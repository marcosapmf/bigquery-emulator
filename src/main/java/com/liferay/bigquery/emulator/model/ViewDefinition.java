package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.UserDefinedFunctionResource;
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
 * ViewDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ViewDefinition {

  private String query;

  private Boolean useExplicitColumnNames;

  private Boolean useLegacySql;

  @Valid
  private List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources = new ArrayList<>();

  public ViewDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * [Required] A query that BigQuery executes when the view is referenced.
   * @return query
   */
  
  @Schema(name = "query", description = "[Required] A query that BigQuery executes when the view is referenced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ViewDefinition useExplicitColumnNames(Boolean useExplicitColumnNames) {
    this.useExplicitColumnNames = useExplicitColumnNames;
    return this;
  }

  /**
   * True if the column names are explicitly specified. For example by using the 'CREATE VIEW v(c1, c2) AS ...' syntax. Can only be set using BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/
   * @return useExplicitColumnNames
   */
  
  @Schema(name = "useExplicitColumnNames", description = "True if the column names are explicitly specified. For example by using the 'CREATE VIEW v(c1, c2) AS ...' syntax. Can only be set using BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useExplicitColumnNames")
  public Boolean getUseExplicitColumnNames() {
    return useExplicitColumnNames;
  }

  public void setUseExplicitColumnNames(Boolean useExplicitColumnNames) {
    this.useExplicitColumnNames = useExplicitColumnNames;
  }

  public ViewDefinition useLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
   * @return useLegacySql
   */
  
  @Schema(name = "useLegacySql", description = "Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useLegacySql")
  public Boolean getUseLegacySql() {
    return useLegacySql;
  }

  public void setUseLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
  }

  public ViewDefinition userDefinedFunctionResources(List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
    return this;
  }

  public ViewDefinition addUserDefinedFunctionResourcesItem(UserDefinedFunctionResource userDefinedFunctionResourcesItem) {
    if (this.userDefinedFunctionResources == null) {
      this.userDefinedFunctionResources = new ArrayList<>();
    }
    this.userDefinedFunctionResources.add(userDefinedFunctionResourcesItem);
    return this;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @return userDefinedFunctionResources
   */
  @Valid 
  @Schema(name = "userDefinedFunctionResources", description = "Describes user-defined function resources used in the query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userDefinedFunctionResources")
  public List<@Valid UserDefinedFunctionResource> getUserDefinedFunctionResources() {
    return userDefinedFunctionResources;
  }

  public void setUserDefinedFunctionResources(List<@Valid UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewDefinition viewDefinition = (ViewDefinition) o;
    return Objects.equals(this.query, viewDefinition.query) &&
        Objects.equals(this.useExplicitColumnNames, viewDefinition.useExplicitColumnNames) &&
        Objects.equals(this.useLegacySql, viewDefinition.useLegacySql) &&
        Objects.equals(this.userDefinedFunctionResources, viewDefinition.userDefinedFunctionResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, useExplicitColumnNames, useLegacySql, userDefinedFunctionResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewDefinition {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    useExplicitColumnNames: ").append(toIndentedString(useExplicitColumnNames)).append("\n");
    sb.append("    useLegacySql: ").append(toIndentedString(useLegacySql)).append("\n");
    sb.append("    userDefinedFunctionResources: ").append(toIndentedString(userDefinedFunctionResources)).append("\n");
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

