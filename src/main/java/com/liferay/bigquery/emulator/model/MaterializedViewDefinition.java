package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MaterializedViewDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class MaterializedViewDefinition {

  private Boolean allowNonIncrementalDefinition;

  private Boolean enableRefresh;

  private String lastRefreshTime;

  private byte[] maxStaleness;

  private String query;

  private String refreshIntervalMs;

  public MaterializedViewDefinition allowNonIncrementalDefinition(Boolean allowNonIncrementalDefinition) {
    this.allowNonIncrementalDefinition = allowNonIncrementalDefinition;
    return this;
  }

  /**
   * [Optional] Allow non incremental materialized view definition. The default value is \"false\".
   * @return allowNonIncrementalDefinition
   */
  
  @Schema(name = "allow_non_incremental_definition", description = "[Optional] Allow non incremental materialized view definition. The default value is \"false\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_non_incremental_definition")
  public Boolean getAllowNonIncrementalDefinition() {
    return allowNonIncrementalDefinition;
  }

  public void setAllowNonIncrementalDefinition(Boolean allowNonIncrementalDefinition) {
    this.allowNonIncrementalDefinition = allowNonIncrementalDefinition;
  }

  public MaterializedViewDefinition enableRefresh(Boolean enableRefresh) {
    this.enableRefresh = enableRefresh;
    return this;
  }

  /**
   * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is \"true\".
   * @return enableRefresh
   */
  
  @Schema(name = "enableRefresh", description = "[Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is \"true\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableRefresh")
  public Boolean getEnableRefresh() {
    return enableRefresh;
  }

  public void setEnableRefresh(Boolean enableRefresh) {
    this.enableRefresh = enableRefresh;
  }

  public MaterializedViewDefinition lastRefreshTime(String lastRefreshTime) {
    this.lastRefreshTime = lastRefreshTime;
    return this;
  }

  /**
   * [Output-only] [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.
   * @return lastRefreshTime
   */
  
  @Schema(name = "lastRefreshTime", description = "[Output-only] [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastRefreshTime")
  public String getLastRefreshTime() {
    return lastRefreshTime;
  }

  public void setLastRefreshTime(String lastRefreshTime) {
    this.lastRefreshTime = lastRefreshTime;
  }

  public MaterializedViewDefinition maxStaleness(byte[] maxStaleness) {
    this.maxStaleness = maxStaleness;
    return this;
  }

  /**
   * [Optional] Max staleness of data that could be returned when materizlized view is queried (formatted as Google SQL Interval type).
   * @return maxStaleness
   */
  
  @Schema(name = "maxStaleness", description = "[Optional] Max staleness of data that could be returned when materizlized view is queried (formatted as Google SQL Interval type).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxStaleness")
  public byte[] getMaxStaleness() {
    return maxStaleness;
  }

  public void setMaxStaleness(byte[] maxStaleness) {
    this.maxStaleness = maxStaleness;
  }

  public MaterializedViewDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * [Required] A query whose result is persisted.
   * @return query
   */
  
  @Schema(name = "query", description = "[Required] A query whose result is persisted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public MaterializedViewDefinition refreshIntervalMs(String refreshIntervalMs) {
    this.refreshIntervalMs = refreshIntervalMs;
    return this;
  }

  /**
   * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is \"1800000\" (30 minutes).
   * @return refreshIntervalMs
   */
  
  @Schema(name = "refreshIntervalMs", description = "[Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is \"1800000\" (30 minutes).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshIntervalMs")
  public String getRefreshIntervalMs() {
    return refreshIntervalMs;
  }

  public void setRefreshIntervalMs(String refreshIntervalMs) {
    this.refreshIntervalMs = refreshIntervalMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterializedViewDefinition materializedViewDefinition = (MaterializedViewDefinition) o;
    return Objects.equals(this.allowNonIncrementalDefinition, materializedViewDefinition.allowNonIncrementalDefinition) &&
        Objects.equals(this.enableRefresh, materializedViewDefinition.enableRefresh) &&
        Objects.equals(this.lastRefreshTime, materializedViewDefinition.lastRefreshTime) &&
        Arrays.equals(this.maxStaleness, materializedViewDefinition.maxStaleness) &&
        Objects.equals(this.query, materializedViewDefinition.query) &&
        Objects.equals(this.refreshIntervalMs, materializedViewDefinition.refreshIntervalMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNonIncrementalDefinition, enableRefresh, lastRefreshTime, Arrays.hashCode(maxStaleness), query, refreshIntervalMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterializedViewDefinition {\n");
    sb.append("    allowNonIncrementalDefinition: ").append(toIndentedString(allowNonIncrementalDefinition)).append("\n");
    sb.append("    enableRefresh: ").append(toIndentedString(enableRefresh)).append("\n");
    sb.append("    lastRefreshTime: ").append(toIndentedString(lastRefreshTime)).append("\n");
    sb.append("    maxStaleness: ").append(toIndentedString(maxStaleness)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    refreshIntervalMs: ").append(toIndentedString(refreshIntervalMs)).append("\n");
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

