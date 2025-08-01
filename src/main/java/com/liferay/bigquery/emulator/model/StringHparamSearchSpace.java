package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Search space for string and enum.
 */

@Schema(name = "StringHparamSearchSpace", description = "Search space for string and enum.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class StringHparamSearchSpace {

  @Valid
  private List<String> candidates = new ArrayList<>();

  public StringHparamSearchSpace candidates(List<String> candidates) {
    this.candidates = candidates;
    return this;
  }

  public StringHparamSearchSpace addCandidatesItem(String candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Canididates for the string or enum parameter in lower case.
   * @return candidates
   */
  
  @Schema(name = "candidates", description = "Canididates for the string or enum parameter in lower case.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidates")
  public List<String> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<String> candidates) {
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
    StringHparamSearchSpace stringHparamSearchSpace = (StringHparamSearchSpace) o;
    return Objects.equals(this.candidates, stringHparamSearchSpace.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringHparamSearchSpace {\n");
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

