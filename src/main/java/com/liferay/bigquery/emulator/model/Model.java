package com.liferay.bigquery.emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery.emulator.model.EncryptionConfiguration;
import com.liferay.bigquery.emulator.model.HparamSearchSpaces;
import com.liferay.bigquery.emulator.model.HparamTuningTrial;
import com.liferay.bigquery.emulator.model.ModelReference;
import com.liferay.bigquery.emulator.model.StandardSqlField;
import com.liferay.bigquery.emulator.model.TrainingRun;

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
 * Model
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class Model {

  private String bestTrialId;

  private String creationTime;

  private String defaultTrialId;

  private String description;

  private EncryptionConfiguration encryptionConfiguration;

  private String etag;

  private String expirationTime;

  @Valid
  private List<@Valid StandardSqlField> featureColumns = new ArrayList<>();

  private String friendlyName;

  private HparamSearchSpaces hparamSearchSpaces;

  @Valid
  private List<@Valid HparamTuningTrial> hparamTrials = new ArrayList<>();

  @Valid
  private List<@Valid StandardSqlField> labelColumns = new ArrayList<>();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String lastModifiedTime;

  private String location;

  private ModelReference modelReference;

  /**
   * Output only. Type of the model resource.
   */
  public enum ModelTypeEnum {
    MODEL_TYPE_UNSPECIFIED("MODEL_TYPE_UNSPECIFIED"),
    
    LINEAR_REGRESSION("LINEAR_REGRESSION"),
    
    LOGISTIC_REGRESSION("LOGISTIC_REGRESSION"),
    
    KMEANS("KMEANS"),
    
    MATRIX_FACTORIZATION("MATRIX_FACTORIZATION"),
    
    DNN_CLASSIFIER("DNN_CLASSIFIER"),
    
    TENSORFLOW("TENSORFLOW"),
    
    DNN_REGRESSOR("DNN_REGRESSOR"),
    
    BOOSTED_TREE_REGRESSOR("BOOSTED_TREE_REGRESSOR"),
    
    BOOSTED_TREE_CLASSIFIER("BOOSTED_TREE_CLASSIFIER"),
    
    ARIMA("ARIMA"),
    
    AUTOML_REGRESSOR("AUTOML_REGRESSOR"),
    
    AUTOML_CLASSIFIER("AUTOML_CLASSIFIER"),
    
    PCA("PCA"),
    
    DNN_LINEAR_COMBINED_CLASSIFIER("DNN_LINEAR_COMBINED_CLASSIFIER"),
    
    DNN_LINEAR_COMBINED_REGRESSOR("DNN_LINEAR_COMBINED_REGRESSOR"),
    
    AUTOENCODER("AUTOENCODER"),
    
    ARIMA_PLUS("ARIMA_PLUS"),
    
    RANDOM_FOREST_REGRESSOR("RANDOM_FOREST_REGRESSOR"),
    
    RANDOM_FOREST_CLASSIFIER("RANDOM_FOREST_CLASSIFIER");

    private String value;

    ModelTypeEnum(String value) {
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
    public static ModelTypeEnum fromValue(String value) {
      for (ModelTypeEnum b : ModelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModelTypeEnum modelType;

  @Valid
  private List<String> optimalTrialIds = new ArrayList<>();

  @Valid
  private List<@Valid TrainingRun> trainingRuns = new ArrayList<>();

  public Model bestTrialId(String bestTrialId) {
    this.bestTrialId = bestTrialId;
    return this;
  }

  /**
   * The best trial_id across all training runs.
   * @return bestTrialId
   */
  
  @Schema(name = "bestTrialId", description = "The best trial_id across all training runs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bestTrialId")
  public String getBestTrialId() {
    return bestTrialId;
  }

  public void setBestTrialId(String bestTrialId) {
    this.bestTrialId = bestTrialId;
  }

  public Model creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Output only. The time when this model was created, in millisecs since the epoch.
   * @return creationTime
   */
  
  @Schema(name = "creationTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this model was created, in millisecs since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Model defaultTrialId(String defaultTrialId) {
    this.defaultTrialId = defaultTrialId;
    return this;
  }

  /**
   * Output only. The default trial_id to use in TVFs when the trial_id is not passed in. For single-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the best trial ID. For multi-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the smallest trial ID among all Pareto optimal trials.
   * @return defaultTrialId
   */
  
  @Schema(name = "defaultTrialId", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The default trial_id to use in TVFs when the trial_id is not passed in. For single-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the best trial ID. For multi-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the smallest trial ID among all Pareto optimal trials.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTrialId")
  public String getDefaultTrialId() {
    return defaultTrialId;
  }

  public void setDefaultTrialId(String defaultTrialId) {
    this.defaultTrialId = defaultTrialId;
  }

  public Model description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. A user-friendly description of this model.
   * @return description
   */
  
  @Schema(name = "description", description = "Optional. A user-friendly description of this model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Model encryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
    return this;
  }

  /**
   * Get encryptionConfiguration
   * @return encryptionConfiguration
   */
  @Valid 
  @Schema(name = "encryptionConfiguration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encryptionConfiguration")
  public EncryptionConfiguration getEncryptionConfiguration() {
    return encryptionConfiguration;
  }

  public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
  }

  public Model etag(String etag) {
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

  public Model expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Optional. The time when this model expires, in milliseconds since the epoch. If not present, the model will persist indefinitely. Expired models will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created models.
   * @return expirationTime
   */
  
  @Schema(name = "expirationTime", description = "Optional. The time when this model expires, in milliseconds since the epoch. If not present, the model will persist indefinitely. Expired models will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationTime")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public Model featureColumns(List<@Valid StandardSqlField> featureColumns) {
    this.featureColumns = featureColumns;
    return this;
  }

  public Model addFeatureColumnsItem(StandardSqlField featureColumnsItem) {
    if (this.featureColumns == null) {
      this.featureColumns = new ArrayList<>();
    }
    this.featureColumns.add(featureColumnsItem);
    return this;
  }

  /**
   * Output only. Input feature columns that were used to train this model.
   * @return featureColumns
   */
  @Valid 
  @Schema(name = "featureColumns", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Input feature columns that were used to train this model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureColumns")
  public List<@Valid StandardSqlField> getFeatureColumns() {
    return featureColumns;
  }

  public void setFeatureColumns(List<@Valid StandardSqlField> featureColumns) {
    this.featureColumns = featureColumns;
  }

  public Model friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Optional. A descriptive name for this model.
   * @return friendlyName
   */
  
  @Schema(name = "friendlyName", description = "Optional. A descriptive name for this model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Model hparamSearchSpaces(HparamSearchSpaces hparamSearchSpaces) {
    this.hparamSearchSpaces = hparamSearchSpaces;
    return this;
  }

  /**
   * Get hparamSearchSpaces
   * @return hparamSearchSpaces
   */
  @Valid 
  @Schema(name = "hparamSearchSpaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hparamSearchSpaces")
  public HparamSearchSpaces getHparamSearchSpaces() {
    return hparamSearchSpaces;
  }

  public void setHparamSearchSpaces(HparamSearchSpaces hparamSearchSpaces) {
    this.hparamSearchSpaces = hparamSearchSpaces;
  }

  public Model hparamTrials(List<@Valid HparamTuningTrial> hparamTrials) {
    this.hparamTrials = hparamTrials;
    return this;
  }

  public Model addHparamTrialsItem(HparamTuningTrial hparamTrialsItem) {
    if (this.hparamTrials == null) {
      this.hparamTrials = new ArrayList<>();
    }
    this.hparamTrials.add(hparamTrialsItem);
    return this;
  }

  /**
   * Output only. Trials of a [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) model sorted by trial_id.
   * @return hparamTrials
   */
  @Valid 
  @Schema(name = "hparamTrials", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Trials of a [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) model sorted by trial_id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hparamTrials")
  public List<@Valid HparamTuningTrial> getHparamTrials() {
    return hparamTrials;
  }

  public void setHparamTrials(List<@Valid HparamTuningTrial> hparamTrials) {
    this.hparamTrials = hparamTrials;
  }

  public Model labelColumns(List<@Valid StandardSqlField> labelColumns) {
    this.labelColumns = labelColumns;
    return this;
  }

  public Model addLabelColumnsItem(StandardSqlField labelColumnsItem) {
    if (this.labelColumns == null) {
      this.labelColumns = new ArrayList<>();
    }
    this.labelColumns.add(labelColumnsItem);
    return this;
  }

  /**
   * Output only. Label columns that were used to train this model. The output of the model will have a \"predicted_\" prefix to these columns.
   * @return labelColumns
   */
  @Valid 
  @Schema(name = "labelColumns", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Label columns that were used to train this model. The output of the model will have a \"predicted_\" prefix to these columns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labelColumns")
  public List<@Valid StandardSqlField> getLabelColumns() {
    return labelColumns;
  }

  public void setLabelColumns(List<@Valid StandardSqlField> labelColumns) {
    this.labelColumns = labelColumns;
  }

  public Model labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Model putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * The labels associated with this model. You can use these to organize and group your models. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
   * @return labels
   */
  
  @Schema(name = "labels", description = "The labels associated with this model. You can use these to organize and group your models. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public Model lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Output only. The time when this model was last modified, in millisecs since the epoch.
   * @return lastModifiedTime
   */
  
  @Schema(name = "lastModifiedTime", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The time when this model was last modified, in millisecs since the epoch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedTime")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Model location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Output only. The geographic location where the model resides. This value is inherited from the dataset.
   * @return location
   */
  
  @Schema(name = "location", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. The geographic location where the model resides. This value is inherited from the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Model modelReference(ModelReference modelReference) {
    this.modelReference = modelReference;
    return this;
  }

  /**
   * Get modelReference
   * @return modelReference
   */
  @Valid 
  @Schema(name = "modelReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelReference")
  public ModelReference getModelReference() {
    return modelReference;
  }

  public void setModelReference(ModelReference modelReference) {
    this.modelReference = modelReference;
  }

  public Model modelType(ModelTypeEnum modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Output only. Type of the model resource.
   * @return modelType
   */
  
  @Schema(name = "modelType", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. Type of the model resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelType")
  public ModelTypeEnum getModelType() {
    return modelType;
  }

  public void setModelType(ModelTypeEnum modelType) {
    this.modelType = modelType;
  }

  public Model optimalTrialIds(List<String> optimalTrialIds) {
    this.optimalTrialIds = optimalTrialIds;
    return this;
  }

  public Model addOptimalTrialIdsItem(String optimalTrialIdsItem) {
    if (this.optimalTrialIds == null) {
      this.optimalTrialIds = new ArrayList<>();
    }
    this.optimalTrialIds.add(optimalTrialIdsItem);
    return this;
  }

  /**
   * Output only. For single-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it only contains the best trial. For multi-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it contains all Pareto optimal trials sorted by trial_id.
   * @return optimalTrialIds
   */
  
  @Schema(name = "optimalTrialIds", accessMode = Schema.AccessMode.READ_ONLY, description = "Output only. For single-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it only contains the best trial. For multi-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it contains all Pareto optimal trials sorted by trial_id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimalTrialIds")
  public List<String> getOptimalTrialIds() {
    return optimalTrialIds;
  }

  public void setOptimalTrialIds(List<String> optimalTrialIds) {
    this.optimalTrialIds = optimalTrialIds;
  }

  public Model trainingRuns(List<@Valid TrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
    return this;
  }

  public Model addTrainingRunsItem(TrainingRun trainingRunsItem) {
    if (this.trainingRuns == null) {
      this.trainingRuns = new ArrayList<>();
    }
    this.trainingRuns.add(trainingRunsItem);
    return this;
  }

  /**
   * Information for all training runs in increasing order of start_time.
   * @return trainingRuns
   */
  @Valid 
  @Schema(name = "trainingRuns", description = "Information for all training runs in increasing order of start_time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainingRuns")
  public List<@Valid TrainingRun> getTrainingRuns() {
    return trainingRuns;
  }

  public void setTrainingRuns(List<@Valid TrainingRun> trainingRuns) {
    this.trainingRuns = trainingRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.bestTrialId, model.bestTrialId) &&
        Objects.equals(this.creationTime, model.creationTime) &&
        Objects.equals(this.defaultTrialId, model.defaultTrialId) &&
        Objects.equals(this.description, model.description) &&
        Objects.equals(this.encryptionConfiguration, model.encryptionConfiguration) &&
        Objects.equals(this.etag, model.etag) &&
        Objects.equals(this.expirationTime, model.expirationTime) &&
        Objects.equals(this.featureColumns, model.featureColumns) &&
        Objects.equals(this.friendlyName, model.friendlyName) &&
        Objects.equals(this.hparamSearchSpaces, model.hparamSearchSpaces) &&
        Objects.equals(this.hparamTrials, model.hparamTrials) &&
        Objects.equals(this.labelColumns, model.labelColumns) &&
        Objects.equals(this.labels, model.labels) &&
        Objects.equals(this.lastModifiedTime, model.lastModifiedTime) &&
        Objects.equals(this.location, model.location) &&
        Objects.equals(this.modelReference, model.modelReference) &&
        Objects.equals(this.modelType, model.modelType) &&
        Objects.equals(this.optimalTrialIds, model.optimalTrialIds) &&
        Objects.equals(this.trainingRuns, model.trainingRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestTrialId, creationTime, defaultTrialId, description, encryptionConfiguration, etag, expirationTime, featureColumns, friendlyName, hparamSearchSpaces, hparamTrials, labelColumns, labels, lastModifiedTime, location, modelReference, modelType, optimalTrialIds, trainingRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    sb.append("    bestTrialId: ").append(toIndentedString(bestTrialId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    defaultTrialId: ").append(toIndentedString(defaultTrialId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionConfiguration: ").append(toIndentedString(encryptionConfiguration)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    featureColumns: ").append(toIndentedString(featureColumns)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    hparamSearchSpaces: ").append(toIndentedString(hparamSearchSpaces)).append("\n");
    sb.append("    hparamTrials: ").append(toIndentedString(hparamTrials)).append("\n");
    sb.append("    labelColumns: ").append(toIndentedString(labelColumns)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    modelReference: ").append(toIndentedString(modelReference)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    optimalTrialIds: ").append(toIndentedString(optimalTrialIds)).append("\n");
    sb.append("    trainingRuns: ").append(toIndentedString(trainingRuns)).append("\n");
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

