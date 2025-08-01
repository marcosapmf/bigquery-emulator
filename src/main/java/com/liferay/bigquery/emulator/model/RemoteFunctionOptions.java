package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Options for a remote user-defined function.
 */

@Schema(name = "RemoteFunctionOptions", description = "Options for a remote user-defined function.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class RemoteFunctionOptions {

  private String connection;

  private String endpoint;

  private String maxBatchingRows;

  @Valid
  private Map<String, String> userDefinedContext = new HashMap<>();

  public RemoteFunctionOptions connection(String connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. Format: ```\"projects/{projectId}/locations/{locationId}/connections/{connectionId}\"```
   * @return connection
   */
  
  @Schema(name = "connection", description = "Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. Format: ```\"projects/{projectId}/locations/{locationId}/connections/{connectionId}\"```", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public RemoteFunctionOptions endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Endpoint of the user-provided remote service, e.g. ```https://us-east1-my_gcf_project.cloudfunctions.net/remote_add```
   * @return endpoint
   */
  
  @Schema(name = "endpoint", description = "Endpoint of the user-provided remote service, e.g. ```https://us-east1-my_gcf_project.cloudfunctions.net/remote_add```", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public RemoteFunctionOptions maxBatchingRows(String maxBatchingRows) {
    this.maxBatchingRows = maxBatchingRows;
    return this;
  }

  /**
   * Max number of rows in each batch sent to the remote service. If absent or if 0, BigQuery dynamically decides the number of rows in a batch.
   * @return maxBatchingRows
   */
  
  @Schema(name = "maxBatchingRows", description = "Max number of rows in each batch sent to the remote service. If absent or if 0, BigQuery dynamically decides the number of rows in a batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxBatchingRows")
  public String getMaxBatchingRows() {
    return maxBatchingRows;
  }

  public void setMaxBatchingRows(String maxBatchingRows) {
    this.maxBatchingRows = maxBatchingRows;
  }

  public RemoteFunctionOptions userDefinedContext(Map<String, String> userDefinedContext) {
    this.userDefinedContext = userDefinedContext;
    return this;
  }

  public RemoteFunctionOptions putUserDefinedContextItem(String key, String userDefinedContextItem) {
    if (this.userDefinedContext == null) {
      this.userDefinedContext = new HashMap<>();
    }
    this.userDefinedContext.put(key, userDefinedContextItem);
    return this;
  }

  /**
   * User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
   * @return userDefinedContext
   */
  
  @Schema(name = "userDefinedContext", description = "User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userDefinedContext")
  public Map<String, String> getUserDefinedContext() {
    return userDefinedContext;
  }

  public void setUserDefinedContext(Map<String, String> userDefinedContext) {
    this.userDefinedContext = userDefinedContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteFunctionOptions remoteFunctionOptions = (RemoteFunctionOptions) o;
    return Objects.equals(this.connection, remoteFunctionOptions.connection) &&
        Objects.equals(this.endpoint, remoteFunctionOptions.endpoint) &&
        Objects.equals(this.maxBatchingRows, remoteFunctionOptions.maxBatchingRows) &&
        Objects.equals(this.userDefinedContext, remoteFunctionOptions.userDefinedContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, endpoint, maxBatchingRows, userDefinedContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFunctionOptions {\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    maxBatchingRows: ").append(toIndentedString(maxBatchingRows)).append("\n");
    sb.append("    userDefinedContext: ").append(toIndentedString(userDefinedContext)).append("\n");
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

