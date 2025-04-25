package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.AggregateClassificationMetrics;
import com.liferay.bigquery_emulator.model.BinaryConfusionMatrix;
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
 * Evaluation metrics for binary classification/classifier models.
 */

@Schema(name = "BinaryClassificationMetrics", description = "Evaluation metrics for binary classification/classifier models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BinaryClassificationMetrics {

  private AggregateClassificationMetrics aggregateClassificationMetrics;

  @Valid
  private List<@Valid BinaryConfusionMatrix> binaryConfusionMatrixList = new ArrayList<>();

  private String negativeLabel;

  private String positiveLabel;

  public BinaryClassificationMetrics aggregateClassificationMetrics(AggregateClassificationMetrics aggregateClassificationMetrics) {
    this.aggregateClassificationMetrics = aggregateClassificationMetrics;
    return this;
  }

  /**
   * Get aggregateClassificationMetrics
   * @return aggregateClassificationMetrics
   */
  @Valid 
  @Schema(name = "aggregateClassificationMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aggregateClassificationMetrics")
  public AggregateClassificationMetrics getAggregateClassificationMetrics() {
    return aggregateClassificationMetrics;
  }

  public void setAggregateClassificationMetrics(AggregateClassificationMetrics aggregateClassificationMetrics) {
    this.aggregateClassificationMetrics = aggregateClassificationMetrics;
  }

  public BinaryClassificationMetrics binaryConfusionMatrixList(List<@Valid BinaryConfusionMatrix> binaryConfusionMatrixList) {
    this.binaryConfusionMatrixList = binaryConfusionMatrixList;
    return this;
  }

  public BinaryClassificationMetrics addBinaryConfusionMatrixListItem(BinaryConfusionMatrix binaryConfusionMatrixListItem) {
    if (this.binaryConfusionMatrixList == null) {
      this.binaryConfusionMatrixList = new ArrayList<>();
    }
    this.binaryConfusionMatrixList.add(binaryConfusionMatrixListItem);
    return this;
  }

  /**
   * Binary confusion matrix at multiple thresholds.
   * @return binaryConfusionMatrixList
   */
  @Valid 
  @Schema(name = "binaryConfusionMatrixList", description = "Binary confusion matrix at multiple thresholds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binaryConfusionMatrixList")
  public List<@Valid BinaryConfusionMatrix> getBinaryConfusionMatrixList() {
    return binaryConfusionMatrixList;
  }

  public void setBinaryConfusionMatrixList(List<@Valid BinaryConfusionMatrix> binaryConfusionMatrixList) {
    this.binaryConfusionMatrixList = binaryConfusionMatrixList;
  }

  public BinaryClassificationMetrics negativeLabel(String negativeLabel) {
    this.negativeLabel = negativeLabel;
    return this;
  }

  /**
   * Label representing the negative class.
   * @return negativeLabel
   */
  
  @Schema(name = "negativeLabel", description = "Label representing the negative class.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negativeLabel")
  public String getNegativeLabel() {
    return negativeLabel;
  }

  public void setNegativeLabel(String negativeLabel) {
    this.negativeLabel = negativeLabel;
  }

  public BinaryClassificationMetrics positiveLabel(String positiveLabel) {
    this.positiveLabel = positiveLabel;
    return this;
  }

  /**
   * Label representing the positive class.
   * @return positiveLabel
   */
  
  @Schema(name = "positiveLabel", description = "Label representing the positive class.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positiveLabel")
  public String getPositiveLabel() {
    return positiveLabel;
  }

  public void setPositiveLabel(String positiveLabel) {
    this.positiveLabel = positiveLabel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryClassificationMetrics binaryClassificationMetrics = (BinaryClassificationMetrics) o;
    return Objects.equals(this.aggregateClassificationMetrics, binaryClassificationMetrics.aggregateClassificationMetrics) &&
        Objects.equals(this.binaryConfusionMatrixList, binaryClassificationMetrics.binaryConfusionMatrixList) &&
        Objects.equals(this.negativeLabel, binaryClassificationMetrics.negativeLabel) &&
        Objects.equals(this.positiveLabel, binaryClassificationMetrics.positiveLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateClassificationMetrics, binaryConfusionMatrixList, negativeLabel, positiveLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryClassificationMetrics {\n");
    sb.append("    aggregateClassificationMetrics: ").append(toIndentedString(aggregateClassificationMetrics)).append("\n");
    sb.append("    binaryConfusionMatrixList: ").append(toIndentedString(binaryConfusionMatrixList)).append("\n");
    sb.append("    negativeLabel: ").append(toIndentedString(negativeLabel)).append("\n");
    sb.append("    positiveLabel: ").append(toIndentedString(positiveLabel)).append("\n");
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

