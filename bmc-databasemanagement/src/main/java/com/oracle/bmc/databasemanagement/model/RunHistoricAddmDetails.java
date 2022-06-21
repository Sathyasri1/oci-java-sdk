/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the ADDM task, which include the beginning and ending AWR snapshot IDs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RunHistoricAddmDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RunHistoricAddmDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"startSnapshotId", "endSnapshotId"})
    public RunHistoricAddmDetails(Long startSnapshotId, Long endSnapshotId) {
        super();
        this.startSnapshotId = startSnapshotId;
        this.endSnapshotId = endSnapshotId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID number of the beginning AWR snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotId")
        private Long startSnapshotId;

        /**
         * The ID number of the beginning AWR snapshot.
         * @param startSnapshotId the value to set
         * @return this builder
         **/
        public Builder startSnapshotId(Long startSnapshotId) {
            this.startSnapshotId = startSnapshotId;
            this.__explicitlySet__.add("startSnapshotId");
            return this;
        }
        /**
         * The ID of the ending AWR snapshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
        private Long endSnapshotId;

        /**
         * The ID of the ending AWR snapshot.
         * @param endSnapshotId the value to set
         * @return this builder
         **/
        public Builder endSnapshotId(Long endSnapshotId) {
            this.endSnapshotId = endSnapshotId;
            this.__explicitlySet__.add("endSnapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunHistoricAddmDetails build() {
            RunHistoricAddmDetails __instance__ =
                    new RunHistoricAddmDetails(startSnapshotId, endSnapshotId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunHistoricAddmDetails o) {
            Builder copiedBuilder =
                    startSnapshotId(o.getStartSnapshotId()).endSnapshotId(o.getEndSnapshotId());

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
     * The ID number of the beginning AWR snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotId")
    private final Long startSnapshotId;

    /**
     * The ID number of the beginning AWR snapshot.
     * @return the value
     **/
    public Long getStartSnapshotId() {
        return startSnapshotId;
    }

    /**
     * The ID of the ending AWR snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
    private final Long endSnapshotId;

    /**
     * The ID of the ending AWR snapshot.
     * @return the value
     **/
    public Long getEndSnapshotId() {
        return endSnapshotId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RunHistoricAddmDetails(");
        sb.append("startSnapshotId=").append(String.valueOf(this.startSnapshotId));
        sb.append(", endSnapshotId=").append(String.valueOf(this.endSnapshotId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunHistoricAddmDetails)) {
            return false;
        }

        RunHistoricAddmDetails other = (RunHistoricAddmDetails) o;
        return java.util.Objects.equals(this.startSnapshotId, other.startSnapshotId)
                && java.util.Objects.equals(this.endSnapshotId, other.endSnapshotId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.startSnapshotId == null ? 43 : this.startSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotId == null ? 43 : this.endSnapshotId.hashCode());
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
