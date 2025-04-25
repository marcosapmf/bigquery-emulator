package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.BiEngineReason;
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
 * BiEngineStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class BiEngineStatistics {

  private String accelerationMode = "";

  private String biEngineMode = "";

  @Valid
  private List<@Valid BiEngineReason> biEngineReasons = new ArrayList<>();

  public BiEngineStatistics accelerationMode(String accelerationMode) {
    this.accelerationMode = accelerationMode;
    return this;
  }

  /**
   * [Output-only] Specifies which mode of BI Engine acceleration was performed (if any).
   * @return accelerationMode
   */
  
  @Schema(name = "accelerationMode", description = "[Output-only] Specifies which mode of BI Engine acceleration was performed (if any).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accelerationMode")
  public String getAccelerationMode() {
    return accelerationMode;
  }

  public void setAccelerationMode(String accelerationMode) {
    this.accelerationMode = accelerationMode;
  }

  public BiEngineStatistics biEngineMode(String biEngineMode) {
    this.biEngineMode = biEngineMode;
    return this;
  }

  /**
   * [Output-only] Specifies which mode of BI Engine acceleration was performed (if any).
   * @return biEngineMode
   */
  
  @Schema(name = "biEngineMode", description = "[Output-only] Specifies which mode of BI Engine acceleration was performed (if any).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biEngineMode")
  public String getBiEngineMode() {
    return biEngineMode;
  }

  public void setBiEngineMode(String biEngineMode) {
    this.biEngineMode = biEngineMode;
  }

  public BiEngineStatistics biEngineReasons(List<@Valid BiEngineReason> biEngineReasons) {
    this.biEngineReasons = biEngineReasons;
    return this;
  }

  public BiEngineStatistics addBiEngineReasonsItem(BiEngineReason biEngineReasonsItem) {
    if (this.biEngineReasons == null) {
      this.biEngineReasons = new ArrayList<>();
    }
    this.biEngineReasons.add(biEngineReasonsItem);
    return this;
  }

  /**
   * In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is not populated.
   * @return biEngineReasons
   */
  @Valid 
  @Schema(name = "biEngineReasons", description = "In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is not populated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biEngineReasons")
  public List<@Valid BiEngineReason> getBiEngineReasons() {
    return biEngineReasons;
  }

  public void setBiEngineReasons(List<@Valid BiEngineReason> biEngineReasons) {
    this.biEngineReasons = biEngineReasons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiEngineStatistics biEngineStatistics = (BiEngineStatistics) o;
    return Objects.equals(this.accelerationMode, biEngineStatistics.accelerationMode) &&
        Objects.equals(this.biEngineMode, biEngineStatistics.biEngineMode) &&
        Objects.equals(this.biEngineReasons, biEngineStatistics.biEngineReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerationMode, biEngineMode, biEngineReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiEngineStatistics {\n");
    sb.append("    accelerationMode: ").append(toIndentedString(accelerationMode)).append("\n");
    sb.append("    biEngineMode: ").append(toIndentedString(biEngineMode)).append("\n");
    sb.append("    biEngineReasons: ").append(toIndentedString(biEngineReasons)).append("\n");
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

