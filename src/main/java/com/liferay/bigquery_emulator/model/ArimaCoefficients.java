package com.liferay.bigquery_emulator.model;

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
 * Arima coefficients.
 */

@Schema(name = "ArimaCoefficients", description = "Arima coefficients.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaCoefficients {

  @Valid
  private List<Double> autoRegressiveCoefficients = new ArrayList<>();

  private Double interceptCoefficient;

  @Valid
  private List<Double> movingAverageCoefficients = new ArrayList<>();

  public ArimaCoefficients autoRegressiveCoefficients(List<Double> autoRegressiveCoefficients) {
    this.autoRegressiveCoefficients = autoRegressiveCoefficients;
    return this;
  }

  public ArimaCoefficients addAutoRegressiveCoefficientsItem(Double autoRegressiveCoefficientsItem) {
    if (this.autoRegressiveCoefficients == null) {
      this.autoRegressiveCoefficients = new ArrayList<>();
    }
    this.autoRegressiveCoefficients.add(autoRegressiveCoefficientsItem);
    return this;
  }

  /**
   * Auto-regressive coefficients, an array of double.
   * @return autoRegressiveCoefficients
   */
  
  @Schema(name = "autoRegressiveCoefficients", description = "Auto-regressive coefficients, an array of double.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRegressiveCoefficients")
  public List<Double> getAutoRegressiveCoefficients() {
    return autoRegressiveCoefficients;
  }

  public void setAutoRegressiveCoefficients(List<Double> autoRegressiveCoefficients) {
    this.autoRegressiveCoefficients = autoRegressiveCoefficients;
  }

  public ArimaCoefficients interceptCoefficient(Double interceptCoefficient) {
    this.interceptCoefficient = interceptCoefficient;
    return this;
  }

  /**
   * Intercept coefficient, just a double not an array.
   * @return interceptCoefficient
   */
  
  @Schema(name = "interceptCoefficient", description = "Intercept coefficient, just a double not an array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interceptCoefficient")
  public Double getInterceptCoefficient() {
    return interceptCoefficient;
  }

  public void setInterceptCoefficient(Double interceptCoefficient) {
    this.interceptCoefficient = interceptCoefficient;
  }

  public ArimaCoefficients movingAverageCoefficients(List<Double> movingAverageCoefficients) {
    this.movingAverageCoefficients = movingAverageCoefficients;
    return this;
  }

  public ArimaCoefficients addMovingAverageCoefficientsItem(Double movingAverageCoefficientsItem) {
    if (this.movingAverageCoefficients == null) {
      this.movingAverageCoefficients = new ArrayList<>();
    }
    this.movingAverageCoefficients.add(movingAverageCoefficientsItem);
    return this;
  }

  /**
   * Moving-average coefficients, an array of double.
   * @return movingAverageCoefficients
   */
  
  @Schema(name = "movingAverageCoefficients", description = "Moving-average coefficients, an array of double.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("movingAverageCoefficients")
  public List<Double> getMovingAverageCoefficients() {
    return movingAverageCoefficients;
  }

  public void setMovingAverageCoefficients(List<Double> movingAverageCoefficients) {
    this.movingAverageCoefficients = movingAverageCoefficients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaCoefficients arimaCoefficients = (ArimaCoefficients) o;
    return Objects.equals(this.autoRegressiveCoefficients, arimaCoefficients.autoRegressiveCoefficients) &&
        Objects.equals(this.interceptCoefficient, arimaCoefficients.interceptCoefficient) &&
        Objects.equals(this.movingAverageCoefficients, arimaCoefficients.movingAverageCoefficients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRegressiveCoefficients, interceptCoefficient, movingAverageCoefficients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaCoefficients {\n");
    sb.append("    autoRegressiveCoefficients: ").append(toIndentedString(autoRegressiveCoefficients)).append("\n");
    sb.append("    interceptCoefficient: ").append(toIndentedString(interceptCoefficient)).append("\n");
    sb.append("    movingAverageCoefficients: ").append(toIndentedString(movingAverageCoefficients)).append("\n");
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

