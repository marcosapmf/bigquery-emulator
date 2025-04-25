package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableListTablesInner;
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
 * TableList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableList {

  private String etag;

  private String kind = "bigquery#tableList";

  private String nextPageToken;

  @Valid
  private List<@Valid TableListTablesInner> tables = new ArrayList<>();

  private Integer totalItems;

  public TableList etag(String etag) {
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

  public TableList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The type of list.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The type of list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public TableList nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to request the next page of results.
   * @return nextPageToken
   */
  
  @Schema(name = "nextPageToken", description = "A token to request the next page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public TableList tables(List<@Valid TableListTablesInner> tables) {
    this.tables = tables;
    return this;
  }

  public TableList addTablesItem(TableListTablesInner tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * Tables in the requested dataset.
   * @return tables
   */
  @Valid 
  @Schema(name = "tables", description = "Tables in the requested dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tables")
  public List<@Valid TableListTablesInner> getTables() {
    return tables;
  }

  public void setTables(List<@Valid TableListTablesInner> tables) {
    this.tables = tables;
  }

  public TableList totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * The total number of tables in the dataset.
   * @return totalItems
   */
  
  @Schema(name = "totalItems", description = "The total number of tables in the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableList tableList = (TableList) o;
    return Objects.equals(this.etag, tableList.etag) &&
        Objects.equals(this.kind, tableList.kind) &&
        Objects.equals(this.nextPageToken, tableList.nextPageToken) &&
        Objects.equals(this.tables, tableList.tables) &&
        Objects.equals(this.totalItems, tableList.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, nextPageToken, tables, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableList {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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

