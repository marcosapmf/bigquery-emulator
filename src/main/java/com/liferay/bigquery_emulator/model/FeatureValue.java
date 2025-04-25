package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.CategoricalValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Representative value of a single feature within the cluster.
 */

@Schema(name = "FeatureValue", description = "Representative value of a single feature within the cluster.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class FeatureValue {

  private CategoricalValue categoricalValue;

  private String featureColumn;

  private Double numericalValue;

  public FeatureValue categoricalValue(CategoricalValue categoricalValue) {
    this.categoricalValue = categoricalValue;
    return this;
  }

  /**
   * Get categoricalValue
   * @return categoricalValue
   */
  @Valid 
  @Schema(name = "categoricalValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoricalValue")
  public CategoricalValue getCategoricalValue() {
    return categoricalValue;
  }

  public void setCategoricalValue(CategoricalValue categoricalValue) {
    this.categoricalValue = categoricalValue;
  }

  public FeatureValue featureColumn(String featureColumn) {
    this.featureColumn = featureColumn;
    return this;
  }

  /**
   * The feature column name.
   * @return featureColumn
   */
  
  @Schema(name = "featureColumn", description = "The feature column name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureColumn")
  public String getFeatureColumn() {
    return featureColumn;
  }

  public void setFeatureColumn(String featureColumn) {
    this.featureColumn = featureColumn;
  }

  public FeatureValue numericalValue(Double numericalValue) {
    this.numericalValue = numericalValue;
    return this;
  }

  /**
   * The numerical feature value. This is the centroid value for this feature.
   * @return numericalValue
   */
  
  @Schema(name = "numericalValue", description = "The numerical feature value. This is the centroid value for this feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numericalValue")
  public Double getNumericalValue() {
    return numericalValue;
  }

  public void setNumericalValue(Double numericalValue) {
    this.numericalValue = numericalValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureValue featureValue = (FeatureValue) o;
    return Objects.equals(this.categoricalValue, featureValue.categoricalValue) &&
        Objects.equals(this.featureColumn, featureValue.featureColumn) &&
        Objects.equals(this.numericalValue, featureValue.numericalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoricalValue, featureColumn, numericalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureValue {\n");
    sb.append("    categoricalValue: ").append(toIndentedString(categoricalValue)).append("\n");
    sb.append("    featureColumn: ").append(toIndentedString(featureColumn)).append("\n");
    sb.append("    numericalValue: ").append(toIndentedString(numericalValue)).append("\n");
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

