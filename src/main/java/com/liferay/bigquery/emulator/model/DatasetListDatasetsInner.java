package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery.emulator.model.DatasetReference;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DatasetListDatasetsInner
 */

@JsonTypeName("DatasetList_datasets_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DatasetListDatasetsInner {

  private DatasetReference datasetReference;

  private String friendlyName;

  private String id;

  private String kind = "bigquery#dataset";

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String location;

  public DatasetListDatasetsInner datasetReference(DatasetReference datasetReference) {
    this.datasetReference = datasetReference;
    return this;
  }

  /**
   * Get datasetReference
   * @return datasetReference
   */
  @Valid 
  @Schema(name = "datasetReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasetReference")
  public DatasetReference getDatasetReference() {
    return datasetReference;
  }

  public void setDatasetReference(DatasetReference datasetReference) {
    this.datasetReference = datasetReference;
  }

  public DatasetListDatasetsInner friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * A descriptive name for the dataset, if one exists.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "A descriptive name for the dataset, if one exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public DatasetListDatasetsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The fully-qualified, unique, opaque ID of the dataset.
   * @return id
   */
  
  @Schema(name = "id", description = "The fully-qualified, unique, opaque ID of the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DatasetListDatasetsInner kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The resource type. This property always returns the value \"bigquery#dataset\".
   * @return kind
   */
  
  @Schema(name = "kind", description = "The resource type. This property always returns the value \"bigquery#dataset\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DatasetListDatasetsInner labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public DatasetListDatasetsInner putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this dataset. You can use these to organize and group your datasets.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this dataset. You can use these to organize and group your datasets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public DatasetListDatasetsInner location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The geographic location where the data resides.
   * @return location
   */
  
  @Schema(name = "location", description = "The geographic location where the data resides.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetListDatasetsInner datasetListDatasetsInner = (DatasetListDatasetsInner) o;
    return Objects.equals(this.datasetReference, datasetListDatasetsInner.datasetReference) &&
        Objects.equals(this.friendlyName, datasetListDatasetsInner.friendlyName) &&
        Objects.equals(this.id, datasetListDatasetsInner.id) &&
        Objects.equals(this.kind, datasetListDatasetsInner.kind) &&
        Objects.equals(this.labels, datasetListDatasetsInner.labels) &&
        Objects.equals(this.location, datasetListDatasetsInner.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetReference, friendlyName, id, kind, labels, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetListDatasetsInner {\n");
    sb.append("    datasetReference: ").append(toIndentedString(datasetReference)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

