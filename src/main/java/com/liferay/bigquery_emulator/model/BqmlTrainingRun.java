package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.BqmlIterationResult;
import com.liferay.bigquery_emulator.model.BqmlTrainingRunTrainingOptions;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BqmlTrainingRun
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BqmlTrainingRun {

  @Valid
  private List<@Valid BqmlIterationResult> iterationResults = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  private String state;

  private BqmlTrainingRunTrainingOptions trainingOptions;

  public BqmlTrainingRun iterationResults(List<@Valid BqmlIterationResult> iterationResults) {
    this.iterationResults = iterationResults;
    return this;
  }

  public BqmlTrainingRun addIterationResultsItem(BqmlIterationResult iterationResultsItem) {
    if (this.iterationResults == null) {
      this.iterationResults = new ArrayList<>();
    }
    this.iterationResults.add(iterationResultsItem);
    return this;
  }

  /**
   * [Output-only, Beta] List of each iteration results.
   * @return iterationResults
   */
  @Valid 
  @Schema(name = "iterationResults", description = "[Output-only, Beta] List of each iteration results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iterationResults")
  public List<@Valid BqmlIterationResult> getIterationResults() {
    return iterationResults;
  }

  public void setIterationResults(List<@Valid BqmlIterationResult> iterationResults) {
    this.iterationResults = iterationResults;
  }

  public BqmlTrainingRun startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * [Output-only, Beta] Training run start time in milliseconds since the epoch.
   * @return startTime
   */
  @Valid 
  @Schema(name = "startTime", description = "[Output-only, Beta] Training run start time in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public BqmlTrainingRun state(String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
   * @return state
   */
  
  @Schema(name = "state", description = "[Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BqmlTrainingRun trainingOptions(BqmlTrainingRunTrainingOptions trainingOptions) {
    this.trainingOptions = trainingOptions;
    return this;
  }

  /**
   * Get trainingOptions
   * @return trainingOptions
   */
  @Valid 
  @Schema(name = "trainingOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingOptions")
  public BqmlTrainingRunTrainingOptions getTrainingOptions() {
    return trainingOptions;
  }

  public void setTrainingOptions(BqmlTrainingRunTrainingOptions trainingOptions) {
    this.trainingOptions = trainingOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BqmlTrainingRun bqmlTrainingRun = (BqmlTrainingRun) o;
    return Objects.equals(this.iterationResults, bqmlTrainingRun.iterationResults) &&
        Objects.equals(this.startTime, bqmlTrainingRun.startTime) &&
        Objects.equals(this.state, bqmlTrainingRun.state) &&
        Objects.equals(this.trainingOptions, bqmlTrainingRun.trainingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterationResults, startTime, state, trainingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BqmlTrainingRun {\n");
    sb.append("    iterationResults: ").append(toIndentedString(iterationResults)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    trainingOptions: ").append(toIndentedString(trainingOptions)).append("\n");
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

