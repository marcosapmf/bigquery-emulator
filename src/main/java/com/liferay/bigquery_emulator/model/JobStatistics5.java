package com.liferay.bigquery_emulator.model;

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
 * JobStatistics5
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatistics5 {

  private String copiedLogicalBytes;

  private String copiedRows;

  public JobStatistics5 copiedLogicalBytes(String copiedLogicalBytes) {
    this.copiedLogicalBytes = copiedLogicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of logical bytes copied to the destination table.
   * @return copiedLogicalBytes
   */
  
  @Schema(name = "copied_logical_bytes", description = "[Output-only] Number of logical bytes copied to the destination table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("copied_logical_bytes")
  public String getCopiedLogicalBytes() {
    return copiedLogicalBytes;
  }

  public void setCopiedLogicalBytes(String copiedLogicalBytes) {
    this.copiedLogicalBytes = copiedLogicalBytes;
  }

  public JobStatistics5 copiedRows(String copiedRows) {
    this.copiedRows = copiedRows;
    return this;
  }

  /**
   * [Output-only] Number of rows copied to the destination table.
   * @return copiedRows
   */
  
  @Schema(name = "copied_rows", description = "[Output-only] Number of rows copied to the destination table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("copied_rows")
  public String getCopiedRows() {
    return copiedRows;
  }

  public void setCopiedRows(String copiedRows) {
    this.copiedRows = copiedRows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatistics5 jobStatistics5 = (JobStatistics5) o;
    return Objects.equals(this.copiedLogicalBytes, jobStatistics5.copiedLogicalBytes) &&
        Objects.equals(this.copiedRows, jobStatistics5.copiedRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copiedLogicalBytes, copiedRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatistics5 {\n");
    sb.append("    copiedLogicalBytes: ").append(toIndentedString(copiedLogicalBytes)).append("\n");
    sb.append("    copiedRows: ").append(toIndentedString(copiedRows)).append("\n");
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

