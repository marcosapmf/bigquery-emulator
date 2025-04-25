package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.JobConfigurationExtract;
import com.liferay.bigquery_emulator.model.JobConfigurationLoad;
import com.liferay.bigquery_emulator.model.JobConfigurationQuery;
import com.liferay.bigquery_emulator.model.JobConfigurationTableCopy;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobConfiguration {

  private JobConfigurationTableCopy copy;

  private Boolean dryRun;

  private JobConfigurationExtract extract;

  private String jobTimeoutMs;

  private String jobType;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private JobConfigurationLoad load;

  private JobConfigurationQuery query;

  public JobConfiguration copy(JobConfigurationTableCopy copy) {
    this.copy = copy;
    return this;
  }

  /**
   * Get copy
   * @return copy
   */
  @Valid 
  @Schema(name = "copy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("copy")
  public JobConfigurationTableCopy getCopy() {
    return copy;
  }

  public void setCopy(JobConfigurationTableCopy copy) {
    this.copy = copy;
  }

  public JobConfiguration dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
   * @return dryRun
   */
  
  @Schema(name = "dryRun", description = "[Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public JobConfiguration extract(JobConfigurationExtract extract) {
    this.extract = extract;
    return this;
  }

  /**
   * Get extract
   * @return extract
   */
  @Valid 
  @Schema(name = "extract", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extract")
  public JobConfigurationExtract getExtract() {
    return extract;
  }

  public void setExtract(JobConfigurationExtract extract) {
    this.extract = extract;
  }

  public JobConfiguration jobTimeoutMs(String jobTimeoutMs) {
    this.jobTimeoutMs = jobTimeoutMs;
    return this;
  }

  /**
   * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
   * @return jobTimeoutMs
   */
  
  @Schema(name = "jobTimeoutMs", description = "[Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobTimeoutMs")
  public String getJobTimeoutMs() {
    return jobTimeoutMs;
  }

  public void setJobTimeoutMs(String jobTimeoutMs) {
    this.jobTimeoutMs = jobTimeoutMs;
  }

  public JobConfiguration jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.
   * @return jobType
   */
  
  @Schema(name = "jobType", description = "[Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobType")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobConfiguration labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public JobConfiguration putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public JobConfiguration load(JobConfigurationLoad load) {
    this.load = load;
    return this;
  }

  /**
   * Get load
   * @return load
   */
  @Valid 
  @Schema(name = "load", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("load")
  public JobConfigurationLoad getLoad() {
    return load;
  }

  public void setLoad(JobConfigurationLoad load) {
    this.load = load;
  }

  public JobConfiguration query(JobConfigurationQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @Valid 
  @Schema(name = "query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public JobConfigurationQuery getQuery() {
    return query;
  }

  public void setQuery(JobConfigurationQuery query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfiguration jobConfiguration = (JobConfiguration) o;
    return Objects.equals(this.copy, jobConfiguration.copy) &&
        Objects.equals(this.dryRun, jobConfiguration.dryRun) &&
        Objects.equals(this.extract, jobConfiguration.extract) &&
        Objects.equals(this.jobTimeoutMs, jobConfiguration.jobTimeoutMs) &&
        Objects.equals(this.jobType, jobConfiguration.jobType) &&
        Objects.equals(this.labels, jobConfiguration.labels) &&
        Objects.equals(this.load, jobConfiguration.load) &&
        Objects.equals(this.query, jobConfiguration.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copy, dryRun, extract, jobTimeoutMs, jobType, labels, load, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfiguration {\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    extract: ").append(toIndentedString(extract)).append("\n");
    sb.append("    jobTimeoutMs: ").append(toIndentedString(jobTimeoutMs)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

