package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryTimelineSample
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryTimelineSample {

  private String activeUnits;

  private String completedUnits;

  private String elapsedMs;

  private String estimatedRunnableUnits;

  private String pendingUnits;

  private String totalSlotMs;

  public QueryTimelineSample activeUnits(String activeUnits) {
    this.activeUnits = activeUnits;
    return this;
  }

  /**
   * Total number of units currently being processed by workers. This does not correspond directly to slot usage. This is the largest value observed since the last sample.
   * @return activeUnits
   */
  
  @Schema(name = "activeUnits", description = "Total number of units currently being processed by workers. This does not correspond directly to slot usage. This is the largest value observed since the last sample.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeUnits")
  public String getActiveUnits() {
    return activeUnits;
  }

  public void setActiveUnits(String activeUnits) {
    this.activeUnits = activeUnits;
  }

  public QueryTimelineSample completedUnits(String completedUnits) {
    this.completedUnits = completedUnits;
    return this;
  }

  /**
   * Total parallel units of work completed by this query.
   * @return completedUnits
   */
  
  @Schema(name = "completedUnits", description = "Total parallel units of work completed by this query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedUnits")
  public String getCompletedUnits() {
    return completedUnits;
  }

  public void setCompletedUnits(String completedUnits) {
    this.completedUnits = completedUnits;
  }

  public QueryTimelineSample elapsedMs(String elapsedMs) {
    this.elapsedMs = elapsedMs;
    return this;
  }

  /**
   * Milliseconds elapsed since the start of query execution.
   * @return elapsedMs
   */
  
  @Schema(name = "elapsedMs", description = "Milliseconds elapsed since the start of query execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elapsedMs")
  public String getElapsedMs() {
    return elapsedMs;
  }

  public void setElapsedMs(String elapsedMs) {
    this.elapsedMs = elapsedMs;
  }

  public QueryTimelineSample estimatedRunnableUnits(String estimatedRunnableUnits) {
    this.estimatedRunnableUnits = estimatedRunnableUnits;
    return this;
  }

  /**
   * Units of work that can be scheduled immediately. Providing additional slots for these units of work will speed up the query, provided no other query in the reservation needs additional slots.
   * @return estimatedRunnableUnits
   */
  
  @Schema(name = "estimatedRunnableUnits", description = "Units of work that can be scheduled immediately. Providing additional slots for these units of work will speed up the query, provided no other query in the reservation needs additional slots.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRunnableUnits")
  public String getEstimatedRunnableUnits() {
    return estimatedRunnableUnits;
  }

  public void setEstimatedRunnableUnits(String estimatedRunnableUnits) {
    this.estimatedRunnableUnits = estimatedRunnableUnits;
  }

  public QueryTimelineSample pendingUnits(String pendingUnits) {
    this.pendingUnits = pendingUnits;
    return this;
  }

  /**
   * Total units of work remaining for the query. This number can be revised (increased or decreased) while the query is running.
   * @return pendingUnits
   */
  
  @Schema(name = "pendingUnits", description = "Total units of work remaining for the query. This number can be revised (increased or decreased) while the query is running.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingUnits")
  public String getPendingUnits() {
    return pendingUnits;
  }

  public void setPendingUnits(String pendingUnits) {
    this.pendingUnits = pendingUnits;
  }

  public QueryTimelineSample totalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
    return this;
  }

  /**
   * Cumulative slot-ms consumed by the query.
   * @return totalSlotMs
   */
  
  @Schema(name = "totalSlotMs", description = "Cumulative slot-ms consumed by the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSlotMs")
  public String getTotalSlotMs() {
    return totalSlotMs;
  }

  public void setTotalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimelineSample queryTimelineSample = (QueryTimelineSample) o;
    return Objects.equals(this.activeUnits, queryTimelineSample.activeUnits) &&
        Objects.equals(this.completedUnits, queryTimelineSample.completedUnits) &&
        Objects.equals(this.elapsedMs, queryTimelineSample.elapsedMs) &&
        Objects.equals(this.estimatedRunnableUnits, queryTimelineSample.estimatedRunnableUnits) &&
        Objects.equals(this.pendingUnits, queryTimelineSample.pendingUnits) &&
        Objects.equals(this.totalSlotMs, queryTimelineSample.totalSlotMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeUnits, completedUnits, elapsedMs, estimatedRunnableUnits, pendingUnits, totalSlotMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimelineSample {\n");
    sb.append("    activeUnits: ").append(toIndentedString(activeUnits)).append("\n");
    sb.append("    completedUnits: ").append(toIndentedString(completedUnits)).append("\n");
    sb.append("    elapsedMs: ").append(toIndentedString(elapsedMs)).append("\n");
    sb.append("    estimatedRunnableUnits: ").append(toIndentedString(estimatedRunnableUnits)).append("\n");
    sb.append("    pendingUnits: ").append(toIndentedString(pendingUnits)).append("\n");
    sb.append("    totalSlotMs: ").append(toIndentedString(totalSlotMs)).append("\n");
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

