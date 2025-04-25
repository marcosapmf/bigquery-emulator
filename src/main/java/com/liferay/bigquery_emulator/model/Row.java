package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.Entry;
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
 * A single row in the confusion matrix.
 */

@Schema(name = "Row", description = "A single row in the confusion matrix.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Row {

  private String actualLabel;

  @Valid
  private List<@Valid Entry> entries = new ArrayList<>();

  public Row actualLabel(String actualLabel) {
    this.actualLabel = actualLabel;
    return this;
  }

  /**
   * The original label of this row.
   * @return actualLabel
   */
  
  @Schema(name = "actualLabel", description = "The original label of this row.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualLabel")
  public String getActualLabel() {
    return actualLabel;
  }

  public void setActualLabel(String actualLabel) {
    this.actualLabel = actualLabel;
  }

  public Row entries(List<@Valid Entry> entries) {
    this.entries = entries;
    return this;
  }

  public Row addEntriesItem(Entry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Info describing predicted label distribution.
   * @return entries
   */
  @Valid 
  @Schema(name = "entries", description = "Info describing predicted label distribution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entries")
  public List<@Valid Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<@Valid Entry> entries) {
    this.entries = entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.actualLabel, row.actualLabel) &&
        Objects.equals(this.entries, row.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualLabel, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    sb.append("    actualLabel: ").append(toIndentedString(actualLabel)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

