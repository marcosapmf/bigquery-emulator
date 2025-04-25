package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.Row;
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
 * Confusion matrix for multi-class classification models.
 */

@Schema(name = "ConfusionMatrix", description = "Confusion matrix for multi-class classification models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ConfusionMatrix {

  private Double confidenceThreshold;

  @Valid
  private List<@Valid Row> rows = new ArrayList<>();

  public ConfusionMatrix confidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Confidence threshold used when computing the entries of the confusion matrix.
   * @return confidenceThreshold
   */
  
  @Schema(name = "confidenceThreshold", description = "Confidence threshold used when computing the entries of the confusion matrix.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confidenceThreshold")
  public Double getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }

  public ConfusionMatrix rows(List<@Valid Row> rows) {
    this.rows = rows;
    return this;
  }

  public ConfusionMatrix addRowsItem(Row rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * One row per actual label.
   * @return rows
   */
  @Valid 
  @Schema(name = "rows", description = "One row per actual label.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rows")
  public List<@Valid Row> getRows() {
    return rows;
  }

  public void setRows(List<@Valid Row> rows) {
    this.rows = rows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfusionMatrix confusionMatrix = (ConfusionMatrix) o;
    return Objects.equals(this.confidenceThreshold, confusionMatrix.confidenceThreshold) &&
        Objects.equals(this.rows, confusionMatrix.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceThreshold, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfusionMatrix {\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

