package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.ConnectionProperty;
import com.liferay.bigquery.emulator.model.DatasetReference;
import com.liferay.bigquery.emulator.model.QueryParameter;
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
 * QueryRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryRequest {

  @Valid
  private List<@Valid ConnectionProperty> connectionProperties = new ArrayList<>();

  private Boolean continuous;

  private Boolean createSession;

  private DatasetReference defaultDataset;

  private Boolean dryRun;

  private String kind = "bigquery#queryRequest";

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String location;

  private Integer maxResults;

  private String maximumBytesBilled;

  private String parameterMode;

  private Boolean preserveNulls;

  private String query;

  @Valid
  private List<@Valid QueryParameter> queryParameters = new ArrayList<>();

  private String requestId;

  private Integer timeoutMs;

  private Boolean useLegacySql = true;

  private Boolean useQueryCache = true;

  public QueryRequest connectionProperties(List<@Valid ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  public QueryRequest addConnectionPropertiesItem(ConnectionProperty connectionPropertiesItem) {
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

  public QueryRequest continuous(Boolean continuous) {
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

  public QueryRequest createSession(Boolean createSession) {
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

  public QueryRequest defaultDataset(DatasetReference defaultDataset) {
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

  public QueryRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid, BigQuery returns statistics about the job such as how many bytes would be processed. If the query is invalid, an error returns. The default value is false.
   * @return dryRun
   */
  
  @Schema(name = "dryRun", description = "[Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid, BigQuery returns statistics about the job such as how many bytes would be processed. If the query is invalid, an error returns. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public QueryRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The resource type of the request.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The resource type of the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public QueryRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public QueryRequest putLabelsItem(String key, String labelsItem) {
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

  public QueryRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The geographic location where the job should run. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
   * @return location
   */
  
  @Schema(name = "location", description = "The geographic location where the job should run. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public QueryRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * [Optional] The maximum number of rows of data to return per page of results. Setting this flag to a small value such as 1000 and then paging through results might improve reliability when the query result set is large. In addition to this limit, responses are also limited to 10 MB. By default, there is no maximum row count, and only the byte limit applies.
   * @return maxResults
   */
  
  @Schema(name = "maxResults", description = "[Optional] The maximum number of rows of data to return per page of results. Setting this flag to a small value such as 1000 and then paging through results might improve reliability when the query result set is large. In addition to this limit, responses are also limited to 10 MB. By default, there is no maximum row count, and only the byte limit applies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public QueryRequest maximumBytesBilled(String maximumBytesBilled) {
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

  public QueryRequest parameterMode(String parameterMode) {
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

  public QueryRequest preserveNulls(Boolean preserveNulls) {
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

  public QueryRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * [Required] A query string, following the BigQuery query syntax, of the query to execute. Example: \"SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]\".
   * @return query
   */
  
  @Schema(name = "query", description = "[Required] A query string, following the BigQuery query syntax, of the query to execute. Example: \"SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QueryRequest queryParameters(List<@Valid QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  public QueryRequest addQueryParametersItem(QueryParameter queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new ArrayList<>();
    }
    this.queryParameters.add(queryParametersItem);
    return this;
  }

  /**
   * Query parameters for Standard SQL queries.
   * @return queryParameters
   */
  @Valid 
  @Schema(name = "queryParameters", description = "Query parameters for Standard SQL queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryParameters")
  public List<@Valid QueryParameter> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters(List<@Valid QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
  }

  public QueryRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * A unique user provided identifier to ensure idempotent behavior for queries. Note that this is different from the job_id. It has the following properties: 1. It is case-sensitive, limited to up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token since they are nullipotent by definition. 3. For the purposes of idempotency ensured by the request_id, a request is considered duplicate of another only if they have the same request_id and are actually duplicates. When determining whether a request is a duplicate of the previous request, all parameters in the request that may affect the behavior are considered. For example, query, connection_properties, query_parameters, use_legacy_sql are parameters that affect the result and are considered when determining whether a request is a duplicate, but properties like timeout_ms don't affect the result and are thus not considered. Dry run query requests are never considered duplicate of another request. 4. When a duplicate mutating query request is detected, it returns: a. the results of the mutation if it completes successfully within the timeout. b. the running operation if it is still in progress at the end of the timeout. 5. Its lifetime is limited to 15 minutes. In other words, if two requests are sent with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.
   * @return requestId
   */
  
  @Schema(name = "requestId", description = "A unique user provided identifier to ensure idempotent behavior for queries. Note that this is different from the job_id. It has the following properties: 1. It is case-sensitive, limited to up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token since they are nullipotent by definition. 3. For the purposes of idempotency ensured by the request_id, a request is considered duplicate of another only if they have the same request_id and are actually duplicates. When determining whether a request is a duplicate of the previous request, all parameters in the request that may affect the behavior are considered. For example, query, connection_properties, query_parameters, use_legacy_sql are parameters that affect the result and are considered when determining whether a request is a duplicate, but properties like timeout_ms don't affect the result and are thus not considered. Dry run query requests are never considered duplicate of another request. 4. When a duplicate mutating query request is detected, it returns: a. the results of the mutation if it completes successfully within the timeout. b. the running operation if it is still in progress at the end of the timeout. 5. Its lifetime is limited to 15 minutes. In other words, if two requests are sent with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public QueryRequest timeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }

  /**
   * [Optional] How long to wait for the query to complete, in milliseconds, before the request times out and returns. Note that this is only a timeout for the request, not the query. If the query takes longer to run than the timeout value, the call returns without any results and with the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to complete and read the results. The default value is 10000 milliseconds (10 seconds).
   * @return timeoutMs
   */
  
  @Schema(name = "timeoutMs", description = "[Optional] How long to wait for the query to complete, in milliseconds, before the request times out and returns. Note that this is only a timeout for the request, not the query. If the query takes longer to run than the timeout value, the call returns without any results and with the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to complete and read the results. The default value is 10000 milliseconds (10 seconds).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeoutMs")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }

  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }

  public QueryRequest useLegacySql(Boolean useLegacySql) {
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

  public QueryRequest useQueryCache(Boolean useQueryCache) {
    this.useQueryCache = useQueryCache;
    return this;
  }

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. The default value is true.
   * @return useQueryCache
   */
  
  @Schema(name = "useQueryCache", description = "[Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. The default value is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useQueryCache")
  public Boolean getUseQueryCache() {
    return useQueryCache;
  }

  public void setUseQueryCache(Boolean useQueryCache) {
    this.useQueryCache = useQueryCache;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(this.connectionProperties, queryRequest.connectionProperties) &&
        Objects.equals(this.continuous, queryRequest.continuous) &&
        Objects.equals(this.createSession, queryRequest.createSession) &&
        Objects.equals(this.defaultDataset, queryRequest.defaultDataset) &&
        Objects.equals(this.dryRun, queryRequest.dryRun) &&
        Objects.equals(this.kind, queryRequest.kind) &&
        Objects.equals(this.labels, queryRequest.labels) &&
        Objects.equals(this.location, queryRequest.location) &&
        Objects.equals(this.maxResults, queryRequest.maxResults) &&
        Objects.equals(this.maximumBytesBilled, queryRequest.maximumBytesBilled) &&
        Objects.equals(this.parameterMode, queryRequest.parameterMode) &&
        Objects.equals(this.preserveNulls, queryRequest.preserveNulls) &&
        Objects.equals(this.query, queryRequest.query) &&
        Objects.equals(this.queryParameters, queryRequest.queryParameters) &&
        Objects.equals(this.requestId, queryRequest.requestId) &&
        Objects.equals(this.timeoutMs, queryRequest.timeoutMs) &&
        Objects.equals(this.useLegacySql, queryRequest.useLegacySql) &&
        Objects.equals(this.useQueryCache, queryRequest.useQueryCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionProperties, continuous, createSession, defaultDataset, dryRun, kind, labels, location, maxResults, maximumBytesBilled, parameterMode, preserveNulls, query, queryParameters, requestId, timeoutMs, useLegacySql, useQueryCache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    sb.append("    connectionProperties: ").append(toIndentedString(connectionProperties)).append("\n");
    sb.append("    continuous: ").append(toIndentedString(continuous)).append("\n");
    sb.append("    createSession: ").append(toIndentedString(createSession)).append("\n");
    sb.append("    defaultDataset: ").append(toIndentedString(defaultDataset)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    maximumBytesBilled: ").append(toIndentedString(maximumBytesBilled)).append("\n");
    sb.append("    parameterMode: ").append(toIndentedString(parameterMode)).append("\n");
    sb.append("    preserveNulls: ").append(toIndentedString(preserveNulls)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
    sb.append("    useLegacySql: ").append(toIndentedString(useLegacySql)).append("\n");
    sb.append("    useQueryCache: ").append(toIndentedString(useQueryCache)).append("\n");
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

