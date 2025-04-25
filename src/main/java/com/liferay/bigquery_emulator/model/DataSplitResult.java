package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Data split result. This contains references to the training and evaluation data tables that were used to train the model.
 */

@Schema(name = "DataSplitResult", description = "Data split result. This contains references to the training and evaluation data tables that were used to train the model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DataSplitResult {

  private TableReference evaluationTable;

  private TableReference testTable;

  private TableReference trainingTable;

  public DataSplitResult evaluationTable(TableReference evaluationTable) {
    this.evaluationTable = evaluationTable;
    return this;
  }

  /**
   * Get evaluationTable
   * @return evaluationTable
   */
  @Valid 
  @Schema(name = "evaluationTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluationTable")
  public TableReference getEvaluationTable() {
    return evaluationTable;
  }

  public void setEvaluationTable(TableReference evaluationTable) {
    this.evaluationTable = evaluationTable;
  }

  public DataSplitResult testTable(TableReference testTable) {
    this.testTable = testTable;
    return this;
  }

  /**
   * Get testTable
   * @return testTable
   */
  @Valid 
  @Schema(name = "testTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testTable")
  public TableReference getTestTable() {
    return testTable;
  }

  public void setTestTable(TableReference testTable) {
    this.testTable = testTable;
  }

  public DataSplitResult trainingTable(TableReference trainingTable) {
    this.trainingTable = trainingTable;
    return this;
  }

  /**
   * Get trainingTable
   * @return trainingTable
   */
  @Valid 
  @Schema(name = "trainingTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingTable")
  public TableReference getTrainingTable() {
    return trainingTable;
  }

  public void setTrainingTable(TableReference trainingTable) {
    this.trainingTable = trainingTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSplitResult dataSplitResult = (DataSplitResult) o;
    return Objects.equals(this.evaluationTable, dataSplitResult.evaluationTable) &&
        Objects.equals(this.testTable, dataSplitResult.testTable) &&
        Objects.equals(this.trainingTable, dataSplitResult.trainingTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationTable, testTable, trainingTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSplitResult {\n");
    sb.append("    evaluationTable: ").append(toIndentedString(evaluationTable)).append("\n");
    sb.append("    testTable: ").append(toIndentedString(testTable)).append("\n");
    sb.append("    trainingTable: ").append(toIndentedString(trainingTable)).append("\n");
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

