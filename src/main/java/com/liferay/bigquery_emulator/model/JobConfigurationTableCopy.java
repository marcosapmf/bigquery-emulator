package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.EncryptionConfiguration;
import com.liferay.bigquery_emulator.model.TableReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobConfigurationTableCopy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobConfigurationTableCopy {

  private String createDisposition;

  private EncryptionConfiguration destinationEncryptionConfiguration;

  private JsonNullable<Object> destinationExpirationTime = JsonNullable.<Object>undefined();

  private TableReference destinationTable;

  private String operationType;

  private TableReference sourceTable;

  @Valid
  private List<@Valid TableReference> sourceTables = new ArrayList<>();

  private String writeDisposition;

  public JobConfigurationTableCopy createDisposition(String createDisposition) {
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

  public JobConfigurationTableCopy destinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
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

  public JobConfigurationTableCopy destinationExpirationTime(Object destinationExpirationTime) {
    this.destinationExpirationTime = JsonNullable.of(destinationExpirationTime);
    return this;
  }

  /**
   * [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
   * @return destinationExpirationTime
   */
  
  @Schema(name = "destinationExpirationTime", description = "[Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationExpirationTime")
  public JsonNullable<Object> getDestinationExpirationTime() {
    return destinationExpirationTime;
  }

  public void setDestinationExpirationTime(JsonNullable<Object> destinationExpirationTime) {
    this.destinationExpirationTime = destinationExpirationTime;
  }

  public JobConfigurationTableCopy destinationTable(TableReference destinationTable) {
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

  public JobConfigurationTableCopy operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * [Optional] Supported operation types in table copy job.
   * @return operationType
   */
  
  @Schema(name = "operationType", description = "[Optional] Supported operation types in table copy job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public JobConfigurationTableCopy sourceTable(TableReference sourceTable) {
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

  public JobConfigurationTableCopy sourceTables(List<@Valid TableReference> sourceTables) {
    this.sourceTables = sourceTables;
    return this;
  }

  public JobConfigurationTableCopy addSourceTablesItem(TableReference sourceTablesItem) {
    if (this.sourceTables == null) {
      this.sourceTables = new ArrayList<>();
    }
    this.sourceTables.add(sourceTablesItem);
    return this;
  }

  /**
   * [Pick one] Source tables to copy.
   * @return sourceTables
   */
  @Valid 
  @Schema(name = "sourceTables", description = "[Pick one] Source tables to copy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceTables")
  public List<@Valid TableReference> getSourceTables() {
    return sourceTables;
  }

  public void setSourceTables(List<@Valid TableReference> sourceTables) {
    this.sourceTables = sourceTables;
  }

  public JobConfigurationTableCopy writeDisposition(String writeDisposition) {
    this.writeDisposition = writeDisposition;
    return this;
  }

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
   * @return writeDisposition
   */
  
  @Schema(name = "writeDisposition", description = "[Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    JobConfigurationTableCopy jobConfigurationTableCopy = (JobConfigurationTableCopy) o;
    return Objects.equals(this.createDisposition, jobConfigurationTableCopy.createDisposition) &&
        Objects.equals(this.destinationEncryptionConfiguration, jobConfigurationTableCopy.destinationEncryptionConfiguration) &&
        equalsNullable(this.destinationExpirationTime, jobConfigurationTableCopy.destinationExpirationTime) &&
        Objects.equals(this.destinationTable, jobConfigurationTableCopy.destinationTable) &&
        Objects.equals(this.operationType, jobConfigurationTableCopy.operationType) &&
        Objects.equals(this.sourceTable, jobConfigurationTableCopy.sourceTable) &&
        Objects.equals(this.sourceTables, jobConfigurationTableCopy.sourceTables) &&
        Objects.equals(this.writeDisposition, jobConfigurationTableCopy.writeDisposition);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDisposition, destinationEncryptionConfiguration, hashCodeNullable(destinationExpirationTime), destinationTable, operationType, sourceTable, sourceTables, writeDisposition);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfigurationTableCopy {\n");
    sb.append("    createDisposition: ").append(toIndentedString(createDisposition)).append("\n");
    sb.append("    destinationEncryptionConfiguration: ").append(toIndentedString(destinationEncryptionConfiguration)).append("\n");
    sb.append("    destinationExpirationTime: ").append(toIndentedString(destinationExpirationTime)).append("\n");
    sb.append("    destinationTable: ").append(toIndentedString(destinationTable)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
    sb.append("    sourceTables: ").append(toIndentedString(sourceTables)).append("\n");
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

