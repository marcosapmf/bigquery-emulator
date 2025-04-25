package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.RowAccessPolicy;
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
 * Response message for the ListRowAccessPolicies method.
 */

@Schema(name = "ListRowAccessPoliciesResponse", description = "Response message for the ListRowAccessPolicies method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ListRowAccessPoliciesResponse {

  private String nextPageToken;

  @Valid
  private List<@Valid RowAccessPolicy> rowAccessPolicies = new ArrayList<>();

  public ListRowAccessPoliciesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to request the next page of results.
   * @return nextPageToken
   */
  
  @Schema(name = "nextPageToken", description = "A token to request the next page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListRowAccessPoliciesResponse rowAccessPolicies(List<@Valid RowAccessPolicy> rowAccessPolicies) {
    this.rowAccessPolicies = rowAccessPolicies;
    return this;
  }

  public ListRowAccessPoliciesResponse addRowAccessPoliciesItem(RowAccessPolicy rowAccessPoliciesItem) {
    if (this.rowAccessPolicies == null) {
      this.rowAccessPolicies = new ArrayList<>();
    }
    this.rowAccessPolicies.add(rowAccessPoliciesItem);
    return this;
  }

  /**
   * Row access policies on the requested table.
   * @return rowAccessPolicies
   */
  @Valid 
  @Schema(name = "rowAccessPolicies", description = "Row access policies on the requested table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rowAccessPolicies")
  public List<@Valid RowAccessPolicy> getRowAccessPolicies() {
    return rowAccessPolicies;
  }

  public void setRowAccessPolicies(List<@Valid RowAccessPolicy> rowAccessPolicies) {
    this.rowAccessPolicies = rowAccessPolicies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRowAccessPoliciesResponse listRowAccessPoliciesResponse = (ListRowAccessPoliciesResponse) o;
    return Objects.equals(this.nextPageToken, listRowAccessPoliciesResponse.nextPageToken) &&
        Objects.equals(this.rowAccessPolicies, listRowAccessPoliciesResponse.rowAccessPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, rowAccessPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRowAccessPoliciesResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    rowAccessPolicies: ").append(toIndentedString(rowAccessPolicies)).append("\n");
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

