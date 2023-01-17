/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The call attributes impl.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BipCallAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BipCallAttribute extends AbstractCallAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("stagingBucket")
        private Schema stagingBucket;

        public Builder stagingBucket(Schema stagingBucket) {
            this.stagingBucket = stagingBucket;
            this.__explicitlySet__.add("stagingBucket");
            return this;
        }
        /**
         * The parameter to set offset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
        private String offsetParameter;

        /**
         * The parameter to set offset.
         * @param offsetParameter the value to set
         * @return this builder
         **/
        public Builder offsetParameter(String offsetParameter) {
            this.offsetParameter = offsetParameter;
            this.__explicitlySet__.add("offsetParameter");
            return this;
        }
        /**
         * The parameter to fetch the next set of rows.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
        private String fetchNextRowsParameter;

        /**
         * The parameter to fetch the next set of rows.
         * @param fetchNextRowsParameter the value to set
         * @return this builder
         **/
        public Builder fetchNextRowsParameter(String fetchNextRowsParameter) {
            this.fetchNextRowsParameter = fetchNextRowsParameter;
            this.__explicitlySet__.add("fetchNextRowsParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
        private DataAsset stagingDataAsset;

        public Builder stagingDataAsset(DataAsset stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private Connection stagingConnection;

        public Builder stagingConnection(Connection stagingConnection) {
            this.stagingConnection = stagingConnection;
            this.__explicitlySet__.add("stagingConnection");
            return this;
        }
        /**
         * The prefix for the staging DataAsset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stagingPrefix")
        private String stagingPrefix;

        /**
         * The prefix for the staging DataAsset.
         * @param stagingPrefix the value to set
         * @return this builder
         **/
        public Builder stagingPrefix(String stagingPrefix) {
            this.stagingPrefix = stagingPrefix;
            this.__explicitlySet__.add("stagingPrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BipCallAttribute build() {
            BipCallAttribute model =
                    new BipCallAttribute(
                            this.stagingBucket,
                            this.offsetParameter,
                            this.fetchNextRowsParameter,
                            this.stagingDataAsset,
                            this.stagingConnection,
                            this.stagingPrefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BipCallAttribute model) {
            if (model.wasPropertyExplicitlySet("stagingBucket")) {
                this.stagingBucket(model.getStagingBucket());
            }
            if (model.wasPropertyExplicitlySet("offsetParameter")) {
                this.offsetParameter(model.getOffsetParameter());
            }
            if (model.wasPropertyExplicitlySet("fetchNextRowsParameter")) {
                this.fetchNextRowsParameter(model.getFetchNextRowsParameter());
            }
            if (model.wasPropertyExplicitlySet("stagingDataAsset")) {
                this.stagingDataAsset(model.getStagingDataAsset());
            }
            if (model.wasPropertyExplicitlySet("stagingConnection")) {
                this.stagingConnection(model.getStagingConnection());
            }
            if (model.wasPropertyExplicitlySet("stagingPrefix")) {
                this.stagingPrefix(model.getStagingPrefix());
            }
            return this;
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

    @Deprecated
    public BipCallAttribute(
            Schema stagingBucket,
            String offsetParameter,
            String fetchNextRowsParameter,
            DataAsset stagingDataAsset,
            Connection stagingConnection,
            String stagingPrefix) {
        super();
        this.stagingBucket = stagingBucket;
        this.offsetParameter = offsetParameter;
        this.fetchNextRowsParameter = fetchNextRowsParameter;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.stagingPrefix = stagingPrefix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingBucket")
    private final Schema stagingBucket;

    public Schema getStagingBucket() {
        return stagingBucket;
    }

    /**
     * The parameter to set offset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
    private final String offsetParameter;

    /**
     * The parameter to set offset.
     * @return the value
     **/
    public String getOffsetParameter() {
        return offsetParameter;
    }

    /**
     * The parameter to fetch the next set of rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
    private final String fetchNextRowsParameter;

    /**
     * The parameter to fetch the next set of rows.
     * @return the value
     **/
    public String getFetchNextRowsParameter() {
        return fetchNextRowsParameter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    private final DataAsset stagingDataAsset;

    public DataAsset getStagingDataAsset() {
        return stagingDataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    private final Connection stagingConnection;

    public Connection getStagingConnection() {
        return stagingConnection;
    }

    /**
     * The prefix for the staging DataAsset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stagingPrefix")
    private final String stagingPrefix;

    /**
     * The prefix for the staging DataAsset.
     * @return the value
     **/
    public String getStagingPrefix() {
        return stagingPrefix;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BipCallAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", stagingBucket=").append(String.valueOf(this.stagingBucket));
        sb.append(", offsetParameter=").append(String.valueOf(this.offsetParameter));
        sb.append(", fetchNextRowsParameter=").append(String.valueOf(this.fetchNextRowsParameter));
        sb.append(", stagingDataAsset=").append(String.valueOf(this.stagingDataAsset));
        sb.append(", stagingConnection=").append(String.valueOf(this.stagingConnection));
        sb.append(", stagingPrefix=").append(String.valueOf(this.stagingPrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BipCallAttribute)) {
            return false;
        }

        BipCallAttribute other = (BipCallAttribute) o;
        return java.util.Objects.equals(this.stagingBucket, other.stagingBucket)
                && java.util.Objects.equals(this.offsetParameter, other.offsetParameter)
                && java.util.Objects.equals(
                        this.fetchNextRowsParameter, other.fetchNextRowsParameter)
                && java.util.Objects.equals(this.stagingDataAsset, other.stagingDataAsset)
                && java.util.Objects.equals(this.stagingConnection, other.stagingConnection)
                && java.util.Objects.equals(this.stagingPrefix, other.stagingPrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.stagingBucket == null ? 43 : this.stagingBucket.hashCode());
        result =
                (result * PRIME)
                        + (this.offsetParameter == null ? 43 : this.offsetParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.fetchNextRowsParameter == null
                                ? 43
                                : this.fetchNextRowsParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingDataAsset == null ? 43 : this.stagingDataAsset.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingConnection == null ? 43 : this.stagingConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingPrefix == null ? 43 : this.stagingPrefix.hashCode());
        return result;
    }
}
