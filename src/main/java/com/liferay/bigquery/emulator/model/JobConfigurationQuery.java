package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.Clustering;
import com.liferay.bigquery.emulator.model.ConnectionProperty;
import com.liferay.bigquery.emulator.model.DatasetReference;
import com.liferay.bigquery.emulator.model.EncryptionConfiguration;
import com.liferay.bigquery.emulator.model.ExternalDataConfiguration;
import com.liferay.bigquery.emulator.model.QueryParameter;
import com.liferay.bigquery.emulator.model.RangePartitioning;
import com.liferay.bigquery.emulator.model.TableReference;
import com.liferay.bigquery.emulator.model.TimePartitioning;
import com.liferay.bigquery.emulator.model.UserDefinedFunctionResource;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobConfigurationQuery
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobConfigurationQuery {

  private Boolean allowLargeResults = false;

  private Clustering clustering;

  @Valid
  private List<@Valid ConnectionProperty> connectionProperties = new ArrayList<>();

  private Boolean continuous;

  private String createDisposition;

  private Boolean createSession;

  private DatasetReference defaultDataset;

  private EncryptionConfiguration destinationEncryptionConfiguration;

  private TableReference destinationTable;

  private Boolean flattenResults = true;

  private Integer maximumBillingTier = 1;

  private String maximumBytesBilled;

  private String parameterMode;

  private Boolean preserveNulls;

  private String priority;

  private String query;

  @Valid
  private List<@Valid QueryParameter> queryParameters = new ArrayList<>();

  private RangePartitioning rangePartitioning;

  @Valid
  private List<String> schemaUpdateOptions = new ArrayList<>();

  @Valid
  private Map<String, ExternalDataConfiguration> tableDefinitions = new HashMap<>();

  private TimePartitioning timePartitioning;

  private Boolean useLegacySql = true;

  private Boolean useQueryCache = true;

  @Valid
  private List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources = new ArrayList<>();

  private String writeDisposition;

  public JobConfigurationQuery allowLargeResults(Boolean allowLargeResults) {
    this.allowLargeResults = allowLargeResults;
    return this;
  }

  /**
   * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
   * @return allowLargeResults
   */
  
  @Schema(name = "allowLargeResults", description = "[Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowLargeResults")
  public Boolean getAllowLargeResults() {
    return allowLargeResults;
  }

  public void setAllowLargeResults(Boolean allowLargeResults) {
    this.allowLargeResults = allowLargeResults;
  }

  public JobConfigurationQuery clustering(Clustering clustering) {
    this.clustering = clustering;
    return this;
  }

  /**
   * Get clustering
   * @return clustering
   */
  @Valid 
  @Schema(name = "clustering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clustering")
  public Clustering getClustering() {
    return clustering;
  }

  public void setClustering(Clustering clustering) {
    this.clustering = clustering;
  }

  public JobConfigurationQuery connectionProperties(List<@Valid ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  public JobConfigurationQuery addConnectionPropertiesItem(ConnectionProperty connectionPropertiesItem) {
    if (this.connectionProperties == null) {
      this.connectionProperties = new ArrayList<>();
    }
    this.connectionProperties.add(connectionPropertiesItem);
    return this;
  }

  /**
   * Connection properties.
   * @return connectionProperties
   */
  @Valid 
  @Schema(name = "connectionProperties", description = "Connection properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionProperties")
  public List<@Valid ConnectionProperty> getConnectionProperties() {
    return connectionProperties;
  }

  public void setConnectionProperties(List<@Valid ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public JobConfigurationQuery continuous(Boolean continuous) {
    this.continuous = continuous;
    return this;
  }

  /**
   * [Optional] Specifies whether the query should be executed as a continuous query. The default value is false.
   * @return continuous
   */
  
  @Schema(name = "continuous", description = "[Optional] Specifies whether the query should be executed as a continuous query. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("continuous")
  public Boolean getContinuous() {
    return continuous;
  }

  public void setContinuous(Boolean continuous) {
    this.continuous = continuous;
  }

  public JobConfigurationQuery createDisposition(String createDisposition) {
    this.createDisposition = createDisposition;
    return this;
  }

  /**
   * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
   * @return createDisposition
   */
  
  @Schema(name = "createDisposition", description = "[Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDisposition")
  public String getCreateDisposition() {
    return createDisposition;
  }

  public void setCreateDisposition(String createDisposition) {
    this.createDisposition = createDisposition;
  }

  public JobConfigurationQuery createSession(Boolean createSession) {
    this.createSession = createSession;
    return this;
  }

  /**
   * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.
   * @return createSession
   */
  
  @Schema(name = "createSession", description = "If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs query in non-session mode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createSession")
  public Boolean getCreateSession() {
    return createSession;
  }

  public void setCreateSession(Boolean createSession) {
    this.createSession = createSession;
  }

  public JobConfigurationQuery defaultDataset(DatasetReference defaultDataset) {
    this.defaultDataset = defaultDataset;
    return this;
  }

  /**
   * Get defaultDataset
   * @return defaultDataset
   */
  @Valid 
  @Schema(name = "defaultDataset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultDataset")
  public DatasetReference getDefaultDataset() {
    return defaultDataset;
  }

  public void setDefaultDataset(DatasetReference defaultDataset) {
    this.defaultDataset = defaultDataset;
  }

  public JobConfigurationQuery destinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
    return this;
  }

  /**
   * Get destinationEncryptionConfiguration
   * @return destinationEncryptionConfiguration
   */
  @Valid 
  @Schema(name = "destinationEncryptionConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationEncryptionConfiguration")
  public EncryptionConfiguration getDestinationEncryptionConfiguration() {
    return destinationEncryptionConfiguration;
  }

  public void setDestinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
  }

  public JobConfigurationQuery destinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  /**
   * Get destinationTable
   * @return destinationTable
   */
  @Valid 
  @Schema(name = "destinationTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationTable")
  public TableReference getDestinationTable() {
    return destinationTable;
  }

  public void setDestinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
  }

  public JobConfigurationQuery flattenResults(Boolean flattenResults) {
    this.flattenResults = flattenResults;
    return this;
  }

  /**
   * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
   * @return flattenResults
   */
  
  @Schema(name = "flattenResults", description = "[Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flattenResults")
  public Boolean getFlattenResults() {
    return flattenResults;
  }

  public void setFlattenResults(Boolean flattenResults) {
    this.flattenResults = flattenResults;
  }

  public JobConfigurationQuery maximumBillingTier(Integer maximumBillingTier) {
    this.maximumBillingTier = maximumBillingTier;
    return this;
  }

  /**
   * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
   * @return maximumBillingTier
   */
  
  @Schema(name = "maximumBillingTier", description = "[Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumBillingTier")
  public Integer getMaximumBillingTier() {
    return maximumBillingTier;
  }

  public void setMaximumBillingTier(Integer maximumBillingTier) {
    this.maximumBillingTier = maximumBillingTier;
  }

  public JobConfigurationQuery maximumBytesBilled(String maximumBytesBilled) {
    this.maximumBytesBilled = maximumBytesBilled;
    return this;
  }

  /**
   * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
   * @return maximumBytesBilled
   */
  
  @Schema(name = "maximumBytesBilled", description = "[Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumBytesBilled")
  public String getMaximumBytesBilled() {
    return maximumBytesBilled;
  }

  public void setMaximumBytesBilled(String maximumBytesBilled) {
    this.maximumBytesBilled = maximumBytesBilled;
  }

  public JobConfigurationQuery parameterMode(String parameterMode) {
    this.parameterMode = parameterMode;
    return this;
  }

  /**
   * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
   * @return parameterMode
   */
  
  @Schema(name = "parameterMode", description = "Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameterMode")
  public String getParameterMode() {
    return parameterMode;
  }

  public void setParameterMode(String parameterMode) {
    this.parameterMode = parameterMode;
  }

  public JobConfigurationQuery preserveNulls(Boolean preserveNulls) {
    this.preserveNulls = preserveNulls;
    return this;
  }

  /**
   * [Deprecated] This property is deprecated.
   * @return preserveNulls
   */
  
  @Schema(name = "preserveNulls", description = "[Deprecated] This property is deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserveNulls")
  public Boolean getPreserveNulls() {
    return preserveNulls;
  }

  public void setPreserveNulls(Boolean preserveNulls) {
    this.preserveNulls = preserveNulls;
  }

  public JobConfigurationQuery priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
   * @return priority
   */
  
  @Schema(name = "priority", description = "[Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public JobConfigurationQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
   * @return query
   */
  
  @Schema(name = "query", description = "[Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public JobConfigurationQuery queryParameters(List<@Valid QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  public JobConfigurationQuery addQueryParametersItem(QueryParameter queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new ArrayList<>();
    }
    this.queryParameters.add(queryParametersItem);
    return this;
  }

  /**
   * Query parameters for standard SQL queries.
   * @return queryParameters
   */
  @Valid 
  @Schema(name = "queryParameters", description = "Query parameters for standard SQL queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryParameters")
  public List<@Valid QueryParameter> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters(List<@Valid QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
  }

  public JobConfigurationQuery rangePartitioning(RangePartitioning rangePartitioning) {
    this.rangePartitioning = rangePartitioning;
    return this;
  }

  /**
   * Get rangePartitioning
   * @return rangePartitioning
   */
  @Valid 
  @Schema(name = "rangePartitioning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rangePartitioning")
  public RangePartitioning getRangePartitioning() {
    return rangePartitioning;
  }

  public void setRangePartitioning(RangePartitioning rangePartitioning) {
    this.rangePartitioning = rangePartitioning;
  }

  public JobConfigurationQuery schemaUpdateOptions(List<String> schemaUpdateOptions) {
    this.schemaUpdateOptions = schemaUpdateOptions;
    return this;
  }

  public JobConfigurationQuery addSchemaUpdateOptionsItem(String schemaUpdateOptionsItem) {
    if (this.schemaUpdateOptions == null) {
      this.schemaUpdateOptions = new ArrayList<>();
    }
    this.schemaUpdateOptions.add(schemaUpdateOptionsItem);
    return this;
  }

  /**
   * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
   * @return schemaUpdateOptions
   */
  
  @Schema(name = "schemaUpdateOptions", description = "Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaUpdateOptions")
  public List<String> getSchemaUpdateOptions() {
    return schemaUpdateOptions;
  }

  public void setSchemaUpdateOptions(List<String> schemaUpdateOptions) {
    this.schemaUpdateOptions = schemaUpdateOptions;
  }

  public JobConfigurationQuery tableDefinitions(Map<String, ExternalDataConfiguration> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
    return this;
  }

  public JobConfigurationQuery putTableDefinitionsItem(String key, ExternalDataConfiguration tableDefinitionsItem) {
    if (this.tableDefinitions == null) {
      this.tableDefinitions = new HashMap<>();
    }
    this.tableDefinitions.put(key, tableDefinitionsItem);
    return this;
  }

  /**
   * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
   * @return tableDefinitions
   */
  @Valid 
  @Schema(name = "tableDefinitions", description = "[Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tableDefinitions")
  public Map<String, ExternalDataConfiguration> getTableDefinitions() {
    return tableDefinitions;
  }

  public void setTableDefinitions(Map<String, ExternalDataConfiguration> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
  }

  public JobConfigurationQuery timePartitioning(TimePartitioning timePartitioning) {
    this.timePartitioning = timePartitioning;
    return this;
  }

  /**
   * Get timePartitioning
   * @return timePartitioning
   */
  @Valid 
  @Schema(name = "timePartitioning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timePartitioning")
  public TimePartitioning getTimePartitioning() {
    return timePartitioning;
  }

  public void setTimePartitioning(TimePartitioning timePartitioning) {
    this.timePartitioning = timePartitioning;
  }

  public JobConfigurationQuery useLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
   * @return useLegacySql
   */
  
  @Schema(name = "useLegacySql", description = "Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useLegacySql")
  public Boolean getUseLegacySql() {
    return useLegacySql;
  }

  public void setUseLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
  }

  public JobConfigurationQuery useQueryCache(Boolean useQueryCache) {
    this.useQueryCache = useQueryCache;
    return this;
  }

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
   * @return useQueryCache
   */
  
  @Schema(name = "useQueryCache", description = "[Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useQueryCache")
  public Boolean getUseQueryCache() {
    return useQueryCache;
  }

  public void setUseQueryCache(Boolean useQueryCache) {
    this.useQueryCache = useQueryCache;
  }

  public JobConfigurationQuery userDefinedFunctionResources(List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
    return this;
  }

  public JobConfigurationQuery addUserDefinedFunctionResourcesItem(UserDefinedFunctionResource userDefinedFunctionResourcesItem) {
    if (this.userDefinedFunctionResources == null) {
      this.userDefinedFunctionResources = new ArrayList<>();
    }
    this.userDefinedFunctionResources.add(userDefinedFunctionResourcesItem);
    return this;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @return userDefinedFunctionResources
   */
  @Valid 
  @Schema(name = "userDefinedFunctionResources", description = "Describes user-defined function resources used in the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userDefinedFunctionResources")
  public List<@Valid UserDefinedFunctionResource> getUserDefinedFunctionResources() {
    return userDefinedFunctionResources;
  }

  public void setUserDefinedFunctionResources(List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
  }

  public JobConfigurationQuery writeDisposition(String writeDisposition) {
    this.writeDisposition = writeDisposition;
    return this;
  }

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
   * @return writeDisposition
   */
  
  @Schema(name = "writeDisposition", description = "[Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeDisposition")
  public String getWriteDisposition() {
    return writeDisposition;
  }

  public void setWriteDisposition(String writeDisposition) {
    this.writeDisposition = writeDisposition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfigurationQuery jobConfigurationQuery = (JobConfigurationQuery) o;
    return Objects.equals(this.allowLargeResults, jobConfigurationQuery.allowLargeResults) &&
        Objects.equals(this.clustering, jobConfigurationQuery.clustering) &&
        Objects.equals(this.connectionProperties, jobConfigurationQuery.connectionProperties) &&
        Objects.equals(this.continuous, jobConfigurationQuery.continuous) &&
        Objects.equals(this.createDisposition, jobConfigurationQuery.createDisposition) &&
        Objects.equals(this.createSession, jobConfigurationQuery.createSession) &&
        Objects.equals(this.defaultDataset, jobConfigurationQuery.defaultDataset) &&
        Objects.equals(this.destinationEncryptionConfiguration, jobConfigurationQuery.destinationEncryptionConfiguration) &&
        Objects.equals(this.destinationTable, jobConfigurationQuery.destinationTable) &&
        Objects.equals(this.flattenResults, jobConfigurationQuery.flattenResults) &&
        Objects.equals(this.maximumBillingTier, jobConfigurationQuery.maximumBillingTier) &&
        Objects.equals(this.maximumBytesBilled, jobConfigurationQuery.maximumBytesBilled) &&
        Objects.equals(this.parameterMode, jobConfigurationQuery.parameterMode) &&
        Objects.equals(this.preserveNulls, jobConfigurationQuery.preserveNulls) &&
        Objects.equals(this.priority, jobConfigurationQuery.priority) &&
        Objects.equals(this.query, jobConfigurationQuery.query) &&
        Objects.equals(this.queryParameters, jobConfigurationQuery.queryParameters) &&
        Objects.equals(this.rangePartitioning, jobConfigurationQuery.rangePartitioning) &&
        Objects.equals(this.schemaUpdateOptions, jobConfigurationQuery.schemaUpdateOptions) &&
        Objects.equals(this.tableDefinitions, jobConfigurationQuery.tableDefinitions) &&
        Objects.equals(this.timePartitioning, jobConfigurationQuery.timePartitioning) &&
        Objects.equals(this.useLegacySql, jobConfigurationQuery.useLegacySql) &&
        Objects.equals(this.useQueryCache, jobConfigurationQuery.useQueryCache) &&
        Objects.equals(this.userDefinedFunctionResources, jobConfigurationQuery.userDefinedFunctionResources) &&
        Objects.equals(this.writeDisposition, jobConfigurationQuery.writeDisposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowLargeResults, clustering, connectionProperties, continuous, createDisposition, createSession, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, preserveNulls, priority, query, queryParameters, rangePartitioning, schemaUpdateOptions, tableDefinitions, timePartitioning, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfigurationQuery {\n");
    sb.append("    allowLargeResults: ").append(toIndentedString(allowLargeResults)).append("\n");
    sb.append("    clustering: ").append(toIndentedString(clustering)).append("\n");
    sb.append("    connectionProperties: ").append(toIndentedString(connectionProperties)).append("\n");
    sb.append("    continuous: ").append(toIndentedString(continuous)).append("\n");
    sb.append("    createDisposition: ").append(toIndentedString(createDisposition)).append("\n");
    sb.append("    createSession: ").append(toIndentedString(createSession)).append("\n");
    sb.append("    defaultDataset: ").append(toIndentedString(defaultDataset)).append("\n");
    sb.append("    destinationEncryptionConfiguration: ").append(toIndentedString(destinationEncryptionConfiguration)).append("\n");
    sb.append("    destinationTable: ").append(toIndentedString(destinationTable)).append("\n");
    sb.append("    flattenResults: ").append(toIndentedString(flattenResults)).append("\n");
    sb.append("    maximumBillingTier: ").append(toIndentedString(maximumBillingTier)).append("\n");
    sb.append("    maximumBytesBilled: ").append(toIndentedString(maximumBytesBilled)).append("\n");
    sb.append("    parameterMode: ").append(toIndentedString(parameterMode)).append("\n");
    sb.append("    preserveNulls: ").append(toIndentedString(preserveNulls)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    rangePartitioning: ").append(toIndentedString(rangePartitioning)).append("\n");
    sb.append("    schemaUpdateOptions: ").append(toIndentedString(schemaUpdateOptions)).append("\n");
    sb.append("    tableDefinitions: ").append(toIndentedString(tableDefinitions)).append("\n");
    sb.append("    timePartitioning: ").append(toIndentedString(timePartitioning)).append("\n");
    sb.append("    useLegacySql: ").append(toIndentedString(useLegacySql)).append("\n");
    sb.append("    useQueryCache: ").append(toIndentedString(useQueryCache)).append("\n");
    sb.append("    userDefinedFunctionResources: ").append(toIndentedString(userDefinedFunctionResources)).append("\n");
    sb.append("    writeDisposition: ").append(toIndentedString(writeDisposition)).append("\n");
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

