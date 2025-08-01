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
 * JobReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobReference {

  private String jobId;

  private String location;

  private String projectId;

  public JobReference jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
   * @return jobId
   */
  
  @Schema(name = "jobId", description = "[Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public JobReference location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
   * @return location
   */
  
  @Schema(name = "location", description = "The geographic location of the job. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public JobReference projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * [Required] The ID of the project containing this job.
   * @return projectId
   */
  
  @Schema(name = "projectId", description = "[Required] The ID of the project containing this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    JobReference jobReference = (JobReference) o;
    return Objects.equals(this.jobId, jobReference.jobId) &&
        Objects.equals(this.location, jobReference.location) &&
        Objects.equals(this.projectId, jobReference.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, location, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobReference {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

