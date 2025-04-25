package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryParameterValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryParameterValue {

  @Valid
  private List<@Valid QueryParameterValue> arrayValues = new ArrayList<>();

  @Valid
  private Map<String, QueryParameterValue> structValues = new HashMap<>();

  private String value;

  public QueryParameterValue arrayValues(List<@Valid QueryParameterValue> arrayValues) {
    this.arrayValues = arrayValues;
    return this;
  }

  public QueryParameterValue addArrayValuesItem(QueryParameterValue arrayValuesItem) {
    if (this.arrayValues == null) {
      this.arrayValues = new ArrayList<>();
    }
    this.arrayValues.add(arrayValuesItem);
    return this;
  }

  /**
   * [Optional] The array values, if this is an array type.
   * @return arrayValues
   */
  @Valid 
  @Schema(name = "arrayValues", description = "[Optional] The array values, if this is an array type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayValues")
  public List<@Valid QueryParameterValue> getArrayValues() {
    return arrayValues;
  }

  public void setArrayValues(List<@Valid QueryParameterValue> arrayValues) {
    this.arrayValues = arrayValues;
  }

  public QueryParameterValue structValues(Map<String, QueryParameterValue> structValues) {
    this.structValues = structValues;
    return this;
  }

  public QueryParameterValue putStructValuesItem(String key, QueryParameterValue structValuesItem) {
    if (this.structValues == null) {
      this.structValues = new HashMap<>();
    }
    this.structValues.put(key, structValuesItem);
    return this;
  }

  /**
   * [Optional] The struct field values, in order of the struct type's declaration.
   * @return structValues
   */
  @Valid 
  @Schema(name = "structValues", description = "[Optional] The struct field values, in order of the struct type's declaration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structValues")
  public Map<String, QueryParameterValue> getStructValues() {
    return structValues;
  }

  public void setStructValues(Map<String, QueryParameterValue> structValues) {
    this.structValues = structValues;
  }

  public QueryParameterValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * [Optional] The value of this value, if a simple scalar type.
   * @return value
   */
  
  @Schema(name = "value", description = "[Optional] The value of this value, if a simple scalar type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryParameterValue queryParameterValue = (QueryParameterValue) o;
    return Objects.equals(this.arrayValues, queryParameterValue.arrayValues) &&
        Objects.equals(this.structValues, queryParameterValue.structValues) &&
        Objects.equals(this.value, queryParameterValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayValues, structValues, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParameterValue {\n");
    sb.append("    arrayValues: ").append(toIndentedString(arrayValues)).append("\n");
    sb.append("    structValues: ").append(toIndentedString(structValues)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

