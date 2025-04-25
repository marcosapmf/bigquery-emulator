package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GoogleSheetsOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class GoogleSheetsOptions {

  private String range;

  private String skipLeadingRows;

  public GoogleSheetsOptions range(String range) {
    this.range = range;
    return this;
  }

  /**
   * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
   * @return range
   */
  
  @Schema(name = "range", description = "[Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("range")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public GoogleSheetsOptions skipLeadingRows(String skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
    return this;
  }

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
   * @return skipLeadingRows
   */
  
  @Schema(name = "skipLeadingRows", description = "[Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipLeadingRows")
  public String getSkipLeadingRows() {
    return skipLeadingRows;
  }

  public void setSkipLeadingRows(String skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleSheetsOptions googleSheetsOptions = (GoogleSheetsOptions) o;
    return Objects.equals(this.range, googleSheetsOptions.range) &&
        Objects.equals(this.skipLeadingRows, googleSheetsOptions.skipLeadingRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, skipLeadingRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleSheetsOptions {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    skipLeadingRows: ").append(toIndentedString(skipLeadingRows)).append("\n");
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

