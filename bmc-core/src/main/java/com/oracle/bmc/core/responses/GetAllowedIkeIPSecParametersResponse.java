/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetAllowedIkeIPSecParametersResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AllowedIkeIPSecParameters instance.
     */
    private com.oracle.bmc.core.model.AllowedIkeIPSecParameters allowedIkeIPSecParameters;

    private GetAllowedIkeIPSecParametersResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.core.model.AllowedIkeIPSecParameters allowedIkeIPSecParameters) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.allowedIkeIPSecParameters = allowedIkeIPSecParameters;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAllowedIkeIPSecParametersResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            allowedIkeIPSecParameters(o.getAllowedIkeIPSecParameters());

            return this;
        }

        public GetAllowedIkeIPSecParametersResponse build() {
            return new GetAllowedIkeIPSecParametersResponse(
                    __httpStatusCode__, opcRequestId, allowedIkeIPSecParameters);
        }
    }
}