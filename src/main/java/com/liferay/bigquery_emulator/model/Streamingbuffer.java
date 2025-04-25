package com.liferay.bigquery_emulator.model;

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
 * Streamingbuffer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Streamingbuffer {

  private String estimatedBytes;

  private String estimatedRows;

  private String oldestEntryTime;

  public Streamingbuffer estimatedBytes(String estimatedBytes) {
    this.estimatedBytes = estimatedBytes;
    return this;
  }

  /**
   * [Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer.
   * @return estimatedBytes
   */
  
  @Schema(name = "estimatedBytes", description = "[Output-only] A lower-bound estimate of the number of bytes currently in the streaming buffer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedBytes")
  public String getEstimatedBytes() {
    return estimatedBytes;
  }

  public void setEstimatedBytes(String estimatedBytes) {
    this.estimatedBytes = estimatedBytes;
  }

  public Streamingbuffer estimatedRows(String estimatedRows) {
    this.estimatedRows = estimatedRows;
    return this;
  }

  /**
   * [Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer.
   * @return estimatedRows
   */
  
  @Schema(name = "estimatedRows", description = "[Output-only] A lower-bound estimate of the number of rows currently in the streaming buffer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRows")
  public String getEstimatedRows() {
    return estimatedRows;
  }

  public void setEstimatedRows(String estimatedRows) {
    this.estimatedRows = estimatedRows;
  }

  public Streamingbuffer oldestEntryTime(String oldestEntryTime) {
    this.oldestEntryTime = oldestEntryTime;
    return this;
  }

  /**
   * [Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is available.
   * @return oldestEntryTime
   */
  
  @Schema(name = "oldestEntryTime", description = "[Output-only] Contains the timestamp of the oldest entry in the streaming buffer, in milliseconds since the epoch, if the streaming buffer is available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldestEntryTime")
  public String getOldestEntryTime() {
    return oldestEntryTime;
  }

  public void setOldestEntryTime(String oldestEntryTime) {
    this.oldestEntryTime = oldestEntryTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Streamingbuffer streamingbuffer = (Streamingbuffer) o;
    return Objects.equals(this.estimatedBytes, streamingbuffer.estimatedBytes) &&
        Objects.equals(this.estimatedRows, streamingbuffer.estimatedRows) &&
        Objects.equals(this.oldestEntryTime, streamingbuffer.oldestEntryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedBytes, estimatedRows, oldestEntryTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Streamingbuffer {\n");
    sb.append("    estimatedBytes: ").append(toIndentedString(estimatedBytes)).append("\n");
    sb.append("    estimatedRows: ").append(toIndentedString(estimatedRows)).append("\n");
    sb.append("    oldestEntryTime: ").append(toIndentedString(oldestEntryTime)).append("\n");
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

