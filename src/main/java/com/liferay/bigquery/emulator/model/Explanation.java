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
 * Explanation for a single feature.
 */

@Schema(name = "Explanation", description = "Explanation for a single feature.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Explanation {

  private Double attribution;

  private String featureName;

  public Explanation attribution(Double attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Attribution of feature.
   * @return attribution
   */
  
  @Schema(name = "attribution", description = "Attribution of feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution")
  public Double getAttribution() {
    return attribution;
  }

  public void setAttribution(Double attribution) {
    this.attribution = attribution;
  }

  public Explanation featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  /**
   * The full feature name. For non-numerical features, will be formatted like `.`. Overall size of feature name will always be truncated to first 120 characters.
   * @return featureName
   */
  
  @Schema(name = "featureName", description = "The full feature name. For non-numerical features, will be formatted like `.`. Overall size of feature name will always be truncated to first 120 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureName")
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Explanation explanation = (Explanation) o;
    return Objects.equals(this.attribution, explanation.attribution) &&
        Objects.equals(this.featureName, explanation.featureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribution, featureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Explanation {\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
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

