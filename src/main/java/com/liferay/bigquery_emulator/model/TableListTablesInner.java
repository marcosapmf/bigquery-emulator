package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery_emulator.model.Clustering;
import com.liferay.bigquery_emulator.model.RangePartitioning;
import com.liferay.bigquery_emulator.model.TableListTablesInnerView;
import com.liferay.bigquery_emulator.model.TableReference;
import com.liferay.bigquery_emulator.model.TimePartitioning;
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
 * TableListTablesInner
 */

@JsonTypeName("TableList_tables_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableListTablesInner {

  private Clustering clustering;

  private String creationTime;

  private String expirationTime;

  private String friendlyName;

  private String id;

  private String kind = "bigquery#table";

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private RangePartitioning rangePartitioning;

  private TableReference tableReference;

  private TimePartitioning timePartitioning;

  private String type;

  private TableListTablesInnerView view;

  public TableListTablesInner clustering(Clustering clustering) {
    this.clustering = clustering;
    return this;
  }

  /**
   * Get clustering
   * @return clustering
   */
  @Valid 
  @Schema(name = "clustering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clustering")
  public Clustering getClustering() {
    return clustering;
  }

  public void setClustering(Clustering clustering) {
    this.clustering = clustering;
  }

  public TableListTablesInner creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The time when this table was created, in milliseconds since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", description = "The time when this table was created, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TableListTablesInner expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed.
   * @return expirationTime
   */
  
  @Schema(name = "expirationTime", description = "[Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationTime")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public TableListTablesInner friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * The user-friendly name for this table.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "The user-friendly name for this table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public TableListTablesInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An opaque ID of the table
   * @return id
   */
  
  @Schema(name = "id", description = "An opaque ID of the table", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TableListTablesInner kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The resource type.
   * @return kind
   */
  
  @Schema(name = "kind", description = "The resource type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public TableListTablesInner labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public TableListTablesInner putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this table. You can use these to organize and group your tables.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this table. You can use these to organize and group your tables.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public TableListTablesInner rangePartitioning(RangePartitioning rangePartitioning) {
    this.rangePartitioning = rangePartitioning;
    return this;
  }

  /**
   * Get rangePartitioning
   * @return rangePartitioning
   */
  @Valid 
  @Schema(name = "rangePartitioning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rangePartitioning")
  public RangePartitioning getRangePartitioning() {
    return rangePartitioning;
  }

  public void setRangePartitioning(RangePartitioning rangePartitioning) {
    this.rangePartitioning = rangePartitioning;
  }

  public TableListTablesInner tableReference(TableReference tableReference) {
    this.tableReference = tableReference;
    return this;
  }

  /**
   * Get tableReference
   * @return tableReference
   */
  @Valid 
  @Schema(name = "tableReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tableReference")
  public TableReference getTableReference() {
    return tableReference;
  }

  public void setTableReference(TableReference tableReference) {
    this.tableReference = tableReference;
  }

  public TableListTablesInner timePartitioning(TimePartitioning timePartitioning) {
    this.timePartitioning = timePartitioning;
    return this;
  }

  /**
   * Get timePartitioning
   * @return timePartitioning
   */
  @Valid 
  @Schema(name = "timePartitioning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timePartitioning")
  public TimePartitioning getTimePartitioning() {
    return timePartitioning;
  }

  public void setTimePartitioning(TimePartitioning timePartitioning) {
    this.timePartitioning = timePartitioning;
  }

  public TableListTablesInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of table. Possible values are: TABLE, VIEW.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of table. Possible values are: TABLE, VIEW.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TableListTablesInner view(TableListTablesInnerView view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
   */
  @Valid 
  @Schema(name = "view", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view")
  public TableListTablesInnerView getView() {
    return view;
  }

  public void setView(TableListTablesInnerView view) {
    this.view = view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableListTablesInner tableListTablesInner = (TableListTablesInner) o;
    return Objects.equals(this.clustering, tableListTablesInner.clustering) &&
        Objects.equals(this.creationTime, tableListTablesInner.creationTime) &&
        Objects.equals(this.expirationTime, tableListTablesInner.expirationTime) &&
        Objects.equals(this.friendlyName, tableListTablesInner.friendlyName) &&
        Objects.equals(this.id, tableListTablesInner.id) &&
        Objects.equals(this.kind, tableListTablesInner.kind) &&
        Objects.equals(this.labels, tableListTablesInner.labels) &&
        Objects.equals(this.rangePartitioning, tableListTablesInner.rangePartitioning) &&
        Objects.equals(this.tableReference, tableListTablesInner.tableReference) &&
        Objects.equals(this.timePartitioning, tableListTablesInner.timePartitioning) &&
        Objects.equals(this.type, tableListTablesInner.type) &&
        Objects.equals(this.view, tableListTablesInner.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clustering, creationTime, expirationTime, friendlyName, id, kind, labels, rangePartitioning, tableReference, timePartitioning, type, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableListTablesInner {\n");
    sb.append("    clustering: ").append(toIndentedString(clustering)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    rangePartitioning: ").append(toIndentedString(rangePartitioning)).append("\n");
    sb.append("    tableReference: ").append(toIndentedString(tableReference)).append("\n");
    sb.append("    timePartitioning: ").append(toIndentedString(timePartitioning)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

