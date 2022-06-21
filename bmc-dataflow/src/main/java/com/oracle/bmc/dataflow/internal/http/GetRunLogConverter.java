/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.internal.http;

import com.oracle.bmc.dataflow.model.*;
import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class GetRunLogConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetRunLogConverter.class);

    public static com.oracle.bmc.dataflow.requests.GetRunLogRequest interceptRequest(
            com.oracle.bmc.dataflow.requests.GetRunLogRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.dataflow.requests.GetRunLogRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getRunId(), "runId must not be blank");
        Validate.notBlank(request.getName(), "name must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200129")
                        .path("runs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getRunId()))
                        .path("logs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getName()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/octet-stream");

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.dataflow.responses.GetRunLogResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.dataflow.responses.GetRunLogResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.dataflow.responses.GetRunLogResponse>() {
                            @Override
                            public com.oracle.bmc.dataflow.responses.GetRunLogResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.dataflow.responses.GetRunLogResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        java.io.InputStream.class);

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.dataflow.responses.GetRunLogResponse.Builder
                                        builder =
                                                com.oracle.bmc.dataflow.responses.GetRunLogResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.inputStream(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentLengthHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-length");
                                if (contentLengthHeader.isPresent()) {
                                    builder.contentLength(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-length",
                                                    contentLengthHeader.get().get(0),
                                                    Long.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentTypeHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-type");
                                if (contentTypeHeader.isPresent()) {
                                    builder.contentType(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-type",
                                                    contentTypeHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        contentEncodingHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "content-encoding");
                                if (contentEncodingHeader.isPresent()) {
                                    builder.contentEncoding(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "content-encoding",
                                                    contentEncodingHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Map<String, String> opcMeta = new java.util.HashMap<>();
                                String opcMetaPattern =
                                        "opc-meta-".toLowerCase(java.util.Locale.ROOT);
                                for (java.util.Map.Entry<String, java.util.List<String>> header :
                                        headers.entrySet()) {
                                    if (header.getKey()
                                            .toLowerCase(java.util.Locale.ROOT)
                                            .startsWith(opcMetaPattern)) {
                                        opcMeta.put(header.getKey(), header.getValue().get(0));
                                    }
                                }
                                if (opcMeta.size() > 0) {
                                    builder.opcMeta(opcMeta);
                                }

                                com.oracle.bmc.dataflow.responses.GetRunLogResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
