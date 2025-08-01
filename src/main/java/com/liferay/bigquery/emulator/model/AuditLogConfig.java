package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Provides the configuration for logging a type of permissions. Example: { \&quot;audit_log_configs\&quot;: [ { \&quot;log_type\&quot;: \&quot;DATA_READ\&quot;, \&quot;exempted_members\&quot;: [ \&quot;user:jose@example.com\&quot; ] }, { \&quot;log_type\&quot;: \&quot;DATA_WRITE\&quot; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 */

@Schema(name = "AuditLogConfig", description = "Provides the configuration for logging a type of permissions. Example: { \"audit_log_configs\": [ { \"log_type\": \"DATA_READ\", \"exempted_members\": [ \"user:jose@example.com\" ] }, { \"log_type\": \"DATA_WRITE\" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose@example.com from DATA_READ logging.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class AuditLogConfig {

  @Valid
  private List<String> exemptedMembers = new ArrayList<>();

  /**
   * The log type that this config enables.
   */
  public enum LogTypeEnum {
    LOG_TYPE_UNSPECIFIED("LOG_TYPE_UNSPECIFIED"),
    
    ADMIN_READ("ADMIN_READ"),
    
    DATA_WRITE("DATA_WRITE"),
    
    DATA_READ("DATA_READ");

    private String value;

    LogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LogTypeEnum fromValue(String value) {
      for (LogTypeEnum b : LogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LogTypeEnum logType;

  public AuditLogConfig exemptedMembers(List<String> exemptedMembers) {
    this.exemptedMembers = exemptedMembers;
    return this;
  }

  public AuditLogConfig addExemptedMembersItem(String exemptedMembersItem) {
    if (this.exemptedMembers == null) {
      this.exemptedMembers = new ArrayList<>();
    }
    this.exemptedMembers.add(exemptedMembersItem);
    return this;
  }

  /**
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * @return exemptedMembers
   */
  
  @Schema(name = "exemptedMembers", description = "Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exemptedMembers")
  public List<String> getExemptedMembers() {
    return exemptedMembers;
  }

  public void setExemptedMembers(List<String> exemptedMembers) {
    this.exemptedMembers = exemptedMembers;
  }

  public AuditLogConfig logType(LogTypeEnum logType) {
    this.logType = logType;
    return this;
  }

  /**
   * The log type that this config enables.
   * @return logType
   */
  
  @Schema(name = "logType", description = "The log type that this config enables.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logType")
  public LogTypeEnum getLogType() {
    return logType;
  }

  public void setLogType(LogTypeEnum logType) {
    this.logType = logType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogConfig auditLogConfig = (AuditLogConfig) o;
    return Objects.equals(this.exemptedMembers, auditLogConfig.exemptedMembers) &&
        Objects.equals(this.logType, auditLogConfig.logType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exemptedMembers, logType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogConfig {\n");
    sb.append("    exemptedMembers: ").append(toIndentedString(exemptedMembers)).append("\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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

