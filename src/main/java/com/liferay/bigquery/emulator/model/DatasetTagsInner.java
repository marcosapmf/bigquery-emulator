package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DatasetTagsInner
 */

@JsonTypeName("Dataset_tags_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DatasetTagsInner {

  private String tagKey;

  private String tagValue;

  public DatasetTagsInner tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * [Required] The namespaced friendly name of the tag key, e.g. \"12345/environment\" where 12345 is org id.
   * @return tagKey
   */
  
  @Schema(name = "tagKey", description = "[Required] The namespaced friendly name of the tag key, e.g. \"12345/environment\" where 12345 is org id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagKey")
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public DatasetTagsInner tagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  /**
   * [Required] Friendly short name of the tag value, e.g. \"production\".
   * @return tagValue
   */
  
  @Schema(name = "tagValue", description = "[Required] Friendly short name of the tag value, e.g. \"production\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagValue")
  public String getTagValue() {
    return tagValue;
  }

  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetTagsInner datasetTagsInner = (DatasetTagsInner) o;
    return Objects.equals(this.tagKey, datasetTagsInner.tagKey) &&
        Objects.equals(this.tagValue, datasetTagsInner.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey, tagValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetTagsInner {\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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

