package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.BigtableColumnFamily;
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
 * BigtableOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BigtableOptions {

  @Valid
  private List<@Valid BigtableColumnFamily> columnFamilies = new ArrayList<>();

  private Boolean ignoreUnspecifiedColumnFamilies;

  private Boolean readRowkeyAsString;

  public BigtableOptions columnFamilies(List<@Valid BigtableColumnFamily> columnFamilies) {
    this.columnFamilies = columnFamilies;
    return this;
  }

  public BigtableOptions addColumnFamiliesItem(BigtableColumnFamily columnFamiliesItem) {
    if (this.columnFamilies == null) {
      this.columnFamilies = new ArrayList<>();
    }
    this.columnFamilies.add(columnFamiliesItem);
    return this;
  }

  /**
   * [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
   * @return columnFamilies
   */
  @Valid 
  @Schema(name = "columnFamilies", description = "[Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columnFamilies")
  public List<@Valid BigtableColumnFamily> getColumnFamilies() {
    return columnFamilies;
  }

  public void setColumnFamilies(List<@Valid BigtableColumnFamily> columnFamilies) {
    this.columnFamilies = columnFamilies;
  }

  public BigtableOptions ignoreUnspecifiedColumnFamilies(Boolean ignoreUnspecifiedColumnFamilies) {
    this.ignoreUnspecifiedColumnFamilies = ignoreUnspecifiedColumnFamilies;
    return this;
  }

  /**
   * [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.
   * @return ignoreUnspecifiedColumnFamilies
   */
  
  @Schema(name = "ignoreUnspecifiedColumnFamilies", description = "[Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoreUnspecifiedColumnFamilies")
  public Boolean getIgnoreUnspecifiedColumnFamilies() {
    return ignoreUnspecifiedColumnFamilies;
  }

  public void setIgnoreUnspecifiedColumnFamilies(Boolean ignoreUnspecifiedColumnFamilies) {
    this.ignoreUnspecifiedColumnFamilies = ignoreUnspecifiedColumnFamilies;
  }

  public BigtableOptions readRowkeyAsString(Boolean readRowkeyAsString) {
    this.readRowkeyAsString = readRowkeyAsString;
    return this;
  }

  /**
   * [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.
   * @return readRowkeyAsString
   */
  
  @Schema(name = "readRowkeyAsString", description = "[Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readRowkeyAsString")
  public Boolean getReadRowkeyAsString() {
    return readRowkeyAsString;
  }

  public void setReadRowkeyAsString(Boolean readRowkeyAsString) {
    this.readRowkeyAsString = readRowkeyAsString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigtableOptions bigtableOptions = (BigtableOptions) o;
    return Objects.equals(this.columnFamilies, bigtableOptions.columnFamilies) &&
        Objects.equals(this.ignoreUnspecifiedColumnFamilies, bigtableOptions.ignoreUnspecifiedColumnFamilies) &&
        Objects.equals(this.readRowkeyAsString, bigtableOptions.readRowkeyAsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnFamilies, ignoreUnspecifiedColumnFamilies, readRowkeyAsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigtableOptions {\n");
    sb.append("    columnFamilies: ").append(toIndentedString(columnFamilies)).append("\n");
    sb.append("    ignoreUnspecifiedColumnFamilies: ").append(toIndentedString(ignoreUnspecifiedColumnFamilies)).append("\n");
    sb.append("    readRowkeyAsString: ").append(toIndentedString(readRowkeyAsString)).append("\n");
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

