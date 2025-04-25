package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery_emulator.model.ErrorProto;
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
 * TableDataInsertAllResponseInsertErrorsInner
 */

@JsonTypeName("TableDataInsertAllResponse_insertErrors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableDataInsertAllResponseInsertErrorsInner {

  @Valid
  private List<@Valid ErrorProto> errors = new ArrayList<>();

  private Integer index;

  public TableDataInsertAllResponseInsertErrorsInner errors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  public TableDataInsertAllResponseInsertErrorsInner addErrorsItem(ErrorProto errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error information for the row indicated by the index property.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Error information for the row indicated by the index property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorProto> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
  }

  public TableDataInsertAllResponseInsertErrorsInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the row that error applies to.
   * @return index
   */
  
  @Schema(name = "index", description = "The index of the row that error applies to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDataInsertAllResponseInsertErrorsInner tableDataInsertAllResponseInsertErrorsInner = (TableDataInsertAllResponseInsertErrorsInner) o;
    return Objects.equals(this.errors, tableDataInsertAllResponseInsertErrorsInner.errors) &&
        Objects.equals(this.index, tableDataInsertAllResponseInsertErrorsInner.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDataInsertAllResponseInsertErrorsInner {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

