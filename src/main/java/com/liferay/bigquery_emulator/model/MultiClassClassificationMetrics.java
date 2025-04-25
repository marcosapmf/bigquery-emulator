package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.AggregateClassificationMetrics;
import com.liferay.bigquery_emulator.model.ConfusionMatrix;
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
 * Evaluation metrics for multi-class classification/classifier models.
 */

@Schema(name = "MultiClassClassificationMetrics", description = "Evaluation metrics for multi-class classification/classifier models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class MultiClassClassificationMetrics {

  private AggregateClassificationMetrics aggregateClassificationMetrics;

  @Valid
  private List<@Valid ConfusionMatrix> confusionMatrixList = new ArrayList<>();

  public MultiClassClassificationMetrics aggregateClassificationMetrics(AggregateClassificationMetrics aggregateClassificationMetrics) {
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

  public MultiClassClassificationMetrics confusionMatrixList(List<@Valid ConfusionMatrix> confusionMatrixList) {
    this.confusionMatrixList = confusionMatrixList;
    return this;
  }

  public MultiClassClassificationMetrics addConfusionMatrixListItem(ConfusionMatrix confusionMatrixListItem) {
    if (this.confusionMatrixList == null) {
      this.confusionMatrixList = new ArrayList<>();
    }
    this.confusionMatrixList.add(confusionMatrixListItem);
    return this;
  }

  /**
   * Confusion matrix at different thresholds.
   * @return confusionMatrixList
   */
  @Valid 
  @Schema(name = "confusionMatrixList", description = "Confusion matrix at different thresholds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confusionMatrixList")
  public List<@Valid ConfusionMatrix> getConfusionMatrixList() {
    return confusionMatrixList;
  }

  public void setConfusionMatrixList(List<@Valid ConfusionMatrix> confusionMatrixList) {
    this.confusionMatrixList = confusionMatrixList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiClassClassificationMetrics multiClassClassificationMetrics = (MultiClassClassificationMetrics) o;
    return Objects.equals(this.aggregateClassificationMetrics, multiClassClassificationMetrics.aggregateClassificationMetrics) &&
        Objects.equals(this.confusionMatrixList, multiClassClassificationMetrics.confusionMatrixList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateClassificationMetrics, confusionMatrixList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiClassClassificationMetrics {\n");
    sb.append("    aggregateClassificationMetrics: ").append(toIndentedString(aggregateClassificationMetrics)).append("\n");
    sb.append("    confusionMatrixList: ").append(toIndentedString(confusionMatrixList)).append("\n");
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

