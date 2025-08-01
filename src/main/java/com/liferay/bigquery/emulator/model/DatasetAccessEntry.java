package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.DatasetReference;

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
 * DatasetAccessEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DatasetAccessEntry {

  private DatasetReference dataset;

  /**
   * Gets or Sets targetTypes
   */
  public enum TargetTypesEnum {
    TARGET_TYPE_UNSPECIFIED("TARGET_TYPE_UNSPECIFIED"),
    
    VIEWS("VIEWS"),
    
    ROUTINES("ROUTINES");

    private String value;

    TargetTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TargetTypesEnum fromValue(String value) {
      for (TargetTypesEnum b : TargetTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<TargetTypesEnum> targetTypes = new ArrayList<>();

  public DatasetAccessEntry dataset(DatasetReference dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Get dataset
   * @return dataset
   */
  @Valid 
  @Schema(name = "dataset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataset")
  public DatasetReference getDataset() {
    return dataset;
  }

  public void setDataset(DatasetReference dataset) {
    this.dataset = dataset;
  }

  public DatasetAccessEntry targetTypes(List<TargetTypesEnum> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  public DatasetAccessEntry addTargetTypesItem(TargetTypesEnum targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
   */
  
  @Schema(name = "targetTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetTypes")
  public List<TargetTypesEnum> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(List<TargetTypesEnum> targetTypes) {
    this.targetTypes = targetTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetAccessEntry datasetAccessEntry = (DatasetAccessEntry) o;
    return Objects.equals(this.dataset, datasetAccessEntry.dataset) &&
        Objects.equals(this.targetTypes, datasetAccessEntry.targetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, targetTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetAccessEntry {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
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

