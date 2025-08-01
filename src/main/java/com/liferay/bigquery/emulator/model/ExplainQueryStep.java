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
 * ExplainQueryStep
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ExplainQueryStep {

  private String kind;

  @Valid
  private List<String> substeps = new ArrayList<>();

  public ExplainQueryStep kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Machine-readable operation type.
   * @return kind
   */
  
  @Schema(name = "kind", description = "Machine-readable operation type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ExplainQueryStep substeps(List<String> substeps) {
    this.substeps = substeps;
    return this;
  }

  public ExplainQueryStep addSubstepsItem(String substepsItem) {
    if (this.substeps == null) {
      this.substeps = new ArrayList<>();
    }
    this.substeps.add(substepsItem);
    return this;
  }

  /**
   * Human-readable stage descriptions.
   * @return substeps
   */
  
  @Schema(name = "substeps", description = "Human-readable stage descriptions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("substeps")
  public List<String> getSubsteps() {
    return substeps;
  }

  public void setSubsteps(List<String> substeps) {
    this.substeps = substeps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplainQueryStep explainQueryStep = (ExplainQueryStep) o;
    return Objects.equals(this.kind, explainQueryStep.kind) &&
        Objects.equals(this.substeps, explainQueryStep.substeps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, substeps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplainQueryStep {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    substeps: ").append(toIndentedString(substeps)).append("\n");
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

