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
 * SparkLoggingInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SparkLoggingInfo {

  private String projectId;

  private String resourceType;

  public SparkLoggingInfo projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * [Output-only] Project ID used for logging
   * @return projectId
   */
  
  @Schema(name = "project_id", description = "[Output-only] Project ID used for logging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public SparkLoggingInfo resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * [Output-only] Resource type used for logging
   * @return resourceType
   */
  
  @Schema(name = "resource_type", description = "[Output-only] Resource type used for logging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkLoggingInfo sparkLoggingInfo = (SparkLoggingInfo) o;
    return Objects.equals(this.projectId, sparkLoggingInfo.projectId) &&
        Objects.equals(this.resourceType, sparkLoggingInfo.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkLoggingInfo {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

