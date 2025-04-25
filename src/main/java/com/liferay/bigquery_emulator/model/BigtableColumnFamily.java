package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.BigtableColumn;
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
 * BigtableColumnFamily
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BigtableColumnFamily {

  @Valid
  private List<@Valid BigtableColumn> columns = new ArrayList<>();

  private String encoding;

  private String familyId;

  private Boolean onlyReadLatest;

  private String type;

  public BigtableColumnFamily columns(List<@Valid BigtableColumn> columns) {
    this.columns = columns;
    return this;
  }

  public BigtableColumnFamily addColumnsItem(BigtableColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
   * @return columns
   */
  @Valid 
  @Schema(name = "columns", description = "[Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columns")
  public List<@Valid BigtableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<@Valid BigtableColumn> columns) {
    this.columns = columns;
  }

  public BigtableColumnFamily encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
   * @return encoding
   */
  
  @Schema(name = "encoding", description = "[Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public BigtableColumnFamily familyId(String familyId) {
    this.familyId = familyId;
    return this;
  }

  /**
   * Identifier of the column family.
   * @return familyId
   */
  
  @Schema(name = "familyId", description = "Identifier of the column family.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyId")
  public String getFamilyId() {
    return familyId;
  }

  public void setFamilyId(String familyId) {
    this.familyId = familyId;
  }

  public BigtableColumnFamily onlyReadLatest(Boolean onlyReadLatest) {
    this.onlyReadLatest = onlyReadLatest;
    return this;
  }

  /**
   * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.
   * @return onlyReadLatest
   */
  
  @Schema(name = "onlyReadLatest", description = "[Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlyReadLatest")
  public Boolean getOnlyReadLatest() {
    return onlyReadLatest;
  }

  public void setOnlyReadLatest(Boolean onlyReadLatest) {
    this.onlyReadLatest = onlyReadLatest;
  }

  public BigtableColumnFamily type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
   * @return type
   */
  
  @Schema(name = "type", description = "[Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigtableColumnFamily bigtableColumnFamily = (BigtableColumnFamily) o;
    return Objects.equals(this.columns, bigtableColumnFamily.columns) &&
        Objects.equals(this.encoding, bigtableColumnFamily.encoding) &&
        Objects.equals(this.familyId, bigtableColumnFamily.familyId) &&
        Objects.equals(this.onlyReadLatest, bigtableColumnFamily.onlyReadLatest) &&
        Objects.equals(this.type, bigtableColumnFamily.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, encoding, familyId, onlyReadLatest, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigtableColumnFamily {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    familyId: ").append(toIndentedString(familyId)).append("\n");
    sb.append("    onlyReadLatest: ").append(toIndentedString(onlyReadLatest)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

