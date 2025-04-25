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
 * ParquetOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ParquetOptions {

  private Boolean enableListInference;

  private Boolean enumAsString;

  public ParquetOptions enableListInference(Boolean enableListInference) {
    this.enableListInference = enableListInference;
    return this;
  }

  /**
   * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
   * @return enableListInference
   */
  
  @Schema(name = "enableListInference", description = "[Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableListInference")
  public Boolean getEnableListInference() {
    return enableListInference;
  }

  public void setEnableListInference(Boolean enableListInference) {
    this.enableListInference = enableListInference;
  }

  public ParquetOptions enumAsString(Boolean enumAsString) {
    this.enumAsString = enumAsString;
    return this;
  }

  /**
   * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
   * @return enumAsString
   */
  
  @Schema(name = "enumAsString", description = "[Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enumAsString")
  public Boolean getEnumAsString() {
    return enumAsString;
  }

  public void setEnumAsString(Boolean enumAsString) {
    this.enumAsString = enumAsString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParquetOptions parquetOptions = (ParquetOptions) o;
    return Objects.equals(this.enableListInference, parquetOptions.enableListInference) &&
        Objects.equals(this.enumAsString, parquetOptions.enumAsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableListInference, enumAsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParquetOptions {\n");
    sb.append("    enableListInference: ").append(toIndentedString(enableListInference)).append("\n");
    sb.append("    enumAsString: ").append(toIndentedString(enumAsString)).append("\n");
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

