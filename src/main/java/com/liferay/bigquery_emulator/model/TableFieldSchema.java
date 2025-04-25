package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.TableFieldSchemaCategories;
import com.liferay.bigquery_emulator.model.TableFieldSchemaPolicyTags;
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
 * TableFieldSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TableFieldSchema {

  private TableFieldSchemaCategories categories;

  private String collation;

  private String defaultValueExpression;

  private String description;

  @Valid
  private List<@Valid TableFieldSchema> fields = new ArrayList<>();

  private String maxLength;

  private String mode;

  private String name;

  private TableFieldSchemaPolicyTags policyTags;

  private String precision;

  private String roundingMode;

  private String scale;

  private String type;

  public TableFieldSchema categories(TableFieldSchemaCategories categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public TableFieldSchemaCategories getCategories() {
    return categories;
  }

  public void setCategories(TableFieldSchemaCategories categories) {
    this.categories = categories;
  }

  public TableFieldSchema collation(String collation) {
    this.collation = collation;
    return this;
  }

  /**
   * Optional. Collation specification of the field. It only can be set on string type field.
   * @return collation
   */
  
  @Schema(name = "collation", description = "Optional. Collation specification of the field. It only can be set on string type field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collation")
  public String getCollation() {
    return collation;
  }

  public void setCollation(String collation) {
    this.collation = collation;
  }

  public TableFieldSchema defaultValueExpression(String defaultValueExpression) {
    this.defaultValueExpression = defaultValueExpression;
    return this;
  }

  /**
   * Optional. A SQL expression to specify the default value for this field. It can only be set for top level fields (columns). You can use struct or array expression to specify default value for the entire struct or array. The valid SQL expressions are: - Literals for all data types, including STRUCT and ARRAY. - Following functions: - CURRENT_TIMESTAMP - CURRENT_TIME - CURRENT_DATE - CURRENT_DATETIME - GENERATE_UUID - RAND - SESSION_USER - ST_GEOGPOINT - Struct or array composed with the above allowed functions, for example, [CURRENT_DATE(), DATE '2020-01-01']
   * @return defaultValueExpression
   */
  
  @Schema(name = "defaultValueExpression", description = "Optional. A SQL expression to specify the default value for this field. It can only be set for top level fields (columns). You can use struct or array expression to specify default value for the entire struct or array. The valid SQL expressions are: - Literals for all data types, including STRUCT and ARRAY. - Following functions: - CURRENT_TIMESTAMP - CURRENT_TIME - CURRENT_DATE - CURRENT_DATETIME - GENERATE_UUID - RAND - SESSION_USER - ST_GEOGPOINT - Struct or array composed with the above allowed functions, for example, [CURRENT_DATE(), DATE '2020-01-01']", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultValueExpression")
  public String getDefaultValueExpression() {
    return defaultValueExpression;
  }

  public void setDefaultValueExpression(String defaultValueExpression) {
    this.defaultValueExpression = defaultValueExpression;
  }

  public TableFieldSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * @return description
   */
  
  @Schema(name = "description", description = "[Optional] The field description. The maximum length is 1,024 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TableFieldSchema fields(List<@Valid TableFieldSchema> fields) {
    this.fields = fields;
    return this;
  }

  public TableFieldSchema addFieldsItem(TableFieldSchema fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * @return fields
   */
  @Valid 
  @Schema(name = "fields", description = "[Optional] Describes the nested schema fields if the type property is set to RECORD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<@Valid TableFieldSchema> getFields() {
    return fields;
  }

  public void setFields(List<@Valid TableFieldSchema> fields) {
    this.fields = fields;
  }

  public TableFieldSchema maxLength(String maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = \"STRING\", then max_length represents the maximum UTF-8 length of strings in this field. If type = \"BYTES\", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type â‰  \"STRING\" and â‰  \"BYTES\".
   * @return maxLength
   */
  
  @Schema(name = "maxLength", description = "[Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = \"STRING\", then max_length represents the maximum UTF-8 length of strings in this field. If type = \"BYTES\", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type â‰  \"STRING\" and â‰  \"BYTES\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxLength")
  public String getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  public TableFieldSchema mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
   * @return mode
   */
  
  @Schema(name = "mode", description = "[Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public TableFieldSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
   * @return name
   */
  
  @Schema(name = "name", description = "[Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TableFieldSchema policyTags(TableFieldSchemaPolicyTags policyTags) {
    this.policyTags = policyTags;
    return this;
  }

  /**
   * Get policyTags
   * @return policyTags
   */
  @Valid 
  @Schema(name = "policyTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyTags")
  public TableFieldSchemaPolicyTags getPolicyTags() {
    return policyTags;
  }

  public void setPolicyTags(TableFieldSchemaPolicyTags policyTags) {
    this.policyTags = policyTags;
  }

  public TableFieldSchema precision(String precision) {
    this.precision = precision;
    return this;
  }

  /**
   * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type â‰  \"NUMERIC\" and â‰  \"BIGNUMERIC\". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = \"NUMERIC\": 1 â‰¤ precision - scale â‰¤ 29 and 0 â‰¤ scale â‰¤ 9. - If type = \"BIGNUMERIC\": 1 â‰¤ precision - scale â‰¤ 38 and 0 â‰¤ scale â‰¤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = \"NUMERIC\": 1 â‰¤ precision â‰¤ 29. - If type = \"BIGNUMERIC\": 1 â‰¤ precision â‰¤ 38. If scale is specified but not precision, then it is invalid.
   * @return precision
   */
  
  @Schema(name = "precision", description = "[Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type â‰  \"NUMERIC\" and â‰  \"BIGNUMERIC\". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = \"NUMERIC\": 1 â‰¤ precision - scale â‰¤ 29 and 0 â‰¤ scale â‰¤ 9. - If type = \"BIGNUMERIC\": 1 â‰¤ precision - scale â‰¤ 38 and 0 â‰¤ scale â‰¤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = \"NUMERIC\": 1 â‰¤ precision â‰¤ 29. - If type = \"BIGNUMERIC\": 1 â‰¤ precision â‰¤ 38. If scale is specified but not precision, then it is invalid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public String getPrecision() {
    return precision;
  }

  public void setPrecision(String precision) {
    this.precision = precision;
  }

  public TableFieldSchema roundingMode(String roundingMode) {
    this.roundingMode = roundingMode;
    return this;
  }

  /**
   * Optional. Rounding Mode specification of the field. It only can be set on NUMERIC or BIGNUMERIC type fields.
   * @return roundingMode
   */
  
  @Schema(name = "roundingMode", description = "Optional. Rounding Mode specification of the field. It only can be set on NUMERIC or BIGNUMERIC type fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roundingMode")
  public String getRoundingMode() {
    return roundingMode;
  }

  public void setRoundingMode(String roundingMode) {
    this.roundingMode = roundingMode;
  }

  public TableFieldSchema scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * [Optional] See documentation for precision.
   * @return scale
   */
  
  @Schema(name = "scale", description = "[Optional] See documentation for precision.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scale")
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }

  public TableFieldSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
   * @return type
   */
  
  @Schema(name = "type", description = "[Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFieldSchema tableFieldSchema = (TableFieldSchema) o;
    return Objects.equals(this.categories, tableFieldSchema.categories) &&
        Objects.equals(this.collation, tableFieldSchema.collation) &&
        Objects.equals(this.defaultValueExpression, tableFieldSchema.defaultValueExpression) &&
        Objects.equals(this.description, tableFieldSchema.description) &&
        Objects.equals(this.fields, tableFieldSchema.fields) &&
        Objects.equals(this.maxLength, tableFieldSchema.maxLength) &&
        Objects.equals(this.mode, tableFieldSchema.mode) &&
        Objects.equals(this.name, tableFieldSchema.name) &&
        Objects.equals(this.policyTags, tableFieldSchema.policyTags) &&
        Objects.equals(this.precision, tableFieldSchema.precision) &&
        Objects.equals(this.roundingMode, tableFieldSchema.roundingMode) &&
        Objects.equals(this.scale, tableFieldSchema.scale) &&
        Objects.equals(this.type, tableFieldSchema.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, collation, defaultValueExpression, description, fields, maxLength, mode, name, policyTags, precision, roundingMode, scale, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFieldSchema {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    collation: ").append(toIndentedString(collation)).append("\n");
    sb.append("    defaultValueExpression: ").append(toIndentedString(defaultValueExpression)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyTags: ").append(toIndentedString(policyTags)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    roundingMode: ").append(toIndentedString(roundingMode)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

