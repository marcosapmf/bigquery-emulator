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
 * Encapsulates settings provided to GetIamPolicy.
 */

@Schema(name = "GetPolicyOptions", description = "Encapsulates settings provided to GetIamPolicy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class GetPolicyOptions {

  private Integer requestedPolicyVersion;

  public GetPolicyOptions requestedPolicyVersion(Integer requestedPolicyVersion) {
    this.requestedPolicyVersion = requestedPolicyVersion;
    return this;
  }

  /**
   * Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return requestedPolicyVersion
   */
  
  @Schema(name = "requestedPolicyVersion", description = "Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedPolicyVersion")
  public Integer getRequestedPolicyVersion() {
    return requestedPolicyVersion;
  }

  public void setRequestedPolicyVersion(Integer requestedPolicyVersion) {
    this.requestedPolicyVersion = requestedPolicyVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyOptions getPolicyOptions = (GetPolicyOptions) o;
    return Objects.equals(this.requestedPolicyVersion, getPolicyOptions.requestedPolicyVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedPolicyVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyOptions {\n");
    sb.append("    requestedPolicyVersion: ").append(toIndentedString(requestedPolicyVersion)).append("\n");
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

