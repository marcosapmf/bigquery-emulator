package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.ArimaForecastingMetrics;
import com.liferay.bigquery.emulator.model.BinaryClassificationMetrics;
import com.liferay.bigquery.emulator.model.ClusteringMetrics;
import com.liferay.bigquery.emulator.model.DimensionalityReductionMetrics;
import com.liferay.bigquery.emulator.model.MultiClassClassificationMetrics;
import com.liferay.bigquery.emulator.model.RankingMetrics;
import com.liferay.bigquery.emulator.model.RegressionMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Evaluation metrics of a model. These are either computed on all training data or just the eval data based on whether eval data was used during training. These are not present for imported models.
 */

@Schema(name = "EvaluationMetrics", description = "Evaluation metrics of a model. These are either computed on all training data or just the eval data based on whether eval data was used during training. These are not present for imported models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class EvaluationMetrics {

  private ArimaForecastingMetrics arimaForecastingMetrics;

  private BinaryClassificationMetrics binaryClassificationMetrics;

  private ClusteringMetrics clusteringMetrics;

  private DimensionalityReductionMetrics dimensionalityReductionMetrics;

  private MultiClassClassificationMetrics multiClassClassificationMetrics;

  private RankingMetrics rankingMetrics;

  private RegressionMetrics regressionMetrics;

  public EvaluationMetrics arimaForecastingMetrics(ArimaForecastingMetrics arimaForecastingMetrics) {
    this.arimaForecastingMetrics = arimaForecastingMetrics;
    return this;
  }

  /**
   * Get arimaForecastingMetrics
   * @return arimaForecastingMetrics
   */
  @Valid 
  @Schema(name = "arimaForecastingMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arimaForecastingMetrics")
  public ArimaForecastingMetrics getArimaForecastingMetrics() {
    return arimaForecastingMetrics;
  }

  public void setArimaForecastingMetrics(ArimaForecastingMetrics arimaForecastingMetrics) {
    this.arimaForecastingMetrics = arimaForecastingMetrics;
  }

  public EvaluationMetrics binaryClassificationMetrics(BinaryClassificationMetrics binaryClassificationMetrics) {
    this.binaryClassificationMetrics = binaryClassificationMetrics;
    return this;
  }

  /**
   * Get binaryClassificationMetrics
   * @return binaryClassificationMetrics
   */
  @Valid 
  @Schema(name = "binaryClassificationMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binaryClassificationMetrics")
  public BinaryClassificationMetrics getBinaryClassificationMetrics() {
    return binaryClassificationMetrics;
  }

  public void setBinaryClassificationMetrics(BinaryClassificationMetrics binaryClassificationMetrics) {
    this.binaryClassificationMetrics = binaryClassificationMetrics;
  }

  public EvaluationMetrics clusteringMetrics(ClusteringMetrics clusteringMetrics) {
    this.clusteringMetrics = clusteringMetrics;
    return this;
  }

  /**
   * Get clusteringMetrics
   * @return clusteringMetrics
   */
  @Valid 
  @Schema(name = "clusteringMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusteringMetrics")
  public ClusteringMetrics getClusteringMetrics() {
    return clusteringMetrics;
  }

  public void setClusteringMetrics(ClusteringMetrics clusteringMetrics) {
    this.clusteringMetrics = clusteringMetrics;
  }

  public EvaluationMetrics dimensionalityReductionMetrics(DimensionalityReductionMetrics dimensionalityReductionMetrics) {
    this.dimensionalityReductionMetrics = dimensionalityReductionMetrics;
    return this;
  }

  /**
   * Get dimensionalityReductionMetrics
   * @return dimensionalityReductionMetrics
   */
  @Valid 
  @Schema(name = "dimensionalityReductionMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensionalityReductionMetrics")
  public DimensionalityReductionMetrics getDimensionalityReductionMetrics() {
    return dimensionalityReductionMetrics;
  }

  public void setDimensionalityReductionMetrics(DimensionalityReductionMetrics dimensionalityReductionMetrics) {
    this.dimensionalityReductionMetrics = dimensionalityReductionMetrics;
  }

  public EvaluationMetrics multiClassClassificationMetrics(MultiClassClassificationMetrics multiClassClassificationMetrics) {
    this.multiClassClassificationMetrics = multiClassClassificationMetrics;
    return this;
  }

  /**
   * Get multiClassClassificationMetrics
   * @return multiClassClassificationMetrics
   */
  @Valid 
  @Schema(name = "multiClassClassificationMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multiClassClassificationMetrics")
  public MultiClassClassificationMetrics getMultiClassClassificationMetrics() {
    return multiClassClassificationMetrics;
  }

  public void setMultiClassClassificationMetrics(MultiClassClassificationMetrics multiClassClassificationMetrics) {
    this.multiClassClassificationMetrics = multiClassClassificationMetrics;
  }

  public EvaluationMetrics rankingMetrics(RankingMetrics rankingMetrics) {
    this.rankingMetrics = rankingMetrics;
    return this;
  }

  /**
   * Get rankingMetrics
   * @return rankingMetrics
   */
  @Valid 
  @Schema(name = "rankingMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rankingMetrics")
  public RankingMetrics getRankingMetrics() {
    return rankingMetrics;
  }

  public void setRankingMetrics(RankingMetrics rankingMetrics) {
    this.rankingMetrics = rankingMetrics;
  }

  public EvaluationMetrics regressionMetrics(RegressionMetrics regressionMetrics) {
    this.regressionMetrics = regressionMetrics;
    return this;
  }

  /**
   * Get regressionMetrics
   * @return regressionMetrics
   */
  @Valid 
  @Schema(name = "regressionMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regressionMetrics")
  public RegressionMetrics getRegressionMetrics() {
    return regressionMetrics;
  }

  public void setRegressionMetrics(RegressionMetrics regressionMetrics) {
    this.regressionMetrics = regressionMetrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationMetrics evaluationMetrics = (EvaluationMetrics) o;
    return Objects.equals(this.arimaForecastingMetrics, evaluationMetrics.arimaForecastingMetrics) &&
        Objects.equals(this.binaryClassificationMetrics, evaluationMetrics.binaryClassificationMetrics) &&
        Objects.equals(this.clusteringMetrics, evaluationMetrics.clusteringMetrics) &&
        Objects.equals(this.dimensionalityReductionMetrics, evaluationMetrics.dimensionalityReductionMetrics) &&
        Objects.equals(this.multiClassClassificationMetrics, evaluationMetrics.multiClassClassificationMetrics) &&
        Objects.equals(this.rankingMetrics, evaluationMetrics.rankingMetrics) &&
        Objects.equals(this.regressionMetrics, evaluationMetrics.regressionMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arimaForecastingMetrics, binaryClassificationMetrics, clusteringMetrics, dimensionalityReductionMetrics, multiClassClassificationMetrics, rankingMetrics, regressionMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationMetrics {\n");
    sb.append("    arimaForecastingMetrics: ").append(toIndentedString(arimaForecastingMetrics)).append("\n");
    sb.append("    binaryClassificationMetrics: ").append(toIndentedString(binaryClassificationMetrics)).append("\n");
    sb.append("    clusteringMetrics: ").append(toIndentedString(clusteringMetrics)).append("\n");
    sb.append("    dimensionalityReductionMetrics: ").append(toIndentedString(dimensionalityReductionMetrics)).append("\n");
    sb.append("    multiClassClassificationMetrics: ").append(toIndentedString(multiClassClassificationMetrics)).append("\n");
    sb.append("    rankingMetrics: ").append(toIndentedString(rankingMetrics)).append("\n");
    sb.append("    regressionMetrics: ").append(toIndentedString(regressionMetrics)).append("\n");
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

