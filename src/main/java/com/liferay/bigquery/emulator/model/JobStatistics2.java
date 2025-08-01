package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.BiEngineStatistics;
import com.liferay.bigquery.emulator.model.BigQueryModelTraining;
import com.liferay.bigquery.emulator.model.DatasetReference;
import com.liferay.bigquery.emulator.model.DmlStatistics;
import com.liferay.bigquery.emulator.model.ExplainQueryStage;
import com.liferay.bigquery.emulator.model.JobStatistics2ReservationUsageInner;
import com.liferay.bigquery.emulator.model.MlStatistics;
import com.liferay.bigquery.emulator.model.QueryParameter;
import com.liferay.bigquery.emulator.model.QueryTimelineSample;
import com.liferay.bigquery.emulator.model.RoutineReference;
import com.liferay.bigquery.emulator.model.RowAccessPolicyReference;
import com.liferay.bigquery.emulator.model.SearchStatistics;
import com.liferay.bigquery.emulator.model.SparkStatistics;
import com.liferay.bigquery.emulator.model.TableReference;
import com.liferay.bigquery.emulator.model.TableSchema;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

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
 * JobStatistics2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatistics2 {

  private BiEngineStatistics biEngineStatistics;

  private Integer billingTier;

  private Boolean cacheHit;

  private String ddlAffectedRowAccessPolicyCount;

  private TableReference ddlDestinationTable;

  private String ddlOperationPerformed;

  private DatasetReference ddlTargetDataset;

  private RoutineReference ddlTargetRoutine;

  private RowAccessPolicyReference ddlTargetRowAccessPolicy;

  private TableReference ddlTargetTable;

  private DmlStatistics dmlStats;

  private String estimatedBytesProcessed;

  private MlStatistics mlStatistics;

  private BigQueryModelTraining modelTraining;

  private Integer modelTrainingCurrentIteration;

  private String modelTrainingExpectedTotalIteration;

  private String numDmlAffectedRows;

  @Valid
  private List<@Valid ExplainQueryStage> queryPlan = new ArrayList<>();

  @Valid
  private List<@Valid RoutineReference> referencedRoutines = new ArrayList<>();

  @Valid
  private List<@Valid TableReference> referencedTables = new ArrayList<>();

  @Valid
  private List<@Valid JobStatistics2ReservationUsageInner> reservationUsage = new ArrayList<>();

  private TableSchema schema;

  private SearchStatistics searchStatistics;

  private SparkStatistics sparkStatistics;

  private String statementType;

  @Valid
  private List<@Valid QueryTimelineSample> timeline = new ArrayList<>();

  private String totalBytesBilled;

  private String totalBytesProcessed;

  private String totalBytesProcessedAccuracy;

  private String totalPartitionsProcessed;

  private String totalSlotMs;

  private String transferredBytes;

  @Valid
  private List<@Valid QueryParameter> undeclaredQueryParameters = new ArrayList<>();

  public JobStatistics2 biEngineStatistics(BiEngineStatistics biEngineStatistics) {
    this.biEngineStatistics = biEngineStatistics;
    return this;
  }

  /**
   * Get biEngineStatistics
   * @return biEngineStatistics
   */
  @Valid 
  @Schema(name = "biEngineStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biEngineStatistics")
  public BiEngineStatistics getBiEngineStatistics() {
    return biEngineStatistics;
  }

  public void setBiEngineStatistics(BiEngineStatistics biEngineStatistics) {
    this.biEngineStatistics = biEngineStatistics;
  }

  public JobStatistics2 billingTier(Integer billingTier) {
    this.billingTier = billingTier;
    return this;
  }

  /**
   * [Output only] Billing tier for the job.
   * @return billingTier
   */
  
  @Schema(name = "billingTier", description = "[Output only] Billing tier for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billingTier")
  public Integer getBillingTier() {
    return billingTier;
  }

  public void setBillingTier(Integer billingTier) {
    this.billingTier = billingTier;
  }

  public JobStatistics2 cacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * [Output only] Whether the query result was fetched from the query cache.
   * @return cacheHit
   */
  
  @Schema(name = "cacheHit", description = "[Output only] Whether the query result was fetched from the query cache.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheHit")
  public Boolean getCacheHit() {
    return cacheHit;
  }

  public void setCacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
  }

  public JobStatistics2 ddlAffectedRowAccessPolicyCount(String ddlAffectedRowAccessPolicyCount) {
    this.ddlAffectedRowAccessPolicyCount = ddlAffectedRowAccessPolicyCount;
    return this;
  }

  /**
   * [Output only] [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
   * @return ddlAffectedRowAccessPolicyCount
   */
  
  @Schema(name = "ddlAffectedRowAccessPolicyCount", description = "[Output only] [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlAffectedRowAccessPolicyCount")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getDdlAffectedRowAccessPolicyCount() {
    return ddlAffectedRowAccessPolicyCount;
  }

  public void setDdlAffectedRowAccessPolicyCount(String ddlAffectedRowAccessPolicyCount) {
    this.ddlAffectedRowAccessPolicyCount = ddlAffectedRowAccessPolicyCount;
  }

  public JobStatistics2 ddlDestinationTable(TableReference ddlDestinationTable) {
    this.ddlDestinationTable = ddlDestinationTable;
    return this;
  }

  /**
   * Get ddlDestinationTable
   * @return ddlDestinationTable
   */
  @Valid 
  @Schema(name = "ddlDestinationTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlDestinationTable")
  public TableReference getDdlDestinationTable() {
    return ddlDestinationTable;
  }

  public void setDdlDestinationTable(TableReference ddlDestinationTable) {
    this.ddlDestinationTable = ddlDestinationTable;
  }

  public JobStatistics2 ddlOperationPerformed(String ddlOperationPerformed) {
    this.ddlOperationPerformed = ddlOperationPerformed;
    return this;
  }

  /**
   * The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): \"CREATE\": The query created the DDL target. \"SKIP\": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. \"REPLACE\": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. \"DROP\": The query deleted the DDL target.
   * @return ddlOperationPerformed
   */
  
  @Schema(name = "ddlOperationPerformed", description = "The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): \"CREATE\": The query created the DDL target. \"SKIP\": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. \"REPLACE\": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. \"DROP\": The query deleted the DDL target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlOperationPerformed")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getDdlOperationPerformed() {
    return ddlOperationPerformed;
  }

  public void setDdlOperationPerformed(String ddlOperationPerformed) {
    this.ddlOperationPerformed = ddlOperationPerformed;
  }

  public JobStatistics2 ddlTargetDataset(DatasetReference ddlTargetDataset) {
    this.ddlTargetDataset = ddlTargetDataset;
    return this;
  }

  /**
   * Get ddlTargetDataset
   * @return ddlTargetDataset
   */
  @Valid 
  @Schema(name = "ddlTargetDataset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlTargetDataset")
  public DatasetReference getDdlTargetDataset() {
    return ddlTargetDataset;
  }

  public void setDdlTargetDataset(DatasetReference ddlTargetDataset) {
    this.ddlTargetDataset = ddlTargetDataset;
  }

  public JobStatistics2 ddlTargetRoutine(RoutineReference ddlTargetRoutine) {
    this.ddlTargetRoutine = ddlTargetRoutine;
    return this;
  }

  /**
   * Get ddlTargetRoutine
   * @return ddlTargetRoutine
   */
  @Valid 
  @Schema(name = "ddlTargetRoutine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlTargetRoutine")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public RoutineReference getDdlTargetRoutine() {
    return ddlTargetRoutine;
  }

  public void setDdlTargetRoutine(RoutineReference ddlTargetRoutine) {
    this.ddlTargetRoutine = ddlTargetRoutine;
  }

  public JobStatistics2 ddlTargetRowAccessPolicy(RowAccessPolicyReference ddlTargetRowAccessPolicy) {
    this.ddlTargetRowAccessPolicy = ddlTargetRowAccessPolicy;
    return this;
  }

  /**
   * Get ddlTargetRowAccessPolicy
   * @return ddlTargetRowAccessPolicy
   */
  @Valid 
  @Schema(name = "ddlTargetRowAccessPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlTargetRowAccessPolicy")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public RowAccessPolicyReference getDdlTargetRowAccessPolicy() {
    return ddlTargetRowAccessPolicy;
  }

  public void setDdlTargetRowAccessPolicy(RowAccessPolicyReference ddlTargetRowAccessPolicy) {
    this.ddlTargetRowAccessPolicy = ddlTargetRowAccessPolicy;
  }

  public JobStatistics2 ddlTargetTable(TableReference ddlTargetTable) {
    this.ddlTargetTable = ddlTargetTable;
    return this;
  }

  /**
   * Get ddlTargetTable
   * @return ddlTargetTable
   */
  @Valid 
  @Schema(name = "ddlTargetTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ddlTargetTable")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public TableReference getDdlTargetTable() {
    return ddlTargetTable;
  }

  public void setDdlTargetTable(TableReference ddlTargetTable) {
    this.ddlTargetTable = ddlTargetTable;
  }

  public JobStatistics2 dmlStats(DmlStatistics dmlStats) {
    this.dmlStats = dmlStats;
    return this;
  }

  /**
   * Get dmlStats
   * @return dmlStats
   */
  @Valid 
  @Schema(name = "dmlStats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dmlStats")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public DmlStatistics getDmlStats() {
    return dmlStats;
  }

  public void setDmlStats(DmlStatistics dmlStats) {
    this.dmlStats = dmlStats;
  }

  public JobStatistics2 estimatedBytesProcessed(String estimatedBytesProcessed) {
    this.estimatedBytesProcessed = estimatedBytesProcessed;
    return this;
  }

  /**
   * [Output only] The original estimate of bytes processed for the job.
   * @return estimatedBytesProcessed
   */
  
  @Schema(name = "estimatedBytesProcessed", description = "[Output only] The original estimate of bytes processed for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedBytesProcessed")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getEstimatedBytesProcessed() {
    return estimatedBytesProcessed;
  }

  public void setEstimatedBytesProcessed(String estimatedBytesProcessed) {
    this.estimatedBytesProcessed = estimatedBytesProcessed;
  }

  public JobStatistics2 mlStatistics(MlStatistics mlStatistics) {
    this.mlStatistics = mlStatistics;
    return this;
  }

  /**
   * Get mlStatistics
   * @return mlStatistics
   */
  @Valid 
  @Schema(name = "mlStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mlStatistics")
  public MlStatistics getMlStatistics() {
    return mlStatistics;
  }

  public void setMlStatistics(MlStatistics mlStatistics) {
    this.mlStatistics = mlStatistics;
  }

  public JobStatistics2 modelTraining(BigQueryModelTraining modelTraining) {
    this.modelTraining = modelTraining;
    return this;
  }

  /**
   * Get modelTraining
   * @return modelTraining
   */
  @Valid 
  @Schema(name = "modelTraining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelTraining")
  public BigQueryModelTraining getModelTraining() {
    return modelTraining;
  }

  public void setModelTraining(BigQueryModelTraining modelTraining) {
    this.modelTraining = modelTraining;
  }

  public JobStatistics2 modelTrainingCurrentIteration(Integer modelTrainingCurrentIteration) {
    this.modelTrainingCurrentIteration = modelTrainingCurrentIteration;
    return this;
  }

  /**
   * [Output only, Beta] Deprecated; do not use.
   * @return modelTrainingCurrentIteration
   */
  
  @Schema(name = "modelTrainingCurrentIteration", description = "[Output only, Beta] Deprecated; do not use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelTrainingCurrentIteration")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public Integer getModelTrainingCurrentIteration() {
    return modelTrainingCurrentIteration;
  }

  public void setModelTrainingCurrentIteration(Integer modelTrainingCurrentIteration) {
    this.modelTrainingCurrentIteration = modelTrainingCurrentIteration;
  }

  public JobStatistics2 modelTrainingExpectedTotalIteration(String modelTrainingExpectedTotalIteration) {
    this.modelTrainingExpectedTotalIteration = modelTrainingExpectedTotalIteration;
    return this;
  }

  /**
   * [Output only, Beta] Deprecated; do not use.
   * @return modelTrainingExpectedTotalIteration
   */
  
  @Schema(name = "modelTrainingExpectedTotalIteration", description = "[Output only, Beta] Deprecated; do not use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelTrainingExpectedTotalIteration")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getModelTrainingExpectedTotalIteration() {
    return modelTrainingExpectedTotalIteration;
  }

  public void setModelTrainingExpectedTotalIteration(String modelTrainingExpectedTotalIteration) {
    this.modelTrainingExpectedTotalIteration = modelTrainingExpectedTotalIteration;
  }

  public JobStatistics2 numDmlAffectedRows(String numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
    return this;
  }

  /**
   * [Output only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
   * @return numDmlAffectedRows
   */
  
  @Schema(name = "numDmlAffectedRows", description = "[Output only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numDmlAffectedRows")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  public void setNumDmlAffectedRows(String numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
  }

  public JobStatistics2 queryPlan(List<@Valid ExplainQueryStage> queryPlan) {
    this.queryPlan = queryPlan;
    return this;
  }

  public JobStatistics2 addQueryPlanItem(ExplainQueryStage queryPlanItem) {
    if (this.queryPlan == null) {
      this.queryPlan = new ArrayList<>();
    }
    this.queryPlan.add(queryPlanItem);
    return this;
  }

  /**
   * [Output only] Describes execution plan for the query.
   * @return queryPlan
   */
  @Valid 
  @Schema(name = "queryPlan", description = "[Output only] Describes execution plan for the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryPlan")
  public List<@Valid ExplainQueryStage> getQueryPlan() {
    return queryPlan;
  }

  public void setQueryPlan(List<@Valid ExplainQueryStage> queryPlan) {
    this.queryPlan = queryPlan;
  }

  public JobStatistics2 referencedRoutines(List<@Valid RoutineReference> referencedRoutines) {
    this.referencedRoutines = referencedRoutines;
    return this;
  }

  public JobStatistics2 addReferencedRoutinesItem(RoutineReference referencedRoutinesItem) {
    if (this.referencedRoutines == null) {
      this.referencedRoutines = new ArrayList<>();
    }
    this.referencedRoutines.add(referencedRoutinesItem);
    return this;
  }

  /**
   * [Output only] Referenced routines (persistent user-defined functions and stored procedures) for the job.
   * @return referencedRoutines
   */
  @Valid 
  @Schema(name = "referencedRoutines", description = "[Output only] Referenced routines (persistent user-defined functions and stored procedures) for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedRoutines")
  public List<@Valid RoutineReference> getReferencedRoutines() {
    return referencedRoutines;
  }

  public void setReferencedRoutines(List<@Valid RoutineReference> referencedRoutines) {
    this.referencedRoutines = referencedRoutines;
  }

  public JobStatistics2 referencedTables(List<@Valid TableReference> referencedTables) {
    this.referencedTables = referencedTables;
    return this;
  }

  public JobStatistics2 addReferencedTablesItem(TableReference referencedTablesItem) {
    if (this.referencedTables == null) {
      this.referencedTables = new ArrayList<>();
    }
    this.referencedTables.add(referencedTablesItem);
    return this;
  }

  /**
   * [Output only] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
   * @return referencedTables
   */
  @Valid 
  @Schema(name = "referencedTables", description = "[Output only] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedTables")
  public List<@Valid TableReference> getReferencedTables() {
    return referencedTables;
  }

  public void setReferencedTables(List<@Valid TableReference> referencedTables) {
    this.referencedTables = referencedTables;
  }

  public JobStatistics2 reservationUsage(List<@Valid JobStatistics2ReservationUsageInner> reservationUsage) {
    this.reservationUsage = reservationUsage;
    return this;
  }

  public JobStatistics2 addReservationUsageItem(JobStatistics2ReservationUsageInner reservationUsageItem) {
    if (this.reservationUsage == null) {
      this.reservationUsage = new ArrayList<>();
    }
    this.reservationUsage.add(reservationUsageItem);
    return this;
  }

  /**
   * [Output only] Job resource usage breakdown by reservation.
   * @return reservationUsage
   */
  @Valid 
  @Schema(name = "reservationUsage", description = "[Output only] Job resource usage breakdown by reservation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reservationUsage")
  public List<@Valid JobStatistics2ReservationUsageInner> getReservationUsage() {
    return reservationUsage;
  }

  public void setReservationUsage(List<@Valid JobStatistics2ReservationUsageInner> reservationUsage) {
    this.reservationUsage = reservationUsage;
  }

  public JobStatistics2 schema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public TableSchema getSchema() {
    return schema;
  }

  public void setSchema(TableSchema schema) {
    this.schema = schema;
  }

  public JobStatistics2 searchStatistics(SearchStatistics searchStatistics) {
    this.searchStatistics = searchStatistics;
    return this;
  }

  /**
   * Get searchStatistics
   * @return searchStatistics
   */
  @Valid 
  @Schema(name = "searchStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchStatistics")
  public SearchStatistics getSearchStatistics() {
    return searchStatistics;
  }

  public void setSearchStatistics(SearchStatistics searchStatistics) {
    this.searchStatistics = searchStatistics;
  }

  public JobStatistics2 sparkStatistics(SparkStatistics sparkStatistics) {
    this.sparkStatistics = sparkStatistics;
    return this;
  }

  /**
   * Get sparkStatistics
   * @return sparkStatistics
   */
  @Valid 
  @Schema(name = "sparkStatistics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sparkStatistics")
  public SparkStatistics getSparkStatistics() {
    return sparkStatistics;
  }

  public void setSparkStatistics(SparkStatistics sparkStatistics) {
    this.sparkStatistics = sparkStatistics;
  }

  public JobStatistics2 statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * The type of query statement, if valid. Possible values (new values might be added in the future): \"SELECT\": SELECT query. \"INSERT\": INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"UPDATE\": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"DELETE\": DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"MERGE\": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"ALTER_TABLE\": ALTER TABLE query. \"ALTER_VIEW\": ALTER VIEW query. \"ASSERT\": ASSERT condition AS 'description'. \"CREATE_FUNCTION\": CREATE FUNCTION query. \"CREATE_MODEL\": CREATE [OR REPLACE] MODEL ... AS SELECT ... . \"CREATE_PROCEDURE\": CREATE PROCEDURE query. \"CREATE_TABLE\": CREATE [OR REPLACE] TABLE without AS SELECT. \"CREATE_TABLE_AS_SELECT\": CREATE [OR REPLACE] TABLE ... AS SELECT ... . \"CREATE_VIEW\": CREATE [OR REPLACE] VIEW ... AS SELECT ... . \"DROP_FUNCTION\" : DROP FUNCTION query. \"DROP_PROCEDURE\": DROP PROCEDURE query. \"DROP_TABLE\": DROP TABLE query. \"DROP_VIEW\": DROP VIEW query.
   * @return statementType
   */
  
  @Schema(name = "statementType", description = "The type of query statement, if valid. Possible values (new values might be added in the future): \"SELECT\": SELECT query. \"INSERT\": INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"UPDATE\": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"DELETE\": DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"MERGE\": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. \"ALTER_TABLE\": ALTER TABLE query. \"ALTER_VIEW\": ALTER VIEW query. \"ASSERT\": ASSERT condition AS 'description'. \"CREATE_FUNCTION\": CREATE FUNCTION query. \"CREATE_MODEL\": CREATE [OR REPLACE] MODEL ... AS SELECT ... . \"CREATE_PROCEDURE\": CREATE PROCEDURE query. \"CREATE_TABLE\": CREATE [OR REPLACE] TABLE without AS SELECT. \"CREATE_TABLE_AS_SELECT\": CREATE [OR REPLACE] TABLE ... AS SELECT ... . \"CREATE_VIEW\": CREATE [OR REPLACE] VIEW ... AS SELECT ... . \"DROP_FUNCTION\" : DROP FUNCTION query. \"DROP_PROCEDURE\": DROP PROCEDURE query. \"DROP_TABLE\": DROP TABLE query. \"DROP_VIEW\": DROP VIEW query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statementType")
  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public JobStatistics2 timeline(List<@Valid QueryTimelineSample> timeline) {
    this.timeline = timeline;
    return this;
  }

  public JobStatistics2 addTimelineItem(QueryTimelineSample timelineItem) {
    if (this.timeline == null) {
      this.timeline = new ArrayList<>();
    }
    this.timeline.add(timelineItem);
    return this;
  }

  /**
   * [Output only] [Beta] Describes a timeline of job execution.
   * @return timeline
   */
  @Valid 
  @Schema(name = "timeline", description = "[Output only] [Beta] Describes a timeline of job execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeline")
  public List<@Valid QueryTimelineSample> getTimeline() {
    return timeline;
  }

  public void setTimeline(List<@Valid QueryTimelineSample> timeline) {
    this.timeline = timeline;
  }

  public JobStatistics2 totalBytesBilled(String totalBytesBilled) {
    this.totalBytesBilled = totalBytesBilled;
    return this;
  }

  /**
   * [Output only] Total bytes billed for the job.
   * @return totalBytesBilled
   */
  
  @Schema(name = "totalBytesBilled", description = "[Output only] Total bytes billed for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBytesBilled")
  public String getTotalBytesBilled() {
    return totalBytesBilled;
  }

  public void setTotalBytesBilled(String totalBytesBilled) {
    this.totalBytesBilled = totalBytesBilled;
  }

  public JobStatistics2 totalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * [Output only] Total bytes processed for the job.
   * @return totalBytesProcessed
   */
  
  @Schema(name = "totalBytesProcessed", description = "[Output only] Total bytes processed for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBytesProcessed")
  public String getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  public void setTotalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
  }

  public JobStatistics2 totalBytesProcessedAccuracy(String totalBytesProcessedAccuracy) {
    this.totalBytesProcessedAccuracy = totalBytesProcessedAccuracy;
    return this;
  }

  /**
   * [Output only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
   * @return totalBytesProcessedAccuracy
   */
  
  @Schema(name = "totalBytesProcessedAccuracy", description = "[Output only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBytesProcessedAccuracy")
  public String getTotalBytesProcessedAccuracy() {
    return totalBytesProcessedAccuracy;
  }

  public void setTotalBytesProcessedAccuracy(String totalBytesProcessedAccuracy) {
    this.totalBytesProcessedAccuracy = totalBytesProcessedAccuracy;
  }

  public JobStatistics2 totalPartitionsProcessed(String totalPartitionsProcessed) {
    this.totalPartitionsProcessed = totalPartitionsProcessed;
    return this;
  }

  /**
   * [Output only] Total number of partitions processed from all partitioned tables referenced in the job.
   * @return totalPartitionsProcessed
   */
  
  @Schema(name = "totalPartitionsProcessed", description = "[Output only] Total number of partitions processed from all partitioned tables referenced in the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPartitionsProcessed")
  public String getTotalPartitionsProcessed() {
    return totalPartitionsProcessed;
  }

  public void setTotalPartitionsProcessed(String totalPartitionsProcessed) {
    this.totalPartitionsProcessed = totalPartitionsProcessed;
  }

  public JobStatistics2 totalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
    return this;
  }

  /**
   * [Output only] Slot-milliseconds for the job.
   * @return totalSlotMs
   */
  
  @Schema(name = "totalSlotMs", description = "[Output only] Slot-milliseconds for the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSlotMs")
  public String getTotalSlotMs() {
    return totalSlotMs;
  }

  public void setTotalSlotMs(String totalSlotMs) {
    this.totalSlotMs = totalSlotMs;
  }

  public JobStatistics2 transferredBytes(String transferredBytes) {
    this.transferredBytes = transferredBytes;
    return this;
  }

  /**
   * [Output-only] Total bytes transferred for cross-cloud queries such as Cross Cloud Transfer and CREATE TABLE AS SELECT (CTAS).
   * @return transferredBytes
   */
  
  @Schema(name = "transferredBytes", description = "[Output-only] Total bytes transferred for cross-cloud queries such as Cross Cloud Transfer and CREATE TABLE AS SELECT (CTAS).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferredBytes")
  public String getTransferredBytes() {
    return transferredBytes;
  }

  public void setTransferredBytes(String transferredBytes) {
    this.transferredBytes = transferredBytes;
  }

  public JobStatistics2 undeclaredQueryParameters(List<@Valid QueryParameter> undeclaredQueryParameters) {
    this.undeclaredQueryParameters = undeclaredQueryParameters;
    return this;
  }

  public JobStatistics2 addUndeclaredQueryParametersItem(QueryParameter undeclaredQueryParametersItem) {
    if (this.undeclaredQueryParameters == null) {
      this.undeclaredQueryParameters = new ArrayList<>();
    }
    this.undeclaredQueryParameters.add(undeclaredQueryParametersItem);
    return this;
  }

  /**
   * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
   * @return undeclaredQueryParameters
   */
  @Valid 
  @Schema(name = "undeclaredQueryParameters", description = "Standard SQL only: list of undeclared query parameters detected during a dry run validation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("undeclaredQueryParameters")
  public List<@Valid QueryParameter> getUndeclaredQueryParameters() {
    return undeclaredQueryParameters;
  }

  public void setUndeclaredQueryParameters(List<@Valid QueryParameter> undeclaredQueryParameters) {
    this.undeclaredQueryParameters = undeclaredQueryParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatistics2 jobStatistics2 = (JobStatistics2) o;
    return Objects.equals(this.biEngineStatistics, jobStatistics2.biEngineStatistics) &&
        Objects.equals(this.billingTier, jobStatistics2.billingTier) &&
        Objects.equals(this.cacheHit, jobStatistics2.cacheHit) &&
        Objects.equals(this.ddlAffectedRowAccessPolicyCount, jobStatistics2.ddlAffectedRowAccessPolicyCount) &&
        Objects.equals(this.ddlDestinationTable, jobStatistics2.ddlDestinationTable) &&
        Objects.equals(this.ddlOperationPerformed, jobStatistics2.ddlOperationPerformed) &&
        Objects.equals(this.ddlTargetDataset, jobStatistics2.ddlTargetDataset) &&
        Objects.equals(this.ddlTargetRoutine, jobStatistics2.ddlTargetRoutine) &&
        Objects.equals(this.ddlTargetRowAccessPolicy, jobStatistics2.ddlTargetRowAccessPolicy) &&
        Objects.equals(this.ddlTargetTable, jobStatistics2.ddlTargetTable) &&
        Objects.equals(this.dmlStats, jobStatistics2.dmlStats) &&
        Objects.equals(this.estimatedBytesProcessed, jobStatistics2.estimatedBytesProcessed) &&
        Objects.equals(this.mlStatistics, jobStatistics2.mlStatistics) &&
        Objects.equals(this.modelTraining, jobStatistics2.modelTraining) &&
        Objects.equals(this.modelTrainingCurrentIteration, jobStatistics2.modelTrainingCurrentIteration) &&
        Objects.equals(this.modelTrainingExpectedTotalIteration, jobStatistics2.modelTrainingExpectedTotalIteration) &&
        Objects.equals(this.numDmlAffectedRows, jobStatistics2.numDmlAffectedRows) &&
        Objects.equals(this.queryPlan, jobStatistics2.queryPlan) &&
        Objects.equals(this.referencedRoutines, jobStatistics2.referencedRoutines) &&
        Objects.equals(this.referencedTables, jobStatistics2.referencedTables) &&
        Objects.equals(this.reservationUsage, jobStatistics2.reservationUsage) &&
        Objects.equals(this.schema, jobStatistics2.schema) &&
        Objects.equals(this.searchStatistics, jobStatistics2.searchStatistics) &&
        Objects.equals(this.sparkStatistics, jobStatistics2.sparkStatistics) &&
        Objects.equals(this.statementType, jobStatistics2.statementType) &&
        Objects.equals(this.timeline, jobStatistics2.timeline) &&
        Objects.equals(this.totalBytesBilled, jobStatistics2.totalBytesBilled) &&
        Objects.equals(this.totalBytesProcessed, jobStatistics2.totalBytesProcessed) &&
        Objects.equals(this.totalBytesProcessedAccuracy, jobStatistics2.totalBytesProcessedAccuracy) &&
        Objects.equals(this.totalPartitionsProcessed, jobStatistics2.totalPartitionsProcessed) &&
        Objects.equals(this.totalSlotMs, jobStatistics2.totalSlotMs) &&
        Objects.equals(this.transferredBytes, jobStatistics2.transferredBytes) &&
        Objects.equals(this.undeclaredQueryParameters, jobStatistics2.undeclaredQueryParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biEngineStatistics, billingTier, cacheHit, ddlAffectedRowAccessPolicyCount, ddlDestinationTable, ddlOperationPerformed, ddlTargetDataset, ddlTargetRoutine, ddlTargetRowAccessPolicy, ddlTargetTable, dmlStats, estimatedBytesProcessed, mlStatistics, modelTraining, modelTrainingCurrentIteration, modelTrainingExpectedTotalIteration, numDmlAffectedRows, queryPlan, referencedRoutines, referencedTables, reservationUsage, schema, searchStatistics, sparkStatistics, statementType, timeline, totalBytesBilled, totalBytesProcessed, totalBytesProcessedAccuracy, totalPartitionsProcessed, totalSlotMs, transferredBytes, undeclaredQueryParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatistics2 {\n");
    sb.append("    biEngineStatistics: ").append(toIndentedString(biEngineStatistics)).append("\n");
    sb.append("    billingTier: ").append(toIndentedString(billingTier)).append("\n");
    sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
    sb.append("    ddlAffectedRowAccessPolicyCount: ").append(toIndentedString(ddlAffectedRowAccessPolicyCount)).append("\n");
    sb.append("    ddlDestinationTable: ").append(toIndentedString(ddlDestinationTable)).append("\n");
    sb.append("    ddlOperationPerformed: ").append(toIndentedString(ddlOperationPerformed)).append("\n");
    sb.append("    ddlTargetDataset: ").append(toIndentedString(ddlTargetDataset)).append("\n");
    sb.append("    ddlTargetRoutine: ").append(toIndentedString(ddlTargetRoutine)).append("\n");
    sb.append("    ddlTargetRowAccessPolicy: ").append(toIndentedString(ddlTargetRowAccessPolicy)).append("\n");
    sb.append("    ddlTargetTable: ").append(toIndentedString(ddlTargetTable)).append("\n");
    sb.append("    dmlStats: ").append(toIndentedString(dmlStats)).append("\n");
    sb.append("    estimatedBytesProcessed: ").append(toIndentedString(estimatedBytesProcessed)).append("\n");
    sb.append("    mlStatistics: ").append(toIndentedString(mlStatistics)).append("\n");
    sb.append("    modelTraining: ").append(toIndentedString(modelTraining)).append("\n");
    sb.append("    modelTrainingCurrentIteration: ").append(toIndentedString(modelTrainingCurrentIteration)).append("\n");
    sb.append("    modelTrainingExpectedTotalIteration: ").append(toIndentedString(modelTrainingExpectedTotalIteration)).append("\n");
    sb.append("    numDmlAffectedRows: ").append(toIndentedString(numDmlAffectedRows)).append("\n");
    sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
    sb.append("    referencedRoutines: ").append(toIndentedString(referencedRoutines)).append("\n");
    sb.append("    referencedTables: ").append(toIndentedString(referencedTables)).append("\n");
    sb.append("    reservationUsage: ").append(toIndentedString(reservationUsage)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    searchStatistics: ").append(toIndentedString(searchStatistics)).append("\n");
    sb.append("    sparkStatistics: ").append(toIndentedString(sparkStatistics)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    totalBytesBilled: ").append(toIndentedString(totalBytesBilled)).append("\n");
    sb.append("    totalBytesProcessed: ").append(toIndentedString(totalBytesProcessed)).append("\n");
    sb.append("    totalBytesProcessedAccuracy: ").append(toIndentedString(totalBytesProcessedAccuracy)).append("\n");
    sb.append("    totalPartitionsProcessed: ").append(toIndentedString(totalPartitionsProcessed)).append("\n");
    sb.append("    totalSlotMs: ").append(toIndentedString(totalSlotMs)).append("\n");
    sb.append("    transferredBytes: ").append(toIndentedString(transferredBytes)).append("\n");
    sb.append("    undeclaredQueryParameters: ").append(toIndentedString(undeclaredQueryParameters)).append("\n");
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

