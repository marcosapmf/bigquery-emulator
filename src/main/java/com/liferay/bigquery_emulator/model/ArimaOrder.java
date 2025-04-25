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
 * Arima order, can be used for both non-seasonal and seasonal parts.
 */

@Schema(name = "ArimaOrder", description = "Arima order, can be used for both non-seasonal and seasonal parts.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class ArimaOrder {

  private String d;

  private String p;

  private String q;

  public ArimaOrder d(String d) {
    this.d = d;
    return this;
  }

  /**
   * Order of the differencing part.
   * @return d
   */
  
  @Schema(name = "d", description = "Order of the differencing part.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("d")
  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  public ArimaOrder p(String p) {
    this.p = p;
    return this;
  }

  /**
   * Order of the autoregressive part.
   * @return p
   */
  
  @Schema(name = "p", description = "Order of the autoregressive part.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p")
  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  public ArimaOrder q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Order of the moving-average part.
   * @return q
   */
  
  @Schema(name = "q", description = "Order of the moving-average part.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("q")
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArimaOrder arimaOrder = (ArimaOrder) o;
    return Objects.equals(this.d, arimaOrder.d) &&
        Objects.equals(this.p, arimaOrder.p) &&
        Objects.equals(this.q, arimaOrder.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d, p, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArimaOrder {\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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

