package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableRow;
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
 * TableDataList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableDataList {

  private String etag;

  private String kind = "bigquery#tableDataList";

  private String pageToken;

  @Valid
  private List<@Valid TableRow> rows = new ArrayList<>();

  private String totalRows;

  public TableDataList etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A hash of this page of results.
   * @return etag
   */
  
  @Schema(name = "etag", description = "A hash of this page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public TableDataList kind(String kind) {
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

  public TableDataList pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * A token used for paging results. Providing this token instead of the startIndex parameter can help you retrieve stable results when an underlying table is changing.
   * @return pageToken
   */
  
  @Schema(name = "pageToken", description = "A token used for paging results. Providing this token instead of the startIndex parameter can help you retrieve stable results when an underlying table is changing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public TableDataList rows(List<@Valid TableRow> rows) {
    this.rows = rows;
    return this;
  }

  public TableDataList addRowsItem(TableRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Rows of results.
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", description = "Rows of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public List<@Valid TableRow> getRows() {
    return rows;
  }

  public void setRows(List<@Valid TableRow> rows) {
    this.rows = rows;
  }

  public TableDataList totalRows(String totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * The total number of rows in the complete table.
   * @return totalRows
   */
  
  @Schema(name = "totalRows", description = "The total number of rows in the complete table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TableDataList tableDataList = (TableDataList) o;
    return Objects.equals(this.etag, tableDataList.etag) &&
        Objects.equals(this.kind, tableDataList.kind) &&
        Objects.equals(this.pageToken, tableDataList.pageToken) &&
        Objects.equals(this.rows, tableDataList.rows) &&
        Objects.equals(this.totalRows, tableDataList.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, pageToken, rows, totalRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDataList {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

