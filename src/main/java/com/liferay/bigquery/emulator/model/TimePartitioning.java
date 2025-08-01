package com.liferay.bigquery.emulator.model;

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
 * TimePartitioning
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TimePartitioning {

  private String expirationMs;

  private String field;

  private Boolean requirePartitionFilter;

  private String type;

  public TimePartitioning expirationMs(String expirationMs) {
    this.expirationMs = expirationMs;
    return this;
  }

  /**
   * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
   * @return expirationMs
   */
  
  @Schema(name = "expirationMs", description = "[Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationMs")
  public String getExpirationMs() {
    return expirationMs;
  }

  public void setExpirationMs(String expirationMs) {
    this.expirationMs = expirationMs;
  }

  public TimePartitioning field(String field) {
    this.field = field;
    return this;
  }

  /**
   * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
   * @return field
   */
  
  @Schema(name = "field", description = "[Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public TimePartitioning requirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
    return this;
  }

  /**
   * Get requirePartitionFilter
   * @return requirePartitionFilter
   */
  
  @Schema(name = "requirePartitionFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requirePartitionFilter")
  public Boolean getRequirePartitionFilter() {
    return requirePartitionFilter;
  }

  public void setRequirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
  }

  public TimePartitioning type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
   * @return type
   */
  
  @Schema(name = "type", description = "[Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePartitioning timePartitioning = (TimePartitioning) o;
    return Objects.equals(this.expirationMs, timePartitioning.expirationMs) &&
        Objects.equals(this.field, timePartitioning.field) &&
        Objects.equals(this.requirePartitionFilter, timePartitioning.requirePartitionFilter) &&
        Objects.equals(this.type, timePartitioning.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationMs, field, requirePartitionFilter, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePartitioning {\n");
    sb.append("    expirationMs: ").append(toIndentedString(expirationMs)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    requirePartitionFilter: ").append(toIndentedString(requirePartitionFilter)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

