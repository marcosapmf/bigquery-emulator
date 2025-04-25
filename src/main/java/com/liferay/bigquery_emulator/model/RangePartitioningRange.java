package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * [TrustedTester] [Required] Defines the ranges for range partitioning.
 */

@Schema(name = "RangePartitioning_range", description = "[TrustedTester] [Required] Defines the ranges for range partitioning.")
@JsonTypeName("RangePartitioning_range")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RangePartitioningRange {

  private String end;

  private String interval;

  private String start;

  public RangePartitioningRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * [TrustedTester] [Required] The end of range partitioning, exclusive.
   * @return end
   */
  
  @Schema(name = "end", description = "[TrustedTester] [Required] The end of range partitioning, exclusive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public RangePartitioningRange interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * [TrustedTester] [Required] The width of each interval.
   * @return interval
   */
  
  @Schema(name = "interval", description = "[TrustedTester] [Required] The width of each interval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public RangePartitioningRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * [TrustedTester] [Required] The start of range partitioning, inclusive.
   * @return start
   */
  
  @Schema(name = "start", description = "[TrustedTester] [Required] The start of range partitioning, inclusive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangePartitioningRange rangePartitioningRange = (RangePartitioningRange) o;
    return Objects.equals(this.end, rangePartitioningRange.end) &&
        Objects.equals(this.interval, rangePartitioningRange.interval) &&
        Objects.equals(this.start, rangePartitioningRange.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, interval, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangePartitioningRange {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

