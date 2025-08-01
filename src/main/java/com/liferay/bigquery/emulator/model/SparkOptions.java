package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Options for a user-defined Spark routine.
 */

@Schema(name = "SparkOptions", description = "Options for a user-defined Spark routine.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class SparkOptions {

  @Valid
  private List<String> archiveUris = new ArrayList<>();

  private String connection;

  private String containerImage;

  @Valid
  private List<String> fileUris = new ArrayList<>();

  @Valid
  private List<String> jarUris = new ArrayList<>();

  private String mainClass;

  private String mainFileUri;

  @Valid
  private Map<String, String> properties = new HashMap<>();

  @Valid
  private List<String> pyFileUris = new ArrayList<>();

  private String runtimeVersion;

  public SparkOptions archiveUris(List<String> archiveUris) {
    this.archiveUris = archiveUris;
    return this;
  }

  public SparkOptions addArchiveUrisItem(String archiveUrisItem) {
    if (this.archiveUris == null) {
      this.archiveUris = new ArrayList<>();
    }
    this.archiveUris.add(archiveUrisItem);
    return this;
  }

  /**
   * Archive files to be extracted into the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
   * @return archiveUris
   */
  
  @Schema(name = "archiveUris", description = "Archive files to be extracted into the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archiveUris")
  public List<String> getArchiveUris() {
    return archiveUris;
  }

  public void setArchiveUris(List<String> archiveUris) {
    this.archiveUris = archiveUris;
  }

  public SparkOptions connection(String connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Fully qualified name of the user-provided Spark connection object. Format: ```\"projects/{project_id}/locations/{location_id}/connections/{connection_id}\"```
   * @return connection
   */
  
  @Schema(name = "connection", description = "Fully qualified name of the user-provided Spark connection object. Format: ```\"projects/{project_id}/locations/{location_id}/connections/{connection_id}\"```", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public SparkOptions containerImage(String containerImage) {
    this.containerImage = containerImage;
    return this;
  }

  /**
   * Custom container image for the runtime environment.
   * @return containerImage
   */
  
  @Schema(name = "containerImage", description = "Custom container image for the runtime environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containerImage")
  public String getContainerImage() {
    return containerImage;
  }

  public void setContainerImage(String containerImage) {
    this.containerImage = containerImage;
  }

  public SparkOptions fileUris(List<String> fileUris) {
    this.fileUris = fileUris;
    return this;
  }

  public SparkOptions addFileUrisItem(String fileUrisItem) {
    if (this.fileUris == null) {
      this.fileUris = new ArrayList<>();
    }
    this.fileUris.add(fileUrisItem);
    return this;
  }

  /**
   * Files to be placed in the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
   * @return fileUris
   */
  
  @Schema(name = "fileUris", description = "Files to be placed in the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileUris")
  public List<String> getFileUris() {
    return fileUris;
  }

  public void setFileUris(List<String> fileUris) {
    this.fileUris = fileUris;
  }

  public SparkOptions jarUris(List<String> jarUris) {
    this.jarUris = jarUris;
    return this;
  }

  public SparkOptions addJarUrisItem(String jarUrisItem) {
    if (this.jarUris == null) {
      this.jarUris = new ArrayList<>();
    }
    this.jarUris.add(jarUrisItem);
    return this;
  }

  /**
   * JARs to include on the driver and executor CLASSPATH. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
   * @return jarUris
   */
  
  @Schema(name = "jarUris", description = "JARs to include on the driver and executor CLASSPATH. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jarUris")
  public List<String> getJarUris() {
    return jarUris;
  }

  public void setJarUris(List<String> jarUris) {
    this.jarUris = jarUris;
  }

  public SparkOptions mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

  /**
   * The fully qualified name of a class in jar_uris, for example, com.example.wordcount. Exactly one of main_class and main_jar_uri field should be set for Java/Scala language type.
   * @return mainClass
   */
  
  @Schema(name = "mainClass", description = "The fully qualified name of a class in jar_uris, for example, com.example.wordcount. Exactly one of main_class and main_jar_uri field should be set for Java/Scala language type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mainClass")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public SparkOptions mainFileUri(String mainFileUri) {
    this.mainFileUri = mainFileUri;
    return this;
  }

  /**
   * The main file/jar URI of the Spark application. Exactly one of the definition_body field and the main_file_uri field must be set for Python. Exactly one of main_class and main_file_uri field should be set for Java/Scala language type.
   * @return mainFileUri
   */
  
  @Schema(name = "mainFileUri", description = "The main file/jar URI of the Spark application. Exactly one of the definition_body field and the main_file_uri field must be set for Python. Exactly one of main_class and main_file_uri field should be set for Java/Scala language type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mainFileUri")
  public String getMainFileUri() {
    return mainFileUri;
  }

  public void setMainFileUri(String mainFileUri) {
    this.mainFileUri = mainFileUri;
  }

  public SparkOptions properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public SparkOptions putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Configuration properties as a set of key/value pairs, which will be passed on to the Spark application. For more information, see [Apache Spark](https://spark.apache.org/docs/latest/index.html) and the [procedure option list](https://cloud.google.com/bigquery/docs/reference/standard-sql/data-definition-language#procedure_option_list).
   * @return properties
   */
  
  @Schema(name = "properties", description = "Configuration properties as a set of key/value pairs, which will be passed on to the Spark application. For more information, see [Apache Spark](https://spark.apache.org/docs/latest/index.html) and the [procedure option list](https://cloud.google.com/bigquery/docs/reference/standard-sql/data-definition-language#procedure_option_list).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public SparkOptions pyFileUris(List<String> pyFileUris) {
    this.pyFileUris = pyFileUris;
    return this;
  }

  public SparkOptions addPyFileUrisItem(String pyFileUrisItem) {
    if (this.pyFileUris == null) {
      this.pyFileUris = new ArrayList<>();
    }
    this.pyFileUris.add(pyFileUrisItem);
    return this;
  }

  /**
   * Python files to be placed on the PYTHONPATH for PySpark application. Supported file types: `.py`, `.egg`, and `.zip`. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
   * @return pyFileUris
   */
  
  @Schema(name = "pyFileUris", description = "Python files to be placed on the PYTHONPATH for PySpark application. Supported file types: `.py`, `.egg`, and `.zip`. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pyFileUris")
  public List<String> getPyFileUris() {
    return pyFileUris;
  }

  public void setPyFileUris(List<String> pyFileUris) {
    this.pyFileUris = pyFileUris;
  }

  public SparkOptions runtimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

  /**
   * Runtime version. If not specified, the default runtime version is used.
   * @return runtimeVersion
   */
  
  @Schema(name = "runtimeVersion", description = "Runtime version. If not specified, the default runtime version is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkOptions sparkOptions = (SparkOptions) o;
    return Objects.equals(this.archiveUris, sparkOptions.archiveUris) &&
        Objects.equals(this.connection, sparkOptions.connection) &&
        Objects.equals(this.containerImage, sparkOptions.containerImage) &&
        Objects.equals(this.fileUris, sparkOptions.fileUris) &&
        Objects.equals(this.jarUris, sparkOptions.jarUris) &&
        Objects.equals(this.mainClass, sparkOptions.mainClass) &&
        Objects.equals(this.mainFileUri, sparkOptions.mainFileUri) &&
        Objects.equals(this.properties, sparkOptions.properties) &&
        Objects.equals(this.pyFileUris, sparkOptions.pyFileUris) &&
        Objects.equals(this.runtimeVersion, sparkOptions.runtimeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveUris, connection, containerImage, fileUris, jarUris, mainClass, mainFileUri, properties, pyFileUris, runtimeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkOptions {\n");
    sb.append("    archiveUris: ").append(toIndentedString(archiveUris)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    containerImage: ").append(toIndentedString(containerImage)).append("\n");
    sb.append("    fileUris: ").append(toIndentedString(fileUris)).append("\n");
    sb.append("    jarUris: ").append(toIndentedString(jarUris)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    mainFileUri: ").append(toIndentedString(mainFileUri)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    pyFileUris: ").append(toIndentedString(pyFileUris)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
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

