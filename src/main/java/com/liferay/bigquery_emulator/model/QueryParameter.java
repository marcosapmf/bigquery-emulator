package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.QueryParameterType;
import com.liferay.bigquery_emulator.model.QueryParameterValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryParameter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryParameter {

  private String name;

  private QueryParameterType parameterType;

  private QueryParameterValue parameterValue;

  public QueryParameter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
   * @return name
   */
  
  @Schema(name = "name", description = "[Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryParameter parameterType(QueryParameterType parameterType) {
    this.parameterType = parameterType;
    return this;
  }

  /**
   * Get parameterType
   * @return parameterType
   */
  @Valid 
  @Schema(name = "parameterType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameterType")
  public QueryParameterType getParameterType() {
    return parameterType;
  }

  public void setParameterType(QueryParameterType parameterType) {
    this.parameterType = parameterType;
  }

  public QueryParameter parameterValue(QueryParameterValue parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

  /**
   * Get parameterValue
   * @return parameterValue
   */
  @Valid 
  @Schema(name = "parameterValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameterValue")
  public QueryParameterValue getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(QueryParameterValue parameterValue) {
    this.parameterValue = parameterValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryParameter queryParameter = (QueryParameter) o;
    return Objects.equals(this.name, queryParameter.name) &&
        Objects.equals(this.parameterType, queryParameter.parameterType) &&
        Objects.equals(this.parameterValue, queryParameter.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameterType, parameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParameter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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

