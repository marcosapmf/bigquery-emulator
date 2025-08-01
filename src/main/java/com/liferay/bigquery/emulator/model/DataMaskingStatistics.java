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
 * DataMaskingStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DataMaskingStatistics {

  private Boolean dataMaskingApplied = false;

  public DataMaskingStatistics dataMaskingApplied(Boolean dataMaskingApplied) {
    this.dataMaskingApplied = dataMaskingApplied;
    return this;
  }

  /**
   * [Output-only] [Preview] Whether any accessed data was protected by data masking. The actual evaluation is done by accessStats.masked_field_count > 0. Since this is only used for the discovery_doc generation purpose, as long as the type (boolean) matches, client library can leverage this. The actual evaluation of the variable is done else-where.
   * @return dataMaskingApplied
   */
  
  @Schema(name = "dataMaskingApplied", description = "[Output-only] [Preview] Whether any accessed data was protected by data masking. The actual evaluation is done by accessStats.masked_field_count > 0. Since this is only used for the discovery_doc generation purpose, as long as the type (boolean) matches, client library can leverage this. The actual evaluation of the variable is done else-where.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataMaskingApplied")
  public Boolean getDataMaskingApplied() {
    return dataMaskingApplied;
  }

  public void setDataMaskingApplied(Boolean dataMaskingApplied) {
    this.dataMaskingApplied = dataMaskingApplied;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataMaskingStatistics dataMaskingStatistics = (DataMaskingStatistics) o;
    return Objects.equals(this.dataMaskingApplied, dataMaskingStatistics.dataMaskingApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMaskingApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataMaskingStatistics {\n");
    sb.append("    dataMaskingApplied: ").append(toIndentedString(dataMaskingApplied)).append("\n");
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

