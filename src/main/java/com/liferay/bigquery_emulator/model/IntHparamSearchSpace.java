package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.IntCandidates;
import com.liferay.bigquery_emulator.model.IntRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Search space for an int hyperparameter.
 */

@Schema(name = "IntHparamSearchSpace", description = "Search space for an int hyperparameter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class IntHparamSearchSpace {

  private IntCandidates candidates;

  private IntRange range;

  public IntHparamSearchSpace candidates(IntCandidates candidates) {
    this.candidates = candidates;
    return this;
  }

  /**
   * Get candidates
   * @return candidates
   */
  @Valid 
  @Schema(name = "candidates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidates")
  public IntCandidates getCandidates() {
    return candidates;
  }

  public void setCandidates(IntCandidates candidates) {
    this.candidates = candidates;
  }

  public IntHparamSearchSpace range(IntRange range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
   */
  @Valid 
  @Schema(name = "range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("range")
  public IntRange getRange() {
    return range;
  }

  public void setRange(IntRange range) {
    this.range = range;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntHparamSearchSpace intHparamSearchSpace = (IntHparamSearchSpace) o;
    return Objects.equals(this.candidates, intHparamSearchSpace.candidates) &&
        Objects.equals(this.range, intHparamSearchSpace.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidates, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntHparamSearchSpace {\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

