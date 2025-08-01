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
 * JobStatistics3
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatistics3 {

  private String badRecords;

  private String inputFileBytes;

  private String inputFiles;

  private String outputBytes;

  private String outputRows;

  public JobStatistics3 badRecords(String badRecords) {
    this.badRecords = badRecords;
    return this;
  }

  /**
   * [Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.
   * @return badRecords
   */
  
  @Schema(name = "badRecords", description = "[Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("badRecords")
  public String getBadRecords() {
    return badRecords;
  }

  public void setBadRecords(String badRecords) {
    this.badRecords = badRecords;
  }

  public JobStatistics3 inputFileBytes(String inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

  /**
   * [Output-only] Number of bytes of source data in a load job.
   * @return inputFileBytes
   */
  
  @Schema(name = "inputFileBytes", description = "[Output-only] Number of bytes of source data in a load job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputFileBytes")
  public String getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(String inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public JobStatistics3 inputFiles(String inputFiles) {
    this.inputFiles = inputFiles;
    return this;
  }

  /**
   * [Output-only] Number of source files in a load job.
   * @return inputFiles
   */
  
  @Schema(name = "inputFiles", description = "[Output-only] Number of source files in a load job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputFiles")
  public String getInputFiles() {
    return inputFiles;
  }

  public void setInputFiles(String inputFiles) {
    this.inputFiles = inputFiles;
  }

  public JobStatistics3 outputBytes(String outputBytes) {
    this.outputBytes = outputBytes;
    return this;
  }

  /**
   * [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.
   * @return outputBytes
   */
  
  @Schema(name = "outputBytes", description = "[Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputBytes")
  public String getOutputBytes() {
    return outputBytes;
  }

  public void setOutputBytes(String outputBytes) {
    this.outputBytes = outputBytes;
  }

  public JobStatistics3 outputRows(String outputRows) {
    this.outputRows = outputRows;
    return this;
  }

  /**
   * [Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.
   * @return outputRows
   */
  
  @Schema(name = "outputRows", description = "[Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputRows")
  public String getOutputRows() {
    return outputRows;
  }

  public void setOutputRows(String outputRows) {
    this.outputRows = outputRows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatistics3 jobStatistics3 = (JobStatistics3) o;
    return Objects.equals(this.badRecords, jobStatistics3.badRecords) &&
        Objects.equals(this.inputFileBytes, jobStatistics3.inputFileBytes) &&
        Objects.equals(this.inputFiles, jobStatistics3.inputFiles) &&
        Objects.equals(this.outputBytes, jobStatistics3.outputBytes) &&
        Objects.equals(this.outputRows, jobStatistics3.outputRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badRecords, inputFileBytes, inputFiles, outputBytes, outputRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatistics3 {\n");
    sb.append("    badRecords: ").append(toIndentedString(badRecords)).append("\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFiles: ").append(toIndentedString(inputFiles)).append("\n");
    sb.append("    outputBytes: ").append(toIndentedString(outputBytes)).append("\n");
    sb.append("    outputRows: ").append(toIndentedString(outputRows)).append("\n");
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

