package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.RowAccessPolicyReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Represents access on a subset of rows on the specified table, defined by its filter predicate. Access to the subset of rows is controlled by its IAM policy.
 */

@Schema(name = "RowAccessPolicy", description = "Represents access on a subset of rows on the specified table, defined by its filter predicate. Access to the subset of rows is controlled by its IAM policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RowAccessPolicy {

  private String creationTime;

  private String etag;

  private String filterPredicate;

  private String lastModifiedTime;

  private RowAccessPolicyReference rowAccessPolicyReference;

  public RowAccessPolicy creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Output only. The time when this row access policy was created, in milliseconds since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this row access policy was created, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public RowAccessPolicy etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. A hash of this resource.
   * @return etag
   */
  
  @Schema(name = "etag", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. A hash of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public RowAccessPolicy filterPredicate(String filterPredicate) {
    this.filterPredicate = filterPredicate;
    return this;
  }

  /**
   * Required. A SQL boolean expression that represents the rows defined by this row access policy, similar to the boolean expression in a WHERE clause of a SELECT query on a table. References to other tables, routines, and temporary functions are not supported. Examples: region=\"EU\" date_field = CAST('2019-9-27' as DATE) nullable_field is not NULL numeric_field BETWEEN 1.0 AND 5.0
   * @return filterPredicate
   */
  
  @Schema(name = "filterPredicate", description = "Required. A SQL boolean expression that represents the rows defined by this row access policy, similar to the boolean expression in a WHERE clause of a SELECT query on a table. References to other tables, routines, and temporary functions are not supported. Examples: region=\"EU\" date_field = CAST('2019-9-27' as DATE) nullable_field is not NULL numeric_field BETWEEN 1.0 AND 5.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterPredicate")
  public String getFilterPredicate() {
    return filterPredicate;
  }

  public void setFilterPredicate(String filterPredicate) {
    this.filterPredicate = filterPredicate;
  }

  public RowAccessPolicy lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Output only. The time when this row access policy was last modified, in milliseconds since the epoch.
   * @return lastModifiedTime
   */
  
  @Schema(name = "lastModifiedTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this row access policy was last modified, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedTime")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public RowAccessPolicy rowAccessPolicyReference(RowAccessPolicyReference rowAccessPolicyReference) {
    this.rowAccessPolicyReference = rowAccessPolicyReference;
    return this;
  }

  /**
   * Get rowAccessPolicyReference
   * @return rowAccessPolicyReference
   */
  @Valid 
  @Schema(name = "rowAccessPolicyReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowAccessPolicyReference")
  public RowAccessPolicyReference getRowAccessPolicyReference() {
    return rowAccessPolicyReference;
  }

  public void setRowAccessPolicyReference(RowAccessPolicyReference rowAccessPolicyReference) {
    this.rowAccessPolicyReference = rowAccessPolicyReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowAccessPolicy rowAccessPolicy = (RowAccessPolicy) o;
    return Objects.equals(this.creationTime, rowAccessPolicy.creationTime) &&
        Objects.equals(this.etag, rowAccessPolicy.etag) &&
        Objects.equals(this.filterPredicate, rowAccessPolicy.filterPredicate) &&
        Objects.equals(this.lastModifiedTime, rowAccessPolicy.lastModifiedTime) &&
        Objects.equals(this.rowAccessPolicyReference, rowAccessPolicy.rowAccessPolicyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, etag, filterPredicate, lastModifiedTime, rowAccessPolicyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowAccessPolicy {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    filterPredicate: ").append(toIndentedString(filterPredicate)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    rowAccessPolicyReference: ").append(toIndentedString(rowAccessPolicyReference)).append("\n");
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

