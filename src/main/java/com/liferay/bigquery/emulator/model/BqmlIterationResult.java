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
 * BqmlIterationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BqmlIterationResult {

  private String durationMs;

  private Double evalLoss;

  private Integer index;

  private Double learnRate;

  private Double trainingLoss;

  public BqmlIterationResult durationMs(String durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
   * @return durationMs
   */
  
  @Schema(name = "durationMs", description = "[Output-only, Beta] Time taken to run the training iteration in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMs")
  public String getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(String durationMs) {
    this.durationMs = durationMs;
  }

  public BqmlIterationResult evalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option is specified as no_split or auto_split with input data size less than 500 rows.
   * @return evalLoss
   */
  
  @Schema(name = "evalLoss", description = "[Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option is specified as no_split or auto_split with input data size less than 500 rows.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evalLoss")
  public Double getEvalLoss() {
    return evalLoss;
  }

  public void setEvalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
  }

  public BqmlIterationResult index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training run.
   * @return index
   */
  
  @Schema(name = "index", description = "[Output-only, Beta] Index of the ML training iteration, starting from zero for each training run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public BqmlIterationResult learnRate(Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * [Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant.
   * @return learnRate
   */
  
  @Schema(name = "learnRate", description = "[Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRate")
  public Double getLearnRate() {
    return learnRate;
  }

  public void setLearnRate(Double learnRate) {
    this.learnRate = learnRate;
  }

  public BqmlIterationResult trainingLoss(Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  /**
   * [Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type.
   * @return trainingLoss
   */
  
  @Schema(name = "trainingLoss", description = "[Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BqmlIterationResult bqmlIterationResult = (BqmlIterationResult) o;
    return Objects.equals(this.durationMs, bqmlIterationResult.durationMs) &&
        Objects.equals(this.evalLoss, bqmlIterationResult.evalLoss) &&
        Objects.equals(this.index, bqmlIterationResult.index) &&
        Objects.equals(this.learnRate, bqmlIterationResult.learnRate) &&
        Objects.equals(this.trainingLoss, bqmlIterationResult.trainingLoss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, evalLoss, index, learnRate, trainingLoss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BqmlIterationResult {\n");
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

