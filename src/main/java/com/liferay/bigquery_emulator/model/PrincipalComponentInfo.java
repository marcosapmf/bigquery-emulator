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
 * Principal component infos, used only for eigen decomposition based models, e.g., PCA. Ordered by explained_variance in the descending order.
 */

@Schema(name = "PrincipalComponentInfo", description = "Principal component infos, used only for eigen decomposition based models, e.g., PCA. Ordered by explained_variance in the descending order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class PrincipalComponentInfo {

  private Double cumulativeExplainedVarianceRatio;

  private Double explainedVariance;

  private Double explainedVarianceRatio;

  private String principalComponentId;

  public PrincipalComponentInfo cumulativeExplainedVarianceRatio(Double cumulativeExplainedVarianceRatio) {
    this.cumulativeExplainedVarianceRatio = cumulativeExplainedVarianceRatio;
    return this;
  }

  /**
   * The explained_variance is pre-ordered in the descending order to compute the cumulative explained variance ratio.
   * @return cumulativeExplainedVarianceRatio
   */
  
  @Schema(name = "cumulativeExplainedVarianceRatio", description = "The explained_variance is pre-ordered in the descending order to compute the cumulative explained variance ratio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cumulativeExplainedVarianceRatio")
  public Double getCumulativeExplainedVarianceRatio() {
    return cumulativeExplainedVarianceRatio;
  }

  public void setCumulativeExplainedVarianceRatio(Double cumulativeExplainedVarianceRatio) {
    this.cumulativeExplainedVarianceRatio = cumulativeExplainedVarianceRatio;
  }

  public PrincipalComponentInfo explainedVariance(Double explainedVariance) {
    this.explainedVariance = explainedVariance;
    return this;
  }

  /**
   * Explained variance by this principal component, which is simply the eigenvalue.
   * @return explainedVariance
   */
  
  @Schema(name = "explainedVariance", description = "Explained variance by this principal component, which is simply the eigenvalue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explainedVariance")
  public Double getExplainedVariance() {
    return explainedVariance;
  }

  public void setExplainedVariance(Double explainedVariance) {
    this.explainedVariance = explainedVariance;
  }

  public PrincipalComponentInfo explainedVarianceRatio(Double explainedVarianceRatio) {
    this.explainedVarianceRatio = explainedVarianceRatio;
    return this;
  }

  /**
   * Explained_variance over the total explained variance.
   * @return explainedVarianceRatio
   */
  
  @Schema(name = "explainedVarianceRatio", description = "Explained_variance over the total explained variance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explainedVarianceRatio")
  public Double getExplainedVarianceRatio() {
    return explainedVarianceRatio;
  }

  public void setExplainedVarianceRatio(Double explainedVarianceRatio) {
    this.explainedVarianceRatio = explainedVarianceRatio;
  }

  public PrincipalComponentInfo principalComponentId(String principalComponentId) {
    this.principalComponentId = principalComponentId;
    return this;
  }

  /**
   * Id of the principal component.
   * @return principalComponentId
   */
  
  @Schema(name = "principalComponentId", description = "Id of the principal component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("principalComponentId")
  public String getPrincipalComponentId() {
    return principalComponentId;
  }

  public void setPrincipalComponentId(String principalComponentId) {
    this.principalComponentId = principalComponentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrincipalComponentInfo principalComponentInfo = (PrincipalComponentInfo) o;
    return Objects.equals(this.cumulativeExplainedVarianceRatio, principalComponentInfo.cumulativeExplainedVarianceRatio) &&
        Objects.equals(this.explainedVariance, principalComponentInfo.explainedVariance) &&
        Objects.equals(this.explainedVarianceRatio, principalComponentInfo.explainedVarianceRatio) &&
        Objects.equals(this.principalComponentId, principalComponentInfo.principalComponentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulativeExplainedVarianceRatio, explainedVariance, explainedVarianceRatio, principalComponentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrincipalComponentInfo {\n");
    sb.append("    cumulativeExplainedVarianceRatio: ").append(toIndentedString(cumulativeExplainedVarianceRatio)).append("\n");
    sb.append("    explainedVariance: ").append(toIndentedString(explainedVariance)).append("\n");
    sb.append("    explainedVarianceRatio: ").append(toIndentedString(explainedVarianceRatio)).append("\n");
    sb.append("    principalComponentId: ").append(toIndentedString(principalComponentId)).append("\n");
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

