package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.QueryParameterTypeStructTypesInner;
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
 * QueryParameterType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryParameterType {

  private QueryParameterType arrayType;

  @Valid
  private List<@Valid QueryParameterTypeStructTypesInner> structTypes = new ArrayList<>();

  private String type;

  public QueryParameterType arrayType(QueryParameterType arrayType) {
    this.arrayType = arrayType;
    return this;
  }

  /**
   * Get arrayType
   * @return arrayType
   */
  @Valid 
  @Schema(name = "arrayType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrayType")
  public QueryParameterType getArrayType() {
    return arrayType;
  }

  public void setArrayType(QueryParameterType arrayType) {
    this.arrayType = arrayType;
  }

  public QueryParameterType structTypes(List<@Valid QueryParameterTypeStructTypesInner> structTypes) {
    this.structTypes = structTypes;
    return this;
  }

  public QueryParameterType addStructTypesItem(QueryParameterTypeStructTypesInner structTypesItem) {
    if (this.structTypes == null) {
      this.structTypes = new ArrayList<>();
    }
    this.structTypes.add(structTypesItem);
    return this;
  }

  /**
   * [Optional] The types of the fields of this struct, in order, if this is a struct.
   * @return structTypes
   */
  @Valid 
  @Schema(name = "structTypes", description = "[Optional] The types of the fields of this struct, in order, if this is a struct.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structTypes")
  public List<@Valid QueryParameterTypeStructTypesInner> getStructTypes() {
    return structTypes;
  }

  public void setStructTypes(List<@Valid QueryParameterTypeStructTypesInner> structTypes) {
    this.structTypes = structTypes;
  }

  public QueryParameterType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Required] The top level type of this field.
   * @return type
   */
  
  @Schema(name = "type", description = "[Required] The top level type of this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    QueryParameterType queryParameterType = (QueryParameterType) o;
    return Objects.equals(this.arrayType, queryParameterType.arrayType) &&
        Objects.equals(this.structTypes, queryParameterType.structTypes) &&
        Objects.equals(this.type, queryParameterType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayType, structTypes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParameterType {\n");
    sb.append("    arrayType: ").append(toIndentedString(arrayType)).append("\n");
    sb.append("    structTypes: ").append(toIndentedString(structTypes)).append("\n");
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

