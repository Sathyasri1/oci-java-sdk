/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datascience.model.*;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class ListNotebookSessionShapesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ListNotebookSessionShapesConverter.class);

    public static com.oracle.bmc.datascience.requests.ListNotebookSessionShapesRequest
            interceptRequest(
                    com.oracle.bmc.datascience.requests.ListNotebookSessionShapesRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.datascience.requests.ListNotebookSessionShapesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20190101").path("notebookSessionShapes");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.datascience.responses.ListNotebookSessionShapesResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.datascience.responses.ListNotebookSessionShapesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.datascience.responses
                                        .ListNotebookSessionShapesResponse>() {
                            @Override
                            public com.oracle.bmc.datascience.responses
                                            .ListNotebookSessionShapesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.datascience.responses.ListNotebookSessionShapesResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.util.List<
                                                                com.oracle.bmc.datascience.model
                                                                        .NotebookSessionShapeSummary>>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        new javax.ws.rs.core.GenericType<
                                                                java.util.List<
                                                                        com.oracle.bmc.datascience
                                                                                .model
                                                                                .NotebookSessionShapeSummary>>() {});

                                com.oracle.bmc.http.internal.WithHeaders<
                                                java.util.List<
                                                        com.oracle.bmc.datascience.model
                                                                .NotebookSessionShapeSummary>>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.datascience.responses
                                                .ListNotebookSessionShapesResponse.Builder
                                        builder =
                                                com.oracle.bmc.datascience.responses
                                                        .ListNotebookSessionShapesResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.items(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcPrevPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-prev-page");
                                if (opcPrevPageHeader.isPresent()) {
                                    builder.opcPrevPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-prev-page",
                                                    opcPrevPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.datascience.responses
                                                .ListNotebookSessionShapesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
