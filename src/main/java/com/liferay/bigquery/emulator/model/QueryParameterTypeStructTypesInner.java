package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery.emulator.model.QueryParameterType;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QueryParameterTypeStructTypesInner
 */

@JsonTypeName("QueryParameterType_structTypes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class QueryParameterTypeStructTypesInner {

  private String description;

  private String name;

  private QueryParameterType type;

  public QueryParameterTypeStructTypesInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] Human-oriented description of the field.
   * @return description
   */
  
  @Schema(name = "description", description = "[Optional] Human-oriented description of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QueryParameterTypeStructTypesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * [Optional] The name of this field.
   * @return name
   */
  
  @Schema(name = "name", description = "[Optional] The name of this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryParameterTypeStructTypesInner type(QueryParameterType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public QueryParameterType getType() {
    return type;
  }

  public void setType(QueryParameterType type) {
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
    QueryParameterTypeStructTypesInner queryParameterTypeStructTypesInner = (QueryParameterTypeStructTypesInner) o;
    return Objects.equals(this.description, queryParameterTypeStructTypesInner.description) &&
        Objects.equals(this.name, queryParameterTypeStructTypesInner.name) &&
        Objects.equals(this.type, queryParameterTypeStructTypesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryParameterTypeStructTypesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

