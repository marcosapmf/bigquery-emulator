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
 * Confusion matrix for binary classification models.
 */

@Schema(name = "BinaryConfusionMatrix", description = "Confusion matrix for binary classification models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BinaryConfusionMatrix {

  private Double accuracy;

  private Double f1Score;

  private String falseNegatives;

  private String falsePositives;

  private Double positiveClassThreshold;

  private Double precision;

  private Double recall;

  private String trueNegatives;

  private String truePositives;

  public BinaryConfusionMatrix accuracy(Double accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * The fraction of predictions given the correct label.
   * @return accuracy
   */
  
  @Schema(name = "accuracy", description = "The fraction of predictions given the correct label.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accuracy")
  public Double getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Double accuracy) {
    this.accuracy = accuracy;
  }

  public BinaryConfusionMatrix f1Score(Double f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * The equally weighted average of recall and precision.
   * @return f1Score
   */
  
  @Schema(name = "f1Score", description = "The equally weighted average of recall and precision.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f1Score")
  public Double getF1Score() {
    return f1Score;
  }

  public void setF1Score(Double f1Score) {
    this.f1Score = f1Score;
  }

  public BinaryConfusionMatrix falseNegatives(String falseNegatives) {
    this.falseNegatives = falseNegatives;
    return this;
  }

  /**
   * Number of false samples predicted as false.
   * @return falseNegatives
   */
  
  @Schema(name = "falseNegatives", description = "Number of false samples predicted as false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("falseNegatives")
  public String getFalseNegatives() {
    return falseNegatives;
  }

  public void setFalseNegatives(String falseNegatives) {
    this.falseNegatives = falseNegatives;
  }

  public BinaryConfusionMatrix falsePositives(String falsePositives) {
    this.falsePositives = falsePositives;
    return this;
  }

  /**
   * Number of false samples predicted as true.
   * @return falsePositives
   */
  
  @Schema(name = "falsePositives", description = "Number of false samples predicted as true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("falsePositives")
  public String getFalsePositives() {
    return falsePositives;
  }

  public void setFalsePositives(String falsePositives) {
    this.falsePositives = falsePositives;
  }

  public BinaryConfusionMatrix positiveClassThreshold(Double positiveClassThreshold) {
    this.positiveClassThreshold = positiveClassThreshold;
    return this;
  }

  /**
   * Threshold value used when computing each of the following metric.
   * @return positiveClassThreshold
   */
  
  @Schema(name = "positiveClassThreshold", description = "Threshold value used when computing each of the following metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positiveClassThreshold")
  public Double getPositiveClassThreshold() {
    return positiveClassThreshold;
  }

  public void setPositiveClassThreshold(Double positiveClassThreshold) {
    this.positiveClassThreshold = positiveClassThreshold;
  }

  public BinaryConfusionMatrix precision(Double precision) {
    this.precision = precision;
    return this;
  }

  /**
   * The fraction of actual positive predictions that had positive actual labels.
   * @return precision
   */
  
  @Schema(name = "precision", description = "The fraction of actual positive predictions that had positive actual labels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public Double getPrecision() {
    return precision;
  }

  public void setPrecision(Double precision) {
    this.precision = precision;
  }

  public BinaryConfusionMatrix recall(Double recall) {
    this.recall = recall;
    return this;
  }

  /**
   * The fraction of actual positive labels that were given a positive prediction.
   * @return recall
   */
  
  @Schema(name = "recall", description = "The fraction of actual positive labels that were given a positive prediction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recall")
  public Double getRecall() {
    return recall;
  }

  public void setRecall(Double recall) {
    this.recall = recall;
  }

  public BinaryConfusionMatrix trueNegatives(String trueNegatives) {
    this.trueNegatives = trueNegatives;
    return this;
  }

  /**
   * Number of true samples predicted as false.
   * @return trueNegatives
   */
  
  @Schema(name = "trueNegatives", description = "Number of true samples predicted as false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trueNegatives")
  public String getTrueNegatives() {
    return trueNegatives;
  }

  public void setTrueNegatives(String trueNegatives) {
    this.trueNegatives = trueNegatives;
  }

  public BinaryConfusionMatrix truePositives(String truePositives) {
    this.truePositives = truePositives;
    return this;
  }

  /**
   * Number of true samples predicted as true.
   * @return truePositives
   */
  
  @Schema(name = "truePositives", description = "Number of true samples predicted as true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truePositives")
  public String getTruePositives() {
    return truePositives;
  }

  public void setTruePositives(String truePositives) {
    this.truePositives = truePositives;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryConfusionMatrix binaryConfusionMatrix = (BinaryConfusionMatrix) o;
    return Objects.equals(this.accuracy, binaryConfusionMatrix.accuracy) &&
        Objects.equals(this.f1Score, binaryConfusionMatrix.f1Score) &&
        Objects.equals(this.falseNegatives, binaryConfusionMatrix.falseNegatives) &&
        Objects.equals(this.falsePositives, binaryConfusionMatrix.falsePositives) &&
        Objects.equals(this.positiveClassThreshold, binaryConfusionMatrix.positiveClassThreshold) &&
        Objects.equals(this.precision, binaryConfusionMatrix.precision) &&
        Objects.equals(this.recall, binaryConfusionMatrix.recall) &&
        Objects.equals(this.trueNegatives, binaryConfusionMatrix.trueNegatives) &&
        Objects.equals(this.truePositives, binaryConfusionMatrix.truePositives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, f1Score, falseNegatives, falsePositives, positiveClassThreshold, precision, recall, trueNegatives, truePositives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryConfusionMatrix {\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    f1Score: ").append(toIndentedString(f1Score)).append("\n");
    sb.append("    falseNegatives: ").append(toIndentedString(falseNegatives)).append("\n");
    sb.append("    falsePositives: ").append(toIndentedString(falsePositives)).append("\n");
    sb.append("    positiveClassThreshold: ").append(toIndentedString(positiveClassThreshold)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
    sb.append("    trueNegatives: ").append(toIndentedString(trueNegatives)).append("\n");
    sb.append("    truePositives: ").append(toIndentedString(truePositives)).append("\n");
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

