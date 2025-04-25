package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.DataSplitResult;
import com.liferay.bigquery_emulator.model.EvaluationMetrics;
import com.liferay.bigquery_emulator.model.GlobalExplanation;
import com.liferay.bigquery_emulator.model.IterationResult;
import com.liferay.bigquery_emulator.model.TrainingOptions;
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
 * Information about a single training query run for the model.
 */

@Schema(name = "TrainingRun", description = "Information about a single training query run for the model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TrainingRun {

  @Valid
  private List<@Valid GlobalExplanation> classLevelGlobalExplanations = new ArrayList<>();

  private DataSplitResult dataSplitResult;

  private EvaluationMetrics evaluationMetrics;

  private GlobalExplanation modelLevelGlobalExplanation;

  @Valid
  private List<@Valid IterationResult> results = new ArrayList<>();

  private String startTime;

  private TrainingOptions trainingOptions;

  private String trainingStartTime;

  private String vertexAiModelId;

  private String vertexAiModelVersion;

  public TrainingRun classLevelGlobalExplanations(List<@Valid GlobalExplanation> classLevelGlobalExplanations) {
    this.classLevelGlobalExplanations = classLevelGlobalExplanations;
    return this;
  }

  public TrainingRun addClassLevelGlobalExplanationsItem(GlobalExplanation classLevelGlobalExplanationsItem) {
    if (this.classLevelGlobalExplanations == null) {
      this.classLevelGlobalExplanations = new ArrayList<>();
    }
    this.classLevelGlobalExplanations.add(classLevelGlobalExplanationsItem);
    return this;
  }

  /**
   * Output only. Global explanation contains the explanation of top features on the class level. Applies to classification models only.
   * @return classLevelGlobalExplanations
   */
  @Valid 
  @Schema(name = "classLevelGlobalExplanations", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Global explanation contains the explanation of top features on the class level. Applies to classification models only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classLevelGlobalExplanations")
  public List<@Valid GlobalExplanation> getClassLevelGlobalExplanations() {
    return classLevelGlobalExplanations;
  }

  public void setClassLevelGlobalExplanations(List<@Valid GlobalExplanation> classLevelGlobalExplanations) {
    this.classLevelGlobalExplanations = classLevelGlobalExplanations;
  }

  public TrainingRun dataSplitResult(DataSplitResult dataSplitResult) {
    this.dataSplitResult = dataSplitResult;
    return this;
  }

  /**
   * Get dataSplitResult
   * @return dataSplitResult
   */
  @Valid 
  @Schema(name = "dataSplitResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSplitResult")
  public DataSplitResult getDataSplitResult() {
    return dataSplitResult;
  }

  public void setDataSplitResult(DataSplitResult dataSplitResult) {
    this.dataSplitResult = dataSplitResult;
  }

  public TrainingRun evaluationMetrics(EvaluationMetrics evaluationMetrics) {
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

  public TrainingRun modelLevelGlobalExplanation(GlobalExplanation modelLevelGlobalExplanation) {
    this.modelLevelGlobalExplanation = modelLevelGlobalExplanation;
    return this;
  }

  /**
   * Get modelLevelGlobalExplanation
   * @return modelLevelGlobalExplanation
   */
  @Valid 
  @Schema(name = "modelLevelGlobalExplanation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelLevelGlobalExplanation")
  public GlobalExplanation getModelLevelGlobalExplanation() {
    return modelLevelGlobalExplanation;
  }

  public void setModelLevelGlobalExplanation(GlobalExplanation modelLevelGlobalExplanation) {
    this.modelLevelGlobalExplanation = modelLevelGlobalExplanation;
  }

  public TrainingRun results(List<@Valid IterationResult> results) {
    this.results = results;
    return this;
  }

  public TrainingRun addResultsItem(IterationResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Output only. Output of each iteration run, results.size() <= max_iterations.
   * @return results
   */
  @Valid 
  @Schema(name = "results", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Output of each iteration run, results.size() <= max_iterations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid IterationResult> getResults() {
    return results;
  }

  public void setResults(List<@Valid IterationResult> results) {
    this.results = results;
  }

  public TrainingRun startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The start time of this training run.
   * @return startTime
   */
  
  @Schema(name = "startTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The start time of this training run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public TrainingRun trainingOptions(TrainingOptions trainingOptions) {
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
  public TrainingOptions getTrainingOptions() {
    return trainingOptions;
  }

  public void setTrainingOptions(TrainingOptions trainingOptions) {
    this.trainingOptions = trainingOptions;
  }

  public TrainingRun trainingStartTime(String trainingStartTime) {
    this.trainingStartTime = trainingStartTime;
    return this;
  }

  /**
   * Output only. The start time of this training run, in milliseconds since epoch.
   * @return trainingStartTime
   */
  
  @Schema(name = "trainingStartTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The start time of this training run, in milliseconds since epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingStartTime")
  public String getTrainingStartTime() {
    return trainingStartTime;
  }

  public void setTrainingStartTime(String trainingStartTime) {
    this.trainingStartTime = trainingStartTime;
  }

  public TrainingRun vertexAiModelId(String vertexAiModelId) {
    this.vertexAiModelId = vertexAiModelId;
    return this;
  }

  /**
   * The model id in the [Vertex AI Model Registry](https://cloud.google.com/vertex-ai/docs/model-registry/introduction) for this training run.
   * @return vertexAiModelId
   */
  
  @Schema(name = "vertexAiModelId", description = "The model id in the [Vertex AI Model Registry](https://cloud.google.com/vertex-ai/docs/model-registry/introduction) for this training run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vertexAiModelId")
  public String getVertexAiModelId() {
    return vertexAiModelId;
  }

  public void setVertexAiModelId(String vertexAiModelId) {
    this.vertexAiModelId = vertexAiModelId;
  }

  public TrainingRun vertexAiModelVersion(String vertexAiModelVersion) {
    this.vertexAiModelVersion = vertexAiModelVersion;
    return this;
  }

  /**
   * Output only. The model version in the [Vertex AI Model Registry](https://cloud.google.com/vertex-ai/docs/model-registry/introduction) for this training run.
   * @return vertexAiModelVersion
   */
  
  @Schema(name = "vertexAiModelVersion", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The model version in the [Vertex AI Model Registry](https://cloud.google.com/vertex-ai/docs/model-registry/introduction) for this training run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vertexAiModelVersion")
  public String getVertexAiModelVersion() {
    return vertexAiModelVersion;
  }

  public void setVertexAiModelVersion(String vertexAiModelVersion) {
    this.vertexAiModelVersion = vertexAiModelVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainingRun trainingRun = (TrainingRun) o;
    return Objects.equals(this.classLevelGlobalExplanations, trainingRun.classLevelGlobalExplanations) &&
        Objects.equals(this.dataSplitResult, trainingRun.dataSplitResult) &&
        Objects.equals(this.evaluationMetrics, trainingRun.evaluationMetrics) &&
        Objects.equals(this.modelLevelGlobalExplanation, trainingRun.modelLevelGlobalExplanation) &&
        Objects.equals(this.results, trainingRun.results) &&
        Objects.equals(this.startTime, trainingRun.startTime) &&
        Objects.equals(this.trainingOptions, trainingRun.trainingOptions) &&
        Objects.equals(this.trainingStartTime, trainingRun.trainingStartTime) &&
        Objects.equals(this.vertexAiModelId, trainingRun.vertexAiModelId) &&
        Objects.equals(this.vertexAiModelVersion, trainingRun.vertexAiModelVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLevelGlobalExplanations, dataSplitResult, evaluationMetrics, modelLevelGlobalExplanation, results, startTime, trainingOptions, trainingStartTime, vertexAiModelId, vertexAiModelVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingRun {\n");
    sb.append("    classLevelGlobalExplanations: ").append(toIndentedString(classLevelGlobalExplanations)).append("\n");
    sb.append("    dataSplitResult: ").append(toIndentedString(dataSplitResult)).append("\n");
    sb.append("    evaluationMetrics: ").append(toIndentedString(evaluationMetrics)).append("\n");
    sb.append("    modelLevelGlobalExplanation: ").append(toIndentedString(modelLevelGlobalExplanation)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trainingOptions: ").append(toIndentedString(trainingOptions)).append("\n");
    sb.append("    trainingStartTime: ").append(toIndentedString(trainingStartTime)).append("\n");
    sb.append("    vertexAiModelId: ").append(toIndentedString(vertexAiModelId)).append("\n");
    sb.append("    vertexAiModelVersion: ").append(toIndentedString(vertexAiModelVersion)).append("\n");
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

