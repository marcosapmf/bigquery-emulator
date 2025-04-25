package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.DatasetListDatasetsInner;
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
 * DatasetList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DatasetList {

  @Valid
  private List<@Valid DatasetListDatasetsInner> datasets = new ArrayList<>();

  private String etag;

  private String kind = "bigquery#datasetList";

  private String nextPageToken;

  public DatasetList datasets(List<@Valid DatasetListDatasetsInner> datasets) {
    this.datasets = datasets;
    return this;
  }

  public DatasetList addDatasetsItem(DatasetListDatasetsInner datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

  /**
   * An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource, use the Datasets: get method. This property is omitted when there are no datasets in the project.
   * @return datasets
   */
  @Valid 
  @Schema(name = "datasets", description = "An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource, use the Datasets: get method. This property is omitted when there are no datasets in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasets")
  public List<@Valid DatasetListDatasetsInner> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<@Valid DatasetListDatasetsInner> datasets) {
    this.datasets = datasets;
  }

  public DatasetList etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * A hash value of the results page. You can use this property to determine if the page has changed since the last request.
   * @return etag
   */
  
  @Schema(name = "etag", description = "A hash value of the results page. You can use this property to determine if the page has changed since the last request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public DatasetList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The list type. This property always returns the value \"bigquery#datasetList\".
   * @return kind
   */
  
  @Schema(name = "kind", description = "The list type. This property always returns the value \"bigquery#datasetList\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DatasetList nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token that can be used to request the next results page. This property is omitted on the final results page.
   * @return nextPageToken
   */
  
  @Schema(name = "nextPageToken", description = "A token that can be used to request the next results page. This property is omitted on the final results page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetList datasetList = (DatasetList) o;
    return Objects.equals(this.datasets, datasetList.datasets) &&
        Objects.equals(this.etag, datasetList.etag) &&
        Objects.equals(this.kind, datasetList.kind) &&
        Objects.equals(this.nextPageToken, datasetList.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, etag, kind, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetList {\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

