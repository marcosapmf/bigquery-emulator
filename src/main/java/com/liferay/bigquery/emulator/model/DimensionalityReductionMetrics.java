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
 * Model evaluation metrics for dimensionality reduction models.
 */

@Schema(name = "DimensionalityReductionMetrics", description = "Model evaluation metrics for dimensionality reduction models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DimensionalityReductionMetrics {

  private Double totalExplainedVarianceRatio;

  public DimensionalityReductionMetrics totalExplainedVarianceRatio(Double totalExplainedVarianceRatio) {
    this.totalExplainedVarianceRatio = totalExplainedVarianceRatio;
    return this;
  }

  /**
   * Total percentage of variance explained by the selected principal components.
   * @return totalExplainedVarianceRatio
   */
  
  @Schema(name = "totalExplainedVarianceRatio", description = "Total percentage of variance explained by the selected principal components.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalExplainedVarianceRatio")
  public Double getTotalExplainedVarianceRatio() {
    return totalExplainedVarianceRatio;
  }

  public void setTotalExplainedVarianceRatio(Double totalExplainedVarianceRatio) {
    this.totalExplainedVarianceRatio = totalExplainedVarianceRatio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionalityReductionMetrics dimensionalityReductionMetrics = (DimensionalityReductionMetrics) o;
    return Objects.equals(this.totalExplainedVarianceRatio, dimensionalityReductionMetrics.totalExplainedVarianceRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalExplainedVarianceRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionalityReductionMetrics {\n");
    sb.append("    totalExplainedVarianceRatio: ").append(toIndentedString(totalExplainedVarianceRatio)).append("\n");
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

