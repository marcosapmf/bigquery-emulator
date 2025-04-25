package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.CloneDefinition;
import com.liferay.bigquery_emulator.model.Clustering;
import com.liferay.bigquery_emulator.model.EncryptionConfiguration;
import com.liferay.bigquery_emulator.model.ExternalDataConfiguration;
import com.liferay.bigquery_emulator.model.MaterializedViewDefinition;
import com.liferay.bigquery_emulator.model.ModelDefinition;
import com.liferay.bigquery_emulator.model.RangePartitioning;
import com.liferay.bigquery_emulator.model.SnapshotDefinition;
import com.liferay.bigquery_emulator.model.Streamingbuffer;
import com.liferay.bigquery_emulator.model.TableReference;
import com.liferay.bigquery_emulator.model.TableSchema;
import com.liferay.bigquery_emulator.model.TimePartitioning;
import com.liferay.bigquery_emulator.model.ViewDefinition;
import java.util.Arrays;
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
 * Table
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Table {

  private CloneDefinition cloneDefinition;

  private Clustering clustering;

  private String creationTime;

  private String defaultCollation;

  private String defaultRoundingMode;

  private String description;

  private EncryptionConfiguration encryptionConfiguration;

  private String etag;

  private String expirationTime;

  private ExternalDataConfiguration externalDataConfiguration;

  private String friendlyName;

  private String id;

  private String kind = "bigquery#table";

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String lastModifiedTime;

  private String location;

  private MaterializedViewDefinition materializedView;

  private byte[] maxStaleness;

  private ModelDefinition model;

  private String numBytes;

  private String numLongTermBytes;

  private String numPhysicalBytes;

  private String numRows;

  private String numActiveLogicalBytes;

  private String numActivePhysicalBytes;

  private String numLongTermLogicalBytes;

  private String numLongTermPhysicalBytes;

  private String numPartitions;

  private String numTimeTravelPhysicalBytes;

  private String numTotalLogicalBytes;

  private String numTotalPhysicalBytes;

  private RangePartitioning rangePartitioning;

  private Boolean requirePartitionFilter = false;

  private TableSchema schema;

  private String selfLink;

  private SnapshotDefinition snapshotDefinition;

  private Streamingbuffer streamingBuffer;

  private TableReference tableReference;

  private TimePartitioning timePartitioning;

  private String type;

  private ViewDefinition view;

  public Table cloneDefinition(CloneDefinition cloneDefinition) {
    this.cloneDefinition = cloneDefinition;
    return this;
  }

  /**
   * Get cloneDefinition
   * @return cloneDefinition
   */
  @Valid 
  @Schema(name = "cloneDefinition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cloneDefinition")
  public CloneDefinition getCloneDefinition() {
    return cloneDefinition;
  }

  public void setCloneDefinition(CloneDefinition cloneDefinition) {
    this.cloneDefinition = cloneDefinition;
  }

  public Table clustering(Clustering clustering) {
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

  public Table creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * [Output-only] The time when this table was created, in milliseconds since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", description = "[Output-only] The time when this table was created, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Table defaultCollation(String defaultCollation) {
    this.defaultCollation = defaultCollation;
    return this;
  }

  /**
   * [Output-only] The default collation of the table.
   * @return defaultCollation
   */
  
  @Schema(name = "defaultCollation", description = "[Output-only] The default collation of the table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultCollation")
  public String getDefaultCollation() {
    return defaultCollation;
  }

  public void setDefaultCollation(String defaultCollation) {
    this.defaultCollation = defaultCollation;
  }

  public Table defaultRoundingMode(String defaultRoundingMode) {
    this.defaultRoundingMode = defaultRoundingMode;
    return this;
  }

  /**
   * [Output-only] The default rounding mode of the table.
   * @return defaultRoundingMode
   */
  
  @Schema(name = "defaultRoundingMode", description = "[Output-only] The default rounding mode of the table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultRoundingMode")
  public String getDefaultRoundingMode() {
    return defaultRoundingMode;
  }

  public void setDefaultRoundingMode(String defaultRoundingMode) {
    this.defaultRoundingMode = defaultRoundingMode;
  }

  public Table description(String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] A user-friendly description of this table.
   * @return description
   */
  
  @Schema(name = "description", description = "[Optional] A user-friendly description of this table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Table encryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
    return this;
  }

  /**
   * Get encryptionConfiguration
   * @return encryptionConfiguration
   */
  @Valid 
  @Schema(name = "encryptionConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encryptionConfiguration")
  public EncryptionConfiguration getEncryptionConfiguration() {
    return encryptionConfiguration;
  }

  public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
  }

  public Table etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Output-only] A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
   * @return etag
   */
  
  @Schema(name = "etag", description = "[Output-only] A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Table expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
   * @return expirationTime
   */
  
  @Schema(name = "expirationTime", description = "[Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationTime")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public Table externalDataConfiguration(ExternalDataConfiguration externalDataConfiguration) {
    this.externalDataConfiguration = externalDataConfiguration;
    return this;
  }

  /**
   * Get externalDataConfiguration
   * @return externalDataConfiguration
   */
  @Valid 
  @Schema(name = "externalDataConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalDataConfiguration")
  public ExternalDataConfiguration getExternalDataConfiguration() {
    return externalDataConfiguration;
  }

  public void setExternalDataConfiguration(ExternalDataConfiguration externalDataConfiguration) {
    this.externalDataConfiguration = externalDataConfiguration;
  }

  public Table friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * [Optional] A descriptive name for this table.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "[Optional] A descriptive name for this table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Table id(String id) {
    this.id = id;
    return this;
  }

  /**
   * [Output-only] An opaque ID uniquely identifying the table.
   * @return id
   */
  
  @Schema(name = "id", description = "[Output-only] An opaque ID uniquely identifying the table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Table kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] The type of the resource.
   * @return kind
   */
  
  @Schema(name = "kind", description = "[Output-only] The type of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Table labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Table putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public Table lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * [Output-only] The time when this table was last modified, in milliseconds since the epoch.
   * @return lastModifiedTime
   */
  
  @Schema(name = "lastModifiedTime", description = "[Output-only] The time when this table was last modified, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedTime")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Table location(String location) {
    this.location = location;
    return this;
  }

  /**
   * [Output-only] The geographic location where the table resides. This value is inherited from the dataset.
   * @return location
   */
  
  @Schema(name = "location", description = "[Output-only] The geographic location where the table resides. This value is inherited from the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Table materializedView(MaterializedViewDefinition materializedView) {
    this.materializedView = materializedView;
    return this;
  }

  /**
   * Get materializedView
   * @return materializedView
   */
  @Valid 
  @Schema(name = "materializedView", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("materializedView")
  public MaterializedViewDefinition getMaterializedView() {
    return materializedView;
  }

  public void setMaterializedView(MaterializedViewDefinition materializedView) {
    this.materializedView = materializedView;
  }

  public Table maxStaleness(byte[] maxStaleness) {
    this.maxStaleness = maxStaleness;
    return this;
  }

  /**
   * [Optional] Max staleness of data that could be returned when table or materialized view is queried (formatted as Google SQL Interval type).
   * @return maxStaleness
   */
  
  @Schema(name = "maxStaleness", description = "[Optional] Max staleness of data that could be returned when table or materialized view is queried (formatted as Google SQL Interval type).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxStaleness")
  public byte[] getMaxStaleness() {
    return maxStaleness;
  }

  public void setMaxStaleness(byte[] maxStaleness) {
    this.maxStaleness = maxStaleness;
  }

  public Table model(ModelDefinition model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public ModelDefinition getModel() {
    return model;
  }

  public void setModel(ModelDefinition model) {
    this.model = model;
  }

  public Table numBytes(String numBytes) {
    this.numBytes = numBytes;
    return this;
  }

  /**
   * [Output-only] The size of this table in bytes, excluding any data in the streaming buffer.
   * @return numBytes
   */
  
  @Schema(name = "numBytes", description = "[Output-only] The size of this table in bytes, excluding any data in the streaming buffer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numBytes")
  public String getNumBytes() {
    return numBytes;
  }

  public void setNumBytes(String numBytes) {
    this.numBytes = numBytes;
  }

  public Table numLongTermBytes(String numLongTermBytes) {
    this.numLongTermBytes = numLongTermBytes;
    return this;
  }

  /**
   * [Output-only] The number of bytes in the table that are considered \"long-term storage\".
   * @return numLongTermBytes
   */
  
  @Schema(name = "numLongTermBytes", description = "[Output-only] The number of bytes in the table that are considered \"long-term storage\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numLongTermBytes")
  public String getNumLongTermBytes() {
    return numLongTermBytes;
  }

  public void setNumLongTermBytes(String numLongTermBytes) {
    this.numLongTermBytes = numLongTermBytes;
  }

  public Table numPhysicalBytes(String numPhysicalBytes) {
    this.numPhysicalBytes = numPhysicalBytes;
    return this;
  }

  /**
   * [Output-only] [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
   * @return numPhysicalBytes
   */
  
  @Schema(name = "numPhysicalBytes", description = "[Output-only] [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numPhysicalBytes")
  public String getNumPhysicalBytes() {
    return numPhysicalBytes;
  }

  public void setNumPhysicalBytes(String numPhysicalBytes) {
    this.numPhysicalBytes = numPhysicalBytes;
  }

  public Table numRows(String numRows) {
    this.numRows = numRows;
    return this;
  }

  /**
   * [Output-only] The number of rows of data in this table, excluding any data in the streaming buffer.
   * @return numRows
   */
  
  @Schema(name = "numRows", description = "[Output-only] The number of rows of data in this table, excluding any data in the streaming buffer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numRows")
  public String getNumRows() {
    return numRows;
  }

  public void setNumRows(String numRows) {
    this.numRows = numRows;
  }

  public Table numActiveLogicalBytes(String numActiveLogicalBytes) {
    this.numActiveLogicalBytes = numActiveLogicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of logical bytes that are less than 90 days old.
   * @return numActiveLogicalBytes
   */
  
  @Schema(name = "num_active_logical_bytes", description = "[Output-only] Number of logical bytes that are less than 90 days old.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_active_logical_bytes")
  public String getNumActiveLogicalBytes() {
    return numActiveLogicalBytes;
  }

  public void setNumActiveLogicalBytes(String numActiveLogicalBytes) {
    this.numActiveLogicalBytes = numActiveLogicalBytes;
  }

  public Table numActivePhysicalBytes(String numActivePhysicalBytes) {
    this.numActivePhysicalBytes = numActivePhysicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of physical bytes less than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
   * @return numActivePhysicalBytes
   */
  
  @Schema(name = "num_active_physical_bytes", description = "[Output-only] Number of physical bytes less than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_active_physical_bytes")
  public String getNumActivePhysicalBytes() {
    return numActivePhysicalBytes;
  }

  public void setNumActivePhysicalBytes(String numActivePhysicalBytes) {
    this.numActivePhysicalBytes = numActivePhysicalBytes;
  }

  public Table numLongTermLogicalBytes(String numLongTermLogicalBytes) {
    this.numLongTermLogicalBytes = numLongTermLogicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of logical bytes that are more than 90 days old.
   * @return numLongTermLogicalBytes
   */
  
  @Schema(name = "num_long_term_logical_bytes", description = "[Output-only] Number of logical bytes that are more than 90 days old.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_long_term_logical_bytes")
  public String getNumLongTermLogicalBytes() {
    return numLongTermLogicalBytes;
  }

  public void setNumLongTermLogicalBytes(String numLongTermLogicalBytes) {
    this.numLongTermLogicalBytes = numLongTermLogicalBytes;
  }

  public Table numLongTermPhysicalBytes(String numLongTermPhysicalBytes) {
    this.numLongTermPhysicalBytes = numLongTermPhysicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of physical bytes more than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
   * @return numLongTermPhysicalBytes
   */
  
  @Schema(name = "num_long_term_physical_bytes", description = "[Output-only] Number of physical bytes more than 90 days old. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_long_term_physical_bytes")
  public String getNumLongTermPhysicalBytes() {
    return numLongTermPhysicalBytes;
  }

  public void setNumLongTermPhysicalBytes(String numLongTermPhysicalBytes) {
    this.numLongTermPhysicalBytes = numLongTermPhysicalBytes;
  }

  public Table numPartitions(String numPartitions) {
    this.numPartitions = numPartitions;
    return this;
  }

  /**
   * [Output-only] The number of partitions present in the table or materialized view. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
   * @return numPartitions
   */
  
  @Schema(name = "num_partitions", description = "[Output-only] The number of partitions present in the table or materialized view. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_partitions")
  public String getNumPartitions() {
    return numPartitions;
  }

  public void setNumPartitions(String numPartitions) {
    this.numPartitions = numPartitions;
  }

  public Table numTimeTravelPhysicalBytes(String numTimeTravelPhysicalBytes) {
    this.numTimeTravelPhysicalBytes = numTimeTravelPhysicalBytes;
    return this;
  }

  /**
   * [Output-only] Number of physical bytes used by time travel storage (deleted or changed data). This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
   * @return numTimeTravelPhysicalBytes
   */
  
  @Schema(name = "num_time_travel_physical_bytes", description = "[Output-only] Number of physical bytes used by time travel storage (deleted or changed data). This data is not kept in real time, and might be delayed by a few seconds to a few minutes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_time_travel_physical_bytes")
  public String getNumTimeTravelPhysicalBytes() {
    return numTimeTravelPhysicalBytes;
  }

  public void setNumTimeTravelPhysicalBytes(String numTimeTravelPhysicalBytes) {
    this.numTimeTravelPhysicalBytes = numTimeTravelPhysicalBytes;
  }

  public Table numTotalLogicalBytes(String numTotalLogicalBytes) {
    this.numTotalLogicalBytes = numTotalLogicalBytes;
    return this;
  }

  /**
   * [Output-only] Total number of logical bytes in the table or materialized view.
   * @return numTotalLogicalBytes
   */
  
  @Schema(name = "num_total_logical_bytes", description = "[Output-only] Total number of logical bytes in the table or materialized view.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_total_logical_bytes")
  public String getNumTotalLogicalBytes() {
    return numTotalLogicalBytes;
  }

  public void setNumTotalLogicalBytes(String numTotalLogicalBytes) {
    this.numTotalLogicalBytes = numTotalLogicalBytes;
  }

  public Table numTotalPhysicalBytes(String numTotalPhysicalBytes) {
    this.numTotalPhysicalBytes = numTotalPhysicalBytes;
    return this;
  }

  /**
   * [Output-only] The physical size of this table in bytes. This also includes storage used for time travel. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.
   * @return numTotalPhysicalBytes
   */
  
  @Schema(name = "num_total_physical_bytes", description = "[Output-only] The physical size of this table in bytes. This also includes storage used for time travel. This data is not kept in real time, and might be delayed by a few seconds to a few minutes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_total_physical_bytes")
  public String getNumTotalPhysicalBytes() {
    return numTotalPhysicalBytes;
  }

  public void setNumTotalPhysicalBytes(String numTotalPhysicalBytes) {
    this.numTotalPhysicalBytes = numTotalPhysicalBytes;
  }

  public Table rangePartitioning(RangePartitioning rangePartitioning) {
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

  public Table requirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
    return this;
  }

  /**
   * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
   * @return requirePartitionFilter
   */
  
  @Schema(name = "requirePartitionFilter", description = "[Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requirePartitionFilter")
  public Boolean getRequirePartitionFilter() {
    return requirePartitionFilter;
  }

  public void setRequirePartitionFilter(Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
  }

  public Table schema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public TableSchema getSchema() {
    return schema;
  }

  public void setSchema(TableSchema schema) {
    this.schema = schema;
  }

  public Table selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @return selfLink
   */
  
  @Schema(name = "selfLink", description = "[Output-only] A URL that can be used to access this resource again.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfLink")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public Table snapshotDefinition(SnapshotDefinition snapshotDefinition) {
    this.snapshotDefinition = snapshotDefinition;
    return this;
  }

  /**
   * Get snapshotDefinition
   * @return snapshotDefinition
   */
  @Valid 
  @Schema(name = "snapshotDefinition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snapshotDefinition")
  public SnapshotDefinition getSnapshotDefinition() {
    return snapshotDefinition;
  }

  public void setSnapshotDefinition(SnapshotDefinition snapshotDefinition) {
    this.snapshotDefinition = snapshotDefinition;
  }

  public Table streamingBuffer(Streamingbuffer streamingBuffer) {
    this.streamingBuffer = streamingBuffer;
    return this;
  }

  /**
   * Get streamingBuffer
   * @return streamingBuffer
   */
  @Valid 
  @Schema(name = "streamingBuffer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streamingBuffer")
  public Streamingbuffer getStreamingBuffer() {
    return streamingBuffer;
  }

  public void setStreamingBuffer(Streamingbuffer streamingBuffer) {
    this.streamingBuffer = streamingBuffer;
  }

  public Table tableReference(TableReference tableReference) {
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

  public Table timePartitioning(TimePartitioning timePartitioning) {
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

  public Table type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
   * @return type
   */
  
  @Schema(name = "type", description = "[Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Table view(ViewDefinition view) {
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
  public ViewDefinition getView() {
    return view;
  }

  public void setView(ViewDefinition view) {
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
    Table table = (Table) o;
    return Objects.equals(this.cloneDefinition, table.cloneDefinition) &&
        Objects.equals(this.clustering, table.clustering) &&
        Objects.equals(this.creationTime, table.creationTime) &&
        Objects.equals(this.defaultCollation, table.defaultCollation) &&
        Objects.equals(this.defaultRoundingMode, table.defaultRoundingMode) &&
        Objects.equals(this.description, table.description) &&
        Objects.equals(this.encryptionConfiguration, table.encryptionConfiguration) &&
        Objects.equals(this.etag, table.etag) &&
        Objects.equals(this.expirationTime, table.expirationTime) &&
        Objects.equals(this.externalDataConfiguration, table.externalDataConfiguration) &&
        Objects.equals(this.friendlyName, table.friendlyName) &&
        Objects.equals(this.id, table.id) &&
        Objects.equals(this.kind, table.kind) &&
        Objects.equals(this.labels, table.labels) &&
        Objects.equals(this.lastModifiedTime, table.lastModifiedTime) &&
        Objects.equals(this.location, table.location) &&
        Objects.equals(this.materializedView, table.materializedView) &&
        Arrays.equals(this.maxStaleness, table.maxStaleness) &&
        Objects.equals(this.model, table.model) &&
        Objects.equals(this.numBytes, table.numBytes) &&
        Objects.equals(this.numLongTermBytes, table.numLongTermBytes) &&
        Objects.equals(this.numPhysicalBytes, table.numPhysicalBytes) &&
        Objects.equals(this.numRows, table.numRows) &&
        Objects.equals(this.numActiveLogicalBytes, table.numActiveLogicalBytes) &&
        Objects.equals(this.numActivePhysicalBytes, table.numActivePhysicalBytes) &&
        Objects.equals(this.numLongTermLogicalBytes, table.numLongTermLogicalBytes) &&
        Objects.equals(this.numLongTermPhysicalBytes, table.numLongTermPhysicalBytes) &&
        Objects.equals(this.numPartitions, table.numPartitions) &&
        Objects.equals(this.numTimeTravelPhysicalBytes, table.numTimeTravelPhysicalBytes) &&
        Objects.equals(this.numTotalLogicalBytes, table.numTotalLogicalBytes) &&
        Objects.equals(this.numTotalPhysicalBytes, table.numTotalPhysicalBytes) &&
        Objects.equals(this.rangePartitioning, table.rangePartitioning) &&
        Objects.equals(this.requirePartitionFilter, table.requirePartitionFilter) &&
        Objects.equals(this.schema, table.schema) &&
        Objects.equals(this.selfLink, table.selfLink) &&
        Objects.equals(this.snapshotDefinition, table.snapshotDefinition) &&
        Objects.equals(this.streamingBuffer, table.streamingBuffer) &&
        Objects.equals(this.tableReference, table.tableReference) &&
        Objects.equals(this.timePartitioning, table.timePartitioning) &&
        Objects.equals(this.type, table.type) &&
        Objects.equals(this.view, table.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneDefinition, clustering, creationTime, defaultCollation, defaultRoundingMode, description, encryptionConfiguration, etag, expirationTime, externalDataConfiguration, friendlyName, id, kind, labels, lastModifiedTime, location, materializedView, Arrays.hashCode(maxStaleness), model, numBytes, numLongTermBytes, numPhysicalBytes, numRows, numActiveLogicalBytes, numActivePhysicalBytes, numLongTermLogicalBytes, numLongTermPhysicalBytes, numPartitions, numTimeTravelPhysicalBytes, numTotalLogicalBytes, numTotalPhysicalBytes, rangePartitioning, requirePartitionFilter, schema, selfLink, snapshotDefinition, streamingBuffer, tableReference, timePartitioning, type, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    cloneDefinition: ").append(toIndentedString(cloneDefinition)).append("\n");
    sb.append("    clustering: ").append(toIndentedString(clustering)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    defaultCollation: ").append(toIndentedString(defaultCollation)).append("\n");
    sb.append("    defaultRoundingMode: ").append(toIndentedString(defaultRoundingMode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionConfiguration: ").append(toIndentedString(encryptionConfiguration)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    externalDataConfiguration: ").append(toIndentedString(externalDataConfiguration)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    materializedView: ").append(toIndentedString(materializedView)).append("\n");
    sb.append("    maxStaleness: ").append(toIndentedString(maxStaleness)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    numBytes: ").append(toIndentedString(numBytes)).append("\n");
    sb.append("    numLongTermBytes: ").append(toIndentedString(numLongTermBytes)).append("\n");
    sb.append("    numPhysicalBytes: ").append(toIndentedString(numPhysicalBytes)).append("\n");
    sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
    sb.append("    numActiveLogicalBytes: ").append(toIndentedString(numActiveLogicalBytes)).append("\n");
    sb.append("    numActivePhysicalBytes: ").append(toIndentedString(numActivePhysicalBytes)).append("\n");
    sb.append("    numLongTermLogicalBytes: ").append(toIndentedString(numLongTermLogicalBytes)).append("\n");
    sb.append("    numLongTermPhysicalBytes: ").append(toIndentedString(numLongTermPhysicalBytes)).append("\n");
    sb.append("    numPartitions: ").append(toIndentedString(numPartitions)).append("\n");
    sb.append("    numTimeTravelPhysicalBytes: ").append(toIndentedString(numTimeTravelPhysicalBytes)).append("\n");
    sb.append("    numTotalLogicalBytes: ").append(toIndentedString(numTotalLogicalBytes)).append("\n");
    sb.append("    numTotalPhysicalBytes: ").append(toIndentedString(numTotalPhysicalBytes)).append("\n");
    sb.append("    rangePartitioning: ").append(toIndentedString(rangePartitioning)).append("\n");
    sb.append("    requirePartitionFilter: ").append(toIndentedString(requirePartitionFilter)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    snapshotDefinition: ").append(toIndentedString(snapshotDefinition)).append("\n");
    sb.append("    streamingBuffer: ").append(toIndentedString(streamingBuffer)).append("\n");
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

