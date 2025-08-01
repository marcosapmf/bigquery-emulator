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
 * Aggregate metrics for classification/classifier models. For multi-class models, the metrics are either macro-averaged or micro-averaged. When macro-averaged, the metrics are calculated for each label and then an unweighted average is taken of those values. When micro-averaged, the metric is calculated globally by counting the total number of correctly predicted rows.
 */

@Schema(name = "AggregateClassificationMetrics", description = "Aggregate metrics for classification/classifier models. For multi-class models, the metrics are either macro-averaged or micro-averaged. When macro-averaged, the metrics are calculated for each label and then an unweighted average is taken of those values. When micro-averaged, the metric is calculated globally by counting the total number of correctly predicted rows.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class AggregateClassificationMetrics {

  private Double accuracy;

  private Double f1Score;

  private Double logLoss;

  private Double precision;

  private Double recall;

  private Double rocAuc;

  private Double threshold;

  public AggregateClassificationMetrics accuracy(Double accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Accuracy is the fraction of predictions given the correct label. For multiclass this is a micro-averaged metric.
   * @return accuracy
   */
  
  @Schema(name = "accuracy", description = "Accuracy is the fraction of predictions given the correct label. For multiclass this is a micro-averaged metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracy")
  public Double getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Double accuracy) {
    this.accuracy = accuracy;
  }

  public AggregateClassificationMetrics f1Score(Double f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * The F1 score is an average of recall and precision. For multiclass this is a macro-averaged metric.
   * @return f1Score
   */
  
  @Schema(name = "f1Score", description = "The F1 score is an average of recall and precision. For multiclass this is a macro-averaged metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f1Score")
  public Double getF1Score() {
    return f1Score;
  }

  public void setF1Score(Double f1Score) {
    this.f1Score = f1Score;
  }

  public AggregateClassificationMetrics logLoss(Double logLoss) {
    this.logLoss = logLoss;
    return this;
  }

  /**
   * Logarithmic Loss. For multiclass this is a macro-averaged metric.
   * @return logLoss
   */
  
  @Schema(name = "logLoss", description = "Logarithmic Loss. For multiclass this is a macro-averaged metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logLoss")
  public Double getLogLoss() {
    return logLoss;
  }

  public void setLogLoss(Double logLoss) {
    this.logLoss = logLoss;
  }

  public AggregateClassificationMetrics precision(Double precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Precision is the fraction of actual positive predictions that had positive actual labels. For multiclass this is a macro-averaged metric treating each class as a binary classifier.
   * @return precision
   */
  
  @Schema(name = "precision", description = "Precision is the fraction of actual positive predictions that had positive actual labels. For multiclass this is a macro-averaged metric treating each class as a binary classifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public Double getPrecision() {
    return precision;
  }

  public void setPrecision(Double precision) {
    this.precision = precision;
  }

  public AggregateClassificationMetrics recall(Double recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Recall is the fraction of actual positive labels that were given a positive prediction. For multiclass this is a macro-averaged metric.
   * @return recall
   */
  
  @Schema(name = "recall", description = "Recall is the fraction of actual positive labels that were given a positive prediction. For multiclass this is a macro-averaged metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recall")
  public Double getRecall() {
    return recall;
  }

  public void setRecall(Double recall) {
    this.recall = recall;
  }

  public AggregateClassificationMetrics rocAuc(Double rocAuc) {
    this.rocAuc = rocAuc;
    return this;
  }

  /**
   * Area Under a ROC Curve. For multiclass this is a macro-averaged metric.
   * @return rocAuc
   */
  
  @Schema(name = "rocAuc", description = "Area Under a ROC Curve. For multiclass this is a macro-averaged metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rocAuc")
  public Double getRocAuc() {
    return rocAuc;
  }

  public void setRocAuc(Double rocAuc) {
    this.rocAuc = rocAuc;
  }

  public AggregateClassificationMetrics threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Threshold at which the metrics are computed. For binary classification models this is the positive class threshold. For multi-class classfication models this is the confidence threshold.
   * @return threshold
   */
  
  @Schema(name = "threshold", description = "Threshold at which the metrics are computed. For binary classification models this is the positive class threshold. For multi-class classfication models this is the confidence threshold.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public Double getThreshold() {
    return threshold;
  }

  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateClassificationMetrics aggregateClassificationMetrics = (AggregateClassificationMetrics) o;
    return Objects.equals(this.accuracy, aggregateClassificationMetrics.accuracy) &&
        Objects.equals(this.f1Score, aggregateClassificationMetrics.f1Score) &&
        Objects.equals(this.logLoss, aggregateClassificationMetrics.logLoss) &&
        Objects.equals(this.precision, aggregateClassificationMetrics.precision) &&
        Objects.equals(this.recall, aggregateClassificationMetrics.recall) &&
        Objects.equals(this.rocAuc, aggregateClassificationMetrics.rocAuc) &&
        Objects.equals(this.threshold, aggregateClassificationMetrics.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, f1Score, logLoss, precision, recall, rocAuc, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateClassificationMetrics {\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    f1Score: ").append(toIndentedString(f1Score)).append("\n");
    sb.append("    logLoss: ").append(toIndentedString(logLoss)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
    sb.append("    rocAuc: ").append(toIndentedString(rocAuc)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

