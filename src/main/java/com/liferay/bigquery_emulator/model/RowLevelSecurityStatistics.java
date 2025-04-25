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
 * RowLevelSecurityStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RowLevelSecurityStatistics {

  private Boolean rowLevelSecurityApplied;

  public RowLevelSecurityStatistics rowLevelSecurityApplied(Boolean rowLevelSecurityApplied) {
    this.rowLevelSecurityApplied = rowLevelSecurityApplied;
    return this;
  }

  /**
   * [Output-only] [Preview] Whether any accessed data was protected by row access policies.
   * @return rowLevelSecurityApplied
   */
  
  @Schema(name = "rowLevelSecurityApplied", description = "[Output-only] [Preview] Whether any accessed data was protected by row access policies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowLevelSecurityApplied")
  public Boolean getRowLevelSecurityApplied() {
    return rowLevelSecurityApplied;
  }

  public void setRowLevelSecurityApplied(Boolean rowLevelSecurityApplied) {
    this.rowLevelSecurityApplied = rowLevelSecurityApplied;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowLevelSecurityStatistics rowLevelSecurityStatistics = (RowLevelSecurityStatistics) o;
    return Objects.equals(this.rowLevelSecurityApplied, rowLevelSecurityStatistics.rowLevelSecurityApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowLevelSecurityApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowLevelSecurityStatistics {\n");
    sb.append("    rowLevelSecurityApplied: ").append(toIndentedString(rowLevelSecurityApplied)).append("\n");
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

