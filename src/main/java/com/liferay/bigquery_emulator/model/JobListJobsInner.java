package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery_emulator.model.ErrorProto;
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
 * JobListJobsInner
 */

@JsonTypeName("JobList_jobs_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobListJobsInner {

  private JobConfiguration _configuration;

  private ErrorProto errorResult;

  private String id;

  private JobReference jobReference;

  private String kind = "bigquery#job";

  private String state;

  private JobStatistics statistics;

  private JobStatus status;

  private String userEmail;

  public JobListJobsInner _configuration(JobConfiguration _configuration) {
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

  public JobListJobsInner errorResult(ErrorProto errorResult) {
    this.errorResult = errorResult;
    return this;
  }

  /**
   * Get errorResult
   * @return errorResult
   */
  @Valid 
  @Schema(name = "errorResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorResult")
  public ErrorProto getErrorResult() {
    return errorResult;
  }

  public void setErrorResult(ErrorProto errorResult) {
    this.errorResult = errorResult;
  }

  public JobListJobsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique opaque ID of the job.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique opaque ID of the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JobListJobsInner jobReference(JobReference jobReference) {
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
  public JobReference getJobReference() {
    return jobReference;
  }

  public void setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
  }

  public JobListJobsInner kind(String kind) {
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

  public JobListJobsInner state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed.
   * @return state
   */
  
  @Schema(name = "state", description = "Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public JobListJobsInner statistics(JobStatistics statistics) {
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

  public JobListJobsInner status(JobStatus status) {
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

  public JobListJobsInner userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * [Full-projection-only] Email address of the user who ran the job.
   * @return userEmail
   */
  
  @Schema(name = "user_email", description = "[Full-projection-only] Email address of the user who ran the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    JobListJobsInner jobListJobsInner = (JobListJobsInner) o;
    return Objects.equals(this._configuration, jobListJobsInner._configuration) &&
        Objects.equals(this.errorResult, jobListJobsInner.errorResult) &&
        Objects.equals(this.id, jobListJobsInner.id) &&
        Objects.equals(this.jobReference, jobListJobsInner.jobReference) &&
        Objects.equals(this.kind, jobListJobsInner.kind) &&
        Objects.equals(this.state, jobListJobsInner.state) &&
        Objects.equals(this.statistics, jobListJobsInner.statistics) &&
        Objects.equals(this.status, jobListJobsInner.status) &&
        Objects.equals(this.userEmail, jobListJobsInner.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, errorResult, id, jobReference, kind, state, statistics, status, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobListJobsInner {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    errorResult: ").append(toIndentedString(errorResult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobReference: ").append(toIndentedString(jobReference)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

