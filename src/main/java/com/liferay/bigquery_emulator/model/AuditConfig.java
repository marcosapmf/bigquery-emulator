package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.AuditLogConfig;
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
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both &#x60;allServices&#x60; and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { \&quot;audit_configs\&quot;: [ { \&quot;service\&quot;: \&quot;allServices\&quot;, \&quot;audit_log_configs\&quot;: [ { \&quot;log_type\&quot;: \&quot;DATA_READ\&quot;, \&quot;exempted_members\&quot;: [ \&quot;user:jose@example.com\&quot; ] }, { \&quot;log_type\&quot;: \&quot;DATA_WRITE\&quot; }, { \&quot;log_type\&quot;: \&quot;ADMIN_READ\&quot; } ] }, { \&quot;service\&quot;: \&quot;sampleservice.googleapis.com\&quot;, \&quot;audit_log_configs\&quot;: [ { \&quot;log_type\&quot;: \&quot;DATA_READ\&quot; }, { \&quot;log_type\&quot;: \&quot;DATA_WRITE\&quot;, \&quot;exempted_members\&quot;: [ \&quot;user:aliya@example.com\&quot; ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts &#x60;jose@example.com&#x60; from DATA_READ logging, and &#x60;aliya@example.com&#x60; from DATA_WRITE logging.
 */

@Schema(name = "AuditConfig", description = "Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { \"audit_configs\": [ { \"service\": \"allServices\", \"audit_log_configs\": [ { \"log_type\": \"DATA_READ\", \"exempted_members\": [ \"user:jose@example.com\" ] }, { \"log_type\": \"DATA_WRITE\" }, { \"log_type\": \"ADMIN_READ\" } ] }, { \"service\": \"sampleservice.googleapis.com\", \"audit_log_configs\": [ { \"log_type\": \"DATA_READ\" }, { \"log_type\": \"DATA_WRITE\", \"exempted_members\": [ \"user:aliya@example.com\" ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts `jose@example.com` from DATA_READ logging, and `aliya@example.com` from DATA_WRITE logging.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class AuditConfig {

  @Valid
  private List<@Valid AuditLogConfig> auditLogConfigs = new ArrayList<>();

  private String service;

  public AuditConfig auditLogConfigs(List<@Valid AuditLogConfig> auditLogConfigs) {
    this.auditLogConfigs = auditLogConfigs;
    return this;
  }

  public AuditConfig addAuditLogConfigsItem(AuditLogConfig auditLogConfigsItem) {
    if (this.auditLogConfigs == null) {
      this.auditLogConfigs = new ArrayList<>();
    }
    this.auditLogConfigs.add(auditLogConfigsItem);
    return this;
  }

  /**
   * The configuration for logging of each type of permission.
   * @return auditLogConfigs
   */
  @Valid 
  @Schema(name = "auditLogConfigs", description = "The configuration for logging of each type of permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditLogConfigs")
  public List<@Valid AuditLogConfig> getAuditLogConfigs() {
    return auditLogConfigs;
  }

  public void setAuditLogConfigs(List<@Valid AuditLogConfig> auditLogConfigs) {
    this.auditLogConfigs = auditLogConfigs;
  }

  public AuditConfig service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
   * @return service
   */
  
  @Schema(name = "service", description = "Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditConfig auditConfig = (AuditConfig) o;
    return Objects.equals(this.auditLogConfigs, auditConfig.auditLogConfigs) &&
        Objects.equals(this.service, auditConfig.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditLogConfigs, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditConfig {\n");
    sb.append("    auditLogConfigs: ").append(toIndentedString(auditLogConfigs)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

