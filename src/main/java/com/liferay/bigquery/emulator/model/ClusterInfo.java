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
 * Information about a single cluster for clustering model.
 */

@Schema(name = "ClusterInfo", description = "Information about a single cluster for clustering model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ClusterInfo {

  private String centroidId;

  private Double clusterRadius;

  private String clusterSize;

  public ClusterInfo centroidId(String centroidId) {
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

  public ClusterInfo clusterRadius(Double clusterRadius) {
    this.clusterRadius = clusterRadius;
    return this;
  }

  /**
   * Cluster radius, the average distance from centroid to each point assigned to the cluster.
   * @return clusterRadius
   */
  
  @Schema(name = "clusterRadius", description = "Cluster radius, the average distance from centroid to each point assigned to the cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterRadius")
  public Double getClusterRadius() {
    return clusterRadius;
  }

  public void setClusterRadius(Double clusterRadius) {
    this.clusterRadius = clusterRadius;
  }

  public ClusterInfo clusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
    return this;
  }

  /**
   * Cluster size, the total number of points assigned to the cluster.
   * @return clusterSize
   */
  
  @Schema(name = "clusterSize", description = "Cluster size, the total number of points assigned to the cluster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterSize")
  public String getClusterSize() {
    return clusterSize;
  }

  public void setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInfo clusterInfo = (ClusterInfo) o;
    return Objects.equals(this.centroidId, clusterInfo.centroidId) &&
        Objects.equals(this.clusterRadius, clusterInfo.clusterRadius) &&
        Objects.equals(this.clusterSize, clusterInfo.clusterSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroidId, clusterRadius, clusterSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInfo {\n");
    sb.append("    centroidId: ").append(toIndentedString(centroidId)).append("\n");
    sb.append("    clusterRadius: ").append(toIndentedString(clusterRadius)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
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

