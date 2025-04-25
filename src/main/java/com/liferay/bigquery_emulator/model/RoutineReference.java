package com.liferay.bigquery_emulator.model;

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
 * RoutineReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RoutineReference {

  private String datasetId;

  private String projectId;

  private String routineId;

  public RoutineReference datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * [Required] The ID of the dataset containing this routine.
   * @return datasetId
   */
  
  @Schema(name = "datasetId", description = "[Required] The ID of the dataset containing this routine.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasetId")
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public RoutineReference projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * [Required] The ID of the project containing this routine.
   * @return projectId
   */
  
  @Schema(name = "projectId", description = "[Required] The ID of the project containing this routine.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RoutineReference routineId(String routineId) {
    this.routineId = routineId;
    return this;
  }

  /**
   * [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
   * @return routineId
   */
  
  @Schema(name = "routineId", description = "[Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routineId")
  public String getRoutineId() {
    return routineId;
  }

  public void setRoutineId(String routineId) {
    this.routineId = routineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutineReference routineReference = (RoutineReference) o;
    return Objects.equals(this.datasetId, routineReference.datasetId) &&
        Objects.equals(this.projectId, routineReference.projectId) &&
        Objects.equals(this.routineId, routineReference.routineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, projectId, routineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutineReference {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    routineId: ").append(toIndentedString(routineId)).append("\n");
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

