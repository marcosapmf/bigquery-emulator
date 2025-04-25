package com.liferay.bigquery_emulator.model;

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
 * ARIMA model fitting metrics.
 */

@Schema(name = "ArimaFittingMetrics", description = "ARIMA model fitting metrics.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaFittingMetrics {

  private Double aic;

  private Double logLikelihood;

  private Double variance;

  public ArimaFittingMetrics aic(Double aic) {
    this.aic = aic;
    return this;
  }

  /**
   * AIC.
   * @return aic
   */
  
  @Schema(name = "aic", description = "AIC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aic")
  public Double getAic() {
    return aic;
  }

  public void setAic(Double aic) {
    this.aic = aic;
  }

  public ArimaFittingMetrics logLikelihood(Double logLikelihood) {
    this.logLikelihood = logLikelihood;
    return this;
  }

  /**
   * Log-likelihood.
   * @return logLikelihood
   */
  
  @Schema(name = "logLikelihood", description = "Log-likelihood.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logLikelihood")
  public Double getLogLikelihood() {
    return logLikelihood;
  }

  public void setLogLikelihood(Double logLikelihood) {
    this.logLikelihood = logLikelihood;
  }

  public ArimaFittingMetrics variance(Double variance) {
    this.variance = variance;
    return this;
  }

  /**
   * Variance.
   * @return variance
   */
  
  @Schema(name = "variance", description = "Variance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variance")
  public Double getVariance() {
    return variance;
  }

  public void setVariance(Double variance) {
    this.variance = variance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaFittingMetrics arimaFittingMetrics = (ArimaFittingMetrics) o;
    return Objects.equals(this.aic, arimaFittingMetrics.aic) &&
        Objects.equals(this.logLikelihood, arimaFittingMetrics.logLikelihood) &&
        Objects.equals(this.variance, arimaFittingMetrics.variance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aic, logLikelihood, variance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaFittingMetrics {\n");
    sb.append("    aic: ").append(toIndentedString(aic)).append("\n");
    sb.append("    logLikelihood: ").append(toIndentedString(logLikelihood)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
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

