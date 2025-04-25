package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * [Optional] The categories attached to this field, used for field-level access control.
 */

@Schema(name = "TableFieldSchema_categories", description = "[Optional] The categories attached to this field, used for field-level access control.")
@JsonTypeName("TableFieldSchema_categories")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableFieldSchemaCategories {

  @Valid
  private List<String> names = new ArrayList<>();

  public TableFieldSchemaCategories names(List<String> names) {
    this.names = names;
    return this;
  }

  public TableFieldSchemaCategories addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * A list of category resource names. For example, \"projects/1/taxonomies/2/categories/3\". At most 5 categories are allowed.
   * @return names
   */
  
  @Schema(name = "names", description = "A list of category resource names. For example, \"projects/1/taxonomies/2/categories/3\". At most 5 categories are allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("names")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFieldSchemaCategories tableFieldSchemaCategories = (TableFieldSchemaCategories) o;
    return Objects.equals(this.names, tableFieldSchemaCategories.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFieldSchemaCategories {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

