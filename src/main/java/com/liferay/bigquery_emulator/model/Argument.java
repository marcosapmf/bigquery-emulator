package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery_emulator.model.StandardSqlDataType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Input/output argument of a function or a stored procedure.
 */

@Schema(name = "Argument", description = "Input/output argument of a function or a stored procedure.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Argument {

  /**
   * Optional. Defaults to FIXED_TYPE.
   */
  public enum ArgumentKindEnum {
    ARGUMENT_KIND_UNSPECIFIED("ARGUMENT_KIND_UNSPECIFIED"),
    
    FIXED_TYPE("FIXED_TYPE"),
    
    ANY_TYPE("ANY_TYPE");

    private String value;

    ArgumentKindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArgumentKindEnum fromValue(String value) {
      for (ArgumentKindEnum b : ArgumentKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ArgumentKindEnum argumentKind;

  private StandardSqlDataType dataType;

  /**
   * Optional. Specifies whether the argument is input or output. Can be set for procedures only.
   */
  public enum ModeEnum {
    MODE_UNSPECIFIED("MODE_UNSPECIFIED"),
    
    IN("IN"),
    
    OUT("OUT"),
    
    INOUT("INOUT");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModeEnum mode;

  private String name;

  public Argument argumentKind(ArgumentKindEnum argumentKind) {
    this.argumentKind = argumentKind;
    return this;
  }

  /**
   * Optional. Defaults to FIXED_TYPE.
   * @return argumentKind
   */
  
  @Schema(name = "argumentKind", description = "Optional. Defaults to FIXED_TYPE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("argumentKind")
  public ArgumentKindEnum getArgumentKind() {
    return argumentKind;
  }

  public void setArgumentKind(ArgumentKindEnum argumentKind) {
    this.argumentKind = argumentKind;
  }

  public Argument dataType(StandardSqlDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @Valid 
  @Schema(name = "dataType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataType")
  public StandardSqlDataType getDataType() {
    return dataType;
  }

  public void setDataType(StandardSqlDataType dataType) {
    this.dataType = dataType;
  }

  public Argument mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Optional. Specifies whether the argument is input or output. Can be set for procedures only.
   * @return mode
   */
  
  @Schema(name = "mode", description = "Optional. Specifies whether the argument is input or output. Can be set for procedures only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public Argument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The name of this argument. Can be absent for function return argument.
   * @return name
   */
  
  @Schema(name = "name", description = "Optional. The name of this argument. Can be absent for function return argument.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Argument argument = (Argument) o;
    return Objects.equals(this.argumentKind, argument.argumentKind) &&
        Objects.equals(this.dataType, argument.dataType) &&
        Objects.equals(this.mode, argument.mode) &&
        Objects.equals(this.name, argument.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argumentKind, dataType, mode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Argument {\n");
    sb.append("    argumentKind: ").append(toIndentedString(argumentKind)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

