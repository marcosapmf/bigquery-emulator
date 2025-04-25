package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
 */

@Schema(name = "ModelDefinition_modelOptions", description = "[Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.")
@JsonTypeName("ModelDefinition_modelOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ModelDefinitionModelOptions {

  @Valid
  private List<String> labels = new ArrayList<>();

  private String lossType;

  private String modelType;

  public ModelDefinitionModelOptions labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ModelDefinitionModelOptions addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public ModelDefinitionModelOptions lossType(String lossType) {
    this.lossType = lossType;
    return this;
  }

  /**
   * Get lossType
   * @return lossType
   */
  
  @Schema(name = "lossType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lossType")
  public String getLossType() {
    return lossType;
  }

  public void setLossType(String lossType) {
    this.lossType = lossType;
  }

  public ModelDefinitionModelOptions modelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Get modelType
   * @return modelType
   */
  
  @Schema(name = "modelType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelType")
  public String getModelType() {
    return modelType;
  }

  public void setModelType(String modelType) {
    this.modelType = modelType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDefinitionModelOptions modelDefinitionModelOptions = (ModelDefinitionModelOptions) o;
    return Objects.equals(this.labels, modelDefinitionModelOptions.labels) &&
        Objects.equals(this.lossType, modelDefinitionModelOptions.lossType) &&
        Objects.equals(this.modelType, modelDefinitionModelOptions.modelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, lossType, modelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDefinitionModelOptions {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lossType: ").append(toIndentedString(lossType)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
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

