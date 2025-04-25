package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.Policy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request message for &#x60;SetIamPolicy&#x60; method.
 */

@Schema(name = "SetIamPolicyRequest", description = "Request message for `SetIamPolicy` method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SetIamPolicyRequest {

  private Policy policy;

  private String updateMask;

  public SetIamPolicyRequest policy(Policy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   */
  @Valid 
  @Schema(name = "policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy")
  public Policy getPolicy() {
    return policy;
  }

  public void setPolicy(Policy policy) {
    this.policy = policy;
  }

  public SetIamPolicyRequest updateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  /**
   * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used: `paths: \"bindings, etag\"`
   * @return updateMask
   */
  
  @Schema(name = "updateMask", description = "OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used: `paths: \"bindings, etag\"`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateMask")
  public String getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetIamPolicyRequest setIamPolicyRequest = (SetIamPolicyRequest) o;
    return Objects.equals(this.policy, setIamPolicyRequest.policy) &&
        Objects.equals(this.updateMask, setIamPolicyRequest.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetIamPolicyRequest {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

