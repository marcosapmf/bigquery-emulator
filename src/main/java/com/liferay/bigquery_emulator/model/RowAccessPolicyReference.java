package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RowAccessPolicyReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RowAccessPolicyReference {

  private String datasetId;

  private String policyId;

  private String projectId;

  private String tableId;

  public RowAccessPolicyReference datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * [Required] The ID of the dataset containing this row access policy.
   * @return datasetId
   */
  
  @Schema(name = "datasetId", description = "[Required] The ID of the dataset containing this row access policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasetId")
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public RowAccessPolicyReference policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * [Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
   * @return policyId
   */
  
  @Schema(name = "policyId", description = "[Required] The ID of the row access policy. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public RowAccessPolicyReference projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * [Required] The ID of the project containing this row access policy.
   * @return projectId
   */
  
  @Schema(name = "projectId", description = "[Required] The ID of the project containing this row access policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RowAccessPolicyReference tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * [Required] The ID of the table containing this row access policy.
   * @return tableId
   */
  
  @Schema(name = "tableId", description = "[Required] The ID of the table containing this row access policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tableId")
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowAccessPolicyReference rowAccessPolicyReference = (RowAccessPolicyReference) o;
    return Objects.equals(this.datasetId, rowAccessPolicyReference.datasetId) &&
        Objects.equals(this.policyId, rowAccessPolicyReference.policyId) &&
        Objects.equals(this.projectId, rowAccessPolicyReference.projectId) &&
        Objects.equals(this.tableId, rowAccessPolicyReference.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, policyId, projectId, tableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowAccessPolicyReference {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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

