package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.Clustering;
import com.liferay.bigquery.emulator.model.ConnectionProperty;
import com.liferay.bigquery.emulator.model.DestinationTableProperties;
import com.liferay.bigquery.emulator.model.EncryptionConfiguration;
import com.liferay.bigquery.emulator.model.HivePartitioningOptions;
import com.liferay.bigquery.emulator.model.ParquetOptions;
import com.liferay.bigquery.emulator.model.RangePartitioning;
import com.liferay.bigquery.emulator.model.TableReference;
import com.liferay.bigquery.emulator.model.TableSchema;
import com.liferay.bigquery.emulator.model.TimePartitioning;
import com.fasterxml.jackson.annotation.JsonCreator;

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
 * JobConfigurationLoad
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobConfigurationLoad {

  private Boolean allowJaggedRows;

  private Boolean allowQuotedNewlines;

  private Boolean autodetect;

  private Clustering clustering;

  @Valid
  private List<@Valid ConnectionProperty> connectionProperties = new ArrayList<>();

  private String createDisposition;

  private Boolean createSession;

  @Valid
  private List<String> decimalTargetTypes = new ArrayList<>();

  private EncryptionConfiguration destinationEncryptionConfiguration;

  private TableReference destinationTable;

  private DestinationTableProperties destinationTableProperties;

  private String encoding;

  private String fieldDelimiter;

  private HivePartitioningOptions hivePartitioningOptions;

  private Boolean ignoreUnknownValues;

  private String jsonExtension;

  private Integer maxBadRecords;

  private String nullMarker;

  private ParquetOptions parquetOptions;

  private Boolean preserveAsciiControlCharacters;

  @Valid
  private List<String> projectionFields = new ArrayList<>();

  private String quote = "\"";

  private RangePartitioning rangePartitioning;

  private String referenceFileSchemaUri;

  private TableSchema schema;

  private String schemaInline;

  private String schemaInlineFormat;

  @Valid
  private List<String> schemaUpdateOptions = new ArrayList<>();

  private Integer skipLeadingRows;

  private String sourceFormat;

  @Valid
  private List<String> sourceUris = new ArrayList<>();

  private TimePartitioning timePartitioning;

  private Boolean useAvroLogicalTypes;

  private String writeDisposition;

  public JobConfigurationLoad allowJaggedRows(Boolean allowJaggedRows) {
    this.allowJaggedRows = allowJaggedRows;
    return this;
  }

  /**
   * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
   * @return allowJaggedRows
   */
  
  @Schema(name = "allowJaggedRows", description = "[Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowJaggedRows")
  public Boolean getAllowJaggedRows() {
    return allowJaggedRows;
  }

  public void setAllowJaggedRows(Boolean allowJaggedRows) {
    this.allowJaggedRows = allowJaggedRows;
  }

  public JobConfigurationLoad allowQuotedNewlines(Boolean allowQuotedNewlines) {
    this.allowQuotedNewlines = allowQuotedNewlines;
    return this;
  }

  /**
   * Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
   * @return allowQuotedNewlines
   */
  
  @Schema(name = "allowQuotedNewlines", description = "Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowQuotedNewlines")
  public Boolean getAllowQuotedNewlines() {
    return allowQuotedNewlines;
  }

  public void setAllowQuotedNewlines(Boolean allowQuotedNewlines) {
    this.allowQuotedNewlines = allowQuotedNewlines;
  }

  public JobConfigurationLoad autodetect(Boolean autodetect) {
    this.autodetect = autodetect;
    return this;
  }

  /**
   * [Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources.
   * @return autodetect
   */
  
  @Schema(name = "autodetect", description = "[Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autodetect")
  public Boolean getAutodetect() {
    return autodetect;
  }

  public void setAutodetect(Boolean autodetect) {
    this.autodetect = autodetect;
  }

  public JobConfigurationLoad clustering(Clustering clustering) {
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

  public JobConfigurationLoad connectionProperties(List<@Valid ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  public JobConfigurationLoad addConnectionPropertiesItem(ConnectionProperty connectionPropertiesItem) {
    if (this.connectionProperties == null) {
      this.connectionProperties = new ArrayList<>();
    }
    this.connectionProperties.add(connectionPropertiesItem);
    return this;
  }

  /**
   * Connection properties.
   * @return connectionProperties
   */
  @Valid 
  @Schema(name = "connectionProperties", description = "Connection properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionProperties")
  public List<@Valid ConnectionProperty> getConnectionProperties() {
    return connectionProperties;
  }

  public void setConnectionProperties(List<@Valid ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public JobConfigurationLoad createDisposition(String createDisposition) {
    this.createDisposition = createDisposition;
    return this;
  }

  /**
   * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
   * @return createDisposition
   */
  
  @Schema(name = "createDisposition", description = "[Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDisposition")
  public String getCreateDisposition() {
    return createDisposition;
  }

  public void setCreateDisposition(String createDisposition) {
    this.createDisposition = createDisposition;
  }

  public JobConfigurationLoad createSession(Boolean createSession) {
    this.createSession = createSession;
    return this;
  }

  /**
   * If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs the load job in non-session mode.
   * @return createSession
   */
  
  @Schema(name = "createSession", description = "If true, creates a new session, where session id will be a server generated random id. If false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs the load job in non-session mode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createSession")
  public Boolean getCreateSession() {
    return createSession;
  }

  public void setCreateSession(Boolean createSession) {
    this.createSession = createSession;
  }

  public JobConfigurationLoad decimalTargetTypes(List<String> decimalTargetTypes) {
    this.decimalTargetTypes = decimalTargetTypes;
    return this;
  }

  public JobConfigurationLoad addDecimalTargetTypesItem(String decimalTargetTypesItem) {
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

  public JobConfigurationLoad destinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
    return this;
  }

  /**
   * Get destinationEncryptionConfiguration
   * @return destinationEncryptionConfiguration
   */
  @Valid 
  @Schema(name = "destinationEncryptionConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationEncryptionConfiguration")
  public EncryptionConfiguration getDestinationEncryptionConfiguration() {
    return destinationEncryptionConfiguration;
  }

  public void setDestinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
  }

  public JobConfigurationLoad destinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  /**
   * Get destinationTable
   * @return destinationTable
   */
  @Valid 
  @Schema(name = "destinationTable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationTable")
  public TableReference getDestinationTable() {
    return destinationTable;
  }

  public void setDestinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
  }

  public JobConfigurationLoad destinationTableProperties(DestinationTableProperties destinationTableProperties) {
    this.destinationTableProperties = destinationTableProperties;
    return this;
  }

  /**
   * Get destinationTableProperties
   * @return destinationTableProperties
   */
  @Valid 
  @Schema(name = "destinationTableProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationTableProperties")
  public DestinationTableProperties getDestinationTableProperties() {
    return destinationTableProperties;
  }

  public void setDestinationTableProperties(DestinationTableProperties destinationTableProperties) {
    this.destinationTableProperties = destinationTableProperties;
  }

  public JobConfigurationLoad encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
   * @return encoding
   */
  
  @Schema(name = "encoding", description = "[Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public JobConfigurationLoad fieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
    return this;
  }

  /**
   * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence \"\\t\" to specify a tab separator. The default value is a comma (',').
   * @return fieldDelimiter
   */
  
  @Schema(name = "fieldDelimiter", description = "[Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence \"\\t\" to specify a tab separator. The default value is a comma (',').", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldDelimiter")
  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  public void setFieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
  }

  public JobConfigurationLoad hivePartitioningOptions(HivePartitioningOptions hivePartitioningOptions) {
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

  public JobConfigurationLoad ignoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
    return this;
  }

  /**
   * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
   * @return ignoreUnknownValues
   */
  
  @Schema(name = "ignoreUnknownValues", description = "[Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignoreUnknownValues")
  public Boolean getIgnoreUnknownValues() {
    return ignoreUnknownValues;
  }

  public void setIgnoreUnknownValues(Boolean ignoreUnknownValues) {
    this.ignoreUnknownValues = ignoreUnknownValues;
  }

  public JobConfigurationLoad jsonExtension(String jsonExtension) {
    this.jsonExtension = jsonExtension;
    return this;
  }

  /**
   * [Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.
   * @return jsonExtension
   */
  
  @Schema(name = "jsonExtension", description = "[Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonExtension")
  public String getJsonExtension() {
    return jsonExtension;
  }

  public void setJsonExtension(String jsonExtension) {
    this.jsonExtension = jsonExtension;
  }

  public JobConfigurationLoad maxBadRecords(Integer maxBadRecords) {
    this.maxBadRecords = maxBadRecords;
    return this;
  }

  /**
   * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.
   * @return maxBadRecords
   */
  
  @Schema(name = "maxBadRecords", description = "[Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxBadRecords")
  public Integer getMaxBadRecords() {
    return maxBadRecords;
  }

  public void setMaxBadRecords(Integer maxBadRecords) {
    this.maxBadRecords = maxBadRecords;
  }

  public JobConfigurationLoad nullMarker(String nullMarker) {
    this.nullMarker = nullMarker;
    return this;
  }

  /**
   * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify \"\\N\", BigQuery interprets \"\\N\" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
   * @return nullMarker
   */
  
  @Schema(name = "nullMarker", description = "[Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify \"\\N\", BigQuery interprets \"\\N\" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nullMarker")
  public String getNullMarker() {
    return nullMarker;
  }

  public void setNullMarker(String nullMarker) {
    this.nullMarker = nullMarker;
  }

  public JobConfigurationLoad parquetOptions(ParquetOptions parquetOptions) {
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

  public JobConfigurationLoad preserveAsciiControlCharacters(Boolean preserveAsciiControlCharacters) {
    this.preserveAsciiControlCharacters = preserveAsciiControlCharacters;
    return this;
  }

  /**
   * [Optional] Preserves the embedded ASCII control characters (the first 32 characters in the ASCII-table, from '\\x00' to '\\x1F') when loading from CSV. Only applicable to CSV, ignored for other formats.
   * @return preserveAsciiControlCharacters
   */
  
  @Schema(name = "preserveAsciiControlCharacters", description = "[Optional] Preserves the embedded ASCII control characters (the first 32 characters in the ASCII-table, from '\\x00' to '\\x1F') when loading from CSV. Only applicable to CSV, ignored for other formats.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserveAsciiControlCharacters")
  public Boolean getPreserveAsciiControlCharacters() {
    return preserveAsciiControlCharacters;
  }

  public void setPreserveAsciiControlCharacters(Boolean preserveAsciiControlCharacters) {
    this.preserveAsciiControlCharacters = preserveAsciiControlCharacters;
  }

  public JobConfigurationLoad projectionFields(List<String> projectionFields) {
    this.projectionFields = projectionFields;
    return this;
  }

  public JobConfigurationLoad addProjectionFieldsItem(String projectionFieldsItem) {
    if (this.projectionFields == null) {
      this.projectionFields = new ArrayList<>();
    }
    this.projectionFields.add(projectionFieldsItem);
    return this;
  }

  /**
   * If sourceFormat is set to \"DATASTORE_BACKUP\", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.
   * @return projectionFields
   */
  
  @Schema(name = "projectionFields", description = "If sourceFormat is set to \"DATASTORE_BACKUP\", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectionFields")
  public List<String> getProjectionFields() {
    return projectionFields;
  }

  public void setProjectionFields(List<String> projectionFields) {
    this.projectionFields = projectionFields;
  }

  public JobConfigurationLoad quote(String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('\"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
   * @return quote
   */
  @Pattern(regexp = ".?") 
  @Schema(name = "quote", description = "[Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('\"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quote")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public JobConfigurationLoad rangePartitioning(RangePartitioning rangePartitioning) {
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

  public JobConfigurationLoad referenceFileSchemaUri(String referenceFileSchemaUri) {
    this.referenceFileSchemaUri = referenceFileSchemaUri;
    return this;
  }

  /**
   * User provided referencing file with the expected reader schema, Available for the format: AVRO, PARQUET, ORC.
   * @return referenceFileSchemaUri
   */
  
  @Schema(name = "referenceFileSchemaUri", description = "User provided referencing file with the expected reader schema, Available for the format: AVRO, PARQUET, ORC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceFileSchemaUri")
  public String getReferenceFileSchemaUri() {
    return referenceFileSchemaUri;
  }

  public void setReferenceFileSchemaUri(String referenceFileSchemaUri) {
    this.referenceFileSchemaUri = referenceFileSchemaUri;
  }

  public JobConfigurationLoad schema(TableSchema schema) {
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

  public JobConfigurationLoad schemaInline(String schemaInline) {
    this.schemaInline = schemaInline;
    return this;
  }

  /**
   * [Deprecated] The inline schema. For CSV schemas, specify as \"Field1:Type1[,Field2:Type2]*\". For example, \"foo:STRING, bar:INTEGER, baz:FLOAT\".
   * @return schemaInline
   */
  
  @Schema(name = "schemaInline", description = "[Deprecated] The inline schema. For CSV schemas, specify as \"Field1:Type1[,Field2:Type2]*\". For example, \"foo:STRING, bar:INTEGER, baz:FLOAT\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaInline")
  public String getSchemaInline() {
    return schemaInline;
  }

  public void setSchemaInline(String schemaInline) {
    this.schemaInline = schemaInline;
  }

  public JobConfigurationLoad schemaInlineFormat(String schemaInlineFormat) {
    this.schemaInlineFormat = schemaInlineFormat;
    return this;
  }

  /**
   * [Deprecated] The format of the schemaInline property.
   * @return schemaInlineFormat
   */
  
  @Schema(name = "schemaInlineFormat", description = "[Deprecated] The format of the schemaInline property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaInlineFormat")
  public String getSchemaInlineFormat() {
    return schemaInlineFormat;
  }

  public void setSchemaInlineFormat(String schemaInlineFormat) {
    this.schemaInlineFormat = schemaInlineFormat;
  }

  public JobConfigurationLoad schemaUpdateOptions(List<String> schemaUpdateOptions) {
    this.schemaUpdateOptions = schemaUpdateOptions;
    return this;
  }

  public JobConfigurationLoad addSchemaUpdateOptionsItem(String schemaUpdateOptionsItem) {
    if (this.schemaUpdateOptions == null) {
      this.schemaUpdateOptions = new ArrayList<>();
    }
    this.schemaUpdateOptions.add(schemaUpdateOptionsItem);
    return this;
  }

  /**
   * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
   * @return schemaUpdateOptions
   */
  
  @Schema(name = "schemaUpdateOptions", description = "Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaUpdateOptions")
  public List<String> getSchemaUpdateOptions() {
    return schemaUpdateOptions;
  }

  public void setSchemaUpdateOptions(List<String> schemaUpdateOptions) {
    this.schemaUpdateOptions = schemaUpdateOptions;
  }

  public JobConfigurationLoad skipLeadingRows(Integer skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
    return this;
  }

  /**
   * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
   * @return skipLeadingRows
   */
  
  @Schema(name = "skipLeadingRows", description = "[Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipLeadingRows")
  public Integer getSkipLeadingRows() {
    return skipLeadingRows;
  }

  public void setSkipLeadingRows(Integer skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
  }

  public JobConfigurationLoad sourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

  /**
   * [Optional] The format of the data files. For CSV files, specify \"CSV\". For datastore backups, specify \"DATASTORE_BACKUP\". For newline-delimited JSON, specify \"NEWLINE_DELIMITED_JSON\". For Avro, specify \"AVRO\". For parquet, specify \"PARQUET\". For orc, specify \"ORC\". The default value is CSV.
   * @return sourceFormat
   */
  
  @Schema(name = "sourceFormat", description = "[Optional] The format of the data files. For CSV files, specify \"CSV\". For datastore backups, specify \"DATASTORE_BACKUP\". For newline-delimited JSON, specify \"NEWLINE_DELIMITED_JSON\". For Avro, specify \"AVRO\". For parquet, specify \"PARQUET\". For orc, specify \"ORC\". The default value is CSV.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceFormat")
  public String getSourceFormat() {
    return sourceFormat;
  }

  public void setSourceFormat(String sourceFormat) {
    this.sourceFormat = sourceFormat;
  }

  public JobConfigurationLoad sourceUris(List<String> sourceUris) {
    this.sourceUris = sourceUris;
    return this;
  }

  public JobConfigurationLoad addSourceUrisItem(String sourceUrisItem) {
    if (this.sourceUris == null) {
      this.sourceUris = new ArrayList<>();
    }
    this.sourceUris.add(sourceUrisItem);
    return this;
  }

  /**
   * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
   * @return sourceUris
   */
  
  @Schema(name = "sourceUris", description = "[Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceUris")
  public List<String> getSourceUris() {
    return sourceUris;
  }

  public void setSourceUris(List<String> sourceUris) {
    this.sourceUris = sourceUris;
  }

  public JobConfigurationLoad timePartitioning(TimePartitioning timePartitioning) {
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

  public JobConfigurationLoad useAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
    return this;
  }

  /**
   * [Optional] If sourceFormat is set to \"AVRO\", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
   * @return useAvroLogicalTypes
   */
  
  @Schema(name = "useAvroLogicalTypes", description = "[Optional] If sourceFormat is set to \"AVRO\", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useAvroLogicalTypes")
  public Boolean getUseAvroLogicalTypes() {
    return useAvroLogicalTypes;
  }

  public void setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
    this.useAvroLogicalTypes = useAvroLogicalTypes;
  }

  public JobConfigurationLoad writeDisposition(String writeDisposition) {
    this.writeDisposition = writeDisposition;
    return this;
  }

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
   * @return writeDisposition
   */
  
  @Schema(name = "writeDisposition", description = "[Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeDisposition")
  public String getWriteDisposition() {
    return writeDisposition;
  }

  public void setWriteDisposition(String writeDisposition) {
    this.writeDisposition = writeDisposition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfigurationLoad jobConfigurationLoad = (JobConfigurationLoad) o;
    return Objects.equals(this.allowJaggedRows, jobConfigurationLoad.allowJaggedRows) &&
        Objects.equals(this.allowQuotedNewlines, jobConfigurationLoad.allowQuotedNewlines) &&
        Objects.equals(this.autodetect, jobConfigurationLoad.autodetect) &&
        Objects.equals(this.clustering, jobConfigurationLoad.clustering) &&
        Objects.equals(this.connectionProperties, jobConfigurationLoad.connectionProperties) &&
        Objects.equals(this.createDisposition, jobConfigurationLoad.createDisposition) &&
        Objects.equals(this.createSession, jobConfigurationLoad.createSession) &&
        Objects.equals(this.decimalTargetTypes, jobConfigurationLoad.decimalTargetTypes) &&
        Objects.equals(this.destinationEncryptionConfiguration, jobConfigurationLoad.destinationEncryptionConfiguration) &&
        Objects.equals(this.destinationTable, jobConfigurationLoad.destinationTable) &&
        Objects.equals(this.destinationTableProperties, jobConfigurationLoad.destinationTableProperties) &&
        Objects.equals(this.encoding, jobConfigurationLoad.encoding) &&
        Objects.equals(this.fieldDelimiter, jobConfigurationLoad.fieldDelimiter) &&
        Objects.equals(this.hivePartitioningOptions, jobConfigurationLoad.hivePartitioningOptions) &&
        Objects.equals(this.ignoreUnknownValues, jobConfigurationLoad.ignoreUnknownValues) &&
        Objects.equals(this.jsonExtension, jobConfigurationLoad.jsonExtension) &&
        Objects.equals(this.maxBadRecords, jobConfigurationLoad.maxBadRecords) &&
        Objects.equals(this.nullMarker, jobConfigurationLoad.nullMarker) &&
        Objects.equals(this.parquetOptions, jobConfigurationLoad.parquetOptions) &&
        Objects.equals(this.preserveAsciiControlCharacters, jobConfigurationLoad.preserveAsciiControlCharacters) &&
        Objects.equals(this.projectionFields, jobConfigurationLoad.projectionFields) &&
        Objects.equals(this.quote, jobConfigurationLoad.quote) &&
        Objects.equals(this.rangePartitioning, jobConfigurationLoad.rangePartitioning) &&
        Objects.equals(this.referenceFileSchemaUri, jobConfigurationLoad.referenceFileSchemaUri) &&
        Objects.equals(this.schema, jobConfigurationLoad.schema) &&
        Objects.equals(this.schemaInline, jobConfigurationLoad.schemaInline) &&
        Objects.equals(this.schemaInlineFormat, jobConfigurationLoad.schemaInlineFormat) &&
        Objects.equals(this.schemaUpdateOptions, jobConfigurationLoad.schemaUpdateOptions) &&
        Objects.equals(this.skipLeadingRows, jobConfigurationLoad.skipLeadingRows) &&
        Objects.equals(this.sourceFormat, jobConfigurationLoad.sourceFormat) &&
        Objects.equals(this.sourceUris, jobConfigurationLoad.sourceUris) &&
        Objects.equals(this.timePartitioning, jobConfigurationLoad.timePartitioning) &&
        Objects.equals(this.useAvroLogicalTypes, jobConfigurationLoad.useAvroLogicalTypes) &&
        Objects.equals(this.writeDisposition, jobConfigurationLoad.writeDisposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowJaggedRows, allowQuotedNewlines, autodetect, clustering, connectionProperties, createDisposition, createSession, decimalTargetTypes, destinationEncryptionConfiguration, destinationTable, destinationTableProperties, encoding, fieldDelimiter, hivePartitioningOptions, ignoreUnknownValues, jsonExtension, maxBadRecords, nullMarker, parquetOptions, preserveAsciiControlCharacters, projectionFields, quote, rangePartitioning, referenceFileSchemaUri, schema, schemaInline, schemaInlineFormat, schemaUpdateOptions, skipLeadingRows, sourceFormat, sourceUris, timePartitioning, useAvroLogicalTypes, writeDisposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfigurationLoad {\n");
    sb.append("    allowJaggedRows: ").append(toIndentedString(allowJaggedRows)).append("\n");
    sb.append("    allowQuotedNewlines: ").append(toIndentedString(allowQuotedNewlines)).append("\n");
    sb.append("    autodetect: ").append(toIndentedString(autodetect)).append("\n");
    sb.append("    clustering: ").append(toIndentedString(clustering)).append("\n");
    sb.append("    connectionProperties: ").append(toIndentedString(connectionProperties)).append("\n");
    sb.append("    createDisposition: ").append(toIndentedString(createDisposition)).append("\n");
    sb.append("    createSession: ").append(toIndentedString(createSession)).append("\n");
    sb.append("    decimalTargetTypes: ").append(toIndentedString(decimalTargetTypes)).append("\n");
    sb.append("    destinationEncryptionConfiguration: ").append(toIndentedString(destinationEncryptionConfiguration)).append("\n");
    sb.append("    destinationTable: ").append(toIndentedString(destinationTable)).append("\n");
    sb.append("    destinationTableProperties: ").append(toIndentedString(destinationTableProperties)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    fieldDelimiter: ").append(toIndentedString(fieldDelimiter)).append("\n");
    sb.append("    hivePartitioningOptions: ").append(toIndentedString(hivePartitioningOptions)).append("\n");
    sb.append("    ignoreUnknownValues: ").append(toIndentedString(ignoreUnknownValues)).append("\n");
    sb.append("    jsonExtension: ").append(toIndentedString(jsonExtension)).append("\n");
    sb.append("    maxBadRecords: ").append(toIndentedString(maxBadRecords)).append("\n");
    sb.append("    nullMarker: ").append(toIndentedString(nullMarker)).append("\n");
    sb.append("    parquetOptions: ").append(toIndentedString(parquetOptions)).append("\n");
    sb.append("    preserveAsciiControlCharacters: ").append(toIndentedString(preserveAsciiControlCharacters)).append("\n");
    sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    rangePartitioning: ").append(toIndentedString(rangePartitioning)).append("\n");
    sb.append("    referenceFileSchemaUri: ").append(toIndentedString(referenceFileSchemaUri)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    schemaInline: ").append(toIndentedString(schemaInline)).append("\n");
    sb.append("    schemaInlineFormat: ").append(toIndentedString(schemaInlineFormat)).append("\n");
    sb.append("    schemaUpdateOptions: ").append(toIndentedString(schemaUpdateOptions)).append("\n");
    sb.append("    skipLeadingRows: ").append(toIndentedString(skipLeadingRows)).append("\n");
    sb.append("    sourceFormat: ").append(toIndentedString(sourceFormat)).append("\n");
    sb.append("    sourceUris: ").append(toIndentedString(sourceUris)).append("\n");
    sb.append("    timePartitioning: ").append(toIndentedString(timePartitioning)).append("\n");
    sb.append("    useAvroLogicalTypes: ").append(toIndentedString(useAvroLogicalTypes)).append("\n");
    sb.append("    writeDisposition: ").append(toIndentedString(writeDisposition)).append("\n");
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

