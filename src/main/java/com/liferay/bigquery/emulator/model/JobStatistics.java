package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.DataMaskingStatistics;
import com.liferay.bigquery.emulator.model.JobStatistics2;
import com.liferay.bigquery.emulator.model.JobStatistics3;
import com.liferay.bigquery.emulator.model.JobStatistics4;
import com.liferay.bigquery.emulator.model.JobStatistics5;
import com.liferay.bigquery.emulator.model.JobStatisticsReservationUsageInner;
import com.liferay.bigquery.emulator.model.RowLevelSecurityStatistics;
import com.liferay.bigquery.emulator.model.ScriptStatistics;
import com.liferay.bigquery.emulator.model.SessionInfo;
import com.liferay.bigquery.emulator.model.TransactionInfo;
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
 * JobStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatistics {

  private Double completionRatio;

  private JobStatistics5 copy;

  private String creationTime;

  private DataMaskingStatistics dataMaskingStatistics;

  private String endTime;

  private JobStatistics4 extract;

  private JobStatistics3 load;

  private String numChildJobs;

  private String parentJobId;

  private JobStatistics2 query;

  @Valid
  private List<String> quotaDeferments = new ArrayList<>();

  @Valid
  private List<@Valid JobStatisticsReservationUsageInner> reservationUsage = new ArrayList<>();

  private String reservationId;

  private RowLevelSecurityStatistics rowLevelSecurityStatistics;

  private ScriptStatistics scriptStatistics;

  private SessionInfo sessionInfo;

  private String startTime;

  private String totalBytesProcessed;

  private String totalSlotMs;

  private TransactionInfo transactionInfo;

  public JobStatistics completionRatio(Double completionRatio) {
    this.completionRatio = completionRatio;
    return this;
  }

  /**
   * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
   * @return completionRatio
   */
  
  @Schema(name = "completionRatio", description = "[TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completionRatio")
  public Double getCompletionRatio() {
    return completionRatio;
  }

  public void setCompletionRatio(Double completionRatio) {
    this.completionRatio = completionRatio;
  }

  public JobStatistics copy(JobStatistics5 copy) {
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
  public JobStatistics5 getCopy() {
    return copy;
  }

  public void setCopy(JobStatistics5 copy) {
    this.copy = copy;
  }

  public JobStatistics creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", description = "[Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public JobStatistics dataMaskingStatistics(DataMaskingStatistics dataMaskingStatistics) {
    this.dataMaskingStatistics = dataMaskingStatistics;
    return this;
  }

  /**
   * Get dataMaskingStatistics
   * @return dataMaskingStatistics
   */
  @Valid 
  @Schema(name = "dataMaskingStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataMaskingStatistics")
  public DataMaskingStatistics getDataMaskingStatistics() {
    return dataMaskingStatistics;
  }

  public void setDataMaskingStatistics(DataMaskingStatistics dataMaskingStatistics) {
    this.dataMaskingStatistics = dataMaskingStatistics;
  }

  public JobStatistics endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
   * @return endTime
   */
  
  @Schema(name = "endTime", description = "[Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public JobStatistics extract(JobStatistics4 extract) {
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
  public JobStatistics4 getExtract() {
    return extract;
  }

  public void setExtract(JobStatistics4 extract) {
    this.extract = extract;
  }

  public JobStatistics load(JobStatistics3 load) {
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
  public JobStatistics3 getLoad() {
    return load;
  }

  public void setLoad(JobStatistics3 load) {
    this.load = load;
  }

  public JobStatistics numChildJobs(String numChildJobs) {
    this.numChildJobs = numChildJobs;
    return this;
  }

  /**
   * [Output-only] Number of child jobs executed.
   * @return numChildJobs
   */
  
  @Schema(name = "numChildJobs", description = "[Output-only] Number of child jobs executed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numChildJobs")
  public String getNumChildJobs() {
    return numChildJobs;
  }

  public void setNumChildJobs(String numChildJobs) {
    this.numChildJobs = numChildJobs;
  }

  public JobStatistics parentJobId(String parentJobId) {
    this.parentJobId = parentJobId;
    return this;
  }

  /**
   * [Output-only] If this is a child job, the id of the parent.
   * @return parentJobId
   */
  
  @Schema(name = "parentJobId", description = "[Output-only] If this is a child job, the id of the parent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentJobId")
  public String getParentJobId() {
    return parentJobId;
  }

  public void setParentJobId(String parentJobId) {
    this.parentJobId = parentJobId;
  }

  public JobStatistics query(JobStatistics2 query) {
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
  public JobStatistics2 getQuery() {
    return query;
  }

  public void setQuery(JobStatistics2 query) {
    this.query = query;
  }

  public JobStatistics quotaDeferments(List<String> quotaDeferments) {
    this.quotaDeferments = quotaDeferments;
    return this;
  }

  public JobStatistics addQuotaDefermentsItem(String quotaDefermentsItem) {
    if (this.quotaDeferments == null) {
      this.quotaDeferments = new ArrayList<>();
    }
    this.quotaDeferments.add(quotaDefermentsItem);
    return this;
  }

  /**
   * [Output-only] Quotas which delayed this job's start time.
   * @return quotaDeferments
   */
  
  @Schema(name = "quotaDeferments", description = "[Output-only] Quotas which delayed this job's start time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quotaDeferments")
  public List<String> getQuotaDeferments() {
    return quotaDeferments;
  }

  public void setQuotaDeferments(List<String> quotaDeferments) {
    this.quotaDeferments = quotaDeferments;
  }

  public JobStatistics reservationUsage(List<@Valid JobStatisticsReservationUsageInner> reservationUsage) {
    this.reservationUsage = reservationUsage;
    return this;
  }

  public JobStatistics addReservationUsageItem(JobStatisticsReservationUsageInner reservationUsageItem) {
    if (this.reservationUsage == null) {
      this.reservationUsage = new ArrayList<>();
    }
    this.reservationUsage.add(reservationUsageItem);
    return this;
  }

  /**
   * [Output-only] Job resource usage breakdown by reservation.
   * @return reservationUsage
   */
  @Valid 
  @Schema(name = "reservationUsage", description = "[Output-only] Job resource usage breakdown by reservation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservationUsage")
  public List<@Valid JobStatisticsReservationUsageInner> getReservationUsage() {
    return reservationUsage;
  }

  public void setReservationUsage(List<@Valid JobStatisticsReservationUsageInner> reservationUsage) {
    this.reservationUsage = reservationUsage;
  }

  public JobStatistics reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * [Output-only] Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
   * @return reservationId
   */
  
  @Schema(name = "reservation_id", description = "[Output-only] Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservation_id")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public JobStatistics rowLevelSecurityStatistics(RowLevelSecurityStatistics rowLevelSecurityStatistics) {
    this.rowLevelSecurityStatistics = rowLevelSecurityStatistics;
    return this;
  }

  /**
   * Get rowLevelSecurityStatistics
   * @return rowLevelSecurityStatistics
   */
  @Valid 
  @Schema(name = "rowLevelSecurityStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowLevelSecurityStatistics")
  public RowLevelSecurityStatistics getRowLevelSecurityStatistics() {
    return rowLevelSecurityStatistics;
  }

  public void setRowLevelSecurityStatistics(RowLevelSecurityStatistics rowLevelSecurityStatistics) {
    this.rowLevelSecurityStatistics = rowLevelSecurityStatistics;
  }

  public JobStatistics scriptStatistics(ScriptStatistics scriptStatistics) {
    this.scriptStatistics = scriptStatistics;
    return this;
  }

  /**
   * Get scriptStatistics
   * @return scriptStatistics
   */
  @Valid 
  @Schema(name = "scriptStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scriptStatistics")
  public ScriptStatistics getScriptStatistics() {
    return scriptStatistics;
  }

  public void setScriptStatistics(ScriptStatistics scriptStatistics) {
    this.scriptStatistics = scriptStatistics;
  }

  public JobStatistics sessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

  /**
   * Get sessionInfo
   * @return sessionInfo
   */
  @Valid 
  @Schema(name = "sessionInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionInfo")
  public SessionInfo getSessionInfo() {
    return sessionInfo;
  }

  public void setSessionInfo(SessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }

  public JobStatistics startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
   * @return startTime
   */
  
  @Schema(name = "startTime", description = "[Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public JobStatistics totalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
   * @return totalBytesProcessed
   */
  
  @Schema(name = "totalBytesProcessed", description = "[Output-only] [Deprecated] Use the bytes processed in the query statistics instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBytesProcessed")
  public String getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  public void setTotalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
  }

  public JobStatistics totalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
    return this;
  }

  /**
   * [Output-only] Slot-milliseconds for the job.
   * @return totalSlotMs
   */
  
  @Schema(name = "totalSlotMs", description = "[Output-only] Slot-milliseconds for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSlotMs")
  public String getTotalSlotMs() {
    return totalSlotMs;
  }

  public void setTotalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
  }

  public JobStatistics transactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   * @return transactionInfo
   */
  @Valid 
  @Schema(name = "transactionInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionInfo")
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatistics jobStatistics = (JobStatistics) o;
    return Objects.equals(this.completionRatio, jobStatistics.completionRatio) &&
        Objects.equals(this.copy, jobStatistics.copy) &&
        Objects.equals(this.creationTime, jobStatistics.creationTime) &&
        Objects.equals(this.dataMaskingStatistics, jobStatistics.dataMaskingStatistics) &&
        Objects.equals(this.endTime, jobStatistics.endTime) &&
        Objects.equals(this.extract, jobStatistics.extract) &&
        Objects.equals(this.load, jobStatistics.load) &&
        Objects.equals(this.numChildJobs, jobStatistics.numChildJobs) &&
        Objects.equals(this.parentJobId, jobStatistics.parentJobId) &&
        Objects.equals(this.query, jobStatistics.query) &&
        Objects.equals(this.quotaDeferments, jobStatistics.quotaDeferments) &&
        Objects.equals(this.reservationUsage, jobStatistics.reservationUsage) &&
        Objects.equals(this.reservationId, jobStatistics.reservationId) &&
        Objects.equals(this.rowLevelSecurityStatistics, jobStatistics.rowLevelSecurityStatistics) &&
        Objects.equals(this.scriptStatistics, jobStatistics.scriptStatistics) &&
        Objects.equals(this.sessionInfo, jobStatistics.sessionInfo) &&
        Objects.equals(this.startTime, jobStatistics.startTime) &&
        Objects.equals(this.totalBytesProcessed, jobStatistics.totalBytesProcessed) &&
        Objects.equals(this.totalSlotMs, jobStatistics.totalSlotMs) &&
        Objects.equals(this.transactionInfo, jobStatistics.transactionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionRatio, copy, creationTime, dataMaskingStatistics, endTime, extract, load, numChildJobs, parentJobId, query, quotaDeferments, reservationUsage, reservationId, rowLevelSecurityStatistics, scriptStatistics, sessionInfo, startTime, totalBytesProcessed, totalSlotMs, transactionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatistics {\n");
    sb.append("    completionRatio: ").append(toIndentedString(completionRatio)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    dataMaskingStatistics: ").append(toIndentedString(dataMaskingStatistics)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extract: ").append(toIndentedString(extract)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    numChildJobs: ").append(toIndentedString(numChildJobs)).append("\n");
    sb.append("    parentJobId: ").append(toIndentedString(parentJobId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    quotaDeferments: ").append(toIndentedString(quotaDeferments)).append("\n");
    sb.append("    reservationUsage: ").append(toIndentedString(reservationUsage)).append("\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    rowLevelSecurityStatistics: ").append(toIndentedString(rowLevelSecurityStatistics)).append("\n");
    sb.append("    scriptStatistics: ").append(toIndentedString(scriptStatistics)).append("\n");
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalBytesProcessed: ").append(toIndentedString(totalBytesProcessed)).append("\n");
    sb.append("    totalSlotMs: ").append(toIndentedString(totalSlotMs)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
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

