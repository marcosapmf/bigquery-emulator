package com.liferay.bigquery_emulator.model;

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
 * Additional details for a view.
 */

@Schema(name = "TableList_tables_inner_view", description = "Additional details for a view.")
@JsonTypeName("TableList_tables_inner_view")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableListTablesInnerView {

  private Boolean useLegacySql;

  public TableListTablesInnerView useLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }

  /**
   * True if view is defined in legacy SQL dialect, false if in standard SQL.
   * @return useLegacySql
   */
  
  @Schema(name = "useLegacySql", description = "True if view is defined in legacy SQL dialect, false if in standard SQL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useLegacySql")
  public Boolean getUseLegacySql() {
    return useLegacySql;
  }

  public void setUseLegacySql(Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableListTablesInnerView tableListTablesInnerView = (TableListTablesInnerView) o;
    return Objects.equals(this.useLegacySql, tableListTablesInnerView.useLegacySql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useLegacySql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableListTablesInnerView {\n");
    sb.append("    useLegacySql: ").append(toIndentedString(useLegacySql)).append("\n");
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

