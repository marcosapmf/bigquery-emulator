package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery_emulator.model.Argument;
import com.liferay.bigquery_emulator.model.RemoteFunctionOptions;
import com.liferay.bigquery_emulator.model.RoutineReference;
import com.liferay.bigquery_emulator.model.SparkOptions;
import com.liferay.bigquery_emulator.model.StandardSqlDataType;
import com.liferay.bigquery_emulator.model.StandardSqlTableType;
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
 * A user-defined function or a stored procedure.
 */

@Schema(name = "Routine", description = "A user-defined function or a stored procedure.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Routine {

  @Valid
  private List<@Valid Argument> arguments = new ArrayList<>();

  private String creationTime;

  private String definitionBody;

  private String description;

  /**
   * Optional. The determinism level of the JavaScript UDF, if defined.
   */
  public enum DeterminismLevelEnum {
    DETERMINISM_LEVEL_UNSPECIFIED("DETERMINISM_LEVEL_UNSPECIFIED"),
    
    DETERMINISTIC("DETERMINISTIC"),
    
    NOT_DETERMINISTIC("NOT_DETERMINISTIC");

    private String value;

    DeterminismLevelEnum(String value) {
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
    public static DeterminismLevelEnum fromValue(String value) {
      for (DeterminismLevelEnum b : DeterminismLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeterminismLevelEnum determinismLevel;

  private String etag;

  @Valid
  private List<String> importedLibraries = new ArrayList<>();

  /**
   * Optional. Defaults to \"SQL\" if remote_function_options field is absent, not set otherwise.
   */
  public enum LanguageEnum {
    LANGUAGE_UNSPECIFIED("LANGUAGE_UNSPECIFIED"),
    
    SQL("SQL"),
    
    JAVASCRIPT("JAVASCRIPT"),
    
    PYTHON("PYTHON"),
    
    JAVA("JAVA"),
    
    SCALA("SCALA");

    private String value;

    LanguageEnum(String value) {
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
    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LanguageEnum language;

  private String lastModifiedTime;

  private RemoteFunctionOptions remoteFunctionOptions;

  private StandardSqlTableType returnTableType;

  private StandardSqlDataType returnType;

  private RoutineReference routineReference;

  /**
   * Required. The type of routine.
   */
  public enum RoutineTypeEnum {
    ROUTINE_TYPE_UNSPECIFIED("ROUTINE_TYPE_UNSPECIFIED"),
    
    SCALAR_FUNCTION("SCALAR_FUNCTION"),
    
    PROCEDURE("PROCEDURE"),
    
    TABLE_VALUED_FUNCTION("TABLE_VALUED_FUNCTION");

    private String value;

    RoutineTypeEnum(String value) {
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
    public static RoutineTypeEnum fromValue(String value) {
      for (RoutineTypeEnum b : RoutineTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoutineTypeEnum routineType;

  private SparkOptions sparkOptions;

  private Boolean strictMode;

  public Routine arguments(List<@Valid Argument> arguments) {
    this.arguments = arguments;
    return this;
  }

  public Routine addArgumentsItem(Argument argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Optional.
   * @return arguments
   */
  @Valid 
  @Schema(name = "arguments", description = "Optional.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public List<@Valid Argument> getArguments() {
    return arguments;
  }

  public void setArguments(List<@Valid Argument> arguments) {
    this.arguments = arguments;
  }

  public Routine creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Output only. The time when this routine was created, in milliseconds since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this routine was created, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Routine definitionBody(String definitionBody) {
    this.definitionBody = definitionBody;
    return this;
  }

  /**
   * Required. The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, \"\\n\", y))` The definition_body is `concat(x, \"\\n\", y)` (\\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS 'return \"\\n\";\\n'` The definition_body is `return \"\\n\";\\n` Note that both \\n are replaced with linebreaks.
   * @return definitionBody
   */
  
  @Schema(name = "definitionBody", description = "Required. The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, \"\\n\", y))` The definition_body is `concat(x, \"\\n\", y)` (\\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS 'return \"\\n\";\\n'` The definition_body is `return \"\\n\";\\n` Note that both \\n are replaced with linebreaks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("definitionBody")
  public String getDefinitionBody() {
    return definitionBody;
  }

  public void setDefinitionBody(String definitionBody) {
    this.definitionBody = definitionBody;
  }

  public Routine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The description of the routine, if defined.
   * @return description
   */
  
  @Schema(name = "description", description = "Optional. The description of the routine, if defined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Routine determinismLevel(DeterminismLevelEnum determinismLevel) {
    this.determinismLevel = determinismLevel;
    return this;
  }

  /**
   * Optional. The determinism level of the JavaScript UDF, if defined.
   * @return determinismLevel
   */
  
  @Schema(name = "determinismLevel", description = "Optional. The determinism level of the JavaScript UDF, if defined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("determinismLevel")
  public DeterminismLevelEnum getDeterminismLevel() {
    return determinismLevel;
  }

  public void setDeterminismLevel(DeterminismLevelEnum determinismLevel) {
    this.determinismLevel = determinismLevel;
  }

  public Routine etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. A hash of this resource.
   * @return etag
   */
  
  @Schema(name = "etag", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. A hash of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Routine importedLibraries(List<String> importedLibraries) {
    this.importedLibraries = importedLibraries;
    return this;
  }

  public Routine addImportedLibrariesItem(String importedLibrariesItem) {
    if (this.importedLibraries == null) {
      this.importedLibraries = new ArrayList<>();
    }
    this.importedLibraries.add(importedLibrariesItem);
    return this;
  }

  /**
   * Optional. If language = \"JAVASCRIPT\", this field stores the path of the imported JAVASCRIPT libraries.
   * @return importedLibraries
   */
  
  @Schema(name = "importedLibraries", description = "Optional. If language = \"JAVASCRIPT\", this field stores the path of the imported JAVASCRIPT libraries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importedLibraries")
  public List<String> getImportedLibraries() {
    return importedLibraries;
  }

  public void setImportedLibraries(List<String> importedLibraries) {
    this.importedLibraries = importedLibraries;
  }

  public Routine language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * Optional. Defaults to \"SQL\" if remote_function_options field is absent, not set otherwise.
   * @return language
   */
  
  @Schema(name = "language", description = "Optional. Defaults to \"SQL\" if remote_function_options field is absent, not set otherwise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public Routine lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Output only. The time when this routine was last modified, in milliseconds since the epoch.
   * @return lastModifiedTime
   */
  
  @Schema(name = "lastModifiedTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this routine was last modified, in milliseconds since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedTime")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Routine remoteFunctionOptions(RemoteFunctionOptions remoteFunctionOptions) {
    this.remoteFunctionOptions = remoteFunctionOptions;
    return this;
  }

  /**
   * Get remoteFunctionOptions
   * @return remoteFunctionOptions
   */
  @Valid 
  @Schema(name = "remoteFunctionOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remoteFunctionOptions")
  public RemoteFunctionOptions getRemoteFunctionOptions() {
    return remoteFunctionOptions;
  }

  public void setRemoteFunctionOptions(RemoteFunctionOptions remoteFunctionOptions) {
    this.remoteFunctionOptions = remoteFunctionOptions;
  }

  public Routine returnTableType(StandardSqlTableType returnTableType) {
    this.returnTableType = returnTableType;
    return this;
  }

  /**
   * Get returnTableType
   * @return returnTableType
   */
  @Valid 
  @Schema(name = "returnTableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnTableType")
  public StandardSqlTableType getReturnTableType() {
    return returnTableType;
  }

  public void setReturnTableType(StandardSqlTableType returnTableType) {
    this.returnTableType = returnTableType;
  }

  public Routine returnType(StandardSqlDataType returnType) {
    this.returnType = returnType;
    return this;
  }

  /**
   * Get returnType
   * @return returnType
   */
  @Valid 
  @Schema(name = "returnType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnType")
  public StandardSqlDataType getReturnType() {
    return returnType;
  }

  public void setReturnType(StandardSqlDataType returnType) {
    this.returnType = returnType;
  }

  public Routine routineReference(RoutineReference routineReference) {
    this.routineReference = routineReference;
    return this;
  }

  /**
   * Get routineReference
   * @return routineReference
   */
  @Valid 
  @Schema(name = "routineReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routineReference")
  public RoutineReference getRoutineReference() {
    return routineReference;
  }

  public void setRoutineReference(RoutineReference routineReference) {
    this.routineReference = routineReference;
  }

  public Routine routineType(RoutineTypeEnum routineType) {
    this.routineType = routineType;
    return this;
  }

  /**
   * Required. The type of routine.
   * @return routineType
   */
  
  @Schema(name = "routineType", description = "Required. The type of routine.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routineType")
  public RoutineTypeEnum getRoutineType() {
    return routineType;
  }

  public void setRoutineType(RoutineTypeEnum routineType) {
    this.routineType = routineType;
  }

  public Routine sparkOptions(SparkOptions sparkOptions) {
    this.sparkOptions = sparkOptions;
    return this;
  }

  /**
   * Get sparkOptions
   * @return sparkOptions
   */
  @Valid 
  @Schema(name = "sparkOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sparkOptions")
  public SparkOptions getSparkOptions() {
    return sparkOptions;
  }

  public void setSparkOptions(SparkOptions sparkOptions) {
    this.sparkOptions = sparkOptions;
  }

  public Routine strictMode(Boolean strictMode) {
    this.strictMode = strictMode;
    return this;
  }

  /**
   * Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
   * @return strictMode
   */
  
  @Schema(name = "strictMode", description = "Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("strictMode")
  public Boolean getStrictMode() {
    return strictMode;
  }

  public void setStrictMode(Boolean strictMode) {
    this.strictMode = strictMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routine routine = (Routine) o;
    return Objects.equals(this.arguments, routine.arguments) &&
        Objects.equals(this.creationTime, routine.creationTime) &&
        Objects.equals(this.definitionBody, routine.definitionBody) &&
        Objects.equals(this.description, routine.description) &&
        Objects.equals(this.determinismLevel, routine.determinismLevel) &&
        Objects.equals(this.etag, routine.etag) &&
        Objects.equals(this.importedLibraries, routine.importedLibraries) &&
        Objects.equals(this.language, routine.language) &&
        Objects.equals(this.lastModifiedTime, routine.lastModifiedTime) &&
        Objects.equals(this.remoteFunctionOptions, routine.remoteFunctionOptions) &&
        Objects.equals(this.returnTableType, routine.returnTableType) &&
        Objects.equals(this.returnType, routine.returnType) &&
        Objects.equals(this.routineReference, routine.routineReference) &&
        Objects.equals(this.routineType, routine.routineType) &&
        Objects.equals(this.sparkOptions, routine.sparkOptions) &&
        Objects.equals(this.strictMode, routine.strictMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, creationTime, definitionBody, description, determinismLevel, etag, importedLibraries, language, lastModifiedTime, remoteFunctionOptions, returnTableType, returnType, routineReference, routineType, sparkOptions, strictMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routine {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    definitionBody: ").append(toIndentedString(definitionBody)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    determinismLevel: ").append(toIndentedString(determinismLevel)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    importedLibraries: ").append(toIndentedString(importedLibraries)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    remoteFunctionOptions: ").append(toIndentedString(remoteFunctionOptions)).append("\n");
    sb.append("    returnTableType: ").append(toIndentedString(returnTableType)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    routineReference: ").append(toIndentedString(routineReference)).append("\n");
    sb.append("    routineType: ").append(toIndentedString(routineType)).append("\n");
    sb.append("    sparkOptions: ").append(toIndentedString(sparkOptions)).append("\n");
    sb.append("    strictMode: ").append(toIndentedString(strictMode)).append("\n");
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

