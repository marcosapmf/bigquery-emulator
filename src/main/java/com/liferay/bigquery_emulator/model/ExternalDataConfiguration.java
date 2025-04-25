package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.AvroOptions;
import com.liferay.bigquery_emulator.model.BigtableOptions;
import com.liferay.bigquery_emulator.model.CsvOptions;
import com.liferay.bigquery_emulator.model.GoogleSheetsOptions;
import com.liferay.bigquery_emulator.model.HivePartitioningOptions;
import com.liferay.bigquery_emulator.model.ParquetOptions;
import com.liferay.bigquery_emulator.model.TableSchema;
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
 * ExternalDataConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ExternalDataConfiguration {

  private Boolean autodetect;

  private AvroOptions avroOptions;

  private BigtableOptions bigtableOptions;

  private String compression;

  private String connectionId;

  private CsvOptions csvOptions;

  @Valid
  private List<String> decimalTargetTypes = new ArrayList<>();

  private GoogleSheetsOptions googleSheetsOptions;

  private HivePartitioningOptions hivePartitioningOptions;

  private Boolean ignoreUnknownValues;

  private Integer maxBadRecords;

  private String metadataCacheMode;

  private String objectMetadata;

  private ParquetOptions parquetOptions;

  private String referenceFileSchemaUri;

  private TableSchema schema;

  private String sourceFormat;

  @Valid
  private List<String> sourceUris = new ArrayList<>();

  public ExternalDataConfiguration autodetect(Boolean autodetect) {
    this.autodetect = autodetect;
    return this;
  }

  /**
   * Try to detect schema and format options automatically. Any option specified explicitly will be honored.
   * @return autodetect
   */
  
  @Schema(name = "autodetect", description = "Try to detect schema and format options automatically. Any option specified explicitly will be honored.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autodetect")
  public Boolean getAutodetect() {
    return autodetect;
  }

  public void setAutodetect(Boolean autodetect) {
    this.autodetect = autodetect;
  }

  public ExternalDataConfiguration avroOptions(AvroOptions avroOptions) {
    this.avroOptions = avroOptions;
    return this;
  }

  /**
   * Get avroOptions
   * @return avroOptions
   */
  @Valid 
  @Schema(name = "avroOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avroOptions")
  public AvroOptions getAvroOptions() {
    return avroOptions;
  }

  public void setAvroOptions(AvroOptions avroOptions) {
    this.avroOptions = avroOptions;
  }

  public ExternalDataConfiguration bigtableOptions(BigtableOptions bigtableOptions) {
    this.bigtableOptions = bigtableOptions;
    return this;
  }

  /**
   * Get bigtableOptions
   * @return bigtableOptions
   */
  @Valid 
  @Schema(name = "bigtableOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigtableOptions")
  public BigtableOptions getBigtableOptions() {
    return bigtableOptions;
  }

  public void setBigtableOptions(BigtableOptions bigtableOptions) {
    this.bigtableOptions = bigtableOptions;
  }

  public ExternalDataConfiguration compression(String compression) {
    this.compression = compression;
    return this;
  }

  /**
   * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
   * @return compression
   */
  
  @Schema(name = "compression", description = "[Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compression")
  public String getCompression() {
    return compression;
  }

  public void setCompression(String compression) {
    this.compression = compression;
  }

  public ExternalDataConfiguration connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * [Optional, Trusted Tester] Connection for external data source.
   * @return connectionId
   */
  
  @Schema(name = "connectionId", description = "[Optional, Trusted Tester] Connection for external data source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionId")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public ExternalDataConfiguration csvOptions(CsvOptions csvOptions) {
    this.csvOptions = csvOptions;
    return this;
  }

  /**
   * Get csvOptions
   * @return csvOptions
   */
  @Valid 
  @Schema(name = "csvOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("csvOptions")
  public CsvOptions getCsvOptions() {
    return csvOptions;
  }

  public void setCsvOptions(CsvOptions csvOptions) {
    this.csvOptions = csvOptions;
  }

  public ExternalDataConfiguration decimalTargetTypes(List<String> decimalTargetTypes) {
    this.decimalTargetTypes = decimalTargetTypes;
    return this;
  }

  public ExternalDataConfiguration addDecimalTargetTypesItem(String decimalTargetTypesItem) {
    if (this.decimalTargetTypes == null) {
      this.decimalTargetTypes = new ArrayList<>();
    }
    this.decimalTargetTypes.add(decimalTargetTypesItem);
    return this;
  }

  /**
   * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is [\"NUMERIC\", \"BIGNUMERIC\"]. If (precision,scale) is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38) -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, [\"BIGNUMERIC\", \"NUMERIC\"] is the same as [\"NUMERIC\", \"BIGNUMERIC\"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to [\"NUMERIC\", \"STRING\"] for ORC and [\"NUMERIC\"] for the other file formats.
   * @return decimalTargetTypes
   */
  
  @Schema(name = "decimalTargetTypes", description = "[Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is [\"NUMERIC\", \"BIGNUMERIC\"]. If (precision,scale) is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38) -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, [\"BIGNUMERIC\", \"NUMERIC\"] is the same as [\"NUMERIC\", \"BIGNUMERIC\"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to [\"NUMERIC\", \"STRING\"] for ORC and [\"NUMERIC\"] for the other file formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decimalTargetTypes")
  public List<String> getDecimalTargetTypes() {
    return decimalTargetTypes;
  }

  public void setDecimalTargetTypes(List<String> decimalTargetTypes) {
    this.decimalTargetTypes = decimalTargetTypes;
  }

  public ExternalDataConfiguration googleSheetsOptions(GoogleSheetsOptions googleSheetsOptions) {
    this.googleSheetsOptions = googleSheetsOptions;
    return this;
  }

  /**
   * Get googleSheetsOptions
   * @return googleSheetsOptions
   */
  @Valid 
  @Schema(name = "googleSheetsOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleSheetsOptions")
  public GoogleSheetsOptions getGoogleSheetsOptions() {
    return googleSheetsOptions;
  }

  public void setGoogleSheetsOptions(GoogleSheetsOptions googleSheetsOptions) {
    this.googleSheetsOptions = googleSheetsOptions;
  }

  public ExternalDataConfiguration hivePartitioningOptions(HivePartitioningOptions hivePartitioningOptions) {
    this.hivePartitioningOptions = hivePartitioningOptions;
    return this;
  }

  /**
   * Get hivePartitioningOptions
   * @return hivePartitioningOptions
   */
  @Valid 
  @Schema(name = "hivePartitioningOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hivePartitioningOptions")
  public HivePartitioningOptions getHivePartitioningOptions() {
    return hivePartitioningOptions;
  }

  public void setHivePartitioningOptions(HivePartitioningOptions hivePartitioningOptions) {
    this.hivePartitioningOptions = hivePartitioningOptions;
  }

  public ExternalDataConfiguration ignoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
    return this;
  }

  /**
   * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.
   * @return ignoreUnknownValues
   */
  
  @Schema(name = "ignoreUnknownValues", description = "[Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoreUnknownValues")
  public Boolean getIgnoreUnknownValues() {
    return ignoreUnknownValues;
  }

  public void setIgnoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
  }

  public ExternalDataConfiguration maxBadRecords(Integer maxBadRecords) {
    this.maxBadRecords = maxBadRecords;
    return this;
  }

  /**
   * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
   * @return maxBadRecords
   */
  
  @Schema(name = "maxBadRecords", description = "[Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV, JSON, and Google Sheets. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxBadRecords")
  public Integer getMaxBadRecords() {
    return maxBadRecords;
  }

  public void setMaxBadRecords(Integer maxBadRecords) {
    this.maxBadRecords = maxBadRecords;
  }

  public ExternalDataConfiguration metadataCacheMode(String metadataCacheMode) {
    this.metadataCacheMode = metadataCacheMode;
    return this;
  }

  /**
   * [Optional] Metadata Cache Mode for the table. Set this to enable caching of metadata from external data source.
   * @return metadataCacheMode
   */
  
  @Schema(name = "metadataCacheMode", description = "[Optional] Metadata Cache Mode for the table. Set this to enable caching of metadata from external data source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadataCacheMode")
  public String getMetadataCacheMode() {
    return metadataCacheMode;
  }

  public void setMetadataCacheMode(String metadataCacheMode) {
    this.metadataCacheMode = metadataCacheMode;
  }

  public ExternalDataConfiguration objectMetadata(String objectMetadata) {
    this.objectMetadata = objectMetadata;
    return this;
  }

  /**
   * ObjectMetadata is used to create Object Tables. Object Tables contain a listing of objects (with their metadata) found at the source_uris. If ObjectMetadata is set, source_format should be omitted. Currently SIMPLE is the only supported Object Metadata type.
   * @return objectMetadata
   */
  
  @Schema(name = "objectMetadata", description = "ObjectMetadata is used to create Object Tables. Object Tables contain a listing of objects (with their metadata) found at the source_uris. If ObjectMetadata is set, source_format should be omitted. Currently SIMPLE is the only supported Object Metadata type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectMetadata")
  public String getObjectMetadata() {
    return objectMetadata;
  }

  public void setObjectMetadata(String objectMetadata) {
    this.objectMetadata = objectMetadata;
  }

  public ExternalDataConfiguration parquetOptions(ParquetOptions parquetOptions) {
    this.parquetOptions = parquetOptions;
    return this;
  }

  /**
   * Get parquetOptions
   * @return parquetOptions
   */
  @Valid 
  @Schema(name = "parquetOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parquetOptions")
  public ParquetOptions getParquetOptions() {
    return parquetOptions;
  }

  public void setParquetOptions(ParquetOptions parquetOptions) {
    this.parquetOptions = parquetOptions;
  }

  public ExternalDataConfiguration referenceFileSchemaUri(String referenceFileSchemaUri) {
    this.referenceFileSchemaUri = referenceFileSchemaUri;
    return this;
  }

  /**
   * [Optional] Provide a referencing file with the expected table schema. Enabled for the format: AVRO, PARQUET, ORC.
   * @return referenceFileSchemaUri
   */
  
  @Schema(name = "referenceFileSchemaUri", description = "[Optional] Provide a referencing file with the expected table schema. Enabled for the format: AVRO, PARQUET, ORC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceFileSchemaUri")
  public String getReferenceFileSchemaUri() {
    return referenceFileSchemaUri;
  }

  public void setReferenceFileSchemaUri(String referenceFileSchemaUri) {
    this.referenceFileSchemaUri = referenceFileSchemaUri;
  }

  public ExternalDataConfiguration schema(TableSchema schema) {
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

  public ExternalDataConfiguration sourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

  /**
   * [Required] The data format. For CSV files, specify \"CSV\". For Google sheets, specify \"GOOGLE_SHEETS\". For newline-delimited JSON, specify \"NEWLINE_DELIMITED_JSON\". For Avro files, specify \"AVRO\". For Google Cloud Datastore backups, specify \"DATASTORE_BACKUP\". [Beta] For Google Cloud Bigtable, specify \"BIGTABLE\".
   * @return sourceFormat
   */
  
  @Schema(name = "sourceFormat", description = "[Required] The data format. For CSV files, specify \"CSV\". For Google sheets, specify \"GOOGLE_SHEETS\". For newline-delimited JSON, specify \"NEWLINE_DELIMITED_JSON\". For Avro files, specify \"AVRO\". For Google Cloud Datastore backups, specify \"DATASTORE_BACKUP\". [Beta] For Google Cloud Bigtable, specify \"BIGTABLE\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceFormat")
  public String getSourceFormat() {
    return sourceFormat;
  }

  public void setSourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
  }

  public ExternalDataConfiguration sourceUris(List<String> sourceUris) {
    this.sourceUris = sourceUris;
    return this;
  }

  public ExternalDataConfiguration addSourceUrisItem(String sourceUrisItem) {
    if (this.sourceUris == null) {
      this.sourceUris = new ArrayList<>();
    }
    this.sourceUris.add(sourceUrisItem);
    return this;
  }

  /**
   * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
   * @return sourceUris
   */
  
  @Schema(name = "sourceUris", description = "[Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the '*' wildcard character is not allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceUris")
  public List<String> getSourceUris() {
    return sourceUris;
  }

  public void setSourceUris(List<String> sourceUris) {
    this.sourceUris = sourceUris;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataConfiguration externalDataConfiguration = (ExternalDataConfiguration) o;
    return Objects.equals(this.autodetect, externalDataConfiguration.autodetect) &&
        Objects.equals(this.avroOptions, externalDataConfiguration.avroOptions) &&
        Objects.equals(this.bigtableOptions, externalDataConfiguration.bigtableOptions) &&
        Objects.equals(this.compression, externalDataConfiguration.compression) &&
        Objects.equals(this.connectionId, externalDataConfiguration.connectionId) &&
        Objects.equals(this.csvOptions, externalDataConfiguration.csvOptions) &&
        Objects.equals(this.decimalTargetTypes, externalDataConfiguration.decimalTargetTypes) &&
        Objects.equals(this.googleSheetsOptions, externalDataConfiguration.googleSheetsOptions) &&
        Objects.equals(this.hivePartitioningOptions, externalDataConfiguration.hivePartitioningOptions) &&
        Objects.equals(this.ignoreUnknownValues, externalDataConfiguration.ignoreUnknownValues) &&
        Objects.equals(this.maxBadRecords, externalDataConfiguration.maxBadRecords) &&
        Objects.equals(this.metadataCacheMode, externalDataConfiguration.metadataCacheMode) &&
        Objects.equals(this.objectMetadata, externalDataConfiguration.objectMetadata) &&
        Objects.equals(this.parquetOptions, externalDataConfiguration.parquetOptions) &&
        Objects.equals(this.referenceFileSchemaUri, externalDataConfiguration.referenceFileSchemaUri) &&
        Objects.equals(this.schema, externalDataConfiguration.schema) &&
        Objects.equals(this.sourceFormat, externalDataConfiguration.sourceFormat) &&
        Objects.equals(this.sourceUris, externalDataConfiguration.sourceUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autodetect, avroOptions, bigtableOptions, compression, connectionId, csvOptions, decimalTargetTypes, googleSheetsOptions, hivePartitioningOptions, ignoreUnknownValues, maxBadRecords, metadataCacheMode, objectMetadata, parquetOptions, referenceFileSchemaUri, schema, sourceFormat, sourceUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataConfiguration {\n");
    sb.append("    autodetect: ").append(toIndentedString(autodetect)).append("\n");
    sb.append("    avroOptions: ").append(toIndentedString(avroOptions)).append("\n");
    sb.append("    bigtableOptions: ").append(toIndentedString(bigtableOptions)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    csvOptions: ").append(toIndentedString(csvOptions)).append("\n");
    sb.append("    decimalTargetTypes: ").append(toIndentedString(decimalTargetTypes)).append("\n");
    sb.append("    googleSheetsOptions: ").append(toIndentedString(googleSheetsOptions)).append("\n");
    sb.append("    hivePartitioningOptions: ").append(toIndentedString(hivePartitioningOptions)).append("\n");
    sb.append("    ignoreUnknownValues: ").append(toIndentedString(ignoreUnknownValues)).append("\n");
    sb.append("    maxBadRecords: ").append(toIndentedString(maxBadRecords)).append("\n");
    sb.append("    metadataCacheMode: ").append(toIndentedString(metadataCacheMode)).append("\n");
    sb.append("    objectMetadata: ").append(toIndentedString(objectMetadata)).append("\n");
    sb.append("    parquetOptions: ").append(toIndentedString(parquetOptions)).append("\n");
    sb.append("    referenceFileSchemaUri: ").append(toIndentedString(referenceFileSchemaUri)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
    sb.append("    sourceUris: ").append(toIndentedString(sourceUris)).append("\n");
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

