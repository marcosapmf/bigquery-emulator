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
 * Evaluation metrics for regression and explicit feedback type matrix factorization models.
 */

@Schema(name = "RegressionMetrics", description = "Evaluation metrics for regression and explicit feedback type matrix factorization models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RegressionMetrics {

  private Double meanAbsoluteError;

  private Double meanSquaredError;

  private Double meanSquaredLogError;

  private Double medianAbsoluteError;

  private Double rSquared;

  public RegressionMetrics meanAbsoluteError(Double meanAbsoluteError) {
    this.meanAbsoluteError = meanAbsoluteError;
    return this;
  }

  /**
   * Mean absolute error.
   * @return meanAbsoluteError
   */
  
  @Schema(name = "meanAbsoluteError", description = "Mean absolute error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanAbsoluteError")
  public Double getMeanAbsoluteError() {
    return meanAbsoluteError;
  }

  public void setMeanAbsoluteError(Double meanAbsoluteError) {
    this.meanAbsoluteError = meanAbsoluteError;
  }

  public RegressionMetrics meanSquaredError(Double meanSquaredError) {
    this.meanSquaredError = meanSquaredError;
    return this;
  }

  /**
   * Mean squared error.
   * @return meanSquaredError
   */
  
  @Schema(name = "meanSquaredError", description = "Mean squared error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanSquaredError")
  public Double getMeanSquaredError() {
    return meanSquaredError;
  }

  public void setMeanSquaredError(Double meanSquaredError) {
    this.meanSquaredError = meanSquaredError;
  }

  public RegressionMetrics meanSquaredLogError(Double meanSquaredLogError) {
    this.meanSquaredLogError = meanSquaredLogError;
    return this;
  }

  /**
   * Mean squared log error.
   * @return meanSquaredLogError
   */
  
  @Schema(name = "meanSquaredLogError", description = "Mean squared log error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanSquaredLogError")
  public Double getMeanSquaredLogError() {
    return meanSquaredLogError;
  }

  public void setMeanSquaredLogError(Double meanSquaredLogError) {
    this.meanSquaredLogError = meanSquaredLogError;
  }

  public RegressionMetrics medianAbsoluteError(Double medianAbsoluteError) {
    this.medianAbsoluteError = medianAbsoluteError;
    return this;
  }

  /**
   * Median absolute error.
   * @return medianAbsoluteError
   */
  
  @Schema(name = "medianAbsoluteError", description = "Median absolute error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("medianAbsoluteError")
  public Double getMedianAbsoluteError() {
    return medianAbsoluteError;
  }

  public void setMedianAbsoluteError(Double medianAbsoluteError) {
    this.medianAbsoluteError = medianAbsoluteError;
  }

  public RegressionMetrics rSquared(Double rSquared) {
    this.rSquared = rSquared;
    return this;
  }

  /**
   * R^2 score. This corresponds to r2_score in ML.EVALUATE.
   * @return rSquared
   */
  
  @Schema(name = "rSquared", description = "R^2 score. This corresponds to r2_score in ML.EVALUATE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rSquared")
  public Double getrSquared() {
    return rSquared;
  }

  public void setrSquared(Double rSquared) {
    this.rSquared = rSquared;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegressionMetrics regressionMetrics = (RegressionMetrics) o;
    return Objects.equals(this.meanAbsoluteError, regressionMetrics.meanAbsoluteError) &&
        Objects.equals(this.meanSquaredError, regressionMetrics.meanSquaredError) &&
        Objects.equals(this.meanSquaredLogError, regressionMetrics.meanSquaredLogError) &&
        Objects.equals(this.medianAbsoluteError, regressionMetrics.medianAbsoluteError) &&
        Objects.equals(this.rSquared, regressionMetrics.rSquared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meanAbsoluteError, meanSquaredError, meanSquaredLogError, medianAbsoluteError, rSquared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegressionMetrics {\n");
    sb.append("    meanAbsoluteError: ").append(toIndentedString(meanAbsoluteError)).append("\n");
    sb.append("    meanSquaredError: ").append(toIndentedString(meanSquaredError)).append("\n");
    sb.append("    meanSquaredLogError: ").append(toIndentedString(meanSquaredLogError)).append("\n");
    sb.append("    medianAbsoluteError: ").append(toIndentedString(medianAbsoluteError)).append("\n");
    sb.append("    rSquared: ").append(toIndentedString(rSquared)).append("\n");
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

