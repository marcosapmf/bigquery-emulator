package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.ErrorProto;
import com.liferay.bigquery_emulator.model.JobReference;
import com.liferay.bigquery_emulator.model.TableRow;
import com.liferay.bigquery_emulator.model.TableSchema;
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
 * GetQueryResultsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class GetQueryResultsResponse {

  private Boolean cacheHit;

  @Valid
  private List<@Valid ErrorProto> errors = new ArrayList<>();

  private String etag;

  private Boolean jobComplete;

  private JobReference jobReference;

  private String kind = "bigquery#getQueryResultsResponse";

  private String numDmlAffectedRows;

  private String pageToken;

  @Valid
  private List<@Valid TableRow> rows = new ArrayList<>();

  private TableSchema schema;

  private String totalBytesProcessed;

  private String totalRows;

  public GetQueryResultsResponse cacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * Whether the query result was fetched from the query cache.
   * @return cacheHit
   */
  
  @Schema(name = "cacheHit", description = "Whether the query result was fetched from the query cache.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cacheHit")
  public Boolean getCacheHit() {
    return cacheHit;
  }

  public void setCacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
  }

  public GetQueryResultsResponse errors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  public GetQueryResultsResponse addErrorsItem(ErrorProto errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * [Output-only] The first errors or warnings encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "[Output-only] The first errors or warnings encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorProto> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
  }

  public GetQueryResultsResponse etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A hash of this response.
   * @return etag
   */
  
  @Schema(name = "etag", description = "A hash of this response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public GetQueryResultsResponse jobComplete(Boolean jobComplete) {
    this.jobComplete = jobComplete;
    return this;
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be true. If this is false, totalRows will not be available.
   * @return jobComplete
   */
  
  @Schema(name = "jobComplete", description = "Whether the query has completed or not. If rows or totalRows are present, this will always be true. If this is false, totalRows will not be available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobComplete")
  public Boolean getJobComplete() {
    return jobComplete;
  }

  public void setJobComplete(Boolean jobComplete) {
    this.jobComplete = jobComplete;
  }

  public GetQueryResultsResponse jobReference(JobReference jobReference) {
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

  public GetQueryResultsResponse kind(String kind) {
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

  public GetQueryResultsResponse numDmlAffectedRows(String numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
    return this;
  }

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
   * @return numDmlAffectedRows
   */
  
  @Schema(name = "numDmlAffectedRows", description = "[Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numDmlAffectedRows")
  public String getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  public void setNumDmlAffectedRows(String numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
  }

  public GetQueryResultsResponse pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * A token used for paging results.
   * @return pageToken
   */
  
  @Schema(name = "pageToken", description = "A token used for paging results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public GetQueryResultsResponse rows(List<@Valid TableRow> rows) {
    this.rows = rows;
    return this;
  }

  public GetQueryResultsResponse addRowsItem(TableRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To get any additional rows, you can call GetQueryResults and specify the jobReference returned above. Present only when the query completes successfully.
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", description = "An object with as many results as can be contained within the maximum permitted reply size. To get any additional rows, you can call GetQueryResults and specify the jobReference returned above. Present only when the query completes successfully.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public List<@Valid TableRow> getRows() {
    return rows;
  }

  public void setRows(List<@Valid TableRow> rows) {
    this.rows = rows;
  }

  public GetQueryResultsResponse schema(TableSchema schema) {
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

  public GetQueryResultsResponse totalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * The total number of bytes processed for this query.
   * @return totalBytesProcessed
   */
  
  @Schema(name = "totalBytesProcessed", description = "The total number of bytes processed for this query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalBytesProcessed")
  public String getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  public void setTotalBytesProcessed(String totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
  }

  public GetQueryResultsResponse totalRows(String totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * The total number of rows in the complete query result set, which can be more than the number of rows in this single page of results. Present only when the query completes successfully.
   * @return totalRows
   */
  
  @Schema(name = "totalRows", description = "The total number of rows in the complete query result set, which can be more than the number of rows in this single page of results. Present only when the query completes successfully.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRows")
  public String getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(String totalRows) {
    this.totalRows = totalRows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQueryResultsResponse getQueryResultsResponse = (GetQueryResultsResponse) o;
    return Objects.equals(this.cacheHit, getQueryResultsResponse.cacheHit) &&
        Objects.equals(this.errors, getQueryResultsResponse.errors) &&
        Objects.equals(this.etag, getQueryResultsResponse.etag) &&
        Objects.equals(this.jobComplete, getQueryResultsResponse.jobComplete) &&
        Objects.equals(this.jobReference, getQueryResultsResponse.jobReference) &&
        Objects.equals(this.kind, getQueryResultsResponse.kind) &&
        Objects.equals(this.numDmlAffectedRows, getQueryResultsResponse.numDmlAffectedRows) &&
        Objects.equals(this.pageToken, getQueryResultsResponse.pageToken) &&
        Objects.equals(this.rows, getQueryResultsResponse.rows) &&
        Objects.equals(this.schema, getQueryResultsResponse.schema) &&
        Objects.equals(this.totalBytesProcessed, getQueryResultsResponse.totalBytesProcessed) &&
        Objects.equals(this.totalRows, getQueryResultsResponse.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheHit, errors, etag, jobComplete, jobReference, kind, numDmlAffectedRows, pageToken, rows, schema, totalBytesProcessed, totalRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQueryResultsResponse {\n");
    sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    jobComplete: ").append(toIndentedString(jobComplete)).append("\n");
    sb.append("    jobReference: ").append(toIndentedString(jobReference)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    numDmlAffectedRows: ").append(toIndentedString(numDmlAffectedRows)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    totalBytesProcessed: ").append(toIndentedString(totalBytesProcessed)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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

