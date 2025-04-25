package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.BqmlTrainingRun;
import com.liferay.bigquery_emulator.model.ModelDefinitionModelOptions;
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
 * ModelDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ModelDefinition {

  private ModelDefinitionModelOptions modelOptions;

  @Valid
  private List<@Valid BqmlTrainingRun> trainingRuns = new ArrayList<>();

  public ModelDefinition modelOptions(ModelDefinitionModelOptions modelOptions) {
    this.modelOptions = modelOptions;
    return this;
  }

  /**
   * Get modelOptions
   * @return modelOptions
   */
  @Valid 
  @Schema(name = "modelOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelOptions")
  public ModelDefinitionModelOptions getModelOptions() {
    return modelOptions;
  }

  public void setModelOptions(ModelDefinitionModelOptions modelOptions) {
    this.modelOptions = modelOptions;
  }

  public ModelDefinition trainingRuns(List<@Valid BqmlTrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
    return this;
  }

  public ModelDefinition addTrainingRunsItem(BqmlTrainingRun trainingRunsItem) {
    if (this.trainingRuns == null) {
      this.trainingRuns = new ArrayList<>();
    }
    this.trainingRuns.add(trainingRunsItem);
    return this;
  }

  /**
   * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
   * @return trainingRuns
   */
  @Valid 
  @Schema(name = "trainingRuns", description = "[Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingRuns")
  public List<@Valid BqmlTrainingRun> getTrainingRuns() {
    return trainingRuns;
  }

  public void setTrainingRuns(List<@Valid BqmlTrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDefinition modelDefinition = (ModelDefinition) o;
    return Objects.equals(this.modelOptions, modelDefinition.modelOptions) &&
        Objects.equals(this.trainingRuns, modelDefinition.trainingRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelOptions, trainingRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDefinition {\n");
    sb.append("    modelOptions: ").append(toIndentedString(modelOptions)).append("\n");
    sb.append("    trainingRuns: ").append(toIndentedString(trainingRuns)).append("\n");
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

