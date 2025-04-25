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
 * HivePartitioningOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class HivePartitioningOptions {

  private String mode;

  private Boolean requirePartitionFilter;

  private String sourceUriPrefix;

  public HivePartitioningOptions mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
   * @return mode
   */
  
  @Schema(name = "mode", description = "[Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public HivePartitioningOptions requirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
    return this;
  }

  /**
   * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
   * @return requirePartitionFilter
   */
  
  @Schema(name = "requirePartitionFilter", description = "[Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requirePartitionFilter")
  public Boolean getRequirePartitionFilter() {
    return requirePartitionFilter;
  }

  public void setRequirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
  }

  public HivePartitioningOptions sourceUriPrefix(String sourceUriPrefix) {
    this.sourceUriPrefix = sourceUriPrefix;
    return this;
  }

  /**
   * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
   * @return sourceUriPrefix
   */
  
  @Schema(name = "sourceUriPrefix", description = "[Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceUriPrefix")
  public String getSourceUriPrefix() {
    return sourceUriPrefix;
  }

  public void setSourceUriPrefix(String sourceUriPrefix) {
    this.sourceUriPrefix = sourceUriPrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HivePartitioningOptions hivePartitioningOptions = (HivePartitioningOptions) o;
    return Objects.equals(this.mode, hivePartitioningOptions.mode) &&
        Objects.equals(this.requirePartitionFilter, hivePartitioningOptions.requirePartitionFilter) &&
        Objects.equals(this.sourceUriPrefix, hivePartitioningOptions.sourceUriPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, requirePartitionFilter, sourceUriPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HivePartitioningOptions {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    requirePartitionFilter: ").append(toIndentedString(requirePartitionFilter)).append("\n");
    sb.append("    sourceUriPrefix: ").append(toIndentedString(sourceUriPrefix)).append("\n");
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

