package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.Cluster;
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
 * Evaluation metrics for clustering models.
 */

@Schema(name = "ClusteringMetrics", description = "Evaluation metrics for clustering models.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ClusteringMetrics {

  @Valid
  private List<@Valid Cluster> clusters = new ArrayList<>();

  private Double daviesBouldinIndex;

  private Double meanSquaredDistance;

  public ClusteringMetrics clusters(List<@Valid Cluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  public ClusteringMetrics addClustersItem(Cluster clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * Information for all clusters.
   * @return clusters
   */
  @Valid 
  @Schema(name = "clusters", description = "Information for all clusters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusters")
  public List<@Valid Cluster> getClusters() {
    return clusters;
  }

  public void setClusters(List<@Valid Cluster> clusters) {
    this.clusters = clusters;
  }

  public ClusteringMetrics daviesBouldinIndex(Double daviesBouldinIndex) {
    this.daviesBouldinIndex = daviesBouldinIndex;
    return this;
  }

  /**
   * Davies-Bouldin index.
   * @return daviesBouldinIndex
   */
  
  @Schema(name = "daviesBouldinIndex", description = "Davies-Bouldin index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daviesBouldinIndex")
  public Double getDaviesBouldinIndex() {
    return daviesBouldinIndex;
  }

  public void setDaviesBouldinIndex(Double daviesBouldinIndex) {
    this.daviesBouldinIndex = daviesBouldinIndex;
  }

  public ClusteringMetrics meanSquaredDistance(Double meanSquaredDistance) {
    this.meanSquaredDistance = meanSquaredDistance;
    return this;
  }

  /**
   * Mean of squared distances between each sample to its cluster centroid.
   * @return meanSquaredDistance
   */
  
  @Schema(name = "meanSquaredDistance", description = "Mean of squared distances between each sample to its cluster centroid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meanSquaredDistance")
  public Double getMeanSquaredDistance() {
    return meanSquaredDistance;
  }

  public void setMeanSquaredDistance(Double meanSquaredDistance) {
    this.meanSquaredDistance = meanSquaredDistance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusteringMetrics clusteringMetrics = (ClusteringMetrics) o;
    return Objects.equals(this.clusters, clusteringMetrics.clusters) &&
        Objects.equals(this.daviesBouldinIndex, clusteringMetrics.daviesBouldinIndex) &&
        Objects.equals(this.meanSquaredDistance, clusteringMetrics.meanSquaredDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, daviesBouldinIndex, meanSquaredDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusteringMetrics {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    daviesBouldinIndex: ").append(toIndentedString(daviesBouldinIndex)).append("\n");
    sb.append("    meanSquaredDistance: ").append(toIndentedString(meanSquaredDistance)).append("\n");
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

