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
 * DmlStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DmlStatistics {

  private String deletedRowCount;

  private String insertedRowCount;

  private String updatedRowCount;

  public DmlStatistics deletedRowCount(String deletedRowCount) {
    this.deletedRowCount = deletedRowCount;
    return this;
  }

  /**
   * Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements.
   * @return deletedRowCount
   */
  
  @Schema(name = "deletedRowCount", description = "Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedRowCount")
  public String getDeletedRowCount() {
    return deletedRowCount;
  }

  public void setDeletedRowCount(String deletedRowCount) {
    this.deletedRowCount = deletedRowCount;
  }

  public DmlStatistics insertedRowCount(String insertedRowCount) {
    this.insertedRowCount = insertedRowCount;
    return this;
  }

  /**
   * Number of inserted Rows. Populated by DML INSERT and MERGE statements.
   * @return insertedRowCount
   */
  
  @Schema(name = "insertedRowCount", description = "Number of inserted Rows. Populated by DML INSERT and MERGE statements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insertedRowCount")
  public String getInsertedRowCount() {
    return insertedRowCount;
  }

  public void setInsertedRowCount(String insertedRowCount) {
    this.insertedRowCount = insertedRowCount;
  }

  public DmlStatistics updatedRowCount(String updatedRowCount) {
    this.updatedRowCount = updatedRowCount;
    return this;
  }

  /**
   * Number of updated Rows. Populated by DML UPDATE and MERGE statements.
   * @return updatedRowCount
   */
  
  @Schema(name = "updatedRowCount", description = "Number of updated Rows. Populated by DML UPDATE and MERGE statements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedRowCount")
  public String getUpdatedRowCount() {
    return updatedRowCount;
  }

  public void setUpdatedRowCount(String updatedRowCount) {
    this.updatedRowCount = updatedRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmlStatistics dmlStatistics = (DmlStatistics) o;
    return Objects.equals(this.deletedRowCount, dmlStatistics.deletedRowCount) &&
        Objects.equals(this.insertedRowCount, dmlStatistics.insertedRowCount) &&
        Objects.equals(this.updatedRowCount, dmlStatistics.updatedRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedRowCount, insertedRowCount, updatedRowCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmlStatistics {\n");
    sb.append("    deletedRowCount: ").append(toIndentedString(deletedRowCount)).append("\n");
    sb.append("    insertedRowCount: ").append(toIndentedString(insertedRowCount)).append("\n");
    sb.append("    updatedRowCount: ").append(toIndentedString(updatedRowCount)).append("\n");
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

