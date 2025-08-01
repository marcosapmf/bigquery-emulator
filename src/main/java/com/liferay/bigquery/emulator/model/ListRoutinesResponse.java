package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.Routine;
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
 * ListRoutinesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ListRoutinesResponse {

  private String nextPageToken;

  @Valid
  private List<@Valid Routine> routines = new ArrayList<>();

  public ListRoutinesResponse nextPageToken(String nextPageToken) {
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

  public ListRoutinesResponse routines(List<@Valid Routine> routines) {
    this.routines = routines;
    return this;
  }

  public ListRoutinesResponse addRoutinesItem(Routine routinesItem) {
    if (this.routines == null) {
      this.routines = new ArrayList<>();
    }
    this.routines.add(routinesItem);
    return this;
  }

  /**
   * Routines in the requested dataset. Unless read_mask is set in the request, only the following fields are populated: etag, project_id, dataset_id, routine_id, routine_type, creation_time, last_modified_time, language, and remote_function_options.
   * @return routines
   */
  @Valid 
  @Schema(name = "routines", description = "Routines in the requested dataset. Unless read_mask is set in the request, only the following fields are populated: etag, project_id, dataset_id, routine_id, routine_type, creation_time, last_modified_time, language, and remote_function_options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routines")
  public List<@Valid Routine> getRoutines() {
    return routines;
  }

  public void setRoutines(List<@Valid Routine> routines) {
    this.routines = routines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRoutinesResponse listRoutinesResponse = (ListRoutinesResponse) o;
    return Objects.equals(this.nextPageToken, listRoutinesResponse.nextPageToken) &&
        Objects.equals(this.routines, listRoutinesResponse.routines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, routines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRoutinesResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    routines: ").append(toIndentedString(routines)).append("\n");
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

