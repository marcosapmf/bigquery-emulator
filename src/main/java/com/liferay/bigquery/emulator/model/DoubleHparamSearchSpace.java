package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.DoubleCandidates;
import com.liferay.bigquery.emulator.model.DoubleRange;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Search space for a double hyperparameter.
 */

@Schema(name = "DoubleHparamSearchSpace", description = "Search space for a double hyperparameter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DoubleHparamSearchSpace {

  private DoubleCandidates candidates;

  private DoubleRange range;

  public DoubleHparamSearchSpace candidates(DoubleCandidates candidates) {
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
  public DoubleCandidates getCandidates() {
    return candidates;
  }

  public void setCandidates(DoubleCandidates candidates) {
    this.candidates = candidates;
  }

  public DoubleHparamSearchSpace range(DoubleRange range) {
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
  public DoubleRange getRange() {
    return range;
  }

  public void setRange(DoubleRange range) {
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
    DoubleHparamSearchSpace doubleHparamSearchSpace = (DoubleHparamSearchSpace) o;
    return Objects.equals(this.candidates, doubleHparamSearchSpace.candidates) &&
        Objects.equals(this.range, doubleHparamSearchSpace.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidates, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoubleHparamSearchSpace {\n");
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

