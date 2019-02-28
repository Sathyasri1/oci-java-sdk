/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetJobLogsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The job OCID.
     */
    private String jobId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A filter that returns only logs of a specified type.
     *
     */
    private java.util.List<LogEntry.Type> type;

    /**
     * A filter that returns only log entries that match a given severity level or greater.
     *
     */
    private LogEntry.Level levelGreaterThanOrEqualTo;

    /**
     * The sort order, either `ASC` (ascending) or `DESC` (descending).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order, either `ASC` (ascending) or `DESC` (descending).
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The number of items returned in a paginated `List` call. For information about pagination, see
     * [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the preceding `List` call.
     * For information about pagination, see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Time stamp specifying the lower time limit for which logs are returned in a query.
     *
     */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /**
     * Time stamp specifying the upper time limit for which logs are returned in a query.
     *
     */
    private java.util.Date timestampLessThanOrEqualTo;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJobLogsRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            type(o.getType());
            levelGreaterThanOrEqualTo(o.getLevelGreaterThanOrEqualTo());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            timestampGreaterThanOrEqualTo(o.getTimestampGreaterThanOrEqualTo());
            timestampLessThanOrEqualTo(o.getTimestampLessThanOrEqualTo());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of GetJobLogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetJobLogsRequest
         */
        public GetJobLogsRequest build() {
            GetJobLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
