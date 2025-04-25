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
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: \&quot;Summary size limit\&quot; description: \&quot;Determines if a summary is less than 100 chars\&quot; expression: \&quot;document.summary.size() &lt; 100\&quot; Example (Equality): title: \&quot;Requestor is owner\&quot; description: \&quot;Determines if requestor is the document owner\&quot; expression: \&quot;document.owner &#x3D;&#x3D; request.auth.claims.email\&quot; Example (Logic): title: \&quot;Public documents\&quot; description: \&quot;Determine whether the document should be publicly visible\&quot; expression: \&quot;document.type !&#x3D; &#39;private&#39; &amp;&amp; document.type !&#x3D; &#39;internal&#39;\&quot; Example (Data Manipulation): title: \&quot;Notification string\&quot; description: \&quot;Create a notification string with a timestamp.\&quot; expression: \&quot;&#39;New message received at &#39; + string(document.create_time)\&quot; The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 */

@Schema(name = "Expr", description = "Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: \"Summary size limit\" description: \"Determines if a summary is less than 100 chars\" expression: \"document.summary.size() < 100\" Example (Equality): title: \"Requestor is owner\" description: \"Determines if requestor is the document owner\" expression: \"document.owner == request.auth.claims.email\" Example (Logic): title: \"Public documents\" description: \"Determine whether the document should be publicly visible\" expression: \"document.type != 'private' && document.type != 'internal'\" Example (Data Manipulation): title: \"Notification string\" description: \"Create a notification string with a timestamp.\" expression: \"'New message received at ' + string(document.create_time)\" The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Expr {

  private String description;

  private String expression;

  private String location;

  private String title;

  public Expr description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
   * @return description
   */
  
  @Schema(name = "description", description = "Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Expr expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Textual representation of an expression in Common Expression Language syntax.
   * @return expression
   */
  
  @Schema(name = "expression", description = "Textual representation of an expression in Common Expression Language syntax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Expr location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
   * @return location
   */
  
  @Schema(name = "location", description = "Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Expr title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
   * @return title
   */
  
  @Schema(name = "title", description = "Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expr expr = (Expr) o;
    return Objects.equals(this.description, expr.description) &&
        Objects.equals(this.expression, expr.expression) &&
        Objects.equals(this.location, expr.location) &&
        Objects.equals(this.title, expr.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expression, location, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expr {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

