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
 * Range of an int hyperparameter.
 */

@Schema(name = "IntRange", description = "Range of an int hyperparameter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class IntRange {

  private String max;

  private String min;

  public IntRange max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Max value of the int parameter.
   * @return max
   */
  
  @Schema(name = "max", description = "Max value of the int parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max")
  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public IntRange min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Min value of the int parameter.
   * @return min
   */
  
  @Schema(name = "min", description = "Min value of the int parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min")
  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntRange intRange = (IntRange) o;
    return Objects.equals(this.max, intRange.max) &&
        Objects.equals(this.min, intRange.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntRange {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

