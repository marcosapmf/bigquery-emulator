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
 * ModelReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ModelReference {

  private String datasetId;

  private String modelId;

  private String projectId;

  public ModelReference datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * [Required] The ID of the dataset containing this model.
   * @return datasetId
   */
  
  @Schema(name = "datasetId", description = "[Required] The ID of the dataset containing this model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasetId")
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public ModelReference modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
   * @return modelId
   */
  
  @Schema(name = "modelId", description = "[Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelId")
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public ModelReference projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * [Required] The ID of the project containing this model.
   * @return projectId
   */
  
  @Schema(name = "projectId", description = "[Required] The ID of the project containing this model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReference modelReference = (ModelReference) o;
    return Objects.equals(this.datasetId, modelReference.datasetId) &&
        Objects.equals(this.modelId, modelReference.modelId) &&
        Objects.equals(this.projectId, modelReference.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, modelId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReference {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

