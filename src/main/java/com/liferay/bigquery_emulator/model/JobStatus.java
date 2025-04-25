package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.ErrorProto;
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
 * JobStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class JobStatus {

  private ErrorProto errorResult;

  @Valid
  private List<@Valid ErrorProto> errors = new ArrayList<>();

  private String state;

  public JobStatus errorResult(ErrorProto errorResult) {
    this.errorResult = errorResult;
    return this;
  }

  /**
   * Get errorResult
   * @return errorResult
   */
  @Valid 
  @Schema(name = "errorResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorResult")
  public ErrorProto getErrorResult() {
    return errorResult;
  }

  public void setErrorResult(ErrorProto errorResult) {
    this.errorResult = errorResult;
  }

  public JobStatus errors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  public JobStatus addErrorsItem(ErrorProto errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * [Output-only] The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "[Output-only] The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorProto> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorProto> errors) {
    this.errors = errors;
  }

  public JobStatus state(String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output-only] Running state of the job.
   * @return state
   */
  
  @Schema(name = "state", description = "[Output-only] Running state of the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatus jobStatus = (JobStatus) o;
    return Objects.equals(this.errorResult, jobStatus.errorResult) &&
        Objects.equals(this.errors, jobStatus.errors) &&
        Objects.equals(this.state, jobStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorResult, errors, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatus {\n");
    sb.append("    errorResult: ").append(toIndentedString(errorResult)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

