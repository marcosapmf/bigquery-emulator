package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * JobStatistics4
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatistics4 {

  @Valid
  private List<String> destinationUriFileCounts = new ArrayList<>();

  private String inputBytes;

  public JobStatistics4 destinationUriFileCounts(List<String> destinationUriFileCounts) {
    this.destinationUriFileCounts = destinationUriFileCounts;
    return this;
  }

  public JobStatistics4 addDestinationUriFileCountsItem(String destinationUriFileCountsItem) {
    if (this.destinationUriFileCounts == null) {
      this.destinationUriFileCounts = new ArrayList<>();
    }
    this.destinationUriFileCounts.add(destinationUriFileCountsItem);
    return this;
  }

  /**
   * [Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the 'destinationUris' field.
   * @return destinationUriFileCounts
   */
  
  @Schema(name = "destinationUriFileCounts", description = "[Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the 'destinationUris' field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationUriFileCounts")
  public List<String> getDestinationUriFileCounts() {
    return destinationUriFileCounts;
  }

  public void setDestinationUriFileCounts(List<String> destinationUriFileCounts) {
    this.destinationUriFileCounts = destinationUriFileCounts;
  }

  public JobStatistics4 inputBytes(String inputBytes) {
    this.inputBytes = inputBytes;
    return this;
  }

  /**
   * [Output-only] Number of user bytes extracted into the result. This is the byte count as computed by BigQuery for billing purposes.
   * @return inputBytes
   */
  
  @Schema(name = "inputBytes", description = "[Output-only] Number of user bytes extracted into the result. This is the byte count as computed by BigQuery for billing purposes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputBytes")
  public String getInputBytes() {
    return inputBytes;
  }

  public void setInputBytes(String inputBytes) {
    this.inputBytes = inputBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatistics4 jobStatistics4 = (JobStatistics4) o;
    return Objects.equals(this.destinationUriFileCounts, jobStatistics4.destinationUriFileCounts) &&
        Objects.equals(this.inputBytes, jobStatistics4.inputBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationUriFileCounts, inputBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatistics4 {\n");
    sb.append("    destinationUriFileCounts: ").append(toIndentedString(destinationUriFileCounts)).append("\n");
    sb.append("    inputBytes: ").append(toIndentedString(inputBytes)).append("\n");
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

