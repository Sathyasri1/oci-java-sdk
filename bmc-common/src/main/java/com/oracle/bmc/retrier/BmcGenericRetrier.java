/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.google.common.base.Optional;
import com.google.common.base.Suppliers;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.waiter.GenericWaiter;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/**
 * A generic retrier that can be used to implement custom retry behavior for specific
 * types of calls.
 */
@Slf4j
public class BmcGenericRetrier {
    @Getter private final GenericWaiter waiter;
    @Getter private final RetryCondition retryCondition;

    /**
     * Creates a new retrier with the given configuration.
     * @param retryConfiguration The retry configuration to use.
     */
    public BmcGenericRetrier(@NonNull final RetryConfiguration retryConfiguration) {
        this.waiter = new GenericWaiter(retryConfiguration);
        this.retryCondition = retryConfiguration.getRetryCondition();
    }

    /**
     * Executes the functionCall based upon the {@link RetryConfiguration} of this retrier
     * @param requestToUse The request that is passed to the functionCall
     * @param functionCall Function that will be invoked to send out the request.
     * @param <REQUEST> Request object class
     * @param <RESPONSE> Response object class
     * @return The successful response
     */
    public <REQUEST, RESPONSE> RESPONSE execute(
            @NonNull final REQUEST requestToUse,
            @NonNull final Function<REQUEST, RESPONSE> functionCall) {
        AtomicReference<BmcException> lastKnownException = new AtomicReference<>();
        LOG.debug(
                "Retry policy to use: {MaximumNumberAttempts={}, MinSleepBetween=0, MaxSleepBetween={}ms, ExponentialBackoffBase=2}",
                RetryConfiguration.DEFAULT_MAX_RETRY_ATTEMPTS,
                RetryConfiguration.DEFAULT_MAX_WAIT_TIME);
        final Optional<RESPONSE> response =
                waiter.execute(
                        Suppliers.ofInstance(requestToUse),
                        (request) -> {
                            if (lastKnownException.get() != null) {
                                // we know there was a previous exception, so this must be a retry
                                LOG.debug(
                                        "Http Status Code: {}, Error Code: {}, Retrying: {}",
                                        lastKnownException.get().getStatusCode(),
                                        lastKnownException.get().getServiceCode(),
                                        lastKnownException.get().getMessage());
                            }
                            try {
                                return doFunctionCall(request, functionCall);
                            } catch (BmcException e) {
                                if (!retryCondition.shouldBeRetried(e)) {
                                    LOG.debug(
                                            "Http Status Code: {}, Error Code: {}, Not retrying, not retriable: {}",
                                            e.getStatusCode(),
                                            e.getServiceCode(),
                                            e.getMessage());
                                    throw e;
                                }
                                lastKnownException.set(e);
                            }
                            return null;
                        },
                        Objects::nonNull);

        if (response.isPresent()) {
            return response.get();
        }

        throw lastKnownException.get();
    }

    /**
     * Executes the actual function call. Can be overridden, e.g. for debugging.
     * @param functionCall Function that will be invoked to send out the request.
     * @param request request data for the function call
     * @param <REQUEST> Request object class
     * @param <RESPONSE> Response object class
     * @return The successful response
     */
    protected <REQUEST, RESPONSE> RESPONSE doFunctionCall(
            @Nullable @NonNull REQUEST request, @NonNull Function<REQUEST, RESPONSE> functionCall) {
        return functionCall.apply(request);
    }
}
