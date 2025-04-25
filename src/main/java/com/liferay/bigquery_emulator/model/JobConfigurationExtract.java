package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.ModelReference;
import com.liferay.bigquery_emulator.model.TableReference;
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
 * JobConfigurationExtract
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobConfigurationExtract {

  private String compression;

  private String destinationFormat;

  private String destinationUri;

  @Valid
  private List<String> destinationUris = new ArrayList<>();

  private String fieldDelimiter;

  private Boolean printHeader = true;

  private ModelReference sourceModel;

  private TableReference sourceTable;

  private Boolean useAvroLogicalTypes;

  public JobConfigurationExtract compression(String compression) {
    this.compression = compression;
    return this;
  }

  /**
   * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
   * @return compression
   */
  
  @Schema(name = "compression", description = "[Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compression")
  public String getCompression() {
    return compression;
  }

  public void setCompression(String compression) {
    this.compression = compression;
  }

  public JobConfigurationExtract destinationFormat(String destinationFormat) {
    this.destinationFormat = destinationFormat;
    return this;
  }

  /**
   * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
   * @return destinationFormat
   */
  
  @Schema(name = "destinationFormat", description = "[Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationFormat")
  public String getDestinationFormat() {
    return destinationFormat;
  }

  public void setDestinationFormat(String destinationFormat) {
    this.destinationFormat = destinationFormat;
  }

  public JobConfigurationExtract destinationUri(String destinationUri) {
    this.destinationUri = destinationUri;
    return this;
  }

  /**
   * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
   * @return destinationUri
   */
  
  @Schema(name = "destinationUri", description = "[Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationUri")
  public String getDestinationUri() {
    return destinationUri;
  }

  public void setDestinationUri(String destinationUri) {
    this.destinationUri = destinationUri;
  }

  public JobConfigurationExtract destinationUris(List<String> destinationUris) {
    this.destinationUris = destinationUris;
    return this;
  }

  public JobConfigurationExtract addDestinationUrisItem(String destinationUrisItem) {
    if (this.destinationUris == null) {
      this.destinationUris = new ArrayList<>();
    }
    this.destinationUris.add(destinationUrisItem);
    return this;
  }

  /**
   * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
   * @return destinationUris
   */
  
  @Schema(name = "destinationUris", description = "[Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationUris")
  public List<String> getDestinationUris() {
    return destinationUris;
  }

  public void setDestinationUris(List<String> destinationUris) {
    this.destinationUris = destinationUris;
  }

  public JobConfigurationExtract fieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
    return this;
  }

  /**
   * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
   * @return fieldDelimiter
   */
  
  @Schema(name = "fieldDelimiter", description = "[Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldDelimiter")
  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  public void setFieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
  }

  public JobConfigurationExtract printHeader(Boolean printHeader) {
    this.printHeader = printHeader;
    return this;
  }

  /**
   * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
   * @return printHeader
   */
  
  @Schema(name = "printHeader", description = "[Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("printHeader")
  public Boolean getPrintHeader() {
    return printHeader;
  }

  public void setPrintHeader(Boolean printHeader) {
    this.printHeader = printHeader;
  }

  public JobConfigurationExtract sourceModel(ModelReference sourceModel) {
    this.sourceModel = sourceModel;
    return this;
  }

  /**
   * Get sourceModel
   * @return sourceModel
   */
  @Valid 
  @Schema(name = "sourceModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceModel")
  public ModelReference getSourceModel() {
    return sourceModel;
  }

  public void setSourceModel(ModelReference sourceModel) {
    this.sourceModel = sourceModel;
  }

  public JobConfigurationExtract sourceTable(TableReference sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  /**
   * Get sourceTable
   * @return sourceTable
   */
  @Valid 
  @Schema(name = "sourceTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceTable")
  public TableReference getSourceTable() {
    return sourceTable;
  }

  public void setSourceTable(TableReference sourceTable) {
    this.sourceTable = sourceTable;
  }

  public JobConfigurationExtract useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
    return this;
  }

  /**
   * [Optional] If destinationFormat is set to \"AVRO\", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
   * @return useAvroLogicalTypes
   */
  
  @Schema(name = "useAvroLogicalTypes", description = "[Optional] If destinationFormat is set to \"AVRO\", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useAvroLogicalTypes")
  public Boolean getUseAvroLogicalTypes() {
    return useAvroLogicalTypes;
  }

  public void setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfigurationExtract jobConfigurationExtract = (JobConfigurationExtract) o;
    return Objects.equals(this.compression, jobConfigurationExtract.compression) &&
        Objects.equals(this.destinationFormat, jobConfigurationExtract.destinationFormat) &&
        Objects.equals(this.destinationUri, jobConfigurationExtract.destinationUri) &&
        Objects.equals(this.destinationUris, jobConfigurationExtract.destinationUris) &&
        Objects.equals(this.fieldDelimiter, jobConfigurationExtract.fieldDelimiter) &&
        Objects.equals(this.printHeader, jobConfigurationExtract.printHeader) &&
        Objects.equals(this.sourceModel, jobConfigurationExtract.sourceModel) &&
        Objects.equals(this.sourceTable, jobConfigurationExtract.sourceTable) &&
        Objects.equals(this.useAvroLogicalTypes, jobConfigurationExtract.useAvroLogicalTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compression, destinationFormat, destinationUri, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfigurationExtract {\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    destinationFormat: ").append(toIndentedString(destinationFormat)).append("\n");
    sb.append("    destinationUri: ").append(toIndentedString(destinationUri)).append("\n");
    sb.append("    destinationUris: ").append(toIndentedString(destinationUris)).append("\n");
    sb.append("    fieldDelimiter: ").append(toIndentedString(fieldDelimiter)).append("\n");
    sb.append("    printHeader: ").append(toIndentedString(printHeader)).append("\n");
    sb.append("    sourceModel: ").append(toIndentedString(sourceModel)).append("\n");
    sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
    sb.append("    useAvroLogicalTypes: ").append(toIndentedString(useAvroLogicalTypes)).append("\n");
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

