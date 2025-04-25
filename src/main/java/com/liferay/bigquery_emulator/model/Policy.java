package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.AuditConfig;
import com.liferay.bigquery_emulator.model.Binding;
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
 * An Identity and Access Management (IAM) policy, which specifies access controls for Google Cloud resources. A &#x60;Policy&#x60; is a collection of &#x60;bindings&#x60;. A &#x60;binding&#x60; binds one or more &#x60;members&#x60;, or principals, to a single &#x60;role&#x60;. Principals can be user accounts, service accounts, Google groups, and domains (such as G Suite). A &#x60;role&#x60; is a named list of permissions; each &#x60;role&#x60; can be an IAM predefined role or a user-created custom role. For some types of Google Cloud resources, a &#x60;binding&#x60; can also specify a &#x60;condition&#x60;, which is a logical expression that allows access to a resource only if the expression evaluates to &#x60;true&#x60;. A condition can add constraints based on attributes of the request, the resource, or both. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies). **JSON example:** { \&quot;bindings\&quot;: [ { \&quot;role\&quot;: \&quot;roles/resourcemanager.organizationAdmin\&quot;, \&quot;members\&quot;: [ \&quot;user:mike@example.com\&quot;, \&quot;group:admins@example.com\&quot;, \&quot;domain:google.com\&quot;, \&quot;serviceAccount:my-project-id@appspot.gserviceaccount.com\&quot; ] }, { \&quot;role\&quot;: \&quot;roles/resourcemanager.organizationViewer\&quot;, \&quot;members\&quot;: [ \&quot;user:eve@example.com\&quot; ], \&quot;condition\&quot;: { \&quot;title\&quot;: \&quot;expirable access\&quot;, \&quot;description\&quot;: \&quot;Does not grant access after Sep 2020\&quot;, \&quot;expression\&quot;: \&quot;request.time &lt; timestamp(&#39;2020-10-01T00:00:00.000Z&#39;)\&quot;, } } ], \&quot;etag\&quot;: \&quot;BwWWja0YfJA&#x3D;\&quot;, \&quot;version\&quot;: 3 } **YAML example:** bindings: - members: - user:mike@example.com - group:admins@example.com - domain:google.com - serviceAccount:my-project-id@appspot.gserviceaccount.com role: roles/resourcemanager.organizationAdmin - members: - user:eve@example.com role: roles/resourcemanager.organizationViewer condition: title: expirable access description: Does not grant access after Sep 2020 expression: request.time &lt; timestamp(&#39;2020-10-01T00:00:00.000Z&#39;) etag: BwWWja0YfJA&#x3D; version: 3 For a description of IAM and its features, see the [IAM documentation](https://cloud.google.com/iam/docs/).
 */

@Schema(name = "Policy", description = "An Identity and Access Management (IAM) policy, which specifies access controls for Google Cloud resources. A `Policy` is a collection of `bindings`. A `binding` binds one or more `members`, or principals, to a single `role`. Principals can be user accounts, service accounts, Google groups, and domains (such as G Suite). A `role` is a named list of permissions; each `role` can be an IAM predefined role or a user-created custom role. For some types of Google Cloud resources, a `binding` can also specify a `condition`, which is a logical expression that allows access to a resource only if the expression evaluates to `true`. A condition can add constraints based on attributes of the request, the resource, or both. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies). **JSON example:** { \"bindings\": [ { \"role\": \"roles/resourcemanager.organizationAdmin\", \"members\": [ \"user:mike@example.com\", \"group:admins@example.com\", \"domain:google.com\", \"serviceAccount:my-project-id@appspot.gserviceaccount.com\" ] }, { \"role\": \"roles/resourcemanager.organizationViewer\", \"members\": [ \"user:eve@example.com\" ], \"condition\": { \"title\": \"expirable access\", \"description\": \"Does not grant access after Sep 2020\", \"expression\": \"request.time < timestamp('2020-10-01T00:00:00.000Z')\", } } ], \"etag\": \"BwWWja0YfJA=\", \"version\": 3 } **YAML example:** bindings: - members: - user:mike@example.com - group:admins@example.com - domain:google.com - serviceAccount:my-project-id@appspot.gserviceaccount.com role: roles/resourcemanager.organizationAdmin - members: - user:eve@example.com role: roles/resourcemanager.organizationViewer condition: title: expirable access description: Does not grant access after Sep 2020 expression: request.time < timestamp('2020-10-01T00:00:00.000Z') etag: BwWWja0YfJA= version: 3 For a description of IAM and its features, see the [IAM documentation](https://cloud.google.com/iam/docs/).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Policy {

  @Valid
  private List<@Valid AuditConfig> auditConfigs = new ArrayList<>();

  @Valid
  private List<@Valid Binding> bindings = new ArrayList<>();

  private byte[] etag;

  private Integer version;

  public Policy auditConfigs(List<@Valid AuditConfig> auditConfigs) {
    this.auditConfigs = auditConfigs;
    return this;
  }

  public Policy addAuditConfigsItem(AuditConfig auditConfigsItem) {
    if (this.auditConfigs == null) {
      this.auditConfigs = new ArrayList<>();
    }
    this.auditConfigs.add(auditConfigsItem);
    return this;
  }

  /**
   * Specifies cloud audit logging configuration for this policy.
   * @return auditConfigs
   */
  @Valid 
  @Schema(name = "auditConfigs", description = "Specifies cloud audit logging configuration for this policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditConfigs")
  public List<@Valid AuditConfig> getAuditConfigs() {
    return auditConfigs;
  }

  public void setAuditConfigs(List<@Valid AuditConfig> auditConfigs) {
    this.auditConfigs = auditConfigs;
  }

  public Policy bindings(List<@Valid Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Policy addBindingsItem(Binding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

  /**
   * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
   * @return bindings
   */
  @Valid 
  @Schema(name = "bindings", description = "Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bindings")
  public List<@Valid Binding> getBindings() {
    return bindings;
  }

  public void setBindings(List<@Valid Binding> bindings) {
    this.bindings = bindings;
  }

  public Policy etag(byte[] etag) {
    this.etag = etag;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
   * @return etag
   */
  
  @Schema(name = "etag", description = "`etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public byte[] getEtag() {
    return etag;
  }

  public void setEtag(byte[] etag) {
    this.etag = etag;
  }

  public Policy version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return version
   */
  
  @Schema(name = "version", description = "Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.auditConfigs, policy.auditConfigs) &&
        Objects.equals(this.bindings, policy.bindings) &&
        Arrays.equals(this.etag, policy.etag) &&
        Objects.equals(this.version, policy.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditConfigs, bindings, Arrays.hashCode(etag), version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    auditConfigs: ").append(toIndentedString(auditConfigs)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

