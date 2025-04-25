package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableReference;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnapshotDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SnapshotDefinition {

  private TableReference baseTableReference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime snapshotTime;

  public SnapshotDefinition baseTableReference(TableReference baseTableReference) {
    this.baseTableReference = baseTableReference;
    return this;
  }

  /**
   * Get baseTableReference
   * @return baseTableReference
   */
  @Valid 
  @Schema(name = "baseTableReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseTableReference")
  public TableReference getBaseTableReference() {
    return baseTableReference;
  }

  public void setBaseTableReference(TableReference baseTableReference) {
    this.baseTableReference = baseTableReference;
  }

  public SnapshotDefinition snapshotTime(OffsetDateTime snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }

  /**
   * [Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.
   * @return snapshotTime
   */
  @Valid 
  @Schema(name = "snapshotTime", description = "[Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshotTime")
  public OffsetDateTime getSnapshotTime() {
    return snapshotTime;
  }

  public void setSnapshotTime(OffsetDateTime snapshotTime) {
    this.snapshotTime = snapshotTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotDefinition snapshotDefinition = (SnapshotDefinition) o;
    return Objects.equals(this.baseTableReference, snapshotDefinition.baseTableReference) &&
        Objects.equals(this.snapshotTime, snapshotDefinition.snapshotTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseTableReference, snapshotTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotDefinition {\n");
    sb.append("    baseTableReference: ").append(toIndentedString(baseTableReference)).append("\n");
    sb.append("    snapshotTime: ").append(toIndentedString(snapshotTime)).append("\n");
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

