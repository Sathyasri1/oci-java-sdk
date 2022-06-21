/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import lombok.Data;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/** The configurable parameters for a client's connection pool */
@Data
public class ApacheConnectionPoolConfig {
    /**
     * Creates a new default {@code ApacheConnectionPoolConfig}.
     *
     * @return a new default connection pool configuration
     */
    public static ApacheConnectionPoolConfig newDefault() {
        return ApacheConnectionPoolConfig.builder()
                .defaultMaxConnectionsPerRoute(50)
                .totalOpenConnections(50)
                .build();
    }

    /** Creates a new {@code Builder} used to construct a new {@code ApacheConnectionPoolConfig} object. **/
    public static Builder builder() {
        return new Builder();
    }

    /** The max total number of connections. */
    private final int totalOpenConnections;
    /** The default max number of connections per route. */
    private final int defaultMaxConnectionsPerRoute;
    /** The time to live per connection. */
    private final Map.Entry<Integer, TimeUnit> ttl;

    private ApacheConnectionPoolConfig(final Builder builder) {
        totalOpenConnections = builder.totalOpenConnections;
        defaultMaxConnectionsPerRoute = builder.defaultMaxConnectionsPerRoute;
        ttl = builder.ttl;
    }

    public final static class Builder {
        private int totalOpenConnections;
        private int defaultMaxConnectionsPerRoute;
        private Map.Entry<Integer, TimeUnit> ttl;

        public Builder() {}

        public Builder totalOpenConnections(final int totalOpenConnections) {
            this.totalOpenConnections = totalOpenConnections;
            return this;
        }

        public Builder defaultMaxConnectionsPerRoute(final int defaultMaxConnectionsPerRoute) {
            this.defaultMaxConnectionsPerRoute = defaultMaxConnectionsPerRoute;
            return this;
        }

        public Builder ttlInMillis(final int ttlInMillis) {
            this.ttl =
                    new AbstractMap.SimpleEntry<Integer, TimeUnit>(
                            ttlInMillis, TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder ttl(final int ttl, final TimeUnit ttlTimeUnit) {
            this.ttl = new AbstractMap.SimpleEntry<Integer, TimeUnit>(ttl, ttlTimeUnit);
            return this;
        }

        public ApacheConnectionPoolConfig build() {
            return new ApacheConnectionPoolConfig(this);
        }
    }
}
