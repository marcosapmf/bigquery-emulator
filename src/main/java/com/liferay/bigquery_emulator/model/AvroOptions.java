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
 * AvroOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class AvroOptions {

  private Boolean useAvroLogicalTypes;

  public AvroOptions useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
    return this;
  }

  /**
   * [Optional] If sourceFormat is set to \"AVRO\", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
   * @return useAvroLogicalTypes
   */
  
  @Schema(name = "useAvroLogicalTypes", description = "[Optional] If sourceFormat is set to \"AVRO\", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useAvroLogicalTypes")
  public Boolean getUseAvroLogicalTypes() {
    return useAvroLogicalTypes;
  }

  public void setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvroOptions avroOptions = (AvroOptions) o;
    return Objects.equals(this.useAvroLogicalTypes, avroOptions.useAvroLogicalTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useAvroLogicalTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvroOptions {\n");
    sb.append("    useAvroLogicalTypes: ").append(toIndentedString(useAvroLogicalTypes)).append("\n");
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

