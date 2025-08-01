package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.SparkLoggingInfo;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SparkStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SparkStatistics {

  @Valid
  private Map<String, String> endpoints = new HashMap<>();

  private SparkLoggingInfo loggingInfo;

  private String sparkJobId;

  private String sparkJobLocation;

  public SparkStatistics endpoints(Map<String, String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public SparkStatistics putEndpointsItem(String key, String endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new HashMap<>();
    }
    this.endpoints.put(key, endpointsItem);
    return this;
  }

  /**
   * [Output-only] Endpoints generated for the Spark job.
   * @return endpoints
   */
  
  @Schema(name = "endpoints", description = "[Output-only] Endpoints generated for the Spark job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoints")
  public Map<String, String> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(Map<String, String> endpoints) {
    this.endpoints = endpoints;
  }

  public SparkStatistics loggingInfo(SparkLoggingInfo loggingInfo) {
    this.loggingInfo = loggingInfo;
    return this;
  }

  /**
   * Get loggingInfo
   * @return loggingInfo
   */
  @Valid 
  @Schema(name = "logging_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logging_info")
  public SparkLoggingInfo getLoggingInfo() {
    return loggingInfo;
  }

  public void setLoggingInfo(SparkLoggingInfo loggingInfo) {
    this.loggingInfo = loggingInfo;
  }

  public SparkStatistics sparkJobId(String sparkJobId) {
    this.sparkJobId = sparkJobId;
    return this;
  }

  /**
   * [Output-only] Spark job id if a Spark job is created successfully.
   * @return sparkJobId
   */
  
  @Schema(name = "spark_job_id", description = "[Output-only] Spark job id if a Spark job is created successfully.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spark_job_id")
  public String getSparkJobId() {
    return sparkJobId;
  }

  public void setSparkJobId(String sparkJobId) {
    this.sparkJobId = sparkJobId;
  }

  public SparkStatistics sparkJobLocation(String sparkJobLocation) {
    this.sparkJobLocation = sparkJobLocation;
    return this;
  }

  /**
   * [Output-only] Location where the Spark job is executed.
   * @return sparkJobLocation
   */
  
  @Schema(name = "spark_job_location", description = "[Output-only] Location where the Spark job is executed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spark_job_location")
  public String getSparkJobLocation() {
    return sparkJobLocation;
  }

  public void setSparkJobLocation(String sparkJobLocation) {
    this.sparkJobLocation = sparkJobLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkStatistics sparkStatistics = (SparkStatistics) o;
    return Objects.equals(this.endpoints, sparkStatistics.endpoints) &&
        Objects.equals(this.loggingInfo, sparkStatistics.loggingInfo) &&
        Objects.equals(this.sparkJobId, sparkStatistics.sparkJobId) &&
        Objects.equals(this.sparkJobLocation, sparkStatistics.sparkJobLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, loggingInfo, sparkJobId, sparkJobLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkStatistics {\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    loggingInfo: ").append(toIndentedString(loggingInfo)).append("\n");
    sb.append("    sparkJobId: ").append(toIndentedString(sparkJobId)).append("\n");
    sb.append("    sparkJobLocation: ").append(toIndentedString(sparkJobLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

