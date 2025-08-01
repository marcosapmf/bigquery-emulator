package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.JobListJobsInner;
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
 * JobList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobList {

  private String etag;

  @Valid
  private List<@Valid JobListJobsInner> jobs = new ArrayList<>();

  private String kind = "bigquery#jobList";

  private String nextPageToken;

  public JobList etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A hash of this page of results.
   * @return etag
   */
  
  @Schema(name = "etag", description = "A hash of this page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public JobList jobs(List<@Valid JobListJobsInner> jobs) {
    this.jobs = jobs;
    return this;
  }

  public JobList addJobsItem(JobListJobsInner jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

  /**
   * List of jobs that were requested.
   * @return jobs
   */
  @Valid 
  @Schema(name = "jobs", description = "List of jobs that were requested.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobs")
  public List<@Valid JobListJobsInner> getJobs() {
    return jobs;
  }

  public void setJobs(List<@Valid JobListJobsInner> jobs) {
    this.jobs = jobs;
  }

  public JobList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The resource type of the response.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The resource type of the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public JobList nextPageToken(String nextPageToken) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobList jobList = (JobList) o;
    return Objects.equals(this.etag, jobList.etag) &&
        Objects.equals(this.jobs, jobList.jobs) &&
        Objects.equals(this.kind, jobList.kind) &&
        Objects.equals(this.nextPageToken, jobList.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, jobs, kind, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobList {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

