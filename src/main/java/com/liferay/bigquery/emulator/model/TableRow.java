package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.TableCell;
import com.fasterxml.jackson.annotation.JsonCreator;

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
 * TableRow
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableRow {

  @Valid
  private List<@Valid TableCell> f = new ArrayList<>();

  public TableRow f(List<@Valid TableCell> f) {
    this.f = f;
    return this;
  }

  public TableRow addFItem(TableCell fItem) {
    if (this.f == null) {
      this.f = new ArrayList<>();
    }
    this.f.add(fItem);
    return this;
  }

  /**
   * Represents a single row in the result set, consisting of one or more fields.
   * @return f
   */
  @Valid 
  @Schema(name = "f", description = "Represents a single row in the result set, consisting of one or more fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("f")
  public List<@Valid TableCell> getF() {
    return f;
  }

  public void setF(List<@Valid TableCell> f) {
    this.f = f;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRow tableRow = (TableRow) o;
    return Objects.equals(this.f, tableRow.f);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRow {\n");
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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

