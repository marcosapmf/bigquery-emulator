package com.liferay.bigquery.emulator.model;

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
 * JobStatisticsReservationUsageInner
 */

@JsonTypeName("JobStatistics_reservationUsage_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatisticsReservationUsageInner {

  private String name;

  private String slotMs;

  public JobStatisticsReservationUsageInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output-only] Reservation name or \"unreserved\" for on-demand resources usage.
   * @return name
   */
  
  @Schema(name = "name", description = "[Output-only] Reservation name or \"unreserved\" for on-demand resources usage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobStatisticsReservationUsageInner slotMs(String slotMs) {
    this.slotMs = slotMs;
    return this;
  }

  /**
   * [Output-only] Slot-milliseconds the job spent in the given reservation.
   * @return slotMs
   */
  
  @Schema(name = "slotMs", description = "[Output-only] Slot-milliseconds the job spent in the given reservation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slotMs")
  public String getSlotMs() {
    return slotMs;
  }

  public void setSlotMs(String slotMs) {
    this.slotMs = slotMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatisticsReservationUsageInner jobStatisticsReservationUsageInner = (JobStatisticsReservationUsageInner) o;
    return Objects.equals(this.name, jobStatisticsReservationUsageInner.name) &&
        Objects.equals(this.slotMs, jobStatisticsReservationUsageInner.slotMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slotMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatisticsReservationUsageInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slotMs: ").append(toIndentedString(slotMs)).append("\n");
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

