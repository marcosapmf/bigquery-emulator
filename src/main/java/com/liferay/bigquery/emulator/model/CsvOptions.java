package com.liferay.bigquery.emulator.model;

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
 * CsvOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class CsvOptions {

  private Boolean allowJaggedRows;

  private Boolean allowQuotedNewlines;

  private String encoding;

  private String fieldDelimiter;

  private String nullMarker;

  private Boolean preserveAsciiControlCharacters;

  private String quote = "\"";

  private String skipLeadingRows;

  public CsvOptions allowJaggedRows(Boolean allowJaggedRows) {
    this.allowJaggedRows = allowJaggedRows;
    return this;
  }

  /**
   * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
   * @return allowJaggedRows
   */
  
  @Schema(name = "allowJaggedRows", description = "[Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowJaggedRows")
  public Boolean getAllowJaggedRows() {
    return allowJaggedRows;
  }

  public void setAllowJaggedRows(Boolean allowJaggedRows) {
    this.allowJaggedRows = allowJaggedRows;
  }

  public CsvOptions allowQuotedNewlines(Boolean allowQuotedNewlines) {
    this.allowQuotedNewlines = allowQuotedNewlines;
    return this;
  }

  /**
   * [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
   * @return allowQuotedNewlines
   */
  
  @Schema(name = "allowQuotedNewlines", description = "[Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowQuotedNewlines")
  public Boolean getAllowQuotedNewlines() {
    return allowQuotedNewlines;
  }

  public void setAllowQuotedNewlines(Boolean allowQuotedNewlines) {
    this.allowQuotedNewlines = allowQuotedNewlines;
  }

  public CsvOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
   * @return encoding
   */
  
  @Schema(name = "encoding", description = "[Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public CsvOptions fieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
    return this;
  }

  /**
   * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence \"\\t\" to specify a tab separator. The default value is a comma (',').
   * @return fieldDelimiter
   */
  
  @Schema(name = "fieldDelimiter", description = "[Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence \"\\t\" to specify a tab separator. The default value is a comma (',').", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldDelimiter")
  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  public void setFieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
  }

  public CsvOptions nullMarker(String nullMarker) {
    this.nullMarker = nullMarker;
    return this;
  }

  /**
   * [Optional] An custom string that will represent a NULL value in CSV import data.
   * @return nullMarker
   */
  
  @Schema(name = "null_marker", description = "[Optional] An custom string that will represent a NULL value in CSV import data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("null_marker")
  public String getNullMarker() {
    return nullMarker;
  }

  public void setNullMarker(String nullMarker) {
    this.nullMarker = nullMarker;
  }

  public CsvOptions preserveAsciiControlCharacters(Boolean preserveAsciiControlCharacters) {
    this.preserveAsciiControlCharacters = preserveAsciiControlCharacters;
    return this;
  }

  /**
   * [Optional] Preserves the embedded ASCII control characters (the first 32 characters in the ASCII-table, from '\\x00' to '\\x1F') when loading from CSV. Only applicable to CSV, ignored for other formats.
   * @return preserveAsciiControlCharacters
   */
  
  @Schema(name = "preserveAsciiControlCharacters", description = "[Optional] Preserves the embedded ASCII control characters (the first 32 characters in the ASCII-table, from '\\x00' to '\\x1F') when loading from CSV. Only applicable to CSV, ignored for other formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserveAsciiControlCharacters")
  public Boolean getPreserveAsciiControlCharacters() {
    return preserveAsciiControlCharacters;
  }

  public void setPreserveAsciiControlCharacters(Boolean preserveAsciiControlCharacters) {
    this.preserveAsciiControlCharacters = preserveAsciiControlCharacters;
  }

  public CsvOptions quote(String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('\"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
   * @return quote
   */
  @Pattern(regexp = ".?") 
  @Schema(name = "quote", description = "[Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('\"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quote")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public CsvOptions skipLeadingRows(String skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
    return this;
  }

  /**
   * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
   * @return skipLeadingRows
   */
  
  @Schema(name = "skipLeadingRows", description = "[Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CsvOptions csvOptions = (CsvOptions) o;
    return Objects.equals(this.allowJaggedRows, csvOptions.allowJaggedRows) &&
        Objects.equals(this.allowQuotedNewlines, csvOptions.allowQuotedNewlines) &&
        Objects.equals(this.encoding, csvOptions.encoding) &&
        Objects.equals(this.fieldDelimiter, csvOptions.fieldDelimiter) &&
        Objects.equals(this.nullMarker, csvOptions.nullMarker) &&
        Objects.equals(this.preserveAsciiControlCharacters, csvOptions.preserveAsciiControlCharacters) &&
        Objects.equals(this.quote, csvOptions.quote) &&
        Objects.equals(this.skipLeadingRows, csvOptions.skipLeadingRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, nullMarker, preserveAsciiControlCharacters, quote, skipLeadingRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvOptions {\n");
    sb.append("    allowJaggedRows: ").append(toIndentedString(allowJaggedRows)).append("\n");
    sb.append("    allowQuotedNewlines: ").append(toIndentedString(allowQuotedNewlines)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    fieldDelimiter: ").append(toIndentedString(fieldDelimiter)).append("\n");
    sb.append("    nullMarker: ").append(toIndentedString(nullMarker)).append("\n");
    sb.append("    preserveAsciiControlCharacters: ").append(toIndentedString(preserveAsciiControlCharacters)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

