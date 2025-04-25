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
 * EncryptionConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class EncryptionConfiguration {

  private String kmsKeyName;

  public EncryptionConfiguration kmsKeyName(String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
   * @return kmsKeyName
   */
  
  @Schema(name = "kmsKeyName", description = "[Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kmsKeyName")
  public String getKmsKeyName() {
    return kmsKeyName;
  }

  public void setKmsKeyName(String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionConfiguration encryptionConfiguration = (EncryptionConfiguration) o;
    return Objects.equals(this.kmsKeyName, encryptionConfiguration.kmsKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionConfiguration {\n");
    sb.append("    kmsKeyName: ").append(toIndentedString(kmsKeyName)).append("\n");
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

