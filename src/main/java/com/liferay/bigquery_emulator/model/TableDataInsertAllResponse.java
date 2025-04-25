package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableDataInsertAllResponseInsertErrorsInner;
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
 * TableDataInsertAllResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableDataInsertAllResponse {

  @Valid
  private List<@Valid TableDataInsertAllResponseInsertErrorsInner> insertErrors = new ArrayList<>();

  private String kind = "bigquery#tableDataInsertAllResponse";

  public TableDataInsertAllResponse insertErrors(List<@Valid TableDataInsertAllResponseInsertErrorsInner> insertErrors) {
    this.insertErrors = insertErrors;
    return this;
  }

  public TableDataInsertAllResponse addInsertErrorsItem(TableDataInsertAllResponseInsertErrorsInner insertErrorsItem) {
    if (this.insertErrors == null) {
      this.insertErrors = new ArrayList<>();
    }
    this.insertErrors.add(insertErrorsItem);
    return this;
  }

  /**
   * An array of errors for rows that were not inserted.
   * @return insertErrors
   */
  @Valid 
  @Schema(name = "insertErrors", description = "An array of errors for rows that were not inserted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insertErrors")
  public List<@Valid TableDataInsertAllResponseInsertErrorsInner> getInsertErrors() {
    return insertErrors;
  }

  public void setInsertErrors(List<@Valid TableDataInsertAllResponseInsertErrorsInner> insertErrors) {
    this.insertErrors = insertErrors;
  }

  public TableDataInsertAllResponse kind(String kind) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDataInsertAllResponse tableDataInsertAllResponse = (TableDataInsertAllResponse) o;
    return Objects.equals(this.insertErrors, tableDataInsertAllResponse.insertErrors) &&
        Objects.equals(this.kind, tableDataInsertAllResponse.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertErrors, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDataInsertAllResponse {\n");
    sb.append("    insertErrors: ").append(toIndentedString(insertErrors)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

