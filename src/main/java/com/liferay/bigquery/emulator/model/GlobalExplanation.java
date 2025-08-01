package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.Explanation;
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
 * Global explanations containing the top most important features after training.
 */

@Schema(name = "GlobalExplanation", description = "Global explanations containing the top most important features after training.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class GlobalExplanation {

  private String classLabel;

  @Valid
  private List<@Valid Explanation> explanations = new ArrayList<>();

  public GlobalExplanation classLabel(String classLabel) {
    this.classLabel = classLabel;
    return this;
  }

  /**
   * Class label for this set of global explanations. Will be empty/null for binary logistic and linear regression models. Sorted alphabetically in descending order.
   * @return classLabel
   */
  
  @Schema(name = "classLabel", description = "Class label for this set of global explanations. Will be empty/null for binary logistic and linear regression models. Sorted alphabetically in descending order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classLabel")
  public String getClassLabel() {
    return classLabel;
  }

  public void setClassLabel(String classLabel) {
    this.classLabel = classLabel;
  }

  public GlobalExplanation explanations(List<@Valid Explanation> explanations) {
    this.explanations = explanations;
    return this;
  }

  public GlobalExplanation addExplanationsItem(Explanation explanationsItem) {
    if (this.explanations == null) {
      this.explanations = new ArrayList<>();
    }
    this.explanations.add(explanationsItem);
    return this;
  }

  /**
   * A list of the top global explanations. Sorted by absolute value of attribution in descending order.
   * @return explanations
   */
  @Valid 
  @Schema(name = "explanations", description = "A list of the top global explanations. Sorted by absolute value of attribution in descending order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanations")
  public List<@Valid Explanation> getExplanations() {
    return explanations;
  }

  public void setExplanations(List<@Valid Explanation> explanations) {
    this.explanations = explanations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalExplanation globalExplanation = (GlobalExplanation) o;
    return Objects.equals(this.classLabel, globalExplanation.classLabel) &&
        Objects.equals(this.explanations, globalExplanation.explanations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLabel, explanations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalExplanation {\n");
    sb.append("    classLabel: ").append(toIndentedString(classLabel)).append("\n");
    sb.append("    explanations: ").append(toIndentedString(explanations)).append("\n");
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

