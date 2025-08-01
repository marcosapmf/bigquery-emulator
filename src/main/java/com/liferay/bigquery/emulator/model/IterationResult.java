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
 * IterationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class IterationResult {

  private String durationMs;

  private Double evalLoss;

  private Integer index;

  private Double learnRate;

  private Double trainingLoss;

  public IterationResult durationMs(String durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Time taken to run the iteration in milliseconds.
   * @return durationMs
   */
  
  @Schema(name = "durationMs", description = "Time taken to run the iteration in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMs")
  public String getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(String durationMs) {
    this.durationMs = durationMs;
  }

  public IterationResult evalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * Loss computed on the eval data at the end of iteration.
   * @return evalLoss
   */
  
  @Schema(name = "evalLoss", description = "Loss computed on the eval data at the end of iteration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evalLoss")
  public Double getEvalLoss() {
    return evalLoss;
  }

  public void setEvalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
  }

  public IterationResult index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Index of the iteration, 0 based.
   * @return index
   */
  
  @Schema(name = "index", description = "Index of the iteration, 0 based.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public IterationResult learnRate(Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * Learn rate used for this iteration.
   * @return learnRate
   */
  
  @Schema(name = "learnRate", description = "Learn rate used for this iteration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRate")
  public Double getLearnRate() {
    return learnRate;
  }

  public void setLearnRate(Double learnRate) {
    this.learnRate = learnRate;
  }

  public IterationResult trainingLoss(Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  /**
   * Loss computed on the training data at the end of iteration.
   * @return trainingLoss
   */
  
  @Schema(name = "trainingLoss", description = "Loss computed on the training data at the end of iteration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingLoss")
  public Double getTrainingLoss() {
    return trainingLoss;
  }

  public void setTrainingLoss(Double trainingLoss) {
    this.trainingLoss = trainingLoss;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IterationResult iterationResult = (IterationResult) o;
    return Objects.equals(this.durationMs, iterationResult.durationMs) &&
        Objects.equals(this.evalLoss, iterationResult.evalLoss) &&
        Objects.equals(this.index, iterationResult.index) &&
        Objects.equals(this.learnRate, iterationResult.learnRate) &&
        Objects.equals(this.trainingLoss, iterationResult.trainingLoss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, evalLoss, index, learnRate, trainingLoss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IterationResult {\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    evalLoss: ").append(toIndentedString(evalLoss)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    learnRate: ").append(toIndentedString(learnRate)).append("\n");
    sb.append("    trainingLoss: ").append(toIndentedString(trainingLoss)).append("\n");
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

