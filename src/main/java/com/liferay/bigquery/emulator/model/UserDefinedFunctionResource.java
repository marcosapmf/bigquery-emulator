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
 * This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions
 */

@Schema(name = "UserDefinedFunctionResource", description = "This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class UserDefinedFunctionResource {

  private String inlineCode;

  private String resourceUri;

  public UserDefinedFunctionResource inlineCode(String inlineCode) {
    this.inlineCode = inlineCode;
    return this;
  }

  /**
   * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
   * @return inlineCode
   */
  
  @Schema(name = "inlineCode", description = "[Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inlineCode")
  public String getInlineCode() {
    return inlineCode;
  }

  public void setInlineCode(String inlineCode) {
    this.inlineCode = inlineCode;
  }

  public UserDefinedFunctionResource resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
   * @return resourceUri
   */
  
  @Schema(name = "resourceUri", description = "[Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceUri")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDefinedFunctionResource userDefinedFunctionResource = (UserDefinedFunctionResource) o;
    return Objects.equals(this.inlineCode, userDefinedFunctionResource.inlineCode) &&
        Objects.equals(this.resourceUri, userDefinedFunctionResource.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineCode, resourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDefinedFunctionResource {\n");
    sb.append("    inlineCode: ").append(toIndentedString(inlineCode)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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

