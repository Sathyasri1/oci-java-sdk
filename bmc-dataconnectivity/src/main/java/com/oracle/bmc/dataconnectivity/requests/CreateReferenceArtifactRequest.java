/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateReferenceArtifactExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateReferenceArtifactRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateReferenceArtifactRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails> {

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
     * The ID of a dcms artifact (DataAsset or Endpoint).
     */
    private String dcmsArtifactId;

    /**
     * The ID of a dcms artifact (DataAsset or Endpoint).
     */
    public String getDcmsArtifactId() {
        return dcmsArtifactId;
    }
    /**
     * The information required to reference a dcms artifact.
     */
    private com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails
            createReferenceArtifactDetails;

    /**
     * The information required to reference a dcms artifact.
     */
    public com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails
            getCreateReferenceArtifactDetails() {
        return createReferenceArtifactDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails getBody$() {
        return createReferenceArtifactDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateReferenceArtifactRequest,
                    com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails> {
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
         * The ID of a dcms artifact (DataAsset or Endpoint).
         */
        private String dcmsArtifactId = null;

        /**
         * The ID of a dcms artifact (DataAsset or Endpoint).
         * @param dcmsArtifactId the value to set
         * @return this builder instance
         */
        public Builder dcmsArtifactId(String dcmsArtifactId) {
            this.dcmsArtifactId = dcmsArtifactId;
            return this;
        }

        /**
         * The information required to reference a dcms artifact.
         */
        private com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails
                createReferenceArtifactDetails = null;

        /**
         * The information required to reference a dcms artifact.
         * @param createReferenceArtifactDetails the value to set
         * @return this builder instance
         */
        public Builder createReferenceArtifactDetails(
                com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails
                        createReferenceArtifactDetails) {
            this.createReferenceArtifactDetails = createReferenceArtifactDetails;
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
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(CreateReferenceArtifactRequest o) {
            registryId(o.getRegistryId());
            dcmsArtifactId(o.getDcmsArtifactId());
            createReferenceArtifactDetails(o.getCreateReferenceArtifactDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateReferenceArtifactRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateReferenceArtifactRequest
         */
        public CreateReferenceArtifactRequest build() {
            CreateReferenceArtifactRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dataconnectivity.model.CreateReferenceArtifactDetails body) {
            createReferenceArtifactDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateReferenceArtifactRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateReferenceArtifactRequest
         */
        public CreateReferenceArtifactRequest buildWithoutInvocationCallback() {
            CreateReferenceArtifactRequest request = new CreateReferenceArtifactRequest();
            request.registryId = registryId;
            request.dcmsArtifactId = dcmsArtifactId;
            request.createReferenceArtifactDetails = createReferenceArtifactDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new CreateReferenceArtifactRequest(registryId, dcmsArtifactId, createReferenceArtifactDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .dcmsArtifactId(dcmsArtifactId)
                .createReferenceArtifactDetails(createReferenceArtifactDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",dcmsArtifactId=").append(String.valueOf(this.dcmsArtifactId));
        sb.append(",createReferenceArtifactDetails=")
                .append(String.valueOf(this.createReferenceArtifactDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReferenceArtifactRequest)) {
            return false;
        }

        CreateReferenceArtifactRequest other = (CreateReferenceArtifactRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.dcmsArtifactId, other.dcmsArtifactId)
                && java.util.Objects.equals(
                        this.createReferenceArtifactDetails, other.createReferenceArtifactDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.dcmsArtifactId == null ? 43 : this.dcmsArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.createReferenceArtifactDetails == null
                                ? 43
                                : this.createReferenceArtifactDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
