package com.liferay.bigquery.emulator.model;

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
 * ScriptStackFrame
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ScriptStackFrame {

  private Integer endColumn;

  private Integer endLine;

  private String procedureId;

  private Integer startColumn;

  private Integer startLine;

  private String text;

  public ScriptStackFrame endColumn(Integer endColumn) {
    this.endColumn = endColumn;
    return this;
  }

  /**
   * [Output-only] One-based end column.
   * @return endColumn
   */
  
  @Schema(name = "endColumn", description = "[Output-only] One-based end column.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endColumn")
  public Integer getEndColumn() {
    return endColumn;
  }

  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }

  public ScriptStackFrame endLine(Integer endLine) {
    this.endLine = endLine;
    return this;
  }

  /**
   * [Output-only] One-based end line.
   * @return endLine
   */
  
  @Schema(name = "endLine", description = "[Output-only] One-based end line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endLine")
  public Integer getEndLine() {
    return endLine;
  }

  public void setEndLine(Integer endLine) {
    this.endLine = endLine;
  }

  public ScriptStackFrame procedureId(String procedureId) {
    this.procedureId = procedureId;
    return this;
  }

  /**
   * [Output-only] Name of the active procedure, empty if in a top-level script.
   * @return procedureId
   */
  
  @Schema(name = "procedureId", description = "[Output-only] Name of the active procedure, empty if in a top-level script.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("procedureId")
  public String getProcedureId() {
    return procedureId;
  }

  public void setProcedureId(String procedureId) {
    this.procedureId = procedureId;
  }

  public ScriptStackFrame startColumn(Integer startColumn) {
    this.startColumn = startColumn;
    return this;
  }

  /**
   * [Output-only] One-based start column.
   * @return startColumn
   */
  
  @Schema(name = "startColumn", description = "[Output-only] One-based start column.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startColumn")
  public Integer getStartColumn() {
    return startColumn;
  }

  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }

  public ScriptStackFrame startLine(Integer startLine) {
    this.startLine = startLine;
    return this;
  }

  /**
   * [Output-only] One-based start line.
   * @return startLine
   */
  
  @Schema(name = "startLine", description = "[Output-only] One-based start line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startLine")
  public Integer getStartLine() {
    return startLine;
  }

  public void setStartLine(Integer startLine) {
    this.startLine = startLine;
  }

  public ScriptStackFrame text(String text) {
    this.text = text;
    return this;
  }

  /**
   * [Output-only] Text of the current statement/expression.
   * @return text
   */
  
  @Schema(name = "text", description = "[Output-only] Text of the current statement/expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScriptStackFrame scriptStackFrame = (ScriptStackFrame) o;
    return Objects.equals(this.endColumn, scriptStackFrame.endColumn) &&
        Objects.equals(this.endLine, scriptStackFrame.endLine) &&
        Objects.equals(this.procedureId, scriptStackFrame.procedureId) &&
        Objects.equals(this.startColumn, scriptStackFrame.startColumn) &&
        Objects.equals(this.startLine, scriptStackFrame.startLine) &&
        Objects.equals(this.text, scriptStackFrame.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endColumn, endLine, procedureId, startColumn, startLine, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScriptStackFrame {\n");
    sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
    sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
    sb.append("    procedureId: ").append(toIndentedString(procedureId)).append("\n");
    sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
    sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

