package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.TableReference;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IndexUnusedReason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class IndexUnusedReason {

  private TableReference baseTable;

  private String code = "$(reason.code)";

  private String indexName = "$(reason.index_name)";

  private String message = "$(reason.message)";

  public IndexUnusedReason baseTable(TableReference baseTable) {
    this.baseTable = baseTable;
    return this;
  }

  /**
   * Get baseTable
   * @return baseTable
   */
  @Valid 
  @Schema(name = "base_table", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_table")
  public TableReference getBaseTable() {
    return baseTable;
  }

  public void setBaseTable(TableReference baseTable) {
    this.baseTable = baseTable;
  }

  public IndexUnusedReason code(String code) {
    this.code = code;
    return this;
  }

  /**
   * [Output-only] Specifies the high-level reason for the scenario when no search index was used.
   * @return code
   */
  
  @Schema(name = "code", description = "[Output-only] Specifies the high-level reason for the scenario when no search index was used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IndexUnusedReason indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * [Output-only] Specifies the name of the unused search index, if available.
   * @return indexName
   */
  
  @Schema(name = "index_name", description = "[Output-only] Specifies the name of the unused search index, if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index_name")
  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public IndexUnusedReason message(String message) {
    this.message = message;
    return this;
  }

  /**
   * [Output-only] Free form human-readable reason for the scenario when no search index was used.
   * @return message
   */
  
  @Schema(name = "message", description = "[Output-only] Free form human-readable reason for the scenario when no search index was used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexUnusedReason indexUnusedReason = (IndexUnusedReason) o;
    return Objects.equals(this.baseTable, indexUnusedReason.baseTable) &&
        Objects.equals(this.code, indexUnusedReason.code) &&
        Objects.equals(this.indexName, indexUnusedReason.indexName) &&
        Objects.equals(this.message, indexUnusedReason.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseTable, code, indexName, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexUnusedReason {\n");
    sb.append("    baseTable: ").append(toIndentedString(baseTable)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

