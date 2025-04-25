package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
 */

@Schema(name = "BqmlTrainingRun_trainingOptions", description = "[Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.")
@JsonTypeName("BqmlTrainingRun_trainingOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BqmlTrainingRunTrainingOptions {

  private Boolean earlyStop;

  private Double l1Reg;

  private Double l2Reg;

  private Double learnRate;

  private String learnRateStrategy;

  private Double lineSearchInitLearnRate;

  private String maxIteration;

  private Double minRelProgress;

  private Boolean warmStart;

  public BqmlTrainingRunTrainingOptions earlyStop(Boolean earlyStop) {
    this.earlyStop = earlyStop;
    return this;
  }

  /**
   * Get earlyStop
   * @return earlyStop
   */
  
  @Schema(name = "earlyStop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earlyStop")
  public Boolean getEarlyStop() {
    return earlyStop;
  }

  public void setEarlyStop(Boolean earlyStop) {
    this.earlyStop = earlyStop;
  }

  public BqmlTrainingRunTrainingOptions l1Reg(Double l1Reg) {
    this.l1Reg = l1Reg;
    return this;
  }

  /**
   * Get l1Reg
   * @return l1Reg
   */
  
  @Schema(name = "l1Reg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l1Reg")
  public Double getL1Reg() {
    return l1Reg;
  }

  public void setL1Reg(Double l1Reg) {
    this.l1Reg = l1Reg;
  }

  public BqmlTrainingRunTrainingOptions l2Reg(Double l2Reg) {
    this.l2Reg = l2Reg;
    return this;
  }

  /**
   * Get l2Reg
   * @return l2Reg
   */
  
  @Schema(name = "l2Reg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l2Reg")
  public Double getL2Reg() {
    return l2Reg;
  }

  public void setL2Reg(Double l2Reg) {
    this.l2Reg = l2Reg;
  }

  public BqmlTrainingRunTrainingOptions learnRate(Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * Get learnRate
   * @return learnRate
   */
  
  @Schema(name = "learnRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRate")
  public Double getLearnRate() {
    return learnRate;
  }

  public void setLearnRate(Double learnRate) {
    this.learnRate = learnRate;
  }

  public BqmlTrainingRunTrainingOptions learnRateStrategy(String learnRateStrategy) {
    this.learnRateStrategy = learnRateStrategy;
    return this;
  }

  /**
   * Get learnRateStrategy
   * @return learnRateStrategy
   */
  
  @Schema(name = "learnRateStrategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRateStrategy")
  public String getLearnRateStrategy() {
    return learnRateStrategy;
  }

  public void setLearnRateStrategy(String learnRateStrategy) {
    this.learnRateStrategy = learnRateStrategy;
  }

  public BqmlTrainingRunTrainingOptions lineSearchInitLearnRate(Double lineSearchInitLearnRate) {
    this.lineSearchInitLearnRate = lineSearchInitLearnRate;
    return this;
  }

  /**
   * Get lineSearchInitLearnRate
   * @return lineSearchInitLearnRate
   */
  
  @Schema(name = "lineSearchInitLearnRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineSearchInitLearnRate")
  public Double getLineSearchInitLearnRate() {
    return lineSearchInitLearnRate;
  }

  public void setLineSearchInitLearnRate(Double lineSearchInitLearnRate) {
    this.lineSearchInitLearnRate = lineSearchInitLearnRate;
  }

  public BqmlTrainingRunTrainingOptions maxIteration(String maxIteration) {
    this.maxIteration = maxIteration;
    return this;
  }

  /**
   * Get maxIteration
   * @return maxIteration
   */
  
  @Schema(name = "maxIteration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxIteration")
  public String getMaxIteration() {
    return maxIteration;
  }

  public void setMaxIteration(String maxIteration) {
    this.maxIteration = maxIteration;
  }

  public BqmlTrainingRunTrainingOptions minRelProgress(Double minRelProgress) {
    this.minRelProgress = minRelProgress;
    return this;
  }

  /**
   * Get minRelProgress
   * @return minRelProgress
   */
  
  @Schema(name = "minRelProgress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minRelProgress")
  public Double getMinRelProgress() {
    return minRelProgress;
  }

  public void setMinRelProgress(Double minRelProgress) {
    this.minRelProgress = minRelProgress;
  }

  public BqmlTrainingRunTrainingOptions warmStart(Boolean warmStart) {
    this.warmStart = warmStart;
    return this;
  }

  /**
   * Get warmStart
   * @return warmStart
   */
  
  @Schema(name = "warmStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warmStart")
  public Boolean getWarmStart() {
    return warmStart;
  }

  public void setWarmStart(Boolean warmStart) {
    this.warmStart = warmStart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BqmlTrainingRunTrainingOptions bqmlTrainingRunTrainingOptions = (BqmlTrainingRunTrainingOptions) o;
    return Objects.equals(this.earlyStop, bqmlTrainingRunTrainingOptions.earlyStop) &&
        Objects.equals(this.l1Reg, bqmlTrainingRunTrainingOptions.l1Reg) &&
        Objects.equals(this.l2Reg, bqmlTrainingRunTrainingOptions.l2Reg) &&
        Objects.equals(this.learnRate, bqmlTrainingRunTrainingOptions.learnRate) &&
        Objects.equals(this.learnRateStrategy, bqmlTrainingRunTrainingOptions.learnRateStrategy) &&
        Objects.equals(this.lineSearchInitLearnRate, bqmlTrainingRunTrainingOptions.lineSearchInitLearnRate) &&
        Objects.equals(this.maxIteration, bqmlTrainingRunTrainingOptions.maxIteration) &&
        Objects.equals(this.minRelProgress, bqmlTrainingRunTrainingOptions.minRelProgress) &&
        Objects.equals(this.warmStart, bqmlTrainingRunTrainingOptions.warmStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earlyStop, l1Reg, l2Reg, learnRate, learnRateStrategy, lineSearchInitLearnRate, maxIteration, minRelProgress, warmStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BqmlTrainingRunTrainingOptions {\n");
    sb.append("    earlyStop: ").append(toIndentedString(earlyStop)).append("\n");
    sb.append("    l1Reg: ").append(toIndentedString(l1Reg)).append("\n");
    sb.append("    l2Reg: ").append(toIndentedString(l2Reg)).append("\n");
    sb.append("    learnRate: ").append(toIndentedString(learnRate)).append("\n");
    sb.append("    learnRateStrategy: ").append(toIndentedString(learnRateStrategy)).append("\n");
    sb.append("    lineSearchInitLearnRate: ").append(toIndentedString(lineSearchInitLearnRate)).append("\n");
    sb.append("    maxIteration: ").append(toIndentedString(maxIteration)).append("\n");
    sb.append("    minRelProgress: ").append(toIndentedString(minRelProgress)).append("\n");
    sb.append("    warmStart: ").append(toIndentedString(warmStart)).append("\n");
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

