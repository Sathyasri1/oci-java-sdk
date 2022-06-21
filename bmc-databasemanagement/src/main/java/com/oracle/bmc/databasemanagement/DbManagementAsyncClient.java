/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.internal.http.*;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import javax.annotation.Nonnull;

/**
 * Async client implementation for DbManagement service. <br/>
 * There are two ways to use async client:
 * 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
 * getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else,
 * because the stream will be closed right after the AsyncHandler is invoked. <br/>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
 * but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
 * is used, it is still safe to use the Future to determine whether or not the request was completed via
 * Future.isDone/isCancelled.<br/>
 * Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementAsyncClient implements DbManagementAsync {
    /**
     * Service instance for DbManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbManagementAsyncClient.class);

    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    public DbManagementAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            com.oracle.bmc.http.internal.RestClientFactoryBuilder restClientFactoryBuilder) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators =
                new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((com.oracle.bmc.auth.ProvidesClientConfigurators)
                                    this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators =
                new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        configuration,
                        isNonBufferingApacheClient);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DbManagementAsyncClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DbManagementAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AddDataFilesResponse> addDataFiles(
            AddDataFilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                    handler) {
        LOG.trace("Called async addDataFiles");
        final AddDataFilesRequest interceptedRequest =
                AddDataFilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddDataFilesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddDataFilesResponse>
                transformer = AddDataFilesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "AddDataFiles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/AddDataFiles");

        com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddDataFilesRequest, AddDataFilesResponse>,
                        java.util.concurrent.Future<AddDataFilesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAddDataFilesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddDataFilesRequest, AddDataFilesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddManagedDatabaseToManagedDatabaseGroupResponse>
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                                    AddManagedDatabaseToManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async addManagedDatabaseToManagedDatabaseGroup");
        final AddManagedDatabaseToManagedDatabaseGroupRequest interceptedRequest =
                AddManagedDatabaseToManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddManagedDatabaseToManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddManagedDatabaseToManagedDatabaseGroupResponse>
                transformer = AddManagedDatabaseToManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "AddManagedDatabaseToManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/AddManagedDatabaseToManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        AddManagedDatabaseToManagedDatabaseGroupRequest,
                        AddManagedDatabaseToManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AddManagedDatabaseToManagedDatabaseGroupRequest,
                                AddManagedDatabaseToManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<
                                AddManagedDatabaseToManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getAddManagedDatabaseToManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                    AddManagedDatabaseToManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AddmTasksResponse> addmTasks(
            AddmTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse>
                    handler) {
        LOG.trace("Called async addmTasks");
        final AddmTasksRequest interceptedRequest = AddmTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddmTasksConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, AddmTasksResponse>
                transformer = AddmTasksConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "AddmTasks",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AddmTasksCollection/AddmTasks");

        com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse>,
                        java.util.concurrent.Future<AddmTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AddmTasksRequest, AddmTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDatabaseParametersResponse> changeDatabaseParameters(
            ChangeDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async changeDatabaseParameters");
        final ChangeDatabaseParametersRequest interceptedRequest =
                ChangeDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDatabaseParametersResponse>
                transformer = ChangeDatabaseParametersConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ChangeDatabaseParameters",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ChangeDatabaseParameters");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>,
                        java.util.concurrent.Future<ChangeDatabaseParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeDatabaseParametersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeDbManagementPrivateEndpointCompartmentResponse>
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                                    ChangeDbManagementPrivateEndpointCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeDbManagementPrivateEndpointCompartment");
        final ChangeDbManagementPrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDbManagementPrivateEndpointCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDbManagementPrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeDbManagementPrivateEndpointCompartmentResponse>
                transformer = ChangeDbManagementPrivateEndpointCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ChangeDbManagementPrivateEndpointCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ChangeDbManagementPrivateEndpointCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeDbManagementPrivateEndpointCompartmentRequest,
                        ChangeDbManagementPrivateEndpointCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeDbManagementPrivateEndpointCompartmentRequest,
                                ChangeDbManagementPrivateEndpointCompartmentResponse>,
                        java.util.concurrent.Future<
                                ChangeDbManagementPrivateEndpointCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeDbManagementPrivateEndpointCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                    ChangeDbManagementPrivateEndpointCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeJobCompartment");
        final ChangeJobCompartmentRequest interceptedRequest =
                ChangeJobCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeJobCompartmentConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeJobCompartmentResponse>
                transformer = ChangeJobCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ChangeJobCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ChangeJobCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>,
                        java.util.concurrent.Future<ChangeJobCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeJobCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>
            changeManagedDatabaseGroupCompartment(
                    ChangeManagedDatabaseGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedDatabaseGroupCompartmentRequest,
                                    ChangeManagedDatabaseGroupCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeManagedDatabaseGroupCompartment");
        final ChangeManagedDatabaseGroupCompartmentRequest interceptedRequest =
                ChangeManagedDatabaseGroupCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedDatabaseGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeManagedDatabaseGroupCompartmentResponse>
                transformer = ChangeManagedDatabaseGroupCompartmentConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ChangeManagedDatabaseGroupCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ChangeManagedDatabaseGroupCompartment");

        com.oracle.bmc.responses.AsyncHandler<
                        ChangeManagedDatabaseGroupCompartmentRequest,
                        ChangeManagedDatabaseGroupCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeManagedDatabaseGroupCompartmentRequest,
                                ChangeManagedDatabaseGroupCompartmentResponse>,
                        java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeManagedDatabaseGroupCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeManagedDatabaseGroupCompartmentRequest,
                    ChangeManagedDatabaseGroupCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>
            createDbManagementPrivateEndpoint(
                    CreateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDbManagementPrivateEndpointRequest,
                                    CreateDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async createDbManagementPrivateEndpoint");
        final CreateDbManagementPrivateEndpointRequest interceptedRequest =
                CreateDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDbManagementPrivateEndpointResponse>
                transformer = CreateDbManagementPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "CreateDbManagementPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/CreateDbManagementPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateDbManagementPrivateEndpointRequest,
                        CreateDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDbManagementPrivateEndpointRequest,
                                CreateDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDbManagementPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDbManagementPrivateEndpointRequest,
                    CreateDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
        LOG.trace("Called async createJob");
        final CreateJobRequest interceptedRequest = CreateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateJobResponse>
                transformer = CreateJobConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "CreateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/CreateJob");

        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>,
                        java.util.concurrent.Future<CreateJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateJobRequest, CreateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateManagedDatabaseGroupResponse>
            createManagedDatabaseGroup(
                    CreateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagedDatabaseGroupRequest,
                                    CreateManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async createManagedDatabaseGroup");
        final CreateManagedDatabaseGroupRequest interceptedRequest =
                CreateManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateManagedDatabaseGroupResponse>
                transformer = CreateManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "CreateManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/CreateManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateManagedDatabaseGroupRequest,
                                CreateManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<CreateManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateTablespaceResponse> createTablespace(
            CreateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTablespaceRequest, CreateTablespaceResponse>
                    handler) {
        LOG.trace("Called async createTablespace");
        final CreateTablespaceRequest interceptedRequest =
                CreateTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTablespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateTablespaceResponse>
                transformer = CreateTablespaceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "CreateTablespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/CreateTablespace");

        com.oracle.bmc.responses.AsyncHandler<CreateTablespaceRequest, CreateTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateTablespaceRequest, CreateTablespaceResponse>,
                        java.util.concurrent.Future<CreateTablespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateTablespaceRequest, CreateTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>
            deleteDbManagementPrivateEndpoint(
                    DeleteDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDbManagementPrivateEndpointRequest,
                                    DeleteDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async deleteDbManagementPrivateEndpoint");
        final DeleteDbManagementPrivateEndpointRequest interceptedRequest =
                DeleteDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDbManagementPrivateEndpointResponse>
                transformer = DeleteDbManagementPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "DeleteDbManagementPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/DeleteDbManagementPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDbManagementPrivateEndpointRequest,
                        DeleteDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDbManagementPrivateEndpointRequest,
                                DeleteDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDbManagementPrivateEndpointRequest,
                    DeleteDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {
        LOG.trace("Called async deleteJob");
        final DeleteJobRequest interceptedRequest = DeleteJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteJobResponse>
                transformer = DeleteJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "DeleteJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/DeleteJob");

        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>,
                        java.util.concurrent.Future<DeleteJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteJobRequest, DeleteJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse>
            deleteManagedDatabaseGroup(
                    DeleteManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagedDatabaseGroupRequest,
                                    DeleteManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async deleteManagedDatabaseGroup");
        final DeleteManagedDatabaseGroupRequest interceptedRequest =
                DeleteManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteManagedDatabaseGroupResponse>
                transformer = DeleteManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "DeleteManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/DeleteManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteManagedDatabaseGroupRequest,
                                DeleteManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DropTablespaceResponse> dropTablespace(
            DropTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropTablespaceRequest, DropTablespaceResponse>
                    handler) {
        LOG.trace("Called async dropTablespace");
        final DropTablespaceRequest interceptedRequest =
                DropTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DropTablespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DropTablespaceResponse>
                transformer = DropTablespaceConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "DropTablespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/DropTablespace");

        com.oracle.bmc.responses.AsyncHandler<DropTablespaceRequest, DropTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DropTablespaceRequest, DropTablespaceResponse>,
                        java.util.concurrent.Future<DropTablespaceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDropTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DropTablespaceRequest, DropTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAwrSnapshotResponse> generateAwrSnapshot(
            GenerateAwrSnapshotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                    handler) {
        LOG.trace("Called async generateAwrSnapshot");
        final GenerateAwrSnapshotRequest interceptedRequest =
                GenerateAwrSnapshotConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateAwrSnapshotConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateAwrSnapshotResponse>
                transformer = GenerateAwrSnapshotConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GenerateAwrSnapshot",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/SnapshotDetails/GenerateAwrSnapshot");

        com.oracle.bmc.responses.AsyncHandler<
                        GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>,
                        java.util.concurrent.Future<GenerateAwrSnapshotResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbReportResponse> getAwrDbReport(
            GetAwrDbReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbReportRequest, GetAwrDbReportResponse>
                    handler) {
        LOG.trace("Called async getAwrDbReport");
        final GetAwrDbReportRequest interceptedRequest =
                GetAwrDbReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAwrDbReportResponse>
                transformer = GetAwrDbReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetAwrDbReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbReport");

        com.oracle.bmc.responses.AsyncHandler<GetAwrDbReportRequest, GetAwrDbReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAwrDbReportRequest, GetAwrDbReportResponse>,
                        java.util.concurrent.Future<GetAwrDbReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAwrDbReportRequest, GetAwrDbReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAwrDbSqlReportResponse> getAwrDbSqlReport(
            GetAwrDbSqlReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                    handler) {
        LOG.trace("Called async getAwrDbSqlReport");
        final GetAwrDbSqlReportRequest interceptedRequest =
                GetAwrDbSqlReportConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAwrDbSqlReportConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetAwrDbSqlReportResponse>
                transformer = GetAwrDbSqlReportConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetAwrDbSqlReport",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetAwrDbSqlReport");

        com.oracle.bmc.responses.AsyncHandler<GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>,
                        java.util.concurrent.Future<GetAwrDbSqlReportResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetClusterCacheMetricResponse> getClusterCacheMetric(
            GetClusterCacheMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                    handler) {
        LOG.trace("Called async getClusterCacheMetric");
        final GetClusterCacheMetricRequest interceptedRequest =
                GetClusterCacheMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetClusterCacheMetricConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetClusterCacheMetricResponse>
                transformer = GetClusterCacheMetricConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetClusterCacheMetric",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ClusterCacheMetric/GetClusterCacheMetric");

        com.oracle.bmc.responses.AsyncHandler<
                        GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>,
                        java.util.concurrent.Future<GetClusterCacheMetricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>
            getDatabaseFleetHealthMetrics(
                    GetDatabaseFleetHealthMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHealthMetricsRequest,
                                    GetDatabaseFleetHealthMetricsResponse>
                            handler) {
        LOG.trace("Called async getDatabaseFleetHealthMetrics");
        final GetDatabaseFleetHealthMetricsRequest interceptedRequest =
                GetDatabaseFleetHealthMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseFleetHealthMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDatabaseFleetHealthMetricsResponse>
                transformer = GetDatabaseFleetHealthMetricsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetDatabaseFleetHealthMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseFleetHealthMetrics/GetDatabaseFleetHealthMetrics");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseFleetHealthMetricsRequest, GetDatabaseFleetHealthMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseFleetHealthMetricsRequest,
                                GetDatabaseFleetHealthMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseFleetHealthMetricsRequest, GetDatabaseFleetHealthMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseHomeMetricsResponse> getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                    handler) {
        LOG.trace("Called async getDatabaseHomeMetrics");
        final GetDatabaseHomeMetricsRequest interceptedRequest =
                GetDatabaseHomeMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDatabaseHomeMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDatabaseHomeMetricsResponse>
                transformer = GetDatabaseHomeMetricsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetDatabaseHomeMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DatabaseHomeMetrics/GetDatabaseHomeMetrics");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>,
                        java.util.concurrent.Future<GetDatabaseHomeMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>
            getDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDbManagementPrivateEndpointRequest,
                                    GetDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async getDbManagementPrivateEndpoint");
        final GetDbManagementPrivateEndpointRequest interceptedRequest =
                GetDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDbManagementPrivateEndpointResponse>
                transformer = GetDbManagementPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetDbManagementPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/GetDbManagementPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        GetDbManagementPrivateEndpointRequest,
                        GetDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDbManagementPrivateEndpointRequest,
                                GetDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {
        LOG.trace("Called async getJob");
        final GetJobRequest interceptedRequest = GetJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobResponse>
                transformer = GetJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/GetJob");

        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse>,
                        java.util.concurrent.Future<GetJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRequest, GetJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobExecutionRequest, GetJobExecutionResponse>
                    handler) {
        LOG.trace("Called async getJobExecution");
        final GetJobExecutionRequest interceptedRequest =
                GetJobExecutionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobExecutionConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobExecutionResponse>
                transformer = GetJobExecutionConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetJobExecution",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/GetJobExecution");

        com.oracle.bmc.responses.AsyncHandler<GetJobExecutionRequest, GetJobExecutionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetJobExecutionRequest, GetJobExecutionResponse>,
                        java.util.concurrent.Future<GetJobExecutionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobExecutionRequest, GetJobExecutionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {
        LOG.trace("Called async getJobRun");
        final GetJobRunRequest interceptedRequest = GetJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJobRunConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetJobRunResponse>
                transformer = GetJobRunConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetJobRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/GetJobRun");

        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>,
                        java.util.concurrent.Future<GetJobRunResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetJobRunRequest, GetJobRunResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseResponse> getManagedDatabase(
            GetManagedDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                    handler) {
        LOG.trace("Called async getManagedDatabase");
        final GetManagedDatabaseRequest interceptedRequest =
                GetManagedDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetManagedDatabaseResponse>
                transformer = GetManagedDatabaseConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetManagedDatabase",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetManagedDatabase");

        com.oracle.bmc.responses.AsyncHandler<GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedDatabaseRequest, GetManagedDatabaseResponse>,
                        java.util.concurrent.Future<GetManagedDatabaseResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedDatabaseRequest, GetManagedDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetManagedDatabaseGroupResponse> getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                    handler) {
        LOG.trace("Called async getManagedDatabaseGroup");
        final GetManagedDatabaseGroupRequest interceptedRequest =
                GetManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetManagedDatabaseGroupResponse>
                transformer = GetManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/GetManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<GetManagedDatabaseGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetPdbMetricsResponse> getPdbMetrics(
            GetPdbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                    handler) {
        LOG.trace("Called async getPdbMetrics");
        final GetPdbMetricsRequest interceptedRequest =
                GetPdbMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPdbMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetPdbMetricsResponse>
                transformer = GetPdbMetricsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetPdbMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/PdbMetrics/GetPdbMetrics");

        com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPdbMetricsRequest, GetPdbMetricsResponse>,
                        java.util.concurrent.Future<GetPdbMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPdbMetricsRequest, GetPdbMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetTablespaceResponse> getTablespace(
            GetTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                    handler) {
        LOG.trace("Called async getTablespace");
        final GetTablespaceRequest interceptedRequest =
                GetTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTablespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetTablespaceResponse>
                transformer = GetTablespaceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetTablespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/GetTablespace");

        com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetTablespaceRequest, GetTablespaceResponse>,
                        java.util.concurrent.Future<GetTablespaceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetTablespaceRequest, GetTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetUserResponse>
                transformer = GetUserConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetUser",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetUser");

        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse>,
                        java.util.concurrent.Future<GetUserResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserRequest, GetUserResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {
        LOG.trace("Called async getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/GetWorkRequest");

        com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetWorkRequestRequest, GetWorkRequestResponse>,
                        java.util.concurrent.Future<GetWorkRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetWorkRequestRequest, GetWorkRequestResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAsmPropertiesResponse> listAsmProperties(
            ListAsmPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                    handler) {
        LOG.trace("Called async listAsmProperties");
        final ListAsmPropertiesRequest interceptedRequest =
                ListAsmPropertiesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAsmPropertiesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAsmPropertiesResponse>
                transformer = ListAsmPropertiesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListAsmProperties",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAsmProperties");

        com.oracle.bmc.responses.AsyncHandler<ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAsmPropertiesRequest, ListAsmPropertiesResponse>,
                        java.util.concurrent.Future<ListAsmPropertiesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAsmPropertiesRequest, ListAsmPropertiesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedDatabasesResponse> listAssociatedDatabases(
            ListAssociatedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                    handler) {
        LOG.trace("Called async listAssociatedDatabases");
        final ListAssociatedDatabasesRequest interceptedRequest =
                ListAssociatedDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAssociatedDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAssociatedDatabasesResponse>
                transformer = ListAssociatedDatabasesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListAssociatedDatabases",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/AssociatedDatabaseSummary/ListAssociatedDatabases");

        com.oracle.bmc.responses.AsyncHandler<
                        ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>,
                        java.util.concurrent.Future<ListAssociatedDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbSnapshotsResponse> listAwrDbSnapshots(
            ListAwrDbSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                    handler) {
        LOG.trace("Called async listAwrDbSnapshots");
        final ListAwrDbSnapshotsRequest interceptedRequest =
                ListAwrDbSnapshotsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbSnapshotsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAwrDbSnapshotsResponse>
                transformer = ListAwrDbSnapshotsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListAwrDbSnapshots",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbSnapshots");

        com.oracle.bmc.responses.AsyncHandler<ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>,
                        java.util.concurrent.Future<ListAwrDbSnapshotsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAwrDbsResponse> listAwrDbs(
            ListAwrDbsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse>
                    handler) {
        LOG.trace("Called async listAwrDbs");
        final ListAwrDbsRequest interceptedRequest = ListAwrDbsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAwrDbsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListAwrDbsResponse>
                transformer = ListAwrDbsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListAwrDbs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListAwrDbs");

        com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAwrDbsRequest, ListAwrDbsResponse>,
                        java.util.concurrent.Future<ListAwrDbsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAwrDbsRequest, ListAwrDbsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse>
            listConsumerGroupPrivileges(
                    ListConsumerGroupPrivilegesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListConsumerGroupPrivilegesRequest,
                                    ListConsumerGroupPrivilegesResponse>
                            handler) {
        LOG.trace("Called async listConsumerGroupPrivileges");
        final ListConsumerGroupPrivilegesRequest interceptedRequest =
                ListConsumerGroupPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConsumerGroupPrivilegesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConsumerGroupPrivilegesResponse>
                transformer = ListConsumerGroupPrivilegesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListConsumerGroupPrivileges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListConsumerGroupPrivileges");

        com.oracle.bmc.responses.AsyncHandler<
                        ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConsumerGroupPrivilegesRequest,
                                ListConsumerGroupPrivilegesResponse>,
                        java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDataAccessContainersResponse> listDataAccessContainers(
            ListDataAccessContainersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                    handler) {
        LOG.trace("Called async listDataAccessContainers");
        final ListDataAccessContainersRequest interceptedRequest =
                ListDataAccessContainersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAccessContainersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataAccessContainersResponse>
                transformer = ListDataAccessContainersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListDataAccessContainers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDataAccessContainers");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDataAccessContainersRequest, ListDataAccessContainersResponse>,
                        java.util.concurrent.Future<ListDataAccessContainersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDataAccessContainersRequest, ListDataAccessContainersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseParametersResponse> listDatabaseParameters(
            ListDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async listDatabaseParameters");
        final ListDatabaseParametersRequest interceptedRequest =
                ListDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDatabaseParametersResponse>
                transformer = ListDatabaseParametersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListDatabaseParameters",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListDatabaseParameters");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDatabaseParametersRequest, ListDatabaseParametersResponse>,
                        java.util.concurrent.Future<ListDatabaseParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDatabaseParametersRequest, ListDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpoints(
                    ListDbManagementPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDbManagementPrivateEndpointsRequest,
                                    ListDbManagementPrivateEndpointsResponse>
                            handler) {
        LOG.trace("Called async listDbManagementPrivateEndpoints");
        final ListDbManagementPrivateEndpointsRequest interceptedRequest =
                ListDbManagementPrivateEndpointsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDbManagementPrivateEndpointsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDbManagementPrivateEndpointsResponse>
                transformer = ListDbManagementPrivateEndpointsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListDbManagementPrivateEndpoints",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/ListDbManagementPrivateEndpoints");

        com.oracle.bmc.responses.AsyncHandler<
                        ListDbManagementPrivateEndpointsRequest,
                        ListDbManagementPrivateEndpointsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDbManagementPrivateEndpointsRequest,
                                ListDbManagementPrivateEndpointsResponse>,
                        java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDbManagementPrivateEndpointsRequest,
                    ListDbManagementPrivateEndpointsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler) {
        LOG.trace("Called async listJobExecutions");
        final ListJobExecutionsRequest interceptedRequest =
                ListJobExecutionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobExecutionsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobExecutionsResponse>
                transformer = ListJobExecutionsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListJobExecutions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecution/ListJobExecutions");

        com.oracle.bmc.responses.AsyncHandler<ListJobExecutionsRequest, ListJobExecutionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobExecutionsRequest, ListJobExecutionsResponse>,
                        java.util.concurrent.Future<ListJobExecutionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobExecutionsRequest, ListJobExecutionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
        LOG.trace("Called async listJobRuns");
        final ListJobRunsRequest interceptedRequest =
                ListJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobRunsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobRunsResponse>
                transformer = ListJobRunsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListJobRuns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobRun/ListJobRuns");

        com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListJobRunsRequest, ListJobRunsResponse>,
                        java.util.concurrent.Future<ListJobRunsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobRunsRequest, ListJobRunsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        LOG.trace("Called async listJobs");
        final ListJobsRequest interceptedRequest = ListJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListJobsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobsResponse>
                transformer = ListJobsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/ListJobs");

        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>,
                        java.util.concurrent.Future<ListJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListJobsRequest, ListJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                    handler) {
        LOG.trace("Called async listManagedDatabaseGroups");
        final ListManagedDatabaseGroupsRequest interceptedRequest =
                ListManagedDatabaseGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabaseGroupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedDatabaseGroupsResponse>
                transformer = ListManagedDatabaseGroupsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListManagedDatabaseGroups",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/ListManagedDatabaseGroups");

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedDatabaseGroupsRequest,
                                ListManagedDatabaseGroupsResponse>,
                        java.util.concurrent.Future<ListManagedDatabaseGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListManagedDatabasesResponse> listManagedDatabases(
            ListManagedDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                    handler) {
        LOG.trace("Called async listManagedDatabases");
        final ListManagedDatabasesRequest interceptedRequest =
                ListManagedDatabasesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedDatabasesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedDatabasesResponse>
                transformer = ListManagedDatabasesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListManagedDatabases",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListManagedDatabases");

        com.oracle.bmc.responses.AsyncHandler<
                        ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListManagedDatabasesRequest, ListManagedDatabasesResponse>,
                        java.util.concurrent.Future<ListManagedDatabasesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListManagedDatabasesRequest, ListManagedDatabasesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListObjectPrivilegesResponse> listObjectPrivileges(
            ListObjectPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                    handler) {
        LOG.trace("Called async listObjectPrivileges");
        final ListObjectPrivilegesRequest interceptedRequest =
                ListObjectPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectPrivilegesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListObjectPrivilegesResponse>
                transformer = ListObjectPrivilegesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListObjectPrivileges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListObjectPrivileges");

        com.oracle.bmc.responses.AsyncHandler<
                        ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>,
                        java.util.concurrent.Future<ListObjectPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProxiedForUsersResponse> listProxiedForUsers(
            ListProxiedForUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                    handler) {
        LOG.trace("Called async listProxiedForUsers");
        final ListProxiedForUsersRequest interceptedRequest =
                ListProxiedForUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxiedForUsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListProxiedForUsersResponse>
                transformer = ListProxiedForUsersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListProxiedForUsers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxiedForUsers");

        com.oracle.bmc.responses.AsyncHandler<
                        ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProxiedForUsersRequest, ListProxiedForUsersResponse>,
                        java.util.concurrent.Future<ListProxiedForUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProxiedForUsersRequest, ListProxiedForUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProxyUsersResponse> listProxyUsers(
            ListProxyUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProxyUsersRequest, ListProxyUsersResponse>
                    handler) {
        LOG.trace("Called async listProxyUsers");
        final ListProxyUsersRequest interceptedRequest =
                ListProxyUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProxyUsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListProxyUsersResponse>
                transformer = ListProxyUsersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListProxyUsers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListProxyUsers");

        com.oracle.bmc.responses.AsyncHandler<ListProxyUsersRequest, ListProxyUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProxyUsersRequest, ListProxyUsersResponse>,
                        java.util.concurrent.Future<ListProxyUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProxyUsersRequest, ListProxyUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>
                    handler) {
        LOG.trace("Called async listRoles");
        final ListRolesRequest interceptedRequest = ListRolesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRolesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListRolesResponse>
                transformer = ListRolesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListRoles",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListRoles");

        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse>,
                        java.util.concurrent.Future<ListRolesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRolesRequest, ListRolesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListSystemPrivilegesResponse> listSystemPrivileges(
            ListSystemPrivilegesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                    handler) {
        LOG.trace("Called async listSystemPrivileges");
        final ListSystemPrivilegesRequest interceptedRequest =
                ListSystemPrivilegesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSystemPrivilegesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSystemPrivilegesResponse>
                transformer = ListSystemPrivilegesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListSystemPrivileges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSystemPrivileges");

        com.oracle.bmc.responses.AsyncHandler<
                        ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>,
                        java.util.concurrent.Future<ListSystemPrivilegesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListTablespacesResponse> listTablespaces(
            ListTablespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTablespacesRequest, ListTablespacesResponse>
                    handler) {
        LOG.trace("Called async listTablespaces");
        final ListTablespacesRequest interceptedRequest =
                ListTablespacesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablespacesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListTablespacesResponse>
                transformer = ListTablespacesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListTablespaces",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ListTablespaces");

        com.oracle.bmc.responses.AsyncHandler<ListTablespacesRequest, ListTablespacesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListTablespacesRequest, ListTablespacesResponse>,
                        java.util.concurrent.Future<ListTablespacesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListTablespacesRequest, ListTablespacesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        LOG.trace("Called async listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer = ListUsersConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListUsers",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListUsers");

        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>,
                        java.util.concurrent.Future<ListUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUsersRequest, ListUsersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestError/ListWorkRequestErrors");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>,
                        java.util.concurrent.Future<ListWorkRequestErrorsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequestLogEntry/ListWorkRequestLogs");

        com.oracle.bmc.responses.AsyncHandler<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>,
                        java.util.concurrent.Future<ListWorkRequestLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        LOG.trace("Called async listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/WorkRequest/ListWorkRequests");

        com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListWorkRequestsRequest, ListWorkRequestsResponse>,
                        java.util.concurrent.Future<ListWorkRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListWorkRequestsRequest, ListWorkRequestsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveDataFileResponse> removeDataFile(
            RemoveDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDataFileRequest, RemoveDataFileResponse>
                    handler) {
        LOG.trace("Called async removeDataFile");
        final RemoveDataFileRequest interceptedRequest =
                RemoveDataFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveDataFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RemoveDataFileResponse>
                transformer = RemoveDataFileConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "RemoveDataFile",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/RemoveDataFile");

        com.oracle.bmc.responses.AsyncHandler<RemoveDataFileRequest, RemoveDataFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveDataFileRequest, RemoveDataFileResponse>,
                        java.util.concurrent.Future<RemoveDataFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRemoveDataFileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveDataFileRequest, RemoveDataFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async removeManagedDatabaseFromManagedDatabaseGroup");
        final RemoveManagedDatabaseFromManagedDatabaseGroupRequest interceptedRequest =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromRequest(
                        client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                transformer = RemoveManagedDatabaseFromManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "RemoveManagedDatabaseFromManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/RemoveManagedDatabaseFromManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                        RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                RemoveManagedDatabaseFromManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<
                                RemoveManagedDatabaseFromManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getRemoveManagedDatabaseFromManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResetDatabaseParametersResponse> resetDatabaseParameters(
            ResetDatabaseParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                    handler) {
        LOG.trace("Called async resetDatabaseParameters");
        final ResetDatabaseParametersRequest interceptedRequest =
                ResetDatabaseParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetDatabaseParametersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, ResetDatabaseParametersResponse>
                transformer = ResetDatabaseParametersConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ResetDatabaseParameters",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ResetDatabaseParameters");

        com.oracle.bmc.responses.AsyncHandler<
                        ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>,
                        java.util.concurrent.Future<ResetDatabaseParametersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResetDatabaseParametersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResizeDataFileResponse> resizeDataFile(
            ResizeDataFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResizeDataFileRequest, ResizeDataFileResponse>
                    handler) {
        LOG.trace("Called async resizeDataFile");
        final ResizeDataFileRequest interceptedRequest =
                ResizeDataFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResizeDataFileConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ResizeDataFileResponse>
                transformer = ResizeDataFileConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "ResizeDataFile",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/ResizeDataFile");

        com.oracle.bmc.responses.AsyncHandler<ResizeDataFileRequest, ResizeDataFileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResizeDataFileRequest, ResizeDataFileResponse>,
                        java.util.concurrent.Future<ResizeDataFileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResizeDataFileDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResizeDataFileRequest, ResizeDataFileResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RunHistoricAddmResponse> runHistoricAddm(
            RunHistoricAddmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RunHistoricAddmRequest, RunHistoricAddmResponse>
                    handler) {
        LOG.trace("Called async runHistoricAddm");
        final RunHistoricAddmRequest interceptedRequest =
                RunHistoricAddmConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunHistoricAddmConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, RunHistoricAddmResponse>
                transformer = RunHistoricAddmConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "RunHistoricAddm",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/HistoricAddmResult/RunHistoricAddm");

        com.oracle.bmc.responses.AsyncHandler<RunHistoricAddmRequest, RunHistoricAddmResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RunHistoricAddmRequest, RunHistoricAddmResponse>,
                        java.util.concurrent.Future<RunHistoricAddmResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRunHistoricAddmDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RunHistoricAddmRequest, RunHistoricAddmResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse> summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbCpuUsages");
        final SummarizeAwrDbCpuUsagesRequest interceptedRequest =
                SummarizeAwrDbCpuUsagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbCpuUsagesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbCpuUsagesResponse>
                transformer = SummarizeAwrDbCpuUsagesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbCpuUsages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbCpuUsages");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbMetricsResponse> summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbMetrics");
        final SummarizeAwrDbMetricsRequest interceptedRequest =
                SummarizeAwrDbMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbMetricsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbMetricsResponse>
                transformer = SummarizeAwrDbMetricsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbMetrics",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbMetrics");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>
            summarizeAwrDbParameterChanges(
                    SummarizeAwrDbParameterChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbParameterChangesRequest,
                                    SummarizeAwrDbParameterChangesResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbParameterChanges");
        final SummarizeAwrDbParameterChangesRequest interceptedRequest =
                SummarizeAwrDbParameterChangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParameterChangesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbParameterChangesResponse>
                transformer = SummarizeAwrDbParameterChangesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbParameterChanges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameterChanges");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbParameterChangesRequest,
                        SummarizeAwrDbParameterChangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbParameterChangesRequest,
                                SummarizeAwrDbParameterChangesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbParameterChangesRequest, SummarizeAwrDbParameterChangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbParametersResponse> summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbParameters");
        final SummarizeAwrDbParametersRequest interceptedRequest =
                SummarizeAwrDbParametersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbParametersConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbParametersResponse>
                transformer = SummarizeAwrDbParametersConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbParameters",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbParameters");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbParametersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse>
            summarizeAwrDbSnapshotRanges(
                    SummarizeAwrDbSnapshotRangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbSnapshotRangesRequest,
                                    SummarizeAwrDbSnapshotRangesResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbSnapshotRanges");
        final SummarizeAwrDbSnapshotRangesRequest interceptedRequest =
                SummarizeAwrDbSnapshotRangesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSnapshotRangesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbSnapshotRangesResponse>
                transformer = SummarizeAwrDbSnapshotRangesConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbSnapshotRanges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSnapshotRanges");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbSnapshotRangesRequest, SummarizeAwrDbSnapshotRangesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbSnapshotRangesRequest,
                                SummarizeAwrDbSnapshotRangesResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbSnapshotRangesRequest, SummarizeAwrDbSnapshotRangesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse> summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbSysstats");
        final SummarizeAwrDbSysstatsRequest interceptedRequest =
                SummarizeAwrDbSysstatsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbSysstatsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbSysstatsResponse>
                transformer = SummarizeAwrDbSysstatsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbSysstats",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbSysstats");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse>
            summarizeAwrDbTopWaitEvents(
                    SummarizeAwrDbTopWaitEventsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbTopWaitEventsRequest,
                                    SummarizeAwrDbTopWaitEventsResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbTopWaitEvents");
        final SummarizeAwrDbTopWaitEventsRequest interceptedRequest =
                SummarizeAwrDbTopWaitEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbTopWaitEventsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbTopWaitEventsResponse>
                transformer = SummarizeAwrDbTopWaitEventsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbTopWaitEvents",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbTopWaitEvents");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbTopWaitEventsRequest, SummarizeAwrDbTopWaitEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbTopWaitEventsRequest,
                                SummarizeAwrDbTopWaitEventsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbTopWaitEventsRequest, SummarizeAwrDbTopWaitEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>
            summarizeAwrDbWaitEventBuckets(
                    SummarizeAwrDbWaitEventBucketsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbWaitEventBucketsRequest,
                                    SummarizeAwrDbWaitEventBucketsResponse>
                            handler) {
        LOG.trace("Called async summarizeAwrDbWaitEventBuckets");
        final SummarizeAwrDbWaitEventBucketsRequest interceptedRequest =
                SummarizeAwrDbWaitEventBucketsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventBucketsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbWaitEventBucketsResponse>
                transformer = SummarizeAwrDbWaitEventBucketsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbWaitEventBuckets",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEventBuckets");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbWaitEventBucketsRequest,
                        SummarizeAwrDbWaitEventBucketsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbWaitEventBucketsRequest,
                                SummarizeAwrDbWaitEventBucketsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbWaitEventBucketsRequest, SummarizeAwrDbWaitEventBucketsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse> summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                    handler) {
        LOG.trace("Called async summarizeAwrDbWaitEvents");
        final SummarizeAwrDbWaitEventsRequest interceptedRequest =
                SummarizeAwrDbWaitEventsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeAwrDbWaitEventsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeAwrDbWaitEventsResponse>
                transformer = SummarizeAwrDbWaitEventsConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeAwrDbWaitEvents",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/SummarizeAwrDbWaitEvents");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>,
                        java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>
            summarizeJobExecutionsStatuses(
                    SummarizeJobExecutionsStatusesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJobExecutionsStatusesRequest,
                                    SummarizeJobExecutionsStatusesResponse>
                            handler) {
        LOG.trace("Called async summarizeJobExecutionsStatuses");
        final SummarizeJobExecutionsStatusesRequest interceptedRequest =
                SummarizeJobExecutionsStatusesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SummarizeJobExecutionsStatusesConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, SummarizeJobExecutionsStatusesResponse>
                transformer = SummarizeJobExecutionsStatusesConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "SummarizeJobExecutionsStatuses",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/JobExecutionsStatusSummaryCollection/SummarizeJobExecutionsStatuses");

        com.oracle.bmc.responses.AsyncHandler<
                        SummarizeJobExecutionsStatusesRequest,
                        SummarizeJobExecutionsStatusesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SummarizeJobExecutionsStatusesRequest,
                                SummarizeJobExecutionsStatusesResponse>,
                        java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SummarizeJobExecutionsStatusesRequest, SummarizeJobExecutionsStatusesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>
            updateDbManagementPrivateEndpoint(
                    UpdateDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDbManagementPrivateEndpointRequest,
                                    UpdateDbManagementPrivateEndpointResponse>
                            handler) {
        LOG.trace("Called async updateDbManagementPrivateEndpoint");
        final UpdateDbManagementPrivateEndpointRequest interceptedRequest =
                UpdateDbManagementPrivateEndpointConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDbManagementPrivateEndpointConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDbManagementPrivateEndpointResponse>
                transformer = UpdateDbManagementPrivateEndpointConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "UpdateDbManagementPrivateEndpoint",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/DbManagementPrivateEndpoint/UpdateDbManagementPrivateEndpoint");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateDbManagementPrivateEndpointRequest,
                        UpdateDbManagementPrivateEndpointResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateDbManagementPrivateEndpointRequest,
                                UpdateDbManagementPrivateEndpointResponse>,
                        java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateDbManagementPrivateEndpointDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateDbManagementPrivateEndpointRequest,
                    UpdateDbManagementPrivateEndpointResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {
        LOG.trace("Called async updateJob");
        final UpdateJobRequest interceptedRequest = UpdateJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJobConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJobResponse>
                transformer = UpdateJobConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "UpdateJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Job/UpdateJob");

        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>,
                        java.util.concurrent.Future<UpdateJobResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateJobRequest, UpdateJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse>
            updateManagedDatabaseGroup(
                    UpdateManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagedDatabaseGroupRequest,
                                    UpdateManagedDatabaseGroupResponse>
                            handler) {
        LOG.trace("Called async updateManagedDatabaseGroup");
        final UpdateManagedDatabaseGroupRequest interceptedRequest =
                UpdateManagedDatabaseGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedDatabaseGroupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateManagedDatabaseGroupResponse>
                transformer = UpdateManagedDatabaseGroupConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "UpdateManagedDatabaseGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabaseGroup/UpdateManagedDatabaseGroup");

        com.oracle.bmc.responses.AsyncHandler<
                        UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateManagedDatabaseGroupRequest,
                                UpdateManagedDatabaseGroupResponse>,
                        java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateManagedDatabaseGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateTablespaceResponse> updateTablespace(
            UpdateTablespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTablespaceRequest, UpdateTablespaceResponse>
                    handler) {
        LOG.trace("Called async updateTablespace");
        final UpdateTablespaceRequest interceptedRequest =
                UpdateTablespaceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTablespaceConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTablespaceResponse>
                transformer = UpdateTablespaceConverter.fromResponse();
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DbManagement",
                "UpdateTablespace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/Tablespace/UpdateTablespace");

        com.oracle.bmc.responses.AsyncHandler<UpdateTablespaceRequest, UpdateTablespaceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateTablespaceRequest, UpdateTablespaceResponse>,
                        java.util.concurrent.Future<UpdateTablespaceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateTablespaceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateTablespaceRequest, UpdateTablespaceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }
}
