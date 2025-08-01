package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.TableDataInsertAllRequestRowsInner;
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
 * TableDataInsertAllRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableDataInsertAllRequest {

  private Boolean ignoreUnknownValues;

  private String kind = "bigquery#tableDataInsertAllRequest";

  @Valid
  private List<@Valid TableDataInsertAllRequestRowsInner> rows = new ArrayList<>();

  private Boolean skipInvalidRows;

  private String templateSuffix;

  public TableDataInsertAllRequest ignoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
    return this;
  }

  /**
   * [Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values as errors.
   * @return ignoreUnknownValues
   */
  
  @Schema(name = "ignoreUnknownValues", description = "[Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values as errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoreUnknownValues")
  public Boolean getIgnoreUnknownValues() {
    return ignoreUnknownValues;
  }

  public void setIgnoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
  }

  public TableDataInsertAllRequest kind(String kind) {
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

  public TableDataInsertAllRequest rows(List<@Valid TableDataInsertAllRequestRowsInner> rows) {
    this.rows = rows;
    return this;
  }

  public TableDataInsertAllRequest addRowsItem(TableDataInsertAllRequestRowsInner rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * The rows to insert.
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", description = "The rows to insert.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public List<@Valid TableDataInsertAllRequestRowsInner> getRows() {
    return rows;
  }

  public void setRows(List<@Valid TableDataInsertAllRequestRowsInner> rows) {
    this.rows = rows;
  }

  public TableDataInsertAllRequest skipInvalidRows(Boolean skipInvalidRows) {
    this.skipInvalidRows = skipInvalidRows;
    return this;
  }

  /**
   * [Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any invalid rows exist.
   * @return skipInvalidRows
   */
  
  @Schema(name = "skipInvalidRows", description = "[Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any invalid rows exist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipInvalidRows")
  public Boolean getSkipInvalidRows() {
    return skipInvalidRows;
  }

  public void setSkipInvalidRows(Boolean skipInvalidRows) {
    this.skipInvalidRows = skipInvalidRows;
  }

  public TableDataInsertAllRequest templateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
    return this;
  }

  /**
   * If specified, treats the destination table as a base template, and inserts the rows into an instance table named \"{destination}{templateSuffix}\". BigQuery will manage creation of the instance table, using the schema of the base template table. See https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working with templates tables.
   * @return templateSuffix
   */
  
  @Schema(name = "templateSuffix", description = "If specified, treats the destination table as a base template, and inserts the rows into an instance table named \"{destination}{templateSuffix}\". BigQuery will manage creation of the instance table, using the schema of the base template table. See https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working with templates tables.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateSuffix")
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDataInsertAllRequest tableDataInsertAllRequest = (TableDataInsertAllRequest) o;
    return Objects.equals(this.ignoreUnknownValues, tableDataInsertAllRequest.ignoreUnknownValues) &&
        Objects.equals(this.kind, tableDataInsertAllRequest.kind) &&
        Objects.equals(this.rows, tableDataInsertAllRequest.rows) &&
        Objects.equals(this.skipInvalidRows, tableDataInsertAllRequest.skipInvalidRows) &&
        Objects.equals(this.templateSuffix, tableDataInsertAllRequest.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreUnknownValues, kind, rows, skipInvalidRows, templateSuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDataInsertAllRequest {\n");
    sb.append("    ignoreUnknownValues: ").append(toIndentedString(ignoreUnknownValues)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    skipInvalidRows: ").append(toIndentedString(skipInvalidRows)).append("\n");
    sb.append("    templateSuffix: ").append(toIndentedString(templateSuffix)).append("\n");
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

