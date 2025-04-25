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
 * Evaluation metrics used by weighted-ALS models specified by feedback_type&#x3D;implicit.
 */

@Schema(name = "RankingMetrics", description = "Evaluation metrics used by weighted-ALS models specified by feedback_type=implicit.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RankingMetrics {

  private Double averageRank;

  private Double meanAveragePrecision;

  private Double meanSquaredError;

  private Double normalizedDiscountedCumulativeGain;

  public RankingMetrics averageRank(Double averageRank) {
    this.averageRank = averageRank;
    return this;
  }

  /**
   * Determines the goodness of a ranking by computing the percentile rank from the predicted confidence and dividing it by the original rank.
   * @return averageRank
   */
  
  @Schema(name = "averageRank", description = "Determines the goodness of a ranking by computing the percentile rank from the predicted confidence and dividing it by the original rank.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageRank")
  public Double getAverageRank() {
    return averageRank;
  }

  public void setAverageRank(Double averageRank) {
    this.averageRank = averageRank;
  }

  public RankingMetrics meanAveragePrecision(Double meanAveragePrecision) {
    this.meanAveragePrecision = meanAveragePrecision;
    return this;
  }

  /**
   * Calculates a precision per user for all the items by ranking them and then averages all the precisions across all the users.
   * @return meanAveragePrecision
   */
  
  @Schema(name = "meanAveragePrecision", description = "Calculates a precision per user for all the items by ranking them and then averages all the precisions across all the users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanAveragePrecision")
  public Double getMeanAveragePrecision() {
    return meanAveragePrecision;
  }

  public void setMeanAveragePrecision(Double meanAveragePrecision) {
    this.meanAveragePrecision = meanAveragePrecision;
  }

  public RankingMetrics meanSquaredError(Double meanSquaredError) {
    this.meanSquaredError = meanSquaredError;
    return this;
  }

  /**
   * Similar to the mean squared error computed in regression and explicit recommendation models except instead of computing the rating directly, the output from evaluate is computed against a preference which is 1 or 0 depending on if the rating exists or not.
   * @return meanSquaredError
   */
  
  @Schema(name = "meanSquaredError", description = "Similar to the mean squared error computed in regression and explicit recommendation models except instead of computing the rating directly, the output from evaluate is computed against a preference which is 1 or 0 depending on if the rating exists or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanSquaredError")
  public Double getMeanSquaredError() {
    return meanSquaredError;
  }

  public void setMeanSquaredError(Double meanSquaredError) {
    this.meanSquaredError = meanSquaredError;
  }

  public RankingMetrics normalizedDiscountedCumulativeGain(Double normalizedDiscountedCumulativeGain) {
    this.normalizedDiscountedCumulativeGain = normalizedDiscountedCumulativeGain;
    return this;
  }

  /**
   * A metric to determine the goodness of a ranking calculated from the predicted confidence by comparing it to an ideal rank measured by the original ratings.
   * @return normalizedDiscountedCumulativeGain
   */
  
  @Schema(name = "normalizedDiscountedCumulativeGain", description = "A metric to determine the goodness of a ranking calculated from the predicted confidence by comparing it to an ideal rank measured by the original ratings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("normalizedDiscountedCumulativeGain")
  public Double getNormalizedDiscountedCumulativeGain() {
    return normalizedDiscountedCumulativeGain;
  }

  public void setNormalizedDiscountedCumulativeGain(Double normalizedDiscountedCumulativeGain) {
    this.normalizedDiscountedCumulativeGain = normalizedDiscountedCumulativeGain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingMetrics rankingMetrics = (RankingMetrics) o;
    return Objects.equals(this.averageRank, rankingMetrics.averageRank) &&
        Objects.equals(this.meanAveragePrecision, rankingMetrics.meanAveragePrecision) &&
        Objects.equals(this.meanSquaredError, rankingMetrics.meanSquaredError) &&
        Objects.equals(this.normalizedDiscountedCumulativeGain, rankingMetrics.normalizedDiscountedCumulativeGain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageRank, meanAveragePrecision, meanSquaredError, normalizedDiscountedCumulativeGain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingMetrics {\n");
    sb.append("    averageRank: ").append(toIndentedString(averageRank)).append("\n");
    sb.append("    meanAveragePrecision: ").append(toIndentedString(meanAveragePrecision)).append("\n");
    sb.append("    meanSquaredError: ").append(toIndentedString(meanSquaredError)).append("\n");
    sb.append("    normalizedDiscountedCumulativeGain: ").append(toIndentedString(normalizedDiscountedCumulativeGain)).append("\n");
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

