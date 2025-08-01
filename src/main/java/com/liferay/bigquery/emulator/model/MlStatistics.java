package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.IterationResult;
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
 * MlStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class MlStatistics {

  @Valid
  private List<@Valid IterationResult> iterationResults = new ArrayList<>();

  private String maxIterations;

  public MlStatistics iterationResults(List<@Valid IterationResult> iterationResults) {
    this.iterationResults = iterationResults;
    return this;
  }

  public MlStatistics addIterationResultsItem(IterationResult iterationResultsItem) {
    if (this.iterationResults == null) {
      this.iterationResults = new ArrayList<>();
    }
    this.iterationResults.add(iterationResultsItem);
    return this;
  }

  /**
   * Results for all completed iterations.
   * @return iterationResults
   */
  @Valid 
  @Schema(name = "iterationResults", description = "Results for all completed iterations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iterationResults")
  public List<@Valid IterationResult> getIterationResults() {
    return iterationResults;
  }

  public void setIterationResults(List<@Valid IterationResult> iterationResults) {
    this.iterationResults = iterationResults;
  }

  public MlStatistics maxIterations(String maxIterations) {
    this.maxIterations = maxIterations;
    return this;
  }

  /**
   * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
   * @return maxIterations
   */
  
  @Schema(name = "maxIterations", description = "Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxIterations")
  public String getMaxIterations() {
    return maxIterations;
  }

  public void setMaxIterations(String maxIterations) {
    this.maxIterations = maxIterations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlStatistics mlStatistics = (MlStatistics) o;
    return Objects.equals(this.iterationResults, mlStatistics.iterationResults) &&
        Objects.equals(this.maxIterations, mlStatistics.maxIterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterationResults, maxIterations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlStatistics {\n");
    sb.append("    iterationResults: ").append(toIndentedString(iterationResults)).append("\n");
    sb.append("    maxIterations: ").append(toIndentedString(maxIterations)).append("\n");
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

