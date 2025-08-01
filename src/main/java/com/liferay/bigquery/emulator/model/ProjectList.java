package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.ProjectListProjectsInner;
import com.fasterxml.jackson.annotation.JsonCreator;

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
 * ProjectList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ProjectList {

  private String etag;

  private String kind = "bigquery#projectList";

  private String nextPageToken;

  @Valid
  private List<@Valid ProjectListProjectsInner> projects = new ArrayList<>();

  private Integer totalItems;

  public ProjectList etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A hash of the page of results
   * @return etag
   */
  
  @Schema(name = "etag", description = "A hash of the page of results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ProjectList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The type of list.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The type of list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ProjectList nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to request the next page of results.
   * @return nextPageToken
   */
  
  @Schema(name = "nextPageToken", description = "A token to request the next page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ProjectList projects(List<@Valid ProjectListProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public ProjectList addProjectsItem(ProjectListProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Projects to which you have at least READ access.
   * @return projects
   */
  @Valid 
  @Schema(name = "projects", description = "Projects to which you have at least READ access.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid ProjectListProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid ProjectListProjectsInner> projects) {
    this.projects = projects;
  }

  public ProjectList totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * The total number of projects in the list.
   * @return totalItems
   */
  
  @Schema(name = "totalItems", description = "The total number of projects in the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectList projectList = (ProjectList) o;
    return Objects.equals(this.etag, projectList.etag) &&
        Objects.equals(this.kind, projectList.kind) &&
        Objects.equals(this.nextPageToken, projectList.nextPageToken) &&
        Objects.equals(this.projects, projectList.projects) &&
        Objects.equals(this.totalItems, projectList.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, nextPageToken, projects, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectList {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

