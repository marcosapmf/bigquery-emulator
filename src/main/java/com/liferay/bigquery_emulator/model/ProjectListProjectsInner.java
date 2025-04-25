package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery_emulator.model.ProjectReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProjectListProjectsInner
 */

@JsonTypeName("ProjectList_projects_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ProjectListProjectsInner {

  private String friendlyName;

  private String id;

  private String kind = "bigquery#project";

  private String numericId;

  private ProjectReference projectReference;

  public ProjectListProjectsInner friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * A descriptive name for this project.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "A descriptive name for this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public ProjectListProjectsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An opaque ID of this project.
   * @return id
   */
  
  @Schema(name = "id", description = "An opaque ID of this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectListProjectsInner kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The resource type.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The resource type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ProjectListProjectsInner numericId(String numericId) {
    this.numericId = numericId;
    return this;
  }

  /**
   * The numeric ID of this project.
   * @return numericId
   */
  
  @Schema(name = "numericId", description = "The numeric ID of this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numericId")
  public String getNumericId() {
    return numericId;
  }

  public void setNumericId(String numericId) {
    this.numericId = numericId;
  }

  public ProjectListProjectsInner projectReference(ProjectReference projectReference) {
    this.projectReference = projectReference;
    return this;
  }

  /**
   * Get projectReference
   * @return projectReference
   */
  @Valid 
  @Schema(name = "projectReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectReference")
  public ProjectReference getProjectReference() {
    return projectReference;
  }

  public void setProjectReference(ProjectReference projectReference) {
    this.projectReference = projectReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListProjectsInner projectListProjectsInner = (ProjectListProjectsInner) o;
    return Objects.equals(this.friendlyName, projectListProjectsInner.friendlyName) &&
        Objects.equals(this.id, projectListProjectsInner.id) &&
        Objects.equals(this.kind, projectListProjectsInner.kind) &&
        Objects.equals(this.numericId, projectListProjectsInner.numericId) &&
        Objects.equals(this.projectReference, projectListProjectsInner.projectReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendlyName, id, kind, numericId, projectReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectListProjectsInner {\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    numericId: ").append(toIndentedString(numericId)).append("\n");
    sb.append("    projectReference: ").append(toIndentedString(projectReference)).append("\n");
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

