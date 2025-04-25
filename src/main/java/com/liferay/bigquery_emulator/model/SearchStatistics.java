package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.IndexUnusedReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SearchStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SearchStatistics {

  @Valid
  private List<@Valid IndexUnusedReason> indexUnusedReason = new ArrayList<>();

  private String indexUsageMode;

  public SearchStatistics indexUnusedReason(List<@Valid IndexUnusedReason> indexUnusedReason) {
    this.indexUnusedReason = indexUnusedReason;
    return this;
  }

  public SearchStatistics addIndexUnusedReasonItem(IndexUnusedReason indexUnusedReasonItem) {
    if (this.indexUnusedReason == null) {
      this.indexUnusedReason = new ArrayList<>();
    }
    this.indexUnusedReason.add(indexUnusedReasonItem);
    return this;
  }

  /**
   * When index_usage_mode is UNUSED or PARTIALLY_USED, this field explains why index was not used in all or part of the search query. If index_usage_mode is FULLLY_USED, this field is not populated.
   * @return indexUnusedReason
   */
  @Valid 
  @Schema(name = "indexUnusedReason", description = "When index_usage_mode is UNUSED or PARTIALLY_USED, this field explains why index was not used in all or part of the search query. If index_usage_mode is FULLLY_USED, this field is not populated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexUnusedReason")
  public List<@Valid IndexUnusedReason> getIndexUnusedReason() {
    return indexUnusedReason;
  }

  public void setIndexUnusedReason(List<@Valid IndexUnusedReason> indexUnusedReason) {
    this.indexUnusedReason = indexUnusedReason;
  }

  public SearchStatistics indexUsageMode(String indexUsageMode) {
    this.indexUsageMode = indexUsageMode;
    return this;
  }

  /**
   * Specifies index usage mode for the query.
   * @return indexUsageMode
   */
  
  @Schema(name = "indexUsageMode", description = "Specifies index usage mode for the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexUsageMode")
  public String getIndexUsageMode() {
    return indexUsageMode;
  }

  public void setIndexUsageMode(String indexUsageMode) {
    this.indexUsageMode = indexUsageMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchStatistics searchStatistics = (SearchStatistics) o;
    return Objects.equals(this.indexUnusedReason, searchStatistics.indexUnusedReason) &&
        Objects.equals(this.indexUsageMode, searchStatistics.indexUsageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexUnusedReason, indexUsageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchStatistics {\n");
    sb.append("    indexUnusedReason: ").append(toIndentedString(indexUnusedReason)).append("\n");
    sb.append("    indexUsageMode: ").append(toIndentedString(indexUsageMode)).append("\n");
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

