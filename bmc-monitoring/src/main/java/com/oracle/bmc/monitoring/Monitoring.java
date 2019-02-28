/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public interface Monitoring extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Creates a new alarm in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAlarmResponse createAlarm(CreateAlarmRequest request);

    /**
     * Deletes the specified alarm.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request);

    /**
     * Gets the specified alarm.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAlarmResponse getAlarm(GetAlarmRequest request);

    /**
     * Get the history of the specified alarm.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAlarmHistoryResponse getAlarmHistory(GetAlarmHistoryRequest request);

    /**
     * Lists the alarms for the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAlarmsResponse listAlarms(ListAlarmsRequest request);

    /**
     * List the status of each alarm in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAlarmsStatusResponse listAlarmsStatus(ListAlarmsStatusRequest request);

    /**
     * Returns metric definitions that match the criteria specified in the request. Compartment OCID required.
     * For information about metrics, see [Metrics Overview](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMetricsResponse listMetrics(ListMetricsRequest request);

    /**
     * Publishes raw metric data points to the Monitoring service.
     * For more information about publishing metrics, see [Publishing Custom Metrics](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Tasks/publishingcustommetrics.htm).
     * <p>
     * The endpoints for this operation differ from other Monitoring operations. Replace the string `telemetry` with `telemetry-ingestion` in the endpoint, as in the following example:
     * <p>
     * https://telemetry-ingestion.eu-frankfurt-1.oraclecloud.com
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PostMetricDataResponse postMetricData(PostMetricDataRequest request);

    /**
     * Removes any existing suppression for the specified alarm.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RemoveAlarmSuppressionResponse removeAlarmSuppression(RemoveAlarmSuppressionRequest request);

    /**
     * Returns aggregated data that match the criteria specified in the request. Compartment OCID required.
     * For information on metric queries, see [Building Metric Queries](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Tasks/buildingqueries.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SummarizeMetricsDataResponse summarizeMetricsData(SummarizeMetricsDataRequest request);

    /**
     * Updates the specified alarm.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    MonitoringWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    MonitoringPaginators getPaginators();
}
