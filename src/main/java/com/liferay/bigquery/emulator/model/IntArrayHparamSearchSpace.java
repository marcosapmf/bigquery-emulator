package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.IntArray;
import com.fasterxml.jackson.annotation.JsonCreator;

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
 * Search space for int array.
 */

@Schema(name = "IntArrayHparamSearchSpace", description = "Search space for int array.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class IntArrayHparamSearchSpace {

  @Valid
  private List<@Valid IntArray> candidates = new ArrayList<>();

  public IntArrayHparamSearchSpace candidates(List<@Valid IntArray> candidates) {
    this.candidates = candidates;
    return this;
  }

  public IntArrayHparamSearchSpace addCandidatesItem(IntArray candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Candidates for the int array parameter.
   * @return candidates
   */
  @Valid 
  @Schema(name = "candidates", description = "Candidates for the int array parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidates")
  public List<@Valid IntArray> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<@Valid IntArray> candidates) {
    this.candidates = candidates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntArrayHparamSearchSpace intArrayHparamSearchSpace = (IntArrayHparamSearchSpace) o;
    return Objects.equals(this.candidates, intArrayHparamSearchSpace.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntArrayHparamSearchSpace {\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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

