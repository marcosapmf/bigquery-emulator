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
 * Represents the count of a single category within the cluster.
 */

@Schema(name = "CategoryCount", description = "Represents the count of a single category within the cluster.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class CategoryCount {

  private String category;

  private String count;

  public CategoryCount category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The name of category.
   * @return category
   */
  
  @Schema(name = "category", description = "The name of category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CategoryCount count(String count) {
    this.count = count;
    return this;
  }

  /**
   * The count of training samples matching the category within the cluster.
   * @return count
   */
  
  @Schema(name = "count", description = "The count of training samples matching the category within the cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryCount categoryCount = (CategoryCount) o;
    return Objects.equals(this.category, categoryCount.category) &&
        Objects.equals(this.count, categoryCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryCount {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

