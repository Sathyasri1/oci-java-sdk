/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * The initial generate records configuration. It generates records from the dataset's source.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InitialRecordGenerationConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InitialRecordGenerationConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({"limit"})
    public InitialRecordGenerationConfiguration(java.math.BigDecimal limit) {
        super();
        this.limit = limit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum number of records to generate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private java.math.BigDecimal limit;

        /**
         * The maximum number of records to generate.
         * @param limit the value to set
         * @return this builder
         **/
        public Builder limit(java.math.BigDecimal limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitialRecordGenerationConfiguration build() {
            InitialRecordGenerationConfiguration __instance__ =
                    new InitialRecordGenerationConfiguration(limit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitialRecordGenerationConfiguration o) {
            Builder copiedBuilder = limit(o.getLimit());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The maximum number of records to generate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final java.math.BigDecimal limit;

    /**
     * The maximum number of records to generate.
     * @return the value
     **/
    public java.math.BigDecimal getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InitialRecordGenerationConfiguration(");
        sb.append("limit=").append(String.valueOf(this.limit));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitialRecordGenerationConfiguration)) {
            return false;
        }

        InitialRecordGenerationConfiguration other = (InitialRecordGenerationConfiguration) o;
        return java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
