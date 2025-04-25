package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.DatasetAccessInner;
import com.liferay.bigquery_emulator.model.DatasetReference;
import com.liferay.bigquery_emulator.model.DatasetTagsInner;
import com.liferay.bigquery_emulator.model.EncryptionConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dataset
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Dataset {

  @Valid
  private List<@Valid DatasetAccessInner> access = new ArrayList<>();

  private String creationTime;

  private DatasetReference datasetReference;

  private String defaultCollation;

  private EncryptionConfiguration defaultEncryptionConfiguration;

  private String defaultPartitionExpirationMs;

  private String defaultRoundingMode;

  private String defaultTableExpirationMs;

  private String description;

  private String etag;

  private String friendlyName;

  private String id;

  private Boolean isCaseInsensitive;

  private String kind = "bigquery#dataset";

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String lastModifiedTime;

  private String location;

  private String maxTimeTravelHours;

  private Boolean satisfiesPzs;

  private String selfLink;

  private String storageBillingModel;

  @Valid
  private List<@Valid DatasetTagsInner> tags = new ArrayList<>();

  public Dataset access(List<@Valid DatasetAccessInner> access) {
    this.access = access;
    return this;
  }

  public Dataset addAccessItem(DatasetAccessInner accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<>();
    }
    this.access.add(accessItem);
    return this;
  }

  /**
   * [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
   * @return access
   */
  @Valid 
  @Schema(name = "access", description = "[Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access")
  public List<@Valid DatasetAccessInner> getAccess() {
    return access;
  }

  public void setAccess(List<@Valid DatasetAccessInner> access) {
    this.access = access;
  }

  public Dataset creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * [Output-only] The time when this dataset was created, in milliseconds since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", description = "[Output-only] The time when this dataset was created, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Dataset datasetReference(DatasetReference datasetReference) {
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

  public Dataset defaultCollation(String defaultCollation) {
    this.defaultCollation = defaultCollation;
    return this;
  }

  /**
   * [Output-only] The default collation of the dataset.
   * @return defaultCollation
   */
  
  @Schema(name = "defaultCollation", description = "[Output-only] The default collation of the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultCollation")
  public String getDefaultCollation() {
    return defaultCollation;
  }

  public void setDefaultCollation(String defaultCollation) {
    this.defaultCollation = defaultCollation;
  }

  public Dataset defaultEncryptionConfiguration(EncryptionConfiguration defaultEncryptionConfiguration) {
    this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
    return this;
  }

  /**
   * Get defaultEncryptionConfiguration
   * @return defaultEncryptionConfiguration
   */
  @Valid 
  @Schema(name = "defaultEncryptionConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultEncryptionConfiguration")
  public EncryptionConfiguration getDefaultEncryptionConfiguration() {
    return defaultEncryptionConfiguration;
  }

  public void setDefaultEncryptionConfiguration(EncryptionConfiguration defaultEncryptionConfiguration) {
    this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
  }

  public Dataset defaultPartitionExpirationMs(String defaultPartitionExpirationMs) {
    this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
    return this;
  }

  /**
   * [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
   * @return defaultPartitionExpirationMs
   */
  
  @Schema(name = "defaultPartitionExpirationMs", description = "[Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultPartitionExpirationMs")
  public String getDefaultPartitionExpirationMs() {
    return defaultPartitionExpirationMs;
  }

  public void setDefaultPartitionExpirationMs(String defaultPartitionExpirationMs) {
    this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
  }

  public Dataset defaultRoundingMode(String defaultRoundingMode) {
    this.defaultRoundingMode = defaultRoundingMode;
    return this;
  }

  /**
   * [Output-only] The default rounding mode of the dataset.
   * @return defaultRoundingMode
   */
  
  @Schema(name = "defaultRoundingMode", description = "[Output-only] The default rounding mode of the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultRoundingMode")
  public String getDefaultRoundingMode() {
    return defaultRoundingMode;
  }

  public void setDefaultRoundingMode(String defaultRoundingMode) {
    this.defaultRoundingMode = defaultRoundingMode;
  }

  public Dataset defaultTableExpirationMs(String defaultTableExpirationMs) {
    this.defaultTableExpirationMs = defaultTableExpirationMs;
    return this;
  }

  /**
   * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
   * @return defaultTableExpirationMs
   */
  
  @Schema(name = "defaultTableExpirationMs", description = "[Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTableExpirationMs")
  public String getDefaultTableExpirationMs() {
    return defaultTableExpirationMs;
  }

  public void setDefaultTableExpirationMs(String defaultTableExpirationMs) {
    this.defaultTableExpirationMs = defaultTableExpirationMs;
  }

  public Dataset description(String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] A user-friendly description of the dataset.
   * @return description
   */
  
  @Schema(name = "description", description = "[Optional] A user-friendly description of the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dataset etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Output-only] A hash of the resource.
   * @return etag
   */
  
  @Schema(name = "etag", description = "[Output-only] A hash of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Dataset friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * [Optional] A descriptive name for the dataset.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "[Optional] A descriptive name for the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Dataset id(String id) {
    this.id = id;
    return this;
  }

  /**
   * [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.
   * @return id
   */
  
  @Schema(name = "id", description = "[Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dataset isCaseInsensitive(Boolean isCaseInsensitive) {
    this.isCaseInsensitive = isCaseInsensitive;
    return this;
  }

  /**
   * [Optional] Indicates if table names are case insensitive in the dataset.
   * @return isCaseInsensitive
   */
  
  @Schema(name = "isCaseInsensitive", description = "[Optional] Indicates if table names are case insensitive in the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCaseInsensitive")
  public Boolean getIsCaseInsensitive() {
    return isCaseInsensitive;
  }

  public void setIsCaseInsensitive(Boolean isCaseInsensitive) {
    this.isCaseInsensitive = isCaseInsensitive;
  }

  public Dataset kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] The resource type.
   * @return kind
   */
  
  @Schema(name = "kind", description = "[Output-only] The resource type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Dataset labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Dataset putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public Dataset lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
   * @return lastModifiedTime
   */
  
  @Schema(name = "lastModifiedTime", description = "[Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedTime")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Dataset location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
   * @return location
   */
  
  @Schema(name = "location", description = "The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Dataset maxTimeTravelHours(String maxTimeTravelHours) {
    this.maxTimeTravelHours = maxTimeTravelHours;
    return this;
  }

  /**
   * [Optional] Number of hours for the max time travel for all tables in the dataset.
   * @return maxTimeTravelHours
   */
  
  @Schema(name = "maxTimeTravelHours", description = "[Optional] Number of hours for the max time travel for all tables in the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTimeTravelHours")
  public String getMaxTimeTravelHours() {
    return maxTimeTravelHours;
  }

  public void setMaxTimeTravelHours(String maxTimeTravelHours) {
    this.maxTimeTravelHours = maxTimeTravelHours;
  }

  public Dataset satisfiesPzs(Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * [Output-only] Reserved for future use.
   * @return satisfiesPzs
   */
  
  @Schema(name = "satisfiesPzs", description = "[Output-only] Reserved for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("satisfiesPzs")
  public Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  public void setSatisfiesPzs(Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
  }

  public Dataset selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
   * @return selfLink
   */
  
  @Schema(name = "selfLink", description = "[Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selfLink")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public Dataset storageBillingModel(String storageBillingModel) {
    this.storageBillingModel = storageBillingModel;
    return this;
  }

  /**
   * [Optional] Storage billing model to be used for all tables in the dataset. Can be set to PHYSICAL. Default is LOGICAL.
   * @return storageBillingModel
   */
  
  @Schema(name = "storageBillingModel", description = "[Optional] Storage billing model to be used for all tables in the dataset. Can be set to PHYSICAL. Default is LOGICAL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storageBillingModel")
  public String getStorageBillingModel() {
    return storageBillingModel;
  }

  public void setStorageBillingModel(String storageBillingModel) {
    this.storageBillingModel = storageBillingModel;
  }

  public Dataset tags(List<@Valid DatasetTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public Dataset addTagsItem(DatasetTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * [Optional]The tags associated with this dataset. Tag keys are globally unique.
   * @return tags
   */
  @Valid 
  @Schema(name = "tags", description = "[Optional]The tags associated with this dataset. Tag keys are globally unique.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid DatasetTagsInner> getTags() {
    return tags;
  }

  public void setTags(List<@Valid DatasetTagsInner> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.access, dataset.access) &&
        Objects.equals(this.creationTime, dataset.creationTime) &&
        Objects.equals(this.datasetReference, dataset.datasetReference) &&
        Objects.equals(this.defaultCollation, dataset.defaultCollation) &&
        Objects.equals(this.defaultEncryptionConfiguration, dataset.defaultEncryptionConfiguration) &&
        Objects.equals(this.defaultPartitionExpirationMs, dataset.defaultPartitionExpirationMs) &&
        Objects.equals(this.defaultRoundingMode, dataset.defaultRoundingMode) &&
        Objects.equals(this.defaultTableExpirationMs, dataset.defaultTableExpirationMs) &&
        Objects.equals(this.description, dataset.description) &&
        Objects.equals(this.etag, dataset.etag) &&
        Objects.equals(this.friendlyName, dataset.friendlyName) &&
        Objects.equals(this.id, dataset.id) &&
        Objects.equals(this.isCaseInsensitive, dataset.isCaseInsensitive) &&
        Objects.equals(this.kind, dataset.kind) &&
        Objects.equals(this.labels, dataset.labels) &&
        Objects.equals(this.lastModifiedTime, dataset.lastModifiedTime) &&
        Objects.equals(this.location, dataset.location) &&
        Objects.equals(this.maxTimeTravelHours, dataset.maxTimeTravelHours) &&
        Objects.equals(this.satisfiesPzs, dataset.satisfiesPzs) &&
        Objects.equals(this.selfLink, dataset.selfLink) &&
        Objects.equals(this.storageBillingModel, dataset.storageBillingModel) &&
        Objects.equals(this.tags, dataset.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, creationTime, datasetReference, defaultCollation, defaultEncryptionConfiguration, defaultPartitionExpirationMs, defaultRoundingMode, defaultTableExpirationMs, description, etag, friendlyName, id, isCaseInsensitive, kind, labels, lastModifiedTime, location, maxTimeTravelHours, satisfiesPzs, selfLink, storageBillingModel, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    datasetReference: ").append(toIndentedString(datasetReference)).append("\n");
    sb.append("    defaultCollation: ").append(toIndentedString(defaultCollation)).append("\n");
    sb.append("    defaultEncryptionConfiguration: ").append(toIndentedString(defaultEncryptionConfiguration)).append("\n");
    sb.append("    defaultPartitionExpirationMs: ").append(toIndentedString(defaultPartitionExpirationMs)).append("\n");
    sb.append("    defaultRoundingMode: ").append(toIndentedString(defaultRoundingMode)).append("\n");
    sb.append("    defaultTableExpirationMs: ").append(toIndentedString(defaultTableExpirationMs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCaseInsensitive: ").append(toIndentedString(isCaseInsensitive)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    maxTimeTravelHours: ").append(toIndentedString(maxTimeTravelHours)).append("\n");
    sb.append("    satisfiesPzs: ").append(toIndentedString(satisfiesPzs)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    storageBillingModel: ").append(toIndentedString(storageBillingModel)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

