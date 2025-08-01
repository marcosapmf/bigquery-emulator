package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.ArimaFittingMetrics;
import com.liferay.bigquery.emulator.model.ArimaOrder;
import com.liferay.bigquery.emulator.model.ArimaSingleModelForecastingMetrics;

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
 * Model evaluation metrics for ARIMA forecasting models.
 */

@Schema(name = "ArimaForecastingMetrics", description = "Model evaluation metrics for ARIMA forecasting models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaForecastingMetrics {

  @Valid
  private List<@Valid ArimaFittingMetrics> arimaFittingMetrics = new ArrayList<>();

  @Valid
  private List<@Valid ArimaSingleModelForecastingMetrics> arimaSingleModelForecastingMetrics = new ArrayList<>();

  @Valid
  private List<Boolean> hasDrift = new ArrayList<>();

  @Valid
  private List<@Valid ArimaOrder> nonSeasonalOrder = new ArrayList<>();

  /**
   * Gets or Sets seasonalPeriods
   */
  public enum SeasonalPeriodsEnum {
    SEASONAL_PERIOD_TYPE_UNSPECIFIED("SEASONAL_PERIOD_TYPE_UNSPECIFIED"),
    
    NO_SEASONALITY("NO_SEASONALITY"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    YEARLY("YEARLY");

    private String value;

    SeasonalPeriodsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeasonalPeriodsEnum fromValue(String value) {
      for (SeasonalPeriodsEnum b : SeasonalPeriodsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SeasonalPeriodsEnum> seasonalPeriods = new ArrayList<>();

  @Valid
  private List<String> timeSeriesId = new ArrayList<>();

  public ArimaForecastingMetrics arimaFittingMetrics(List<@Valid ArimaFittingMetrics> arimaFittingMetrics) {
    this.arimaFittingMetrics = arimaFittingMetrics;
    return this;
  }

  public ArimaForecastingMetrics addArimaFittingMetricsItem(ArimaFittingMetrics arimaFittingMetricsItem) {
    if (this.arimaFittingMetrics == null) {
      this.arimaFittingMetrics = new ArrayList<>();
    }
    this.arimaFittingMetrics.add(arimaFittingMetricsItem);
    return this;
  }

  /**
   * Arima model fitting metrics.
   * @return arimaFittingMetrics
   */
  @Valid 
  @Schema(name = "arimaFittingMetrics", description = "Arima model fitting metrics.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arimaFittingMetrics")
  public List<@Valid ArimaFittingMetrics> getArimaFittingMetrics() {
    return arimaFittingMetrics;
  }

  public void setArimaFittingMetrics(List<@Valid ArimaFittingMetrics> arimaFittingMetrics) {
    this.arimaFittingMetrics = arimaFittingMetrics;
  }

  public ArimaForecastingMetrics arimaSingleModelForecastingMetrics(List<@Valid ArimaSingleModelForecastingMetrics> arimaSingleModelForecastingMetrics) {
    this.arimaSingleModelForecastingMetrics = arimaSingleModelForecastingMetrics;
    return this;
  }

  public ArimaForecastingMetrics addArimaSingleModelForecastingMetricsItem(ArimaSingleModelForecastingMetrics arimaSingleModelForecastingMetricsItem) {
    if (this.arimaSingleModelForecastingMetrics == null) {
      this.arimaSingleModelForecastingMetrics = new ArrayList<>();
    }
    this.arimaSingleModelForecastingMetrics.add(arimaSingleModelForecastingMetricsItem);
    return this;
  }

  /**
   * Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case.
   * @return arimaSingleModelForecastingMetrics
   */
  @Valid 
  @Schema(name = "arimaSingleModelForecastingMetrics", description = "Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arimaSingleModelForecastingMetrics")
  public List<@Valid ArimaSingleModelForecastingMetrics> getArimaSingleModelForecastingMetrics() {
    return arimaSingleModelForecastingMetrics;
  }

  public void setArimaSingleModelForecastingMetrics(List<@Valid ArimaSingleModelForecastingMetrics> arimaSingleModelForecastingMetrics) {
    this.arimaSingleModelForecastingMetrics = arimaSingleModelForecastingMetrics;
  }

  public ArimaForecastingMetrics hasDrift(List<Boolean> hasDrift) {
    this.hasDrift = hasDrift;
    return this;
  }

  public ArimaForecastingMetrics addHasDriftItem(Boolean hasDriftItem) {
    if (this.hasDrift == null) {
      this.hasDrift = new ArrayList<>();
    }
    this.hasDrift.add(hasDriftItem);
    return this;
  }

  /**
   * Whether Arima model fitted with drift or not. It is always false when d is not 1.
   * @return hasDrift
   */
  
  @Schema(name = "hasDrift", description = "Whether Arima model fitted with drift or not. It is always false when d is not 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDrift")
  public List<Boolean> getHasDrift() {
    return hasDrift;
  }

  public void setHasDrift(List<Boolean> hasDrift) {
    this.hasDrift = hasDrift;
  }

  public ArimaForecastingMetrics nonSeasonalOrder(List<@Valid ArimaOrder> nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
    return this;
  }

  public ArimaForecastingMetrics addNonSeasonalOrderItem(ArimaOrder nonSeasonalOrderItem) {
    if (this.nonSeasonalOrder == null) {
      this.nonSeasonalOrder = new ArrayList<>();
    }
    this.nonSeasonalOrder.add(nonSeasonalOrderItem);
    return this;
  }

  /**
   * Non-seasonal order.
   * @return nonSeasonalOrder
   */
  @Valid 
  @Schema(name = "nonSeasonalOrder", description = "Non-seasonal order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonSeasonalOrder")
  public List<@Valid ArimaOrder> getNonSeasonalOrder() {
    return nonSeasonalOrder;
  }

  public void setNonSeasonalOrder(List<@Valid ArimaOrder> nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
  }

  public ArimaForecastingMetrics seasonalPeriods(List<SeasonalPeriodsEnum> seasonalPeriods) {
    this.seasonalPeriods = seasonalPeriods;
    return this;
  }

  public ArimaForecastingMetrics addSeasonalPeriodsItem(SeasonalPeriodsEnum seasonalPeriodsItem) {
    if (this.seasonalPeriods == null) {
      this.seasonalPeriods = new ArrayList<>();
    }
    this.seasonalPeriods.add(seasonalPeriodsItem);
    return this;
  }

  /**
   * Seasonal periods. Repeated because multiple periods are supported for one time series.
   * @return seasonalPeriods
   */
  
  @Schema(name = "seasonalPeriods", description = "Seasonal periods. Repeated because multiple periods are supported for one time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seasonalPeriods")
  public List<SeasonalPeriodsEnum> getSeasonalPeriods() {
    return seasonalPeriods;
  }

  public void setSeasonalPeriods(List<SeasonalPeriodsEnum> seasonalPeriods) {
    this.seasonalPeriods = seasonalPeriods;
  }

  public ArimaForecastingMetrics timeSeriesId(List<String> timeSeriesId) {
    this.timeSeriesId = timeSeriesId;
    return this;
  }

  public ArimaForecastingMetrics addTimeSeriesIdItem(String timeSeriesIdItem) {
    if (this.timeSeriesId == null) {
      this.timeSeriesId = new ArrayList<>();
    }
    this.timeSeriesId.add(timeSeriesIdItem);
    return this;
  }

  /**
   * Id to differentiate different time series for the large-scale case.
   * @return timeSeriesId
   */
  
  @Schema(name = "timeSeriesId", description = "Id to differentiate different time series for the large-scale case.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesId")
  public List<String> getTimeSeriesId() {
    return timeSeriesId;
  }

  public void setTimeSeriesId(List<String> timeSeriesId) {
    this.timeSeriesId = timeSeriesId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaForecastingMetrics arimaForecastingMetrics = (ArimaForecastingMetrics) o;
    return Objects.equals(this.arimaFittingMetrics, arimaForecastingMetrics.arimaFittingMetrics) &&
        Objects.equals(this.arimaSingleModelForecastingMetrics, arimaForecastingMetrics.arimaSingleModelForecastingMetrics) &&
        Objects.equals(this.hasDrift, arimaForecastingMetrics.hasDrift) &&
        Objects.equals(this.nonSeasonalOrder, arimaForecastingMetrics.nonSeasonalOrder) &&
        Objects.equals(this.seasonalPeriods, arimaForecastingMetrics.seasonalPeriods) &&
        Objects.equals(this.timeSeriesId, arimaForecastingMetrics.timeSeriesId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arimaFittingMetrics, arimaSingleModelForecastingMetrics, hasDrift, nonSeasonalOrder, seasonalPeriods, timeSeriesId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaForecastingMetrics {\n");
    sb.append("    arimaFittingMetrics: ").append(toIndentedString(arimaFittingMetrics)).append("\n");
    sb.append("    arimaSingleModelForecastingMetrics: ").append(toIndentedString(arimaSingleModelForecastingMetrics)).append("\n");
    sb.append("    hasDrift: ").append(toIndentedString(hasDrift)).append("\n");
    sb.append("    nonSeasonalOrder: ").append(toIndentedString(nonSeasonalOrder)).append("\n");
    sb.append("    seasonalPeriods: ").append(toIndentedString(seasonalPeriods)).append("\n");
    sb.append("    timeSeriesId: ").append(toIndentedString(timeSeriesId)).append("\n");
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

