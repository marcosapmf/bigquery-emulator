package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.ExplainQueryStep;
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
 * ExplainQueryStage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ExplainQueryStage {

  private String completedParallelInputs;

  private String computeMsAvg;

  private String computeMsMax;

  private Double computeRatioAvg;

  private Double computeRatioMax;

  private String endMs;

  private String id;

  @Valid
  private List<String> inputStages = new ArrayList<>();

  private String name;

  private String parallelInputs;

  private String readMsAvg;

  private String readMsMax;

  private Double readRatioAvg;

  private Double readRatioMax;

  private String recordsRead;

  private String recordsWritten;

  private String shuffleOutputBytes;

  private String shuffleOutputBytesSpilled;

  private String slotMs;

  private String startMs;

  private String status;

  @Valid
  private List<@Valid ExplainQueryStep> steps = new ArrayList<>();

  private String waitMsAvg;

  private String waitMsMax;

  private Double waitRatioAvg;

  private Double waitRatioMax;

  private String writeMsAvg;

  private String writeMsMax;

  private Double writeRatioAvg;

  private Double writeRatioMax;

  public ExplainQueryStage completedParallelInputs(String completedParallelInputs) {
    this.completedParallelInputs = completedParallelInputs;
    return this;
  }

  /**
   * Number of parallel input segments completed.
   * @return completedParallelInputs
   */
  
  @Schema(name = "completedParallelInputs", description = "Number of parallel input segments completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedParallelInputs")
  public String getCompletedParallelInputs() {
    return completedParallelInputs;
  }

  public void setCompletedParallelInputs(String completedParallelInputs) {
    this.completedParallelInputs = completedParallelInputs;
  }

  public ExplainQueryStage computeMsAvg(String computeMsAvg) {
    this.computeMsAvg = computeMsAvg;
    return this;
  }

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * @return computeMsAvg
   */
  
  @Schema(name = "computeMsAvg", description = "Milliseconds the average shard spent on CPU-bound tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("computeMsAvg")
  public String getComputeMsAvg() {
    return computeMsAvg;
  }

  public void setComputeMsAvg(String computeMsAvg) {
    this.computeMsAvg = computeMsAvg;
  }

  public ExplainQueryStage computeMsMax(String computeMsMax) {
    this.computeMsMax = computeMsMax;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * @return computeMsMax
   */
  
  @Schema(name = "computeMsMax", description = "Milliseconds the slowest shard spent on CPU-bound tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("computeMsMax")
  public String getComputeMsMax() {
    return computeMsMax;
  }

  public void setComputeMsMax(String computeMsMax) {
    this.computeMsMax = computeMsMax;
  }

  public ExplainQueryStage computeRatioAvg(Double computeRatioAvg) {
    this.computeRatioAvg = computeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * @return computeRatioAvg
   */
  
  @Schema(name = "computeRatioAvg", description = "Relative amount of time the average shard spent on CPU-bound tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("computeRatioAvg")
  public Double getComputeRatioAvg() {
    return computeRatioAvg;
  }

  public void setComputeRatioAvg(Double computeRatioAvg) {
    this.computeRatioAvg = computeRatioAvg;
  }

  public ExplainQueryStage computeRatioMax(Double computeRatioMax) {
    this.computeRatioMax = computeRatioMax;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * @return computeRatioMax
   */
  
  @Schema(name = "computeRatioMax", description = "Relative amount of time the slowest shard spent on CPU-bound tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("computeRatioMax")
  public Double getComputeRatioMax() {
    return computeRatioMax;
  }

  public void setComputeRatioMax(Double computeRatioMax) {
    this.computeRatioMax = computeRatioMax;
  }

  public ExplainQueryStage endMs(String endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * Stage end time represented as milliseconds since epoch.
   * @return endMs
   */
  
  @Schema(name = "endMs", description = "Stage end time represented as milliseconds since epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endMs")
  public String getEndMs() {
    return endMs;
  }

  public void setEndMs(String endMs) {
    this.endMs = endMs;
  }

  public ExplainQueryStage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for stage within plan.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique ID for stage within plan.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExplainQueryStage inputStages(List<String> inputStages) {
    this.inputStages = inputStages;
    return this;
  }

  public ExplainQueryStage addInputStagesItem(String inputStagesItem) {
    if (this.inputStages == null) {
      this.inputStages = new ArrayList<>();
    }
    this.inputStages.add(inputStagesItem);
    return this;
  }

  /**
   * IDs for stages that are inputs to this stage.
   * @return inputStages
   */
  
  @Schema(name = "inputStages", description = "IDs for stages that are inputs to this stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputStages")
  public List<String> getInputStages() {
    return inputStages;
  }

  public void setInputStages(List<String> inputStages) {
    this.inputStages = inputStages;
  }

  public ExplainQueryStage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for stage.
   * @return name
   */
  
  @Schema(name = "name", description = "Human-readable name for stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExplainQueryStage parallelInputs(String parallelInputs) {
    this.parallelInputs = parallelInputs;
    return this;
  }

  /**
   * Number of parallel input segments to be processed.
   * @return parallelInputs
   */
  
  @Schema(name = "parallelInputs", description = "Number of parallel input segments to be processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallelInputs")
  public String getParallelInputs() {
    return parallelInputs;
  }

  public void setParallelInputs(String parallelInputs) {
    this.parallelInputs = parallelInputs;
  }

  public ExplainQueryStage readMsAvg(String readMsAvg) {
    this.readMsAvg = readMsAvg;
    return this;
  }

  /**
   * Milliseconds the average shard spent reading input.
   * @return readMsAvg
   */
  
  @Schema(name = "readMsAvg", description = "Milliseconds the average shard spent reading input.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readMsAvg")
  public String getReadMsAvg() {
    return readMsAvg;
  }

  public void setReadMsAvg(String readMsAvg) {
    this.readMsAvg = readMsAvg;
  }

  public ExplainQueryStage readMsMax(String readMsMax) {
    this.readMsMax = readMsMax;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent reading input.
   * @return readMsMax
   */
  
  @Schema(name = "readMsMax", description = "Milliseconds the slowest shard spent reading input.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readMsMax")
  public String getReadMsMax() {
    return readMsMax;
  }

  public void setReadMsMax(String readMsMax) {
    this.readMsMax = readMsMax;
  }

  public ExplainQueryStage readRatioAvg(Double readRatioAvg) {
    this.readRatioAvg = readRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the average shard spent reading input.
   * @return readRatioAvg
   */
  
  @Schema(name = "readRatioAvg", description = "Relative amount of time the average shard spent reading input.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readRatioAvg")
  public Double getReadRatioAvg() {
    return readRatioAvg;
  }

  public void setReadRatioAvg(Double readRatioAvg) {
    this.readRatioAvg = readRatioAvg;
  }

  public ExplainQueryStage readRatioMax(Double readRatioMax) {
    this.readRatioMax = readRatioMax;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent reading input.
   * @return readRatioMax
   */
  
  @Schema(name = "readRatioMax", description = "Relative amount of time the slowest shard spent reading input.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readRatioMax")
  public Double getReadRatioMax() {
    return readRatioMax;
  }

  public void setReadRatioMax(Double readRatioMax) {
    this.readRatioMax = readRatioMax;
  }

  public ExplainQueryStage recordsRead(String recordsRead) {
    this.recordsRead = recordsRead;
    return this;
  }

  /**
   * Number of records read into the stage.
   * @return recordsRead
   */
  
  @Schema(name = "recordsRead", description = "Number of records read into the stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordsRead")
  public String getRecordsRead() {
    return recordsRead;
  }

  public void setRecordsRead(String recordsRead) {
    this.recordsRead = recordsRead;
  }

  public ExplainQueryStage recordsWritten(String recordsWritten) {
    this.recordsWritten = recordsWritten;
    return this;
  }

  /**
   * Number of records written by the stage.
   * @return recordsWritten
   */
  
  @Schema(name = "recordsWritten", description = "Number of records written by the stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordsWritten")
  public String getRecordsWritten() {
    return recordsWritten;
  }

  public void setRecordsWritten(String recordsWritten) {
    this.recordsWritten = recordsWritten;
  }

  public ExplainQueryStage shuffleOutputBytes(String shuffleOutputBytes) {
    this.shuffleOutputBytes = shuffleOutputBytes;
    return this;
  }

  /**
   * Total number of bytes written to shuffle.
   * @return shuffleOutputBytes
   */
  
  @Schema(name = "shuffleOutputBytes", description = "Total number of bytes written to shuffle.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shuffleOutputBytes")
  public String getShuffleOutputBytes() {
    return shuffleOutputBytes;
  }

  public void setShuffleOutputBytes(String shuffleOutputBytes) {
    this.shuffleOutputBytes = shuffleOutputBytes;
  }

  public ExplainQueryStage shuffleOutputBytesSpilled(String shuffleOutputBytesSpilled) {
    this.shuffleOutputBytesSpilled = shuffleOutputBytesSpilled;
    return this;
  }

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * @return shuffleOutputBytesSpilled
   */
  
  @Schema(name = "shuffleOutputBytesSpilled", description = "Total number of bytes written to shuffle and spilled to disk.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shuffleOutputBytesSpilled")
  public String getShuffleOutputBytesSpilled() {
    return shuffleOutputBytesSpilled;
  }

  public void setShuffleOutputBytesSpilled(String shuffleOutputBytesSpilled) {
    this.shuffleOutputBytesSpilled = shuffleOutputBytesSpilled;
  }

  public ExplainQueryStage slotMs(String slotMs) {
    this.slotMs = slotMs;
    return this;
  }

  /**
   * Slot-milliseconds used by the stage.
   * @return slotMs
   */
  
  @Schema(name = "slotMs", description = "Slot-milliseconds used by the stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slotMs")
  public String getSlotMs() {
    return slotMs;
  }

  public void setSlotMs(String slotMs) {
    this.slotMs = slotMs;
  }

  public ExplainQueryStage startMs(String startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Stage start time represented as milliseconds since epoch.
   * @return startMs
   */
  
  @Schema(name = "startMs", description = "Stage start time represented as milliseconds since epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startMs")
  public String getStartMs() {
    return startMs;
  }

  public void setStartMs(String startMs) {
    this.startMs = startMs;
  }

  public ExplainQueryStage status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Current status for the stage.
   * @return status
   */
  
  @Schema(name = "status", description = "Current status for the stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ExplainQueryStage steps(List<@Valid ExplainQueryStep> steps) {
    this.steps = steps;
    return this;
  }

  public ExplainQueryStage addStepsItem(ExplainQueryStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * @return steps
   */
  @Valid 
  @Schema(name = "steps", description = "List of operations within the stage in dependency order (approximately chronological).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public List<@Valid ExplainQueryStep> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid ExplainQueryStep> steps) {
    this.steps = steps;
  }

  public ExplainQueryStage waitMsAvg(String waitMsAvg) {
    this.waitMsAvg = waitMsAvg;
    return this;
  }

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * @return waitMsAvg
   */
  
  @Schema(name = "waitMsAvg", description = "Milliseconds the average shard spent waiting to be scheduled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waitMsAvg")
  public String getWaitMsAvg() {
    return waitMsAvg;
  }

  public void setWaitMsAvg(String waitMsAvg) {
    this.waitMsAvg = waitMsAvg;
  }

  public ExplainQueryStage waitMsMax(String waitMsMax) {
    this.waitMsMax = waitMsMax;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * @return waitMsMax
   */
  
  @Schema(name = "waitMsMax", description = "Milliseconds the slowest shard spent waiting to be scheduled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waitMsMax")
  public String getWaitMsMax() {
    return waitMsMax;
  }

  public void setWaitMsMax(String waitMsMax) {
    this.waitMsMax = waitMsMax;
  }

  public ExplainQueryStage waitRatioAvg(Double waitRatioAvg) {
    this.waitRatioAvg = waitRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * @return waitRatioAvg
   */
  
  @Schema(name = "waitRatioAvg", description = "Relative amount of time the average shard spent waiting to be scheduled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waitRatioAvg")
  public Double getWaitRatioAvg() {
    return waitRatioAvg;
  }

  public void setWaitRatioAvg(Double waitRatioAvg) {
    this.waitRatioAvg = waitRatioAvg;
  }

  public ExplainQueryStage waitRatioMax(Double waitRatioMax) {
    this.waitRatioMax = waitRatioMax;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * @return waitRatioMax
   */
  
  @Schema(name = "waitRatioMax", description = "Relative amount of time the slowest shard spent waiting to be scheduled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waitRatioMax")
  public Double getWaitRatioMax() {
    return waitRatioMax;
  }

  public void setWaitRatioMax(Double waitRatioMax) {
    this.waitRatioMax = waitRatioMax;
  }

  public ExplainQueryStage writeMsAvg(String writeMsAvg) {
    this.writeMsAvg = writeMsAvg;
    return this;
  }

  /**
   * Milliseconds the average shard spent on writing output.
   * @return writeMsAvg
   */
  
  @Schema(name = "writeMsAvg", description = "Milliseconds the average shard spent on writing output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeMsAvg")
  public String getWriteMsAvg() {
    return writeMsAvg;
  }

  public void setWriteMsAvg(String writeMsAvg) {
    this.writeMsAvg = writeMsAvg;
  }

  public ExplainQueryStage writeMsMax(String writeMsMax) {
    this.writeMsMax = writeMsMax;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on writing output.
   * @return writeMsMax
   */
  
  @Schema(name = "writeMsMax", description = "Milliseconds the slowest shard spent on writing output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeMsMax")
  public String getWriteMsMax() {
    return writeMsMax;
  }

  public void setWriteMsMax(String writeMsMax) {
    this.writeMsMax = writeMsMax;
  }

  public ExplainQueryStage writeRatioAvg(Double writeRatioAvg) {
    this.writeRatioAvg = writeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on writing output.
   * @return writeRatioAvg
   */
  
  @Schema(name = "writeRatioAvg", description = "Relative amount of time the average shard spent on writing output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeRatioAvg")
  public Double getWriteRatioAvg() {
    return writeRatioAvg;
  }

  public void setWriteRatioAvg(Double writeRatioAvg) {
    this.writeRatioAvg = writeRatioAvg;
  }

  public ExplainQueryStage writeRatioMax(Double writeRatioMax) {
    this.writeRatioMax = writeRatioMax;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * @return writeRatioMax
   */
  
  @Schema(name = "writeRatioMax", description = "Relative amount of time the slowest shard spent on writing output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeRatioMax")
  public Double getWriteRatioMax() {
    return writeRatioMax;
  }

  public void setWriteRatioMax(Double writeRatioMax) {
    this.writeRatioMax = writeRatioMax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplainQueryStage explainQueryStage = (ExplainQueryStage) o;
    return Objects.equals(this.completedParallelInputs, explainQueryStage.completedParallelInputs) &&
        Objects.equals(this.computeMsAvg, explainQueryStage.computeMsAvg) &&
        Objects.equals(this.computeMsMax, explainQueryStage.computeMsMax) &&
        Objects.equals(this.computeRatioAvg, explainQueryStage.computeRatioAvg) &&
        Objects.equals(this.computeRatioMax, explainQueryStage.computeRatioMax) &&
        Objects.equals(this.endMs, explainQueryStage.endMs) &&
        Objects.equals(this.id, explainQueryStage.id) &&
        Objects.equals(this.inputStages, explainQueryStage.inputStages) &&
        Objects.equals(this.name, explainQueryStage.name) &&
        Objects.equals(this.parallelInputs, explainQueryStage.parallelInputs) &&
        Objects.equals(this.readMsAvg, explainQueryStage.readMsAvg) &&
        Objects.equals(this.readMsMax, explainQueryStage.readMsMax) &&
        Objects.equals(this.readRatioAvg, explainQueryStage.readRatioAvg) &&
        Objects.equals(this.readRatioMax, explainQueryStage.readRatioMax) &&
        Objects.equals(this.recordsRead, explainQueryStage.recordsRead) &&
        Objects.equals(this.recordsWritten, explainQueryStage.recordsWritten) &&
        Objects.equals(this.shuffleOutputBytes, explainQueryStage.shuffleOutputBytes) &&
        Objects.equals(this.shuffleOutputBytesSpilled, explainQueryStage.shuffleOutputBytesSpilled) &&
        Objects.equals(this.slotMs, explainQueryStage.slotMs) &&
        Objects.equals(this.startMs, explainQueryStage.startMs) &&
        Objects.equals(this.status, explainQueryStage.status) &&
        Objects.equals(this.steps, explainQueryStage.steps) &&
        Objects.equals(this.waitMsAvg, explainQueryStage.waitMsAvg) &&
        Objects.equals(this.waitMsMax, explainQueryStage.waitMsMax) &&
        Objects.equals(this.waitRatioAvg, explainQueryStage.waitRatioAvg) &&
        Objects.equals(this.waitRatioMax, explainQueryStage.waitRatioMax) &&
        Objects.equals(this.writeMsAvg, explainQueryStage.writeMsAvg) &&
        Objects.equals(this.writeMsMax, explainQueryStage.writeMsMax) &&
        Objects.equals(this.writeRatioAvg, explainQueryStage.writeRatioAvg) &&
        Objects.equals(this.writeRatioMax, explainQueryStage.writeRatioMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedParallelInputs, computeMsAvg, computeMsMax, computeRatioAvg, computeRatioMax, endMs, id, inputStages, name, parallelInputs, readMsAvg, readMsMax, readRatioAvg, readRatioMax, recordsRead, recordsWritten, shuffleOutputBytes, shuffleOutputBytesSpilled, slotMs, startMs, status, steps, waitMsAvg, waitMsMax, waitRatioAvg, waitRatioMax, writeMsAvg, writeMsMax, writeRatioAvg, writeRatioMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplainQueryStage {\n");
    sb.append("    completedParallelInputs: ").append(toIndentedString(completedParallelInputs)).append("\n");
    sb.append("    computeMsAvg: ").append(toIndentedString(computeMsAvg)).append("\n");
    sb.append("    computeMsMax: ").append(toIndentedString(computeMsMax)).append("\n");
    sb.append("    computeRatioAvg: ").append(toIndentedString(computeRatioAvg)).append("\n");
    sb.append("    computeRatioMax: ").append(toIndentedString(computeRatioMax)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputStages: ").append(toIndentedString(inputStages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parallelInputs: ").append(toIndentedString(parallelInputs)).append("\n");
    sb.append("    readMsAvg: ").append(toIndentedString(readMsAvg)).append("\n");
    sb.append("    readMsMax: ").append(toIndentedString(readMsMax)).append("\n");
    sb.append("    readRatioAvg: ").append(toIndentedString(readRatioAvg)).append("\n");
    sb.append("    readRatioMax: ").append(toIndentedString(readRatioMax)).append("\n");
    sb.append("    recordsRead: ").append(toIndentedString(recordsRead)).append("\n");
    sb.append("    recordsWritten: ").append(toIndentedString(recordsWritten)).append("\n");
    sb.append("    shuffleOutputBytes: ").append(toIndentedString(shuffleOutputBytes)).append("\n");
    sb.append("    shuffleOutputBytesSpilled: ").append(toIndentedString(shuffleOutputBytesSpilled)).append("\n");
    sb.append("    slotMs: ").append(toIndentedString(slotMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    waitMsAvg: ").append(toIndentedString(waitMsAvg)).append("\n");
    sb.append("    waitMsMax: ").append(toIndentedString(waitMsMax)).append("\n");
    sb.append("    waitRatioAvg: ").append(toIndentedString(waitRatioAvg)).append("\n");
    sb.append("    waitRatioMax: ").append(toIndentedString(waitRatioMax)).append("\n");
    sb.append("    writeMsAvg: ").append(toIndentedString(writeMsAvg)).append("\n");
    sb.append("    writeMsMax: ").append(toIndentedString(writeMsMax)).append("\n");
    sb.append("    writeRatioAvg: ").append(toIndentedString(writeRatioAvg)).append("\n");
    sb.append("    writeRatioMax: ").append(toIndentedString(writeRatioMax)).append("\n");
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

