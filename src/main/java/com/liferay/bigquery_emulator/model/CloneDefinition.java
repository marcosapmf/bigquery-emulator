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
 * CloneDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class CloneDefinition {

  private TableReference baseTableReference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime cloneTime;

  public CloneDefinition baseTableReference(TableReference baseTableReference) {
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

  public CloneDefinition cloneTime(OffsetDateTime cloneTime) {
    this.cloneTime = cloneTime;
    return this;
  }

  /**
   * [Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format.
   * @return cloneTime
   */
  @Valid 
  @Schema(name = "cloneTime", description = "[Required] The time at which the base table was cloned. This value is reported in the JSON response using RFC3339 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cloneTime")
  public OffsetDateTime getCloneTime() {
    return cloneTime;
  }

  public void setCloneTime(OffsetDateTime cloneTime) {
    this.cloneTime = cloneTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneDefinition cloneDefinition = (CloneDefinition) o;
    return Objects.equals(this.baseTableReference, cloneDefinition.baseTableReference) &&
        Objects.equals(this.cloneTime, cloneDefinition.cloneTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseTableReference, cloneTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneDefinition {\n");
    sb.append("    baseTableReference: ").append(toIndentedString(baseTableReference)).append("\n");
    sb.append("    cloneTime: ").append(toIndentedString(cloneTime)).append("\n");
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

