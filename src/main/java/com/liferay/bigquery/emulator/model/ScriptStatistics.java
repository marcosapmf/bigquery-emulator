package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.liferay.bigquery.emulator.model.ScriptStackFrame;
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
 * ScriptStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ScriptStatistics {

  private String evaluationKind;

  @Valid
  private List<@Valid ScriptStackFrame> stackFrames = new ArrayList<>();

  public ScriptStatistics evaluationKind(String evaluationKind) {
    this.evaluationKind = evaluationKind;
    return this;
  }

  /**
   * [Output-only] Whether this child job was a statement or expression.
   * @return evaluationKind
   */
  
  @Schema(name = "evaluationKind", description = "[Output-only] Whether this child job was a statement or expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluationKind")
  public String getEvaluationKind() {
    return evaluationKind;
  }

  public void setEvaluationKind(String evaluationKind) {
    this.evaluationKind = evaluationKind;
  }

  public ScriptStatistics stackFrames(List<@Valid ScriptStackFrame> stackFrames) {
    this.stackFrames = stackFrames;
    return this;
  }

  public ScriptStatistics addStackFramesItem(ScriptStackFrame stackFramesItem) {
    if (this.stackFrames == null) {
      this.stackFrames = new ArrayList<>();
    }
    this.stackFrames.add(stackFramesItem);
    return this;
  }

  /**
   * Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is last. Never empty.
   * @return stackFrames
   */
  @Valid 
  @Schema(name = "stackFrames", description = "Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is last. Never empty.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stackFrames")
  public List<@Valid ScriptStackFrame> getStackFrames() {
    return stackFrames;
  }

  public void setStackFrames(List<@Valid ScriptStackFrame> stackFrames) {
    this.stackFrames = stackFrames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScriptStatistics scriptStatistics = (ScriptStatistics) o;
    return Objects.equals(this.evaluationKind, scriptStatistics.evaluationKind) &&
        Objects.equals(this.stackFrames, scriptStatistics.stackFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationKind, stackFrames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScriptStatistics {\n");
    sb.append("    evaluationKind: ").append(toIndentedString(evaluationKind)).append("\n");
    sb.append("    stackFrames: ").append(toIndentedString(stackFrames)).append("\n");
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

