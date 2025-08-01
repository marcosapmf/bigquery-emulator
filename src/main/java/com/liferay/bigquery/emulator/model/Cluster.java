package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.FeatureValue;
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
 * Message containing the information about one cluster.
 */

@Schema(name = "Cluster", description = "Message containing the information about one cluster.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Cluster {

  private String centroidId;

  private String count;

  @Valid
  private List<@Valid FeatureValue> featureValues = new ArrayList<>();

  public Cluster centroidId(String centroidId) {
    this.centroidId = centroidId;
    return this;
  }

  /**
   * Centroid id.
   * @return centroidId
   */
  
  @Schema(name = "centroidId", description = "Centroid id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("centroidId")
  public String getCentroidId() {
    return centroidId;
  }

  public void setCentroidId(String centroidId) {
    this.centroidId = centroidId;
  }

  public Cluster count(String count) {
    this.count = count;
    return this;
  }

  /**
   * Count of training data rows that were assigned to this cluster.
   * @return count
   */
  
  @Schema(name = "count", description = "Count of training data rows that were assigned to this cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public Cluster featureValues(List<@Valid FeatureValue> featureValues) {
    this.featureValues = featureValues;
    return this;
  }

  public Cluster addFeatureValuesItem(FeatureValue featureValuesItem) {
    if (this.featureValues == null) {
      this.featureValues = new ArrayList<>();
    }
    this.featureValues.add(featureValuesItem);
    return this;
  }

  /**
   * Values of highly variant features for this cluster.
   * @return featureValues
   */
  @Valid 
  @Schema(name = "featureValues", description = "Values of highly variant features for this cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureValues")
  public List<@Valid FeatureValue> getFeatureValues() {
    return featureValues;
  }

  public void setFeatureValues(List<@Valid FeatureValue> featureValues) {
    this.featureValues = featureValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.centroidId, cluster.centroidId) &&
        Objects.equals(this.count, cluster.count) &&
        Objects.equals(this.featureValues, cluster.featureValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroidId, count, featureValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    centroidId: ").append(toIndentedString(centroidId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    featureValues: ").append(toIndentedString(featureValues)).append("\n");
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

