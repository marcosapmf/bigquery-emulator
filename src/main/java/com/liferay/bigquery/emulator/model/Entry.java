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
 * A single entry in the confusion matrix.
 */

@Schema(name = "Entry", description = "A single entry in the confusion matrix.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Entry {

  private String itemCount;

  private String predictedLabel;

  public Entry itemCount(String itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Number of items being predicted as this label.
   * @return itemCount
   */
  
  @Schema(name = "itemCount", description = "Number of items being predicted as this label.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public String getItemCount() {
    return itemCount;
  }

  public void setItemCount(String itemCount) {
    this.itemCount = itemCount;
  }

  public Entry predictedLabel(String predictedLabel) {
    this.predictedLabel = predictedLabel;
    return this;
  }

  /**
   * The predicted label. For confidence_threshold > 0, we will also add an entry indicating the number of items under the confidence threshold.
   * @return predictedLabel
   */
  
  @Schema(name = "predictedLabel", description = "The predicted label. For confidence_threshold > 0, we will also add an entry indicating the number of items under the confidence threshold.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("predictedLabel")
  public String getPredictedLabel() {
    return predictedLabel;
  }

  public void setPredictedLabel(String predictedLabel) {
    this.predictedLabel = predictedLabel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entry entry = (Entry) o;
    return Objects.equals(this.itemCount, entry.itemCount) &&
        Objects.equals(this.predictedLabel, entry.predictedLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount, predictedLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entry {\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    predictedLabel: ").append(toIndentedString(predictedLabel)).append("\n");
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

