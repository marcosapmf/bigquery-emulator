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
 * BigQueryModelTraining
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BigQueryModelTraining {

  private Integer currentIteration;

  private String expectedTotalIterations;

  public BigQueryModelTraining currentIteration(Integer currentIteration) {
    this.currentIteration = currentIteration;
    return this;
  }

  /**
   * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
   * @return currentIteration
   */
  
  @Schema(name = "currentIteration", description = "[Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentIteration")
  public Integer getCurrentIteration() {
    return currentIteration;
  }

  public void setCurrentIteration(Integer currentIteration) {
    this.currentIteration = currentIteration;
  }

  public BigQueryModelTraining expectedTotalIterations(String expectedTotalIterations) {
    this.expectedTotalIterations = expectedTotalIterations;
    return this;
  }

  /**
   * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
   * @return expectedTotalIterations
   */
  
  @Schema(name = "expectedTotalIterations", description = "[Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedTotalIterations")
  public String getExpectedTotalIterations() {
    return expectedTotalIterations;
  }

  public void setExpectedTotalIterations(String expectedTotalIterations) {
    this.expectedTotalIterations = expectedTotalIterations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigQueryModelTraining bigQueryModelTraining = (BigQueryModelTraining) o;
    return Objects.equals(this.currentIteration, bigQueryModelTraining.currentIteration) &&
        Objects.equals(this.expectedTotalIterations, bigQueryModelTraining.expectedTotalIterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentIteration, expectedTotalIterations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigQueryModelTraining {\n");
    sb.append("    currentIteration: ").append(toIndentedString(currentIteration)).append("\n");
    sb.append("    expectedTotalIterations: ").append(toIndentedString(expectedTotalIterations)).append("\n");
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

