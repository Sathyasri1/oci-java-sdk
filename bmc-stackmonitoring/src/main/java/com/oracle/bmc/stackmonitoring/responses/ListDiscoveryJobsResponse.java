/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.responses;

import com.oracle.bmc.stackmonitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListDiscoveryJobsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned DiscoveryJobCollection instance.
     */
    private com.oracle.bmc.stackmonitoring.model.DiscoveryJobCollection discoveryJobCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "discoveryJobCollection"
    })
    private ListDiscoveryJobsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.stackmonitoring.model.DiscoveryJobCollection discoveryJobCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.discoveryJobCollection = discoveryJobCollection;
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
        public Builder copy(ListDiscoveryJobsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            discoveryJobCollection(o.getDiscoveryJobCollection());

            return this;
        }

        public ListDiscoveryJobsResponse build() {
            return new ListDiscoveryJobsResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, discoveryJobCollection);
        }
    }
}