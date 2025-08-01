package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.ArimaFittingMetrics;
import com.liferay.bigquery.emulator.model.ArimaOrder;

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
 * Model evaluation metrics for a single ARIMA forecasting model.
 */

@Schema(name = "ArimaSingleModelForecastingMetrics", description = "Model evaluation metrics for a single ARIMA forecasting model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaSingleModelForecastingMetrics {

  private ArimaFittingMetrics arimaFittingMetrics;

  private Boolean hasDrift;

  private Boolean hasHolidayEffect;

  private Boolean hasSpikesAndDips;

  private Boolean hasStepChanges;

  private ArimaOrder nonSeasonalOrder;

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

  private String timeSeriesId;

  @Valid
  private List<String> timeSeriesIds = new ArrayList<>();

  public ArimaSingleModelForecastingMetrics arimaFittingMetrics(ArimaFittingMetrics arimaFittingMetrics) {
    this.arimaFittingMetrics = arimaFittingMetrics;
    return this;
  }

  /**
   * Get arimaFittingMetrics
   * @return arimaFittingMetrics
   */
  @Valid 
  @Schema(name = "arimaFittingMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arimaFittingMetrics")
  public ArimaFittingMetrics getArimaFittingMetrics() {
    return arimaFittingMetrics;
  }

  public void setArimaFittingMetrics(ArimaFittingMetrics arimaFittingMetrics) {
    this.arimaFittingMetrics = arimaFittingMetrics;
  }

  public ArimaSingleModelForecastingMetrics hasDrift(Boolean hasDrift) {
    this.hasDrift = hasDrift;
    return this;
  }

  /**
   * Is arima model fitted with drift or not. It is always false when d is not 1.
   * @return hasDrift
   */
  
  @Schema(name = "hasDrift", description = "Is arima model fitted with drift or not. It is always false when d is not 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDrift")
  public Boolean getHasDrift() {
    return hasDrift;
  }

  public void setHasDrift(Boolean hasDrift) {
    this.hasDrift = hasDrift;
  }

  public ArimaSingleModelForecastingMetrics hasHolidayEffect(Boolean hasHolidayEffect) {
    this.hasHolidayEffect = hasHolidayEffect;
    return this;
  }

  /**
   * If true, holiday_effect is a part of time series decomposition result.
   * @return hasHolidayEffect
   */
  
  @Schema(name = "hasHolidayEffect", description = "If true, holiday_effect is a part of time series decomposition result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasHolidayEffect")
  public Boolean getHasHolidayEffect() {
    return hasHolidayEffect;
  }

  public void setHasHolidayEffect(Boolean hasHolidayEffect) {
    this.hasHolidayEffect = hasHolidayEffect;
  }

  public ArimaSingleModelForecastingMetrics hasSpikesAndDips(Boolean hasSpikesAndDips) {
    this.hasSpikesAndDips = hasSpikesAndDips;
    return this;
  }

  /**
   * If true, spikes_and_dips is a part of time series decomposition result.
   * @return hasSpikesAndDips
   */
  
  @Schema(name = "hasSpikesAndDips", description = "If true, spikes_and_dips is a part of time series decomposition result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasSpikesAndDips")
  public Boolean getHasSpikesAndDips() {
    return hasSpikesAndDips;
  }

  public void setHasSpikesAndDips(Boolean hasSpikesAndDips) {
    this.hasSpikesAndDips = hasSpikesAndDips;
  }

  public ArimaSingleModelForecastingMetrics hasStepChanges(Boolean hasStepChanges) {
    this.hasStepChanges = hasStepChanges;
    return this;
  }

  /**
   * If true, step_changes is a part of time series decomposition result.
   * @return hasStepChanges
   */
  
  @Schema(name = "hasStepChanges", description = "If true, step_changes is a part of time series decomposition result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasStepChanges")
  public Boolean getHasStepChanges() {
    return hasStepChanges;
  }

  public void setHasStepChanges(Boolean hasStepChanges) {
    this.hasStepChanges = hasStepChanges;
  }

  public ArimaSingleModelForecastingMetrics nonSeasonalOrder(ArimaOrder nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
    return this;
  }

  /**
   * Get nonSeasonalOrder
   * @return nonSeasonalOrder
   */
  @Valid 
  @Schema(name = "nonSeasonalOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonSeasonalOrder")
  public ArimaOrder getNonSeasonalOrder() {
    return nonSeasonalOrder;
  }

  public void setNonSeasonalOrder(ArimaOrder nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
  }

  public ArimaSingleModelForecastingMetrics seasonalPeriods(List<SeasonalPeriodsEnum> seasonalPeriods) {
    this.seasonalPeriods = seasonalPeriods;
    return this;
  }

  public ArimaSingleModelForecastingMetrics addSeasonalPeriodsItem(SeasonalPeriodsEnum seasonalPeriodsItem) {
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

  public ArimaSingleModelForecastingMetrics timeSeriesId(String timeSeriesId) {
    this.timeSeriesId = timeSeriesId;
    return this;
  }

  /**
   * The time_series_id value for this time series. It will be one of the unique values from the time_series_id_column specified during ARIMA model training. Only present when time_series_id_column training option was used.
   * @return timeSeriesId
   */
  
  @Schema(name = "timeSeriesId", description = "The time_series_id value for this time series. It will be one of the unique values from the time_series_id_column specified during ARIMA model training. Only present when time_series_id_column training option was used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesId")
  public String getTimeSeriesId() {
    return timeSeriesId;
  }

  public void setTimeSeriesId(String timeSeriesId) {
    this.timeSeriesId = timeSeriesId;
  }

  public ArimaSingleModelForecastingMetrics timeSeriesIds(List<String> timeSeriesIds) {
    this.timeSeriesIds = timeSeriesIds;
    return this;
  }

  public ArimaSingleModelForecastingMetrics addTimeSeriesIdsItem(String timeSeriesIdsItem) {
    if (this.timeSeriesIds == null) {
      this.timeSeriesIds = new ArrayList<>();
    }
    this.timeSeriesIds.add(timeSeriesIdsItem);
    return this;
  }

  /**
   * The tuple of time_series_ids identifying this time series. It will be one of the unique tuples of values present in the time_series_id_columns specified during ARIMA model training. Only present when time_series_id_columns training option was used and the order of values here are same as the order of time_series_id_columns.
   * @return timeSeriesIds
   */
  
  @Schema(name = "timeSeriesIds", description = "The tuple of time_series_ids identifying this time series. It will be one of the unique tuples of values present in the time_series_id_columns specified during ARIMA model training. Only present when time_series_id_columns training option was used and the order of values here are same as the order of time_series_id_columns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesIds")
  public List<String> getTimeSeriesIds() {
    return timeSeriesIds;
  }

  public void setTimeSeriesIds(List<String> timeSeriesIds) {
    this.timeSeriesIds = timeSeriesIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaSingleModelForecastingMetrics arimaSingleModelForecastingMetrics = (ArimaSingleModelForecastingMetrics) o;
    return Objects.equals(this.arimaFittingMetrics, arimaSingleModelForecastingMetrics.arimaFittingMetrics) &&
        Objects.equals(this.hasDrift, arimaSingleModelForecastingMetrics.hasDrift) &&
        Objects.equals(this.hasHolidayEffect, arimaSingleModelForecastingMetrics.hasHolidayEffect) &&
        Objects.equals(this.hasSpikesAndDips, arimaSingleModelForecastingMetrics.hasSpikesAndDips) &&
        Objects.equals(this.hasStepChanges, arimaSingleModelForecastingMetrics.hasStepChanges) &&
        Objects.equals(this.nonSeasonalOrder, arimaSingleModelForecastingMetrics.nonSeasonalOrder) &&
        Objects.equals(this.seasonalPeriods, arimaSingleModelForecastingMetrics.seasonalPeriods) &&
        Objects.equals(this.timeSeriesId, arimaSingleModelForecastingMetrics.timeSeriesId) &&
        Objects.equals(this.timeSeriesIds, arimaSingleModelForecastingMetrics.timeSeriesIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arimaFittingMetrics, hasDrift, hasHolidayEffect, hasSpikesAndDips, hasStepChanges, nonSeasonalOrder, seasonalPeriods, timeSeriesId, timeSeriesIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaSingleModelForecastingMetrics {\n");
    sb.append("    arimaFittingMetrics: ").append(toIndentedString(arimaFittingMetrics)).append("\n");
    sb.append("    hasDrift: ").append(toIndentedString(hasDrift)).append("\n");
    sb.append("    hasHolidayEffect: ").append(toIndentedString(hasHolidayEffect)).append("\n");
    sb.append("    hasSpikesAndDips: ").append(toIndentedString(hasSpikesAndDips)).append("\n");
    sb.append("    hasStepChanges: ").append(toIndentedString(hasStepChanges)).append("\n");
    sb.append("    nonSeasonalOrder: ").append(toIndentedString(nonSeasonalOrder)).append("\n");
    sb.append("    seasonalPeriods: ").append(toIndentedString(seasonalPeriods)).append("\n");
    sb.append("    timeSeriesId: ").append(toIndentedString(timeSeriesId)).append("\n");
    sb.append("    timeSeriesIds: ").append(toIndentedString(timeSeriesIds)).append("\n");
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

