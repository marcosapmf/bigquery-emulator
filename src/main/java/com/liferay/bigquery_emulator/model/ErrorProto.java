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
 * ErrorProto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ErrorProto {

  private String debugInfo;

  private String location;

  private String message;

  private String reason;

  public ErrorProto debugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * Debugging information. This property is internal to Google and should not be used.
   * @return debugInfo
   */
  
  @Schema(name = "debugInfo", description = "Debugging information. This property is internal to Google and should not be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debugInfo")
  public String getDebugInfo() {
    return debugInfo;
  }

  public void setDebugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
  }

  public ErrorProto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Specifies where the error occurred, if present.
   * @return location
   */
  
  @Schema(name = "location", description = "Specifies where the error occurred, if present.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ErrorProto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the error.
   * @return message
   */
  
  @Schema(name = "message", description = "A human-readable description of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorProto reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A short error code that summarizes the error.
   * @return reason
   */
  
  @Schema(name = "reason", description = "A short error code that summarizes the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorProto errorProto = (ErrorProto) o;
    return Objects.equals(this.debugInfo, errorProto.debugInfo) &&
        Objects.equals(this.location, errorProto.location) &&
        Objects.equals(this.message, errorProto.message) &&
        Objects.equals(this.reason, errorProto.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debugInfo, location, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorProto {\n");
    sb.append("    debugInfo: ").append(toIndentedString(debugInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

