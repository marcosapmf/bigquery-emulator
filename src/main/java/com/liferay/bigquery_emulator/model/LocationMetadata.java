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
 * BigQuery-specific metadata about a location. This will be set on google.cloud.location.Location.metadata in Cloud Location API responses.
 */

@Schema(name = "LocationMetadata", description = "BigQuery-specific metadata about a location. This will be set on google.cloud.location.Location.metadata in Cloud Location API responses.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class LocationMetadata {

  private String legacyLocationId;

  public LocationMetadata legacyLocationId(String legacyLocationId) {
    this.legacyLocationId = legacyLocationId;
    return this;
  }

  /**
   * The legacy BigQuery location ID.
   * @return legacyLocationId
   */
  
  @Schema(name = "legacyLocationId", description = "The legacy BigQuery location ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legacyLocationId")
  public String getLegacyLocationId() {
    return legacyLocationId;
  }

  public void setLegacyLocationId(String legacyLocationId) {
    this.legacyLocationId = legacyLocationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationMetadata locationMetadata = (LocationMetadata) o;
    return Objects.equals(this.legacyLocationId, locationMetadata.legacyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationMetadata {\n");
    sb.append("    legacyLocationId: ").append(toIndentedString(legacyLocationId)).append("\n");
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

