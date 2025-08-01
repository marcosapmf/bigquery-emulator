package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.EvaluationMetrics;
import com.liferay.bigquery.emulator.model.TrainingOptions;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Training info of a trial in [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models.
 */

@Schema(name = "HparamTuningTrial", description = "Training info of a trial in [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class HparamTuningTrial {

  private String endTimeMs;

  private String errorMessage;

  private Double evalLoss;

  private EvaluationMetrics evaluationMetrics;

  private EvaluationMetrics hparamTuningEvaluationMetrics;

  private TrainingOptions hparams;

  private String startTimeMs;

  /**
   * The status of the trial.
   */
  public enum StatusEnum {
    TRIAL_STATUS_UNSPECIFIED("TRIAL_STATUS_UNSPECIFIED"),
    
    NOT_STARTED("NOT_STARTED"),
    
    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    INFEASIBLE("INFEASIBLE"),
    
    STOPPED_EARLY("STOPPED_EARLY");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Double trainingLoss;

  private String trialId;

  public HparamTuningTrial endTimeMs(String endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * Ending time of the trial.
   * @return endTimeMs
   */
  
  @Schema(name = "endTimeMs", description = "Ending time of the trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTimeMs")
  public String getEndTimeMs() {
    return endTimeMs;
  }

  public void setEndTimeMs(String endTimeMs) {
    this.endTimeMs = endTimeMs;
  }

  public HparamTuningTrial errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message for FAILED and INFEASIBLE trial.
   * @return errorMessage
   */
  
  @Schema(name = "errorMessage", description = "Error message for FAILED and INFEASIBLE trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HparamTuningTrial evalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * Loss computed on the eval data at the end of trial.
   * @return evalLoss
   */
  
  @Schema(name = "evalLoss", description = "Loss computed on the eval data at the end of trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evalLoss")
  public Double getEvalLoss() {
    return evalLoss;
  }

  public void setEvalLoss(Double evalLoss) {
    this.evalLoss = evalLoss;
  }

  public HparamTuningTrial evaluationMetrics(EvaluationMetrics evaluationMetrics) {
    this.evaluationMetrics = evaluationMetrics;
    return this;
  }

  /**
   * Get evaluationMetrics
   * @return evaluationMetrics
   */
  @Valid 
  @Schema(name = "evaluationMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluationMetrics")
  public EvaluationMetrics getEvaluationMetrics() {
    return evaluationMetrics;
  }

  public void setEvaluationMetrics(EvaluationMetrics evaluationMetrics) {
    this.evaluationMetrics = evaluationMetrics;
  }

  public HparamTuningTrial hparamTuningEvaluationMetrics(EvaluationMetrics hparamTuningEvaluationMetrics) {
    this.hparamTuningEvaluationMetrics = hparamTuningEvaluationMetrics;
    return this;
  }

  /**
   * Get hparamTuningEvaluationMetrics
   * @return hparamTuningEvaluationMetrics
   */
  @Valid 
  @Schema(name = "hparamTuningEvaluationMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hparamTuningEvaluationMetrics")
  public EvaluationMetrics getHparamTuningEvaluationMetrics() {
    return hparamTuningEvaluationMetrics;
  }

  public void setHparamTuningEvaluationMetrics(EvaluationMetrics hparamTuningEvaluationMetrics) {
    this.hparamTuningEvaluationMetrics = hparamTuningEvaluationMetrics;
  }

  public HparamTuningTrial hparams(TrainingOptions hparams) {
    this.hparams = hparams;
    return this;
  }

  /**
   * Get hparams
   * @return hparams
   */
  @Valid 
  @Schema(name = "hparams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hparams")
  public TrainingOptions getHparams() {
    return hparams;
  }

  public void setHparams(TrainingOptions hparams) {
    this.hparams = hparams;
  }

  public HparamTuningTrial startTimeMs(String startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * Starting time of the trial.
   * @return startTimeMs
   */
  
  @Schema(name = "startTimeMs", description = "Starting time of the trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeMs")
  public String getStartTimeMs() {
    return startTimeMs;
  }

  public void setStartTimeMs(String startTimeMs) {
    this.startTimeMs = startTimeMs;
  }

  public HparamTuningTrial status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the trial.
   * @return status
   */
  
  @Schema(name = "status", description = "The status of the trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HparamTuningTrial trainingLoss(Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  /**
   * Loss computed on the training data at the end of trial.
   * @return trainingLoss
   */
  
  @Schema(name = "trainingLoss", description = "Loss computed on the training data at the end of trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingLoss")
  public Double getTrainingLoss() {
    return trainingLoss;
  }

  public void setTrainingLoss(Double trainingLoss) {
    this.trainingLoss = trainingLoss;
  }

  public HparamTuningTrial trialId(String trialId) {
    this.trialId = trialId;
    return this;
  }

  /**
   * 1-based index of the trial.
   * @return trialId
   */
  
  @Schema(name = "trialId", description = "1-based index of the trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trialId")
  public String getTrialId() {
    return trialId;
  }

  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HparamTuningTrial hparamTuningTrial = (HparamTuningTrial) o;
    return Objects.equals(this.endTimeMs, hparamTuningTrial.endTimeMs) &&
        Objects.equals(this.errorMessage, hparamTuningTrial.errorMessage) &&
        Objects.equals(this.evalLoss, hparamTuningTrial.evalLoss) &&
        Objects.equals(this.evaluationMetrics, hparamTuningTrial.evaluationMetrics) &&
        Objects.equals(this.hparamTuningEvaluationMetrics, hparamTuningTrial.hparamTuningEvaluationMetrics) &&
        Objects.equals(this.hparams, hparamTuningTrial.hparams) &&
        Objects.equals(this.startTimeMs, hparamTuningTrial.startTimeMs) &&
        Objects.equals(this.status, hparamTuningTrial.status) &&
        Objects.equals(this.trainingLoss, hparamTuningTrial.trainingLoss) &&
        Objects.equals(this.trialId, hparamTuningTrial.trialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTimeMs, errorMessage, evalLoss, evaluationMetrics, hparamTuningEvaluationMetrics, hparams, startTimeMs, status, trainingLoss, trialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HparamTuningTrial {\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    evalLoss: ").append(toIndentedString(evalLoss)).append("\n");
    sb.append("    evaluationMetrics: ").append(toIndentedString(evaluationMetrics)).append("\n");
    sb.append("    hparamTuningEvaluationMetrics: ").append(toIndentedString(hparamTuningEvaluationMetrics)).append("\n");
    sb.append("    hparams: ").append(toIndentedString(hparams)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trainingLoss: ").append(toIndentedString(trainingLoss)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
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

