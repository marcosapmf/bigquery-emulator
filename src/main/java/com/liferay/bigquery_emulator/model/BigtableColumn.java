package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BigtableColumn
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BigtableColumn {

  private String encoding;

  private String fieldName;

  private Boolean onlyReadLatest;

  private byte[] qualifierEncoded;

  private String qualifierString;

  private String type;

  public BigtableColumn encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.
   * @return encoding
   */
  
  @Schema(name = "encoding", description = "[Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public BigtableColumn fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
   * @return fieldName
   */
  
  @Schema(name = "fieldName", description = "[Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public BigtableColumn onlyReadLatest(Boolean onlyReadLatest) {
    this.onlyReadLatest = onlyReadLatest;
    return this;
  }

  /**
   * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
   * @return onlyReadLatest
   */
  
  @Schema(name = "onlyReadLatest", description = "[Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlyReadLatest")
  public Boolean getOnlyReadLatest() {
    return onlyReadLatest;
  }

  public void setOnlyReadLatest(Boolean onlyReadLatest) {
    this.onlyReadLatest = onlyReadLatest;
  }

  public BigtableColumn qualifierEncoded(byte[] qualifierEncoded) {
    this.qualifierEncoded = qualifierEncoded;
    return this;
  }

  /**
   * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
   * @return qualifierEncoded
   */
  
  @Schema(name = "qualifierEncoded", description = "[Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qualifierEncoded")
  public byte[] getQualifierEncoded() {
    return qualifierEncoded;
  }

  public void setQualifierEncoded(byte[] qualifierEncoded) {
    this.qualifierEncoded = qualifierEncoded;
  }

  public BigtableColumn qualifierString(String qualifierString) {
    this.qualifierString = qualifierString;
    return this;
  }

  /**
   * Get qualifierString
   * @return qualifierString
   */
  
  @Schema(name = "qualifierString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qualifierString")
  public String getQualifierString() {
    return qualifierString;
  }

  public void setQualifierString(String qualifierString) {
    this.qualifierString = qualifierString;
  }

  public BigtableColumn type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
   * @return type
   */
  
  @Schema(name = "type", description = "[Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BigtableColumn bigtableColumn = (BigtableColumn) o;
    return Objects.equals(this.encoding, bigtableColumn.encoding) &&
        Objects.equals(this.fieldName, bigtableColumn.fieldName) &&
        Objects.equals(this.onlyReadLatest, bigtableColumn.onlyReadLatest) &&
        Arrays.equals(this.qualifierEncoded, bigtableColumn.qualifierEncoded) &&
        Objects.equals(this.qualifierString, bigtableColumn.qualifierString) &&
        Objects.equals(this.type, bigtableColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, fieldName, onlyReadLatest, Arrays.hashCode(qualifierEncoded), qualifierString, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigtableColumn {\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    onlyReadLatest: ").append(toIndentedString(onlyReadLatest)).append("\n");
    sb.append("    qualifierEncoded: ").append(toIndentedString(qualifierEncoded)).append("\n");
    sb.append("    qualifierString: ").append(toIndentedString(qualifierString)).append("\n");
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

