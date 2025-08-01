package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * TableDataInsertAllRequestRowsInner
 */

@JsonTypeName("TableDataInsertAllRequest_rows_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableDataInsertAllRequestRowsInner {

  private String insertId;

  @Valid
  private Map<String, Object> json = new HashMap<>();

  public TableDataInsertAllRequestRowsInner insertId(String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * [Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis.
   * @return insertId
   */
  
  @Schema(name = "insertId", description = "[Optional] A unique ID for each row. BigQuery uses this property to detect duplicate insertion requests on a best-effort basis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insertId")
  public String getInsertId() {
    return insertId;
  }

  public void setInsertId(String insertId) {
    this.insertId = insertId;
  }

  public TableDataInsertAllRequestRowsInner json(Map<String, Object> json) {
    this.json = json;
    return this;
  }

  public TableDataInsertAllRequestRowsInner putJsonItem(String key, Object jsonItem) {
    if (this.json == null) {
      this.json = new HashMap<>();
    }
    this.json.put(key, jsonItem);
    return this;
  }

  /**
   * Represents a single JSON object.
   * @return json
   */
  
  @Schema(name = "json", description = "Represents a single JSON object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("json")
  public Map<String, Object> getJson() {
    return json;
  }

  public void setJson(Map<String, Object> json) {
    this.json = json;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDataInsertAllRequestRowsInner tableDataInsertAllRequestRowsInner = (TableDataInsertAllRequestRowsInner) o;
    return Objects.equals(this.insertId, tableDataInsertAllRequestRowsInner.insertId) &&
        Objects.equals(this.json, tableDataInsertAllRequestRowsInner.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertId, json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDataInsertAllRequestRowsInner {\n");
    sb.append("    insertId: ").append(toIndentedString(insertId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
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

