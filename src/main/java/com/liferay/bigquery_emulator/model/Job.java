package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.liferay.bigquery_emulator.model.JobConfiguration;
import com.liferay.bigquery_emulator.model.JobReference;
import com.liferay.bigquery_emulator.model.JobStatistics;
import com.liferay.bigquery_emulator.model.JobStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Job
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Job {

  private JobConfiguration _configuration;

  private String etag;

  private String id;

  private JobReference jobReference;

  private String kind = "bigquery#job";

  private String selfLink;

  private JobStatistics statistics;

  private JobStatus status;

  private String userEmail;

  public Job _configuration(JobConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @Valid 
  @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public JobConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(JobConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public Job etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Output-only] A hash of this resource.
   * @return etag
   */
  
  @Schema(name = "etag", description = "[Output-only] A hash of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Job id(String id) {
    this.id = id;
    return this;
  }

  /**
   * [Output-only] Opaque ID field of the job
   * @return id
   */
  
  @Schema(name = "id", description = "[Output-only] Opaque ID field of the job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Job jobReference(JobReference jobReference) {
    this.jobReference = jobReference;
    return this;
  }

  /**
   * Get jobReference
   * @return jobReference
   */
  @Valid 
  @Schema(name = "jobReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobReference")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public JobReference getJobReference() {
    return jobReference;
  }

  public void setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
  }

  public Job kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] The type of the resource.
   * @return kind
   */
  
  @Schema(name = "kind", description = "[Output-only] The type of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Job selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @return selfLink
   */
  
  @Schema(name = "selfLink", description = "[Output-only] A URL that can be used to access this resource again.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfLink")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public Job statistics(JobStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * @return statistics
   */
  @Valid 
  @Schema(name = "statistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statistics")
  public JobStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(JobStatistics statistics) {
    this.statistics = statistics;
  }

  public Job status(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public JobStatus getStatus() {
    return status;
  }

  public void setStatus(JobStatus status) {
    this.status = status;
  }

  public Job userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * [Output-only] Email address of the user who ran the job.
   * @return userEmail
   */
  
  @Schema(name = "user_email", description = "[Output-only] Email address of the user who ran the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this._configuration, job._configuration) &&
        Objects.equals(this.etag, job.etag) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.jobReference, job.jobReference) &&
        Objects.equals(this.kind, job.kind) &&
        Objects.equals(this.selfLink, job.selfLink) &&
        Objects.equals(this.statistics, job.statistics) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.userEmail, job.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, etag, id, jobReference, kind, selfLink, statistics, status, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobReference: ").append(toIndentedString(jobReference)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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

