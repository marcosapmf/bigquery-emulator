package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.ArimaModelInfo;

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
 * (Auto-)arima fitting result. Wrap everything in ArimaResult for easier refactoring if we want to use model-specific iteration results.
 */

@Schema(name = "ArimaResult", description = "(Auto-)arima fitting result. Wrap everything in ArimaResult for easier refactoring if we want to use model-specific iteration results.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaResult {

  @Valid
  private List<@Valid ArimaModelInfo> arimaModelInfo = new ArrayList<>();

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

  public ArimaResult arimaModelInfo(List<@Valid ArimaModelInfo> arimaModelInfo) {
    this.arimaModelInfo = arimaModelInfo;
    return this;
  }

  public ArimaResult addArimaModelInfoItem(ArimaModelInfo arimaModelInfoItem) {
    if (this.arimaModelInfo == null) {
      this.arimaModelInfo = new ArrayList<>();
    }
    this.arimaModelInfo.add(arimaModelInfoItem);
    return this;
  }

  /**
   * This message is repeated because there are multiple arima models fitted in auto-arima. For non-auto-arima model, its size is one.
   * @return arimaModelInfo
   */
  @Valid 
  @Schema(name = "arimaModelInfo", description = "This message is repeated because there are multiple arima models fitted in auto-arima. For non-auto-arima model, its size is one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arimaModelInfo")
  public List<@Valid ArimaModelInfo> getArimaModelInfo() {
    return arimaModelInfo;
  }

  public void setArimaModelInfo(List<@Valid ArimaModelInfo> arimaModelInfo) {
    this.arimaModelInfo = arimaModelInfo;
  }

  public ArimaResult seasonalPeriods(List<SeasonalPeriodsEnum> seasonalPeriods) {
    this.seasonalPeriods = seasonalPeriods;
    return this;
  }

  public ArimaResult addSeasonalPeriodsItem(SeasonalPeriodsEnum seasonalPeriodsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaResult arimaResult = (ArimaResult) o;
    return Objects.equals(this.arimaModelInfo, arimaResult.arimaModelInfo) &&
        Objects.equals(this.seasonalPeriods, arimaResult.seasonalPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arimaModelInfo, seasonalPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaResult {\n");
    sb.append("    arimaModelInfo: ").append(toIndentedString(arimaModelInfo)).append("\n");
    sb.append("    seasonalPeriods: ").append(toIndentedString(seasonalPeriods)).append("\n");
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

