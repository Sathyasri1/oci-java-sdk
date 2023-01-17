/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateConnectionValidationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateConnectionValidationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateConnectionValidationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails> {

    /**
     * The registry OCID.
     */
    private String registryId;

    /**
     * The registry OCID.
     */
    public String getRegistryId() {
        return registryId;
    }
    /**
     * The information required to validate a connection.
     */
    private com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails
            createConnectionValidationDetails;

    /**
     * The information required to validate a connection.
     */
    public com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails
            getCreateConnectionValidationDetails() {
        return createConnectionValidationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails getBody$() {
        return createConnectionValidationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateConnectionValidationRequest,
                    com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The registry OCID.
         */
        private String registryId = null;

        /**
         * The registry OCID.
         * @param registryId the value to set
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * The information required to validate a connection.
         */
        private com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails
                createConnectionValidationDetails = null;

        /**
         * The information required to validate a connection.
         * @param createConnectionValidationDetails the value to set
         * @return this builder instance
         */
        public Builder createConnectionValidationDetails(
                com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails
                        createConnectionValidationDetails) {
            this.createConnectionValidationDetails = createConnectionValidationDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         */
        private String endpointId = null;

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         * @param endpointId the value to set
         * @return this builder instance
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateConnectionValidationRequest o) {
            registryId(o.getRegistryId());
            createConnectionValidationDetails(o.getCreateConnectionValidationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            endpointId(o.getEndpointId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateConnectionValidationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateConnectionValidationRequest
         */
        public CreateConnectionValidationRequest build() {
            CreateConnectionValidationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dataconnectivity.model.CreateConnectionValidationDetails body) {
            createConnectionValidationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateConnectionValidationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateConnectionValidationRequest
         */
        public CreateConnectionValidationRequest buildWithoutInvocationCallback() {
            CreateConnectionValidationRequest request = new CreateConnectionValidationRequest();
            request.registryId = registryId;
            request.createConnectionValidationDetails = createConnectionValidationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.endpointId = endpointId;
            return request;
            // new CreateConnectionValidationRequest(registryId, createConnectionValidationDetails, opcRequestId, opcRetryToken, endpointId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .createConnectionValidationDetails(createConnectionValidationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .endpointId(endpointId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",createConnectionValidationDetails=")
                .append(String.valueOf(this.createConnectionValidationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectionValidationRequest)) {
            return false;
        }

        CreateConnectionValidationRequest other = (CreateConnectionValidationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(
                        this.createConnectionValidationDetails,
                        other.createConnectionValidationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.endpointId, other.endpointId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.createConnectionValidationDetails == null
                                ? 43
                                : this.createConnectionValidationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        return result;
    }
}
