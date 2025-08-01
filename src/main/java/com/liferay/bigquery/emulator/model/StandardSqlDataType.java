package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.StandardSqlStructType;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The data type of a variable such as a function argument. Examples include: * INT64: &#x60;{\&quot;typeKind\&quot;: \&quot;INT64\&quot;}&#x60; * ARRAY: { \&quot;typeKind\&quot;: \&quot;ARRAY\&quot;, \&quot;arrayElementType\&quot;: {\&quot;typeKind\&quot;: \&quot;STRING\&quot;} } * STRUCT&gt;: { \&quot;typeKind\&quot;: \&quot;STRUCT\&quot;, \&quot;structType\&quot;: { \&quot;fields\&quot;: [ { \&quot;name\&quot;: \&quot;x\&quot;, \&quot;type\&quot;: {\&quot;typeKind\&quot;: \&quot;STRING\&quot;} }, { \&quot;name\&quot;: \&quot;y\&quot;, \&quot;type\&quot;: { \&quot;typeKind\&quot;: \&quot;ARRAY\&quot;, \&quot;arrayElementType\&quot;: {\&quot;typeKind\&quot;: \&quot;DATE\&quot;} } } ] } }
 */

@Schema(name = "StandardSqlDataType", description = "The data type of a variable such as a function argument. Examples include: * INT64: `{\"typeKind\": \"INT64\"}` * ARRAY: { \"typeKind\": \"ARRAY\", \"arrayElementType\": {\"typeKind\": \"STRING\"} } * STRUCT>: { \"typeKind\": \"STRUCT\", \"structType\": { \"fields\": [ { \"name\": \"x\", \"type\": {\"typeKind\": \"STRING\"} }, { \"name\": \"y\", \"type\": { \"typeKind\": \"ARRAY\", \"arrayElementType\": {\"typeKind\": \"DATE\"} } } ] } }")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class StandardSqlDataType {

  private StandardSqlDataType arrayElementType;

  private StandardSqlStructType structType;

  /**
   * Required. The top level type of this field. Can be any GoogleSQL data type (e.g., \"INT64\", \"DATE\", \"ARRAY\").
   */
  public enum TypeKindEnum {
    TYPE_KIND_UNSPECIFIED("TYPE_KIND_UNSPECIFIED"),
    
    INT64("INT64"),
    
    BOOL("BOOL"),
    
    FLOAT64("FLOAT64"),
    
    STRING("STRING"),
    
    BYTES("BYTES"),
    
    TIMESTAMP("TIMESTAMP"),
    
    DATE("DATE"),
    
    TIME("TIME"),
    
    DATETIME("DATETIME"),
    
    INTERVAL("INTERVAL"),
    
    GEOGRAPHY("GEOGRAPHY"),
    
    NUMERIC("NUMERIC"),
    
    BIGNUMERIC("BIGNUMERIC"),
    
    JSON("JSON"),
    
    ARRAY("ARRAY"),
    
    STRUCT("STRUCT");

    private String value;

    TypeKindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeKindEnum fromValue(String value) {
      for (TypeKindEnum b : TypeKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeKindEnum typeKind;

  public StandardSqlDataType arrayElementType(StandardSqlDataType arrayElementType) {
    this.arrayElementType = arrayElementType;
    return this;
  }

  /**
   * Get arrayElementType
   * @return arrayElementType
   */
  @Valid 
  @Schema(name = "arrayElementType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayElementType")
  public StandardSqlDataType getArrayElementType() {
    return arrayElementType;
  }

  public void setArrayElementType(StandardSqlDataType arrayElementType) {
    this.arrayElementType = arrayElementType;
  }

  public StandardSqlDataType structType(StandardSqlStructType structType) {
    this.structType = structType;
    return this;
  }

  /**
   * Get structType
   * @return structType
   */
  @Valid 
  @Schema(name = "structType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structType")
  public StandardSqlStructType getStructType() {
    return structType;
  }

  public void setStructType(StandardSqlStructType structType) {
    this.structType = structType;
  }

  public StandardSqlDataType typeKind(TypeKindEnum typeKind) {
    this.typeKind = typeKind;
    return this;
  }

  /**
   * Required. The top level type of this field. Can be any GoogleSQL data type (e.g., \"INT64\", \"DATE\", \"ARRAY\").
   * @return typeKind
   */
  
  @Schema(name = "typeKind", description = "Required. The top level type of this field. Can be any GoogleSQL data type (e.g., \"INT64\", \"DATE\", \"ARRAY\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typeKind")
  public TypeKindEnum getTypeKind() {
    return typeKind;
  }

  public void setTypeKind(TypeKindEnum typeKind) {
    this.typeKind = typeKind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardSqlDataType standardSqlDataType = (StandardSqlDataType) o;
    return Objects.equals(this.arrayElementType, standardSqlDataType.arrayElementType) &&
        Objects.equals(this.structType, standardSqlDataType.structType) &&
        Objects.equals(this.typeKind, standardSqlDataType.typeKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayElementType, structType, typeKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardSqlDataType {\n");
    sb.append("    arrayElementType: ").append(toIndentedString(arrayElementType)).append("\n");
    sb.append("    structType: ").append(toIndentedString(structType)).append("\n");
    sb.append("    typeKind: ").append(toIndentedString(typeKind)).append("\n");
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

