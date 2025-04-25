package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.CategoryCount;
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
 * Representative value of a categorical feature.
 */

@Schema(name = "CategoricalValue", description = "Representative value of a categorical feature.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class CategoricalValue {

  @Valid
  private List<@Valid CategoryCount> categoryCounts = new ArrayList<>();

  public CategoricalValue categoryCounts(List<@Valid CategoryCount> categoryCounts) {
    this.categoryCounts = categoryCounts;
    return this;
  }

  public CategoricalValue addCategoryCountsItem(CategoryCount categoryCountsItem) {
    if (this.categoryCounts == null) {
      this.categoryCounts = new ArrayList<>();
    }
    this.categoryCounts.add(categoryCountsItem);
    return this;
  }

  /**
   * Counts of all categories for the categorical feature. If there are more than ten categories, we return top ten (by count) and return one more CategoryCount with category \"_OTHER_\" and count as aggregate counts of remaining categories.
   * @return categoryCounts
   */
  @Valid 
  @Schema(name = "categoryCounts", description = "Counts of all categories for the categorical feature. If there are more than ten categories, we return top ten (by count) and return one more CategoryCount with category \"_OTHER_\" and count as aggregate counts of remaining categories.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryCounts")
  public List<@Valid CategoryCount> getCategoryCounts() {
    return categoryCounts;
  }

  public void setCategoryCounts(List<@Valid CategoryCount> categoryCounts) {
    this.categoryCounts = categoryCounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoricalValue categoricalValue = (CategoricalValue) o;
    return Objects.equals(this.categoryCounts, categoricalValue.categoryCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoricalValue {\n");
    sb.append("    categoryCounts: ").append(toIndentedString(categoryCounts)).append("\n");
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

