package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.liferay.bigquery_emulator.model.ArimaOrder;
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
 * Options used in model training.
 */

@Schema(name = "TrainingOptions", description = "Options used in model training.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class TrainingOptions {

  private Boolean adjustStepChanges;

  private Boolean autoArima;

  private String autoArimaMaxOrder;

  private String autoArimaMinOrder;

  private String batchSize;

  /**
   * Booster type for boosted tree models.
   */
  public enum BoosterTypeEnum {
    BOOSTER_TYPE_UNSPECIFIED("BOOSTER_TYPE_UNSPECIFIED"),
    
    GBTREE("GBTREE"),
    
    DART("DART");

    private String value;

    BoosterTypeEnum(String value) {
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
    public static BoosterTypeEnum fromValue(String value) {
      for (BoosterTypeEnum b : BoosterTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BoosterTypeEnum boosterType;

  private Boolean calculatePValues;

  private Boolean cleanSpikesAndDips;

  /**
   * Enums for color space, used for processing images in Object Table. See more details at https://www.tensorflow.org/io/tutorials/colorspace.
   */
  public enum ColorSpaceEnum {
    COLOR_SPACE_UNSPECIFIED("COLOR_SPACE_UNSPECIFIED"),
    
    RGB("RGB"),
    
    HSV("HSV"),
    
    YIQ("YIQ"),
    
    YUV("YUV"),
    
    GRAYSCALE("GRAYSCALE");

    private String value;

    ColorSpaceEnum(String value) {
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
    public static ColorSpaceEnum fromValue(String value) {
      for (ColorSpaceEnum b : ColorSpaceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ColorSpaceEnum colorSpace;

  private Double colsampleBylevel;

  private Double colsampleBynode;

  private Double colsampleBytree;

  /**
   * Type of normalization algorithm for boosted tree models using dart booster.
   */
  public enum DartNormalizeTypeEnum {
    DART_NORMALIZE_TYPE_UNSPECIFIED("DART_NORMALIZE_TYPE_UNSPECIFIED"),
    
    TREE("TREE"),
    
    FOREST("FOREST");

    private String value;

    DartNormalizeTypeEnum(String value) {
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
    public static DartNormalizeTypeEnum fromValue(String value) {
      for (DartNormalizeTypeEnum b : DartNormalizeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DartNormalizeTypeEnum dartNormalizeType;

  /**
   * The data frequency of a time series.
   */
  public enum DataFrequencyEnum {
    DATA_FREQUENCY_UNSPECIFIED("DATA_FREQUENCY_UNSPECIFIED"),
    
    AUTO_FREQUENCY("AUTO_FREQUENCY"),
    
    YEARLY("YEARLY"),
    
    QUARTERLY("QUARTERLY"),
    
    MONTHLY("MONTHLY"),
    
    WEEKLY("WEEKLY"),
    
    DAILY("DAILY"),
    
    HOURLY("HOURLY"),
    
    PER_MINUTE("PER_MINUTE");

    private String value;

    DataFrequencyEnum(String value) {
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
    public static DataFrequencyEnum fromValue(String value) {
      for (DataFrequencyEnum b : DataFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataFrequencyEnum dataFrequency;

  private String dataSplitColumn;

  private Double dataSplitEvalFraction;

  /**
   * The data split type for training and evaluation, e.g. RANDOM.
   */
  public enum DataSplitMethodEnum {
    DATA_SPLIT_METHOD_UNSPECIFIED("DATA_SPLIT_METHOD_UNSPECIFIED"),
    
    RANDOM("RANDOM"),
    
    CUSTOM("CUSTOM"),
    
    SEQUENTIAL("SEQUENTIAL"),
    
    NO_SPLIT("NO_SPLIT"),
    
    AUTO_SPLIT("AUTO_SPLIT");

    private String value;

    DataSplitMethodEnum(String value) {
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
    public static DataSplitMethodEnum fromValue(String value) {
      for (DataSplitMethodEnum b : DataSplitMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataSplitMethodEnum dataSplitMethod;

  private Boolean decomposeTimeSeries;

  /**
   * Distance type for clustering models.
   */
  public enum DistanceTypeEnum {
    DISTANCE_TYPE_UNSPECIFIED("DISTANCE_TYPE_UNSPECIFIED"),
    
    EUCLIDEAN("EUCLIDEAN"),
    
    COSINE("COSINE");

    private String value;

    DistanceTypeEnum(String value) {
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
    public static DistanceTypeEnum fromValue(String value) {
      for (DistanceTypeEnum b : DistanceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DistanceTypeEnum distanceType;

  private Double dropout;

  private Boolean earlyStop;

  private Boolean enableGlobalExplain;

  /**
   * Feedback type that specifies which algorithm to run for matrix factorization.
   */
  public enum FeedbackTypeEnum {
    FEEDBACK_TYPE_UNSPECIFIED("FEEDBACK_TYPE_UNSPECIFIED"),
    
    IMPLICIT("IMPLICIT"),
    
    EXPLICIT("EXPLICIT");

    private String value;

    FeedbackTypeEnum(String value) {
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
    public static FeedbackTypeEnum fromValue(String value) {
      for (FeedbackTypeEnum b : FeedbackTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FeedbackTypeEnum feedbackType;

  @Valid
  private List<String> hiddenUnits = new ArrayList<>();

  /**
   * The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled.
   */
  public enum HolidayRegionEnum {
    HOLIDAY_REGION_UNSPECIFIED("HOLIDAY_REGION_UNSPECIFIED"),
    
    GLOBAL("GLOBAL"),
    
    NA("NA"),
    
    JAPAC("JAPAC"),
    
    EMEA("EMEA"),
    
    LAC("LAC"),
    
    AE("AE"),
    
    AR("AR"),
    
    AT("AT"),
    
    AU("AU"),
    
    BE("BE"),
    
    BR("BR"),
    
    CA("CA"),
    
    CH("CH"),
    
    CL("CL"),
    
    CN("CN"),
    
    CO("CO"),
    
    CS("CS"),
    
    CZ("CZ"),
    
    DE("DE"),
    
    DK("DK"),
    
    DZ("DZ"),
    
    EC("EC"),
    
    EE("EE"),
    
    EG("EG"),
    
    ES("ES"),
    
    FI("FI"),
    
    FR("FR"),
    
    GB("GB"),
    
    GR("GR"),
    
    HK("HK"),
    
    HU("HU"),
    
    ID("ID"),
    
    IE("IE"),
    
    IL("IL"),
    
    IN("IN"),
    
    IR("IR"),
    
    IT("IT"),
    
    JP("JP"),
    
    KR("KR"),
    
    LV("LV"),
    
    MA("MA"),
    
    MX("MX"),
    
    MY("MY"),
    
    NG("NG"),
    
    NL("NL"),
    
    FALSE("false"),
    
    NZ("NZ"),
    
    PE("PE"),
    
    PH("PH"),
    
    PK("PK"),
    
    PL("PL"),
    
    PT("PT"),
    
    RO("RO"),
    
    RS("RS"),
    
    RU("RU"),
    
    SA("SA"),
    
    SE("SE"),
    
    SG("SG"),
    
    SI("SI"),
    
    SK("SK"),
    
    TH("TH"),
    
    TR("TR"),
    
    TW("TW"),
    
    UA("UA"),
    
    US("US"),
    
    VE("VE"),
    
    VN("VN"),
    
    ZA("ZA");

    private String value;

    HolidayRegionEnum(String value) {
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
    public static HolidayRegionEnum fromValue(String value) {
      for (HolidayRegionEnum b : HolidayRegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HolidayRegionEnum holidayRegion;

  private String horizon;

  /**
   * Gets or Sets hparamTuningObjectives
   */
  public enum HparamTuningObjectivesEnum {
    HPARAM_TUNING_OBJECTIVE_UNSPECIFIED("HPARAM_TUNING_OBJECTIVE_UNSPECIFIED"),
    
    MEAN_ABSOLUTE_ERROR("MEAN_ABSOLUTE_ERROR"),
    
    MEAN_SQUARED_ERROR("MEAN_SQUARED_ERROR"),
    
    MEAN_SQUARED_LOG_ERROR("MEAN_SQUARED_LOG_ERROR"),
    
    MEDIAN_ABSOLUTE_ERROR("MEDIAN_ABSOLUTE_ERROR"),
    
    R_SQUARED("R_SQUARED"),
    
    EXPLAINED_VARIANCE("EXPLAINED_VARIANCE"),
    
    PRECISION("PRECISION"),
    
    RECALL("RECALL"),
    
    ACCURACY("ACCURACY"),
    
    F1_SCORE("F1_SCORE"),
    
    LOG_LOSS("LOG_LOSS"),
    
    ROC_AUC("ROC_AUC"),
    
    DAVIES_BOULDIN_INDEX("DAVIES_BOULDIN_INDEX"),
    
    MEAN_AVERAGE_PRECISION("MEAN_AVERAGE_PRECISION"),
    
    NORMALIZED_DISCOUNTED_CUMULATIVE_GAIN("NORMALIZED_DISCOUNTED_CUMULATIVE_GAIN"),
    
    AVERAGE_RANK("AVERAGE_RANK");

    private String value;

    HparamTuningObjectivesEnum(String value) {
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
    public static HparamTuningObjectivesEnum fromValue(String value) {
      for (HparamTuningObjectivesEnum b : HparamTuningObjectivesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<HparamTuningObjectivesEnum> hparamTuningObjectives = new ArrayList<>();

  private Boolean includeDrift;

  private Double initialLearnRate;

  @Valid
  private List<String> inputLabelColumns = new ArrayList<>();

  private String integratedGradientsNumSteps;

  private String itemColumn;

  private String kmeansInitializationColumn;

  /**
   * The method used to initialize the centroids for kmeans algorithm.
   */
  public enum KmeansInitializationMethodEnum {
    KMEANS_INITIALIZATION_METHOD_UNSPECIFIED("KMEANS_INITIALIZATION_METHOD_UNSPECIFIED"),
    
    RANDOM("RANDOM"),
    
    CUSTOM("CUSTOM"),
    
    KMEANS_PLUS_PLUS("KMEANS_PLUS_PLUS");

    private String value;

    KmeansInitializationMethodEnum(String value) {
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
    public static KmeansInitializationMethodEnum fromValue(String value) {
      for (KmeansInitializationMethodEnum b : KmeansInitializationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private KmeansInitializationMethodEnum kmeansInitializationMethod;

  private Double l1Regularization;

  private Double l2Regularization;

  @Valid
  private Map<String, Double> labelClassWeights = new HashMap<>();

  private Double learnRate;

  /**
   * The strategy to determine learn rate for the current iteration.
   */
  public enum LearnRateStrategyEnum {
    LEARN_RATE_STRATEGY_UNSPECIFIED("LEARN_RATE_STRATEGY_UNSPECIFIED"),
    
    LINE_SEARCH("LINE_SEARCH"),
    
    CONSTANT("CONSTANT");

    private String value;

    LearnRateStrategyEnum(String value) {
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
    public static LearnRateStrategyEnum fromValue(String value) {
      for (LearnRateStrategyEnum b : LearnRateStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LearnRateStrategyEnum learnRateStrategy;

  /**
   * Type of loss function used during training run.
   */
  public enum LossTypeEnum {
    LOSS_TYPE_UNSPECIFIED("LOSS_TYPE_UNSPECIFIED"),
    
    MEAN_SQUARED_LOSS("MEAN_SQUARED_LOSS"),
    
    MEAN_LOG_LOSS("MEAN_LOG_LOSS");

    private String value;

    LossTypeEnum(String value) {
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
    public static LossTypeEnum fromValue(String value) {
      for (LossTypeEnum b : LossTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LossTypeEnum lossType;

  private String maxIterations;

  private String maxParallelTrials;

  private String maxTimeSeriesLength;

  private String maxTreeDepth;

  private Double minRelativeProgress;

  private Double minSplitLoss;

  private String minTimeSeriesLength;

  private String minTreeChildWeight;

  private String modelUri;

  private ArimaOrder nonSeasonalOrder;

  private String numClusters;

  private String numFactors;

  private String numParallelTree;

  private String numTrials;

  /**
   * Optimization strategy for training linear regression models.
   */
  public enum OptimizationStrategyEnum {
    OPTIMIZATION_STRATEGY_UNSPECIFIED("OPTIMIZATION_STRATEGY_UNSPECIFIED"),
    
    BATCH_GRADIENT_DESCENT("BATCH_GRADIENT_DESCENT"),
    
    NORMAL_EQUATION("NORMAL_EQUATION");

    private String value;

    OptimizationStrategyEnum(String value) {
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
    public static OptimizationStrategyEnum fromValue(String value) {
      for (OptimizationStrategyEnum b : OptimizationStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OptimizationStrategyEnum optimizationStrategy;

  private Boolean preserveInputStructs;

  private String sampledShapleyNumPaths;

  private Double subsample;

  private String timeSeriesDataColumn;

  private String timeSeriesIdColumn;

  @Valid
  private List<String> timeSeriesIdColumns = new ArrayList<>();

  private Double timeSeriesLengthFraction;

  private String timeSeriesTimestampColumn;

  /**
   * Tree construction algorithm for boosted tree models.
   */
  public enum TreeMethodEnum {
    TREE_METHOD_UNSPECIFIED("TREE_METHOD_UNSPECIFIED"),
    
    AUTO("AUTO"),
    
    EXACT("EXACT"),
    
    APPROX("APPROX"),
    
    HIST("HIST");

    private String value;

    TreeMethodEnum(String value) {
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
    public static TreeMethodEnum fromValue(String value) {
      for (TreeMethodEnum b : TreeMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TreeMethodEnum treeMethod;

  private String trendSmoothingWindowSize;

  private String userColumn;

  private Double walsAlpha;

  private Boolean warmStart;

  public TrainingOptions adjustStepChanges(Boolean adjustStepChanges) {
    this.adjustStepChanges = adjustStepChanges;
    return this;
  }

  /**
   * If true, detect step changes and make data adjustment in the input time series.
   * @return adjustStepChanges
   */
  
  @Schema(name = "adjustStepChanges", description = "If true, detect step changes and make data adjustment in the input time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adjustStepChanges")
  public Boolean getAdjustStepChanges() {
    return adjustStepChanges;
  }

  public void setAdjustStepChanges(Boolean adjustStepChanges) {
    this.adjustStepChanges = adjustStepChanges;
  }

  public TrainingOptions autoArima(Boolean autoArima) {
    this.autoArima = autoArima;
    return this;
  }

  /**
   * Whether to enable auto ARIMA or not.
   * @return autoArima
   */
  
  @Schema(name = "autoArima", description = "Whether to enable auto ARIMA or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoArima")
  public Boolean getAutoArima() {
    return autoArima;
  }

  public void setAutoArima(Boolean autoArima) {
    this.autoArima = autoArima;
  }

  public TrainingOptions autoArimaMaxOrder(String autoArimaMaxOrder) {
    this.autoArimaMaxOrder = autoArimaMaxOrder;
    return this;
  }

  /**
   * The max value of the sum of non-seasonal p and q.
   * @return autoArimaMaxOrder
   */
  
  @Schema(name = "autoArimaMaxOrder", description = "The max value of the sum of non-seasonal p and q.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoArimaMaxOrder")
  public String getAutoArimaMaxOrder() {
    return autoArimaMaxOrder;
  }

  public void setAutoArimaMaxOrder(String autoArimaMaxOrder) {
    this.autoArimaMaxOrder = autoArimaMaxOrder;
  }

  public TrainingOptions autoArimaMinOrder(String autoArimaMinOrder) {
    this.autoArimaMinOrder = autoArimaMinOrder;
    return this;
  }

  /**
   * The min value of the sum of non-seasonal p and q.
   * @return autoArimaMinOrder
   */
  
  @Schema(name = "autoArimaMinOrder", description = "The min value of the sum of non-seasonal p and q.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoArimaMinOrder")
  public String getAutoArimaMinOrder() {
    return autoArimaMinOrder;
  }

  public void setAutoArimaMinOrder(String autoArimaMinOrder) {
    this.autoArimaMinOrder = autoArimaMinOrder;
  }

  public TrainingOptions batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Batch size for dnn models.
   * @return batchSize
   */
  
  @Schema(name = "batchSize", description = "Batch size for dnn models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchSize")
  public String getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }

  public TrainingOptions boosterType(BoosterTypeEnum boosterType) {
    this.boosterType = boosterType;
    return this;
  }

  /**
   * Booster type for boosted tree models.
   * @return boosterType
   */
  
  @Schema(name = "boosterType", description = "Booster type for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boosterType")
  public BoosterTypeEnum getBoosterType() {
    return boosterType;
  }

  public void setBoosterType(BoosterTypeEnum boosterType) {
    this.boosterType = boosterType;
  }

  public TrainingOptions calculatePValues(Boolean calculatePValues) {
    this.calculatePValues = calculatePValues;
    return this;
  }

  /**
   * Whether or not p-value test should be computed for this model. Only available for linear and logistic regression models.
   * @return calculatePValues
   */
  
  @Schema(name = "calculatePValues", description = "Whether or not p-value test should be computed for this model. Only available for linear and logistic regression models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calculatePValues")
  public Boolean getCalculatePValues() {
    return calculatePValues;
  }

  public void setCalculatePValues(Boolean calculatePValues) {
    this.calculatePValues = calculatePValues;
  }

  public TrainingOptions cleanSpikesAndDips(Boolean cleanSpikesAndDips) {
    this.cleanSpikesAndDips = cleanSpikesAndDips;
    return this;
  }

  /**
   * If true, clean spikes and dips in the input time series.
   * @return cleanSpikesAndDips
   */
  
  @Schema(name = "cleanSpikesAndDips", description = "If true, clean spikes and dips in the input time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanSpikesAndDips")
  public Boolean getCleanSpikesAndDips() {
    return cleanSpikesAndDips;
  }

  public void setCleanSpikesAndDips(Boolean cleanSpikesAndDips) {
    this.cleanSpikesAndDips = cleanSpikesAndDips;
  }

  public TrainingOptions colorSpace(ColorSpaceEnum colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

  /**
   * Enums for color space, used for processing images in Object Table. See more details at https://www.tensorflow.org/io/tutorials/colorspace.
   * @return colorSpace
   */
  
  @Schema(name = "colorSpace", description = "Enums for color space, used for processing images in Object Table. See more details at https://www.tensorflow.org/io/tutorials/colorspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colorSpace")
  public ColorSpaceEnum getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(ColorSpaceEnum colorSpace) {
    this.colorSpace = colorSpace;
  }

  public TrainingOptions colsampleBylevel(Double colsampleBylevel) {
    this.colsampleBylevel = colsampleBylevel;
    return this;
  }

  /**
   * Subsample ratio of columns for each level for boosted tree models.
   * @return colsampleBylevel
   */
  
  @Schema(name = "colsampleBylevel", description = "Subsample ratio of columns for each level for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBylevel")
  public Double getColsampleBylevel() {
    return colsampleBylevel;
  }

  public void setColsampleBylevel(Double colsampleBylevel) {
    this.colsampleBylevel = colsampleBylevel;
  }

  public TrainingOptions colsampleBynode(Double colsampleBynode) {
    this.colsampleBynode = colsampleBynode;
    return this;
  }

  /**
   * Subsample ratio of columns for each node(split) for boosted tree models.
   * @return colsampleBynode
   */
  
  @Schema(name = "colsampleBynode", description = "Subsample ratio of columns for each node(split) for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBynode")
  public Double getColsampleBynode() {
    return colsampleBynode;
  }

  public void setColsampleBynode(Double colsampleBynode) {
    this.colsampleBynode = colsampleBynode;
  }

  public TrainingOptions colsampleBytree(Double colsampleBytree) {
    this.colsampleBytree = colsampleBytree;
    return this;
  }

  /**
   * Subsample ratio of columns when constructing each tree for boosted tree models.
   * @return colsampleBytree
   */
  
  @Schema(name = "colsampleBytree", description = "Subsample ratio of columns when constructing each tree for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBytree")
  public Double getColsampleBytree() {
    return colsampleBytree;
  }

  public void setColsampleBytree(Double colsampleBytree) {
    this.colsampleBytree = colsampleBytree;
  }

  public TrainingOptions dartNormalizeType(DartNormalizeTypeEnum dartNormalizeType) {
    this.dartNormalizeType = dartNormalizeType;
    return this;
  }

  /**
   * Type of normalization algorithm for boosted tree models using dart booster.
   * @return dartNormalizeType
   */
  
  @Schema(name = "dartNormalizeType", description = "Type of normalization algorithm for boosted tree models using dart booster.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dartNormalizeType")
  public DartNormalizeTypeEnum getDartNormalizeType() {
    return dartNormalizeType;
  }

  public void setDartNormalizeType(DartNormalizeTypeEnum dartNormalizeType) {
    this.dartNormalizeType = dartNormalizeType;
  }

  public TrainingOptions dataFrequency(DataFrequencyEnum dataFrequency) {
    this.dataFrequency = dataFrequency;
    return this;
  }

  /**
   * The data frequency of a time series.
   * @return dataFrequency
   */
  
  @Schema(name = "dataFrequency", description = "The data frequency of a time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataFrequency")
  public DataFrequencyEnum getDataFrequency() {
    return dataFrequency;
  }

  public void setDataFrequency(DataFrequencyEnum dataFrequency) {
    this.dataFrequency = dataFrequency;
  }

  public TrainingOptions dataSplitColumn(String dataSplitColumn) {
    this.dataSplitColumn = dataSplitColumn;
    return this;
  }

  /**
   * The column to split data with. This column won't be used as a feature. 1. When data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are used as training data, and the rest are eval data. It respects the order in Orderable data types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
   * @return dataSplitColumn
   */
  
  @Schema(name = "dataSplitColumn", description = "The column to split data with. This column won't be used as a feature. 1. When data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are used as training data, and the rest are eval data. It respects the order in Orderable data types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSplitColumn")
  public String getDataSplitColumn() {
    return dataSplitColumn;
  }

  public void setDataSplitColumn(String dataSplitColumn) {
    this.dataSplitColumn = dataSplitColumn;
  }

  public TrainingOptions dataSplitEvalFraction(Double dataSplitEvalFraction) {
    this.dataSplitEvalFraction = dataSplitEvalFraction;
    return this;
  }

  /**
   * The fraction of evaluation data over the whole input data. The rest of data will be used as training data. The format should be double. Accurate to two decimal places. Default value is 0.2.
   * @return dataSplitEvalFraction
   */
  
  @Schema(name = "dataSplitEvalFraction", description = "The fraction of evaluation data over the whole input data. The rest of data will be used as training data. The format should be double. Accurate to two decimal places. Default value is 0.2.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSplitEvalFraction")
  public Double getDataSplitEvalFraction() {
    return dataSplitEvalFraction;
  }

  public void setDataSplitEvalFraction(Double dataSplitEvalFraction) {
    this.dataSplitEvalFraction = dataSplitEvalFraction;
  }

  public TrainingOptions dataSplitMethod(DataSplitMethodEnum dataSplitMethod) {
    this.dataSplitMethod = dataSplitMethod;
    return this;
  }

  /**
   * The data split type for training and evaluation, e.g. RANDOM.
   * @return dataSplitMethod
   */
  
  @Schema(name = "dataSplitMethod", description = "The data split type for training and evaluation, e.g. RANDOM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSplitMethod")
  public DataSplitMethodEnum getDataSplitMethod() {
    return dataSplitMethod;
  }

  public void setDataSplitMethod(DataSplitMethodEnum dataSplitMethod) {
    this.dataSplitMethod = dataSplitMethod;
  }

  public TrainingOptions decomposeTimeSeries(Boolean decomposeTimeSeries) {
    this.decomposeTimeSeries = decomposeTimeSeries;
    return this;
  }

  /**
   * If true, perform decompose time series and save the results.
   * @return decomposeTimeSeries
   */
  
  @Schema(name = "decomposeTimeSeries", description = "If true, perform decompose time series and save the results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decomposeTimeSeries")
  public Boolean getDecomposeTimeSeries() {
    return decomposeTimeSeries;
  }

  public void setDecomposeTimeSeries(Boolean decomposeTimeSeries) {
    this.decomposeTimeSeries = decomposeTimeSeries;
  }

  public TrainingOptions distanceType(DistanceTypeEnum distanceType) {
    this.distanceType = distanceType;
    return this;
  }

  /**
   * Distance type for clustering models.
   * @return distanceType
   */
  
  @Schema(name = "distanceType", description = "Distance type for clustering models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distanceType")
  public DistanceTypeEnum getDistanceType() {
    return distanceType;
  }

  public void setDistanceType(DistanceTypeEnum distanceType) {
    this.distanceType = distanceType;
  }

  public TrainingOptions dropout(Double dropout) {
    this.dropout = dropout;
    return this;
  }

  /**
   * Dropout probability for dnn models.
   * @return dropout
   */
  
  @Schema(name = "dropout", description = "Dropout probability for dnn models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropout")
  public Double getDropout() {
    return dropout;
  }

  public void setDropout(Double dropout) {
    this.dropout = dropout;
  }

  public TrainingOptions earlyStop(Boolean earlyStop) {
    this.earlyStop = earlyStop;
    return this;
  }

  /**
   * Whether to stop early when the loss doesn't improve significantly any more (compared to min_relative_progress). Used only for iterative training algorithms.
   * @return earlyStop
   */
  
  @Schema(name = "earlyStop", description = "Whether to stop early when the loss doesn't improve significantly any more (compared to min_relative_progress). Used only for iterative training algorithms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earlyStop")
  public Boolean getEarlyStop() {
    return earlyStop;
  }

  public void setEarlyStop(Boolean earlyStop) {
    this.earlyStop = earlyStop;
  }

  public TrainingOptions enableGlobalExplain(Boolean enableGlobalExplain) {
    this.enableGlobalExplain = enableGlobalExplain;
    return this;
  }

  /**
   * If true, enable global explanation during training.
   * @return enableGlobalExplain
   */
  
  @Schema(name = "enableGlobalExplain", description = "If true, enable global explanation during training.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableGlobalExplain")
  public Boolean getEnableGlobalExplain() {
    return enableGlobalExplain;
  }

  public void setEnableGlobalExplain(Boolean enableGlobalExplain) {
    this.enableGlobalExplain = enableGlobalExplain;
  }

  public TrainingOptions feedbackType(FeedbackTypeEnum feedbackType) {
    this.feedbackType = feedbackType;
    return this;
  }

  /**
   * Feedback type that specifies which algorithm to run for matrix factorization.
   * @return feedbackType
   */
  
  @Schema(name = "feedbackType", description = "Feedback type that specifies which algorithm to run for matrix factorization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedbackType")
  public FeedbackTypeEnum getFeedbackType() {
    return feedbackType;
  }

  public void setFeedbackType(FeedbackTypeEnum feedbackType) {
    this.feedbackType = feedbackType;
  }

  public TrainingOptions hiddenUnits(List<String> hiddenUnits) {
    this.hiddenUnits = hiddenUnits;
    return this;
  }

  public TrainingOptions addHiddenUnitsItem(String hiddenUnitsItem) {
    if (this.hiddenUnits == null) {
      this.hiddenUnits = new ArrayList<>();
    }
    this.hiddenUnits.add(hiddenUnitsItem);
    return this;
  }

  /**
   * Hidden units for dnn models.
   * @return hiddenUnits
   */
  
  @Schema(name = "hiddenUnits", description = "Hidden units for dnn models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hiddenUnits")
  public List<String> getHiddenUnits() {
    return hiddenUnits;
  }

  public void setHiddenUnits(List<String> hiddenUnits) {
    this.hiddenUnits = hiddenUnits;
  }

  public TrainingOptions holidayRegion(HolidayRegionEnum holidayRegion) {
    this.holidayRegion = holidayRegion;
    return this;
  }

  /**
   * The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled.
   * @return holidayRegion
   */
  
  @Schema(name = "holidayRegion", description = "The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("holidayRegion")
  public HolidayRegionEnum getHolidayRegion() {
    return holidayRegion;
  }

  public void setHolidayRegion(HolidayRegionEnum holidayRegion) {
    this.holidayRegion = holidayRegion;
  }

  public TrainingOptions horizon(String horizon) {
    this.horizon = horizon;
    return this;
  }

  /**
   * The number of periods ahead that need to be forecasted.
   * @return horizon
   */
  
  @Schema(name = "horizon", description = "The number of periods ahead that need to be forecasted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("horizon")
  public String getHorizon() {
    return horizon;
  }

  public void setHorizon(String horizon) {
    this.horizon = horizon;
  }

  public TrainingOptions hparamTuningObjectives(List<HparamTuningObjectivesEnum> hparamTuningObjectives) {
    this.hparamTuningObjectives = hparamTuningObjectives;
    return this;
  }

  public TrainingOptions addHparamTuningObjectivesItem(HparamTuningObjectivesEnum hparamTuningObjectivesItem) {
    if (this.hparamTuningObjectives == null) {
      this.hparamTuningObjectives = new ArrayList<>();
    }
    this.hparamTuningObjectives.add(hparamTuningObjectivesItem);
    return this;
  }

  /**
   * The target evaluation metrics to optimize the hyperparameters for.
   * @return hparamTuningObjectives
   */
  
  @Schema(name = "hparamTuningObjectives", description = "The target evaluation metrics to optimize the hyperparameters for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hparamTuningObjectives")
  public List<HparamTuningObjectivesEnum> getHparamTuningObjectives() {
    return hparamTuningObjectives;
  }

  public void setHparamTuningObjectives(List<HparamTuningObjectivesEnum> hparamTuningObjectives) {
    this.hparamTuningObjectives = hparamTuningObjectives;
  }

  public TrainingOptions includeDrift(Boolean includeDrift) {
    this.includeDrift = includeDrift;
    return this;
  }

  /**
   * Include drift when fitting an ARIMA model.
   * @return includeDrift
   */
  
  @Schema(name = "includeDrift", description = "Include drift when fitting an ARIMA model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeDrift")
  public Boolean getIncludeDrift() {
    return includeDrift;
  }

  public void setIncludeDrift(Boolean includeDrift) {
    this.includeDrift = includeDrift;
  }

  public TrainingOptions initialLearnRate(Double initialLearnRate) {
    this.initialLearnRate = initialLearnRate;
    return this;
  }

  /**
   * Specifies the initial learning rate for the line search learn rate strategy.
   * @return initialLearnRate
   */
  
  @Schema(name = "initialLearnRate", description = "Specifies the initial learning rate for the line search learn rate strategy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialLearnRate")
  public Double getInitialLearnRate() {
    return initialLearnRate;
  }

  public void setInitialLearnRate(Double initialLearnRate) {
    this.initialLearnRate = initialLearnRate;
  }

  public TrainingOptions inputLabelColumns(List<String> inputLabelColumns) {
    this.inputLabelColumns = inputLabelColumns;
    return this;
  }

  public TrainingOptions addInputLabelColumnsItem(String inputLabelColumnsItem) {
    if (this.inputLabelColumns == null) {
      this.inputLabelColumns = new ArrayList<>();
    }
    this.inputLabelColumns.add(inputLabelColumnsItem);
    return this;
  }

  /**
   * Name of input label columns in training data.
   * @return inputLabelColumns
   */
  
  @Schema(name = "inputLabelColumns", description = "Name of input label columns in training data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputLabelColumns")
  public List<String> getInputLabelColumns() {
    return inputLabelColumns;
  }

  public void setInputLabelColumns(List<String> inputLabelColumns) {
    this.inputLabelColumns = inputLabelColumns;
  }

  public TrainingOptions integratedGradientsNumSteps(String integratedGradientsNumSteps) {
    this.integratedGradientsNumSteps = integratedGradientsNumSteps;
    return this;
  }

  /**
   * Number of integral steps for the integrated gradients explain method.
   * @return integratedGradientsNumSteps
   */
  
  @Schema(name = "integratedGradientsNumSteps", description = "Number of integral steps for the integrated gradients explain method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("integratedGradientsNumSteps")
  public String getIntegratedGradientsNumSteps() {
    return integratedGradientsNumSteps;
  }

  public void setIntegratedGradientsNumSteps(String integratedGradientsNumSteps) {
    this.integratedGradientsNumSteps = integratedGradientsNumSteps;
  }

  public TrainingOptions itemColumn(String itemColumn) {
    this.itemColumn = itemColumn;
    return this;
  }

  /**
   * Item column specified for matrix factorization models.
   * @return itemColumn
   */
  
  @Schema(name = "itemColumn", description = "Item column specified for matrix factorization models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemColumn")
  public String getItemColumn() {
    return itemColumn;
  }

  public void setItemColumn(String itemColumn) {
    this.itemColumn = itemColumn;
  }

  public TrainingOptions kmeansInitializationColumn(String kmeansInitializationColumn) {
    this.kmeansInitializationColumn = kmeansInitializationColumn;
    return this;
  }

  /**
   * The column used to provide the initial centroids for kmeans algorithm when kmeans_initialization_method is CUSTOM.
   * @return kmeansInitializationColumn
   */
  
  @Schema(name = "kmeansInitializationColumn", description = "The column used to provide the initial centroids for kmeans algorithm when kmeans_initialization_method is CUSTOM.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kmeansInitializationColumn")
  public String getKmeansInitializationColumn() {
    return kmeansInitializationColumn;
  }

  public void setKmeansInitializationColumn(String kmeansInitializationColumn) {
    this.kmeansInitializationColumn = kmeansInitializationColumn;
  }

  public TrainingOptions kmeansInitializationMethod(KmeansInitializationMethodEnum kmeansInitializationMethod) {
    this.kmeansInitializationMethod = kmeansInitializationMethod;
    return this;
  }

  /**
   * The method used to initialize the centroids for kmeans algorithm.
   * @return kmeansInitializationMethod
   */
  
  @Schema(name = "kmeansInitializationMethod", description = "The method used to initialize the centroids for kmeans algorithm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kmeansInitializationMethod")
  public KmeansInitializationMethodEnum getKmeansInitializationMethod() {
    return kmeansInitializationMethod;
  }

  public void setKmeansInitializationMethod(KmeansInitializationMethodEnum kmeansInitializationMethod) {
    this.kmeansInitializationMethod = kmeansInitializationMethod;
  }

  public TrainingOptions l1Regularization(Double l1Regularization) {
    this.l1Regularization = l1Regularization;
    return this;
  }

  /**
   * L1 regularization coefficient.
   * @return l1Regularization
   */
  
  @Schema(name = "l1Regularization", description = "L1 regularization coefficient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l1Regularization")
  public Double getL1Regularization() {
    return l1Regularization;
  }

  public void setL1Regularization(Double l1Regularization) {
    this.l1Regularization = l1Regularization;
  }

  public TrainingOptions l2Regularization(Double l2Regularization) {
    this.l2Regularization = l2Regularization;
    return this;
  }

  /**
   * L2 regularization coefficient.
   * @return l2Regularization
   */
  
  @Schema(name = "l2Regularization", description = "L2 regularization coefficient.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l2Regularization")
  public Double getL2Regularization() {
    return l2Regularization;
  }

  public void setL2Regularization(Double l2Regularization) {
    this.l2Regularization = l2Regularization;
  }

  public TrainingOptions labelClassWeights(Map<String, Double> labelClassWeights) {
    this.labelClassWeights = labelClassWeights;
    return this;
  }

  public TrainingOptions putLabelClassWeightsItem(String key, Double labelClassWeightsItem) {
    if (this.labelClassWeights == null) {
      this.labelClassWeights = new HashMap<>();
    }
    this.labelClassWeights.put(key, labelClassWeightsItem);
    return this;
  }

  /**
   * Weights associated with each label class, for rebalancing the training data. Only applicable for classification models.
   * @return labelClassWeights
   */
  
  @Schema(name = "labelClassWeights", description = "Weights associated with each label class, for rebalancing the training data. Only applicable for classification models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labelClassWeights")
  public Map<String, Double> getLabelClassWeights() {
    return labelClassWeights;
  }

  public void setLabelClassWeights(Map<String, Double> labelClassWeights) {
    this.labelClassWeights = labelClassWeights;
  }

  public TrainingOptions learnRate(Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * Learning rate in training. Used only for iterative training algorithms.
   * @return learnRate
   */
  
  @Schema(name = "learnRate", description = "Learning rate in training. Used only for iterative training algorithms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRate")
  public Double getLearnRate() {
    return learnRate;
  }

  public void setLearnRate(Double learnRate) {
    this.learnRate = learnRate;
  }

  public TrainingOptions learnRateStrategy(LearnRateStrategyEnum learnRateStrategy) {
    this.learnRateStrategy = learnRateStrategy;
    return this;
  }

  /**
   * The strategy to determine learn rate for the current iteration.
   * @return learnRateStrategy
   */
  
  @Schema(name = "learnRateStrategy", description = "The strategy to determine learn rate for the current iteration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRateStrategy")
  public LearnRateStrategyEnum getLearnRateStrategy() {
    return learnRateStrategy;
  }

  public void setLearnRateStrategy(LearnRateStrategyEnum learnRateStrategy) {
    this.learnRateStrategy = learnRateStrategy;
  }

  public TrainingOptions lossType(LossTypeEnum lossType) {
    this.lossType = lossType;
    return this;
  }

  /**
   * Type of loss function used during training run.
   * @return lossType
   */
  
  @Schema(name = "lossType", description = "Type of loss function used during training run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lossType")
  public LossTypeEnum getLossType() {
    return lossType;
  }

  public void setLossType(LossTypeEnum lossType) {
    this.lossType = lossType;
  }

  public TrainingOptions maxIterations(String maxIterations) {
    this.maxIterations = maxIterations;
    return this;
  }

  /**
   * The maximum number of iterations in training. Used only for iterative training algorithms.
   * @return maxIterations
   */
  
  @Schema(name = "maxIterations", description = "The maximum number of iterations in training. Used only for iterative training algorithms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxIterations")
  public String getMaxIterations() {
    return maxIterations;
  }

  public void setMaxIterations(String maxIterations) {
    this.maxIterations = maxIterations;
  }

  public TrainingOptions maxParallelTrials(String maxParallelTrials) {
    this.maxParallelTrials = maxParallelTrials;
    return this;
  }

  /**
   * Maximum number of trials to run in parallel.
   * @return maxParallelTrials
   */
  
  @Schema(name = "maxParallelTrials", description = "Maximum number of trials to run in parallel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxParallelTrials")
  public String getMaxParallelTrials() {
    return maxParallelTrials;
  }

  public void setMaxParallelTrials(String maxParallelTrials) {
    this.maxParallelTrials = maxParallelTrials;
  }

  public TrainingOptions maxTimeSeriesLength(String maxTimeSeriesLength) {
    this.maxTimeSeriesLength = maxTimeSeriesLength;
    return this;
  }

  /**
   * Get truncated length by last n points in time series. Use separately from time_series_length_fraction and min_time_series_length.
   * @return maxTimeSeriesLength
   */
  
  @Schema(name = "maxTimeSeriesLength", description = "Get truncated length by last n points in time series. Use separately from time_series_length_fraction and min_time_series_length.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTimeSeriesLength")
  public String getMaxTimeSeriesLength() {
    return maxTimeSeriesLength;
  }

  public void setMaxTimeSeriesLength(String maxTimeSeriesLength) {
    this.maxTimeSeriesLength = maxTimeSeriesLength;
  }

  public TrainingOptions maxTreeDepth(String maxTreeDepth) {
    this.maxTreeDepth = maxTreeDepth;
    return this;
  }

  /**
   * Maximum depth of a tree for boosted tree models.
   * @return maxTreeDepth
   */
  
  @Schema(name = "maxTreeDepth", description = "Maximum depth of a tree for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTreeDepth")
  public String getMaxTreeDepth() {
    return maxTreeDepth;
  }

  public void setMaxTreeDepth(String maxTreeDepth) {
    this.maxTreeDepth = maxTreeDepth;
  }

  public TrainingOptions minRelativeProgress(Double minRelativeProgress) {
    this.minRelativeProgress = minRelativeProgress;
    return this;
  }

  /**
   * When early_stop is true, stops training when accuracy improvement is less than 'min_relative_progress'. Used only for iterative training algorithms.
   * @return minRelativeProgress
   */
  
  @Schema(name = "minRelativeProgress", description = "When early_stop is true, stops training when accuracy improvement is less than 'min_relative_progress'. Used only for iterative training algorithms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minRelativeProgress")
  public Double getMinRelativeProgress() {
    return minRelativeProgress;
  }

  public void setMinRelativeProgress(Double minRelativeProgress) {
    this.minRelativeProgress = minRelativeProgress;
  }

  public TrainingOptions minSplitLoss(Double minSplitLoss) {
    this.minSplitLoss = minSplitLoss;
    return this;
  }

  /**
   * Minimum split loss for boosted tree models.
   * @return minSplitLoss
   */
  
  @Schema(name = "minSplitLoss", description = "Minimum split loss for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minSplitLoss")
  public Double getMinSplitLoss() {
    return minSplitLoss;
  }

  public void setMinSplitLoss(Double minSplitLoss) {
    this.minSplitLoss = minSplitLoss;
  }

  public TrainingOptions minTimeSeriesLength(String minTimeSeriesLength) {
    this.minTimeSeriesLength = minTimeSeriesLength;
    return this;
  }

  /**
   * Set fast trend ARIMA_PLUS model minimum training length. Use in pair with time_series_length_fraction.
   * @return minTimeSeriesLength
   */
  
  @Schema(name = "minTimeSeriesLength", description = "Set fast trend ARIMA_PLUS model minimum training length. Use in pair with time_series_length_fraction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minTimeSeriesLength")
  public String getMinTimeSeriesLength() {
    return minTimeSeriesLength;
  }

  public void setMinTimeSeriesLength(String minTimeSeriesLength) {
    this.minTimeSeriesLength = minTimeSeriesLength;
  }

  public TrainingOptions minTreeChildWeight(String minTreeChildWeight) {
    this.minTreeChildWeight = minTreeChildWeight;
    return this;
  }

  /**
   * Minimum sum of instance weight needed in a child for boosted tree models.
   * @return minTreeChildWeight
   */
  
  @Schema(name = "minTreeChildWeight", description = "Minimum sum of instance weight needed in a child for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minTreeChildWeight")
  public String getMinTreeChildWeight() {
    return minTreeChildWeight;
  }

  public void setMinTreeChildWeight(String minTreeChildWeight) {
    this.minTreeChildWeight = minTreeChildWeight;
  }

  public TrainingOptions modelUri(String modelUri) {
    this.modelUri = modelUri;
    return this;
  }

  /**
   * Google Cloud Storage URI from which the model was imported. Only applicable for imported models.
   * @return modelUri
   */
  
  @Schema(name = "modelUri", description = "Google Cloud Storage URI from which the model was imported. Only applicable for imported models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelUri")
  public String getModelUri() {
    return modelUri;
  }

  public void setModelUri(String modelUri) {
    this.modelUri = modelUri;
  }

  public TrainingOptions nonSeasonalOrder(ArimaOrder nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
    return this;
  }

  /**
   * Get nonSeasonalOrder
   * @return nonSeasonalOrder
   */
  @Valid 
  @Schema(name = "nonSeasonalOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonSeasonalOrder")
  public ArimaOrder getNonSeasonalOrder() {
    return nonSeasonalOrder;
  }

  public void setNonSeasonalOrder(ArimaOrder nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
  }

  public TrainingOptions numClusters(String numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  /**
   * Number of clusters for clustering models.
   * @return numClusters
   */
  
  @Schema(name = "numClusters", description = "Number of clusters for clustering models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numClusters")
  public String getNumClusters() {
    return numClusters;
  }

  public void setNumClusters(String numClusters) {
    this.numClusters = numClusters;
  }

  public TrainingOptions numFactors(String numFactors) {
    this.numFactors = numFactors;
    return this;
  }

  /**
   * Num factors specified for matrix factorization models.
   * @return numFactors
   */
  
  @Schema(name = "numFactors", description = "Num factors specified for matrix factorization models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numFactors")
  public String getNumFactors() {
    return numFactors;
  }

  public void setNumFactors(String numFactors) {
    this.numFactors = numFactors;
  }

  public TrainingOptions numParallelTree(String numParallelTree) {
    this.numParallelTree = numParallelTree;
    return this;
  }

  /**
   * Number of parallel trees constructed during each iteration for boosted tree models.
   * @return numParallelTree
   */
  
  @Schema(name = "numParallelTree", description = "Number of parallel trees constructed during each iteration for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numParallelTree")
  public String getNumParallelTree() {
    return numParallelTree;
  }

  public void setNumParallelTree(String numParallelTree) {
    this.numParallelTree = numParallelTree;
  }

  public TrainingOptions numTrials(String numTrials) {
    this.numTrials = numTrials;
    return this;
  }

  /**
   * Number of trials to run this hyperparameter tuning job.
   * @return numTrials
   */
  
  @Schema(name = "numTrials", description = "Number of trials to run this hyperparameter tuning job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numTrials")
  public String getNumTrials() {
    return numTrials;
  }

  public void setNumTrials(String numTrials) {
    this.numTrials = numTrials;
  }

  public TrainingOptions optimizationStrategy(OptimizationStrategyEnum optimizationStrategy) {
    this.optimizationStrategy = optimizationStrategy;
    return this;
  }

  /**
   * Optimization strategy for training linear regression models.
   * @return optimizationStrategy
   */
  
  @Schema(name = "optimizationStrategy", description = "Optimization strategy for training linear regression models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizationStrategy")
  public OptimizationStrategyEnum getOptimizationStrategy() {
    return optimizationStrategy;
  }

  public void setOptimizationStrategy(OptimizationStrategyEnum optimizationStrategy) {
    this.optimizationStrategy = optimizationStrategy;
  }

  public TrainingOptions preserveInputStructs(Boolean preserveInputStructs) {
    this.preserveInputStructs = preserveInputStructs;
    return this;
  }

  /**
   * Whether to preserve the input structs in output feature names. Suppose there is a struct A with field b. When false (default), the output feature name is A_b. When true, the output feature name is A.b.
   * @return preserveInputStructs
   */
  
  @Schema(name = "preserveInputStructs", description = "Whether to preserve the input structs in output feature names. Suppose there is a struct A with field b. When false (default), the output feature name is A_b. When true, the output feature name is A.b.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserveInputStructs")
  public Boolean getPreserveInputStructs() {
    return preserveInputStructs;
  }

  public void setPreserveInputStructs(Boolean preserveInputStructs) {
    this.preserveInputStructs = preserveInputStructs;
  }

  public TrainingOptions sampledShapleyNumPaths(String sampledShapleyNumPaths) {
    this.sampledShapleyNumPaths = sampledShapleyNumPaths;
    return this;
  }

  /**
   * Number of paths for the sampled Shapley explain method.
   * @return sampledShapleyNumPaths
   */
  
  @Schema(name = "sampledShapleyNumPaths", description = "Number of paths for the sampled Shapley explain method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sampledShapleyNumPaths")
  public String getSampledShapleyNumPaths() {
    return sampledShapleyNumPaths;
  }

  public void setSampledShapleyNumPaths(String sampledShapleyNumPaths) {
    this.sampledShapleyNumPaths = sampledShapleyNumPaths;
  }

  public TrainingOptions subsample(Double subsample) {
    this.subsample = subsample;
    return this;
  }

  /**
   * Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree models.
   * @return subsample
   */
  
  @Schema(name = "subsample", description = "Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsample")
  public Double getSubsample() {
    return subsample;
  }

  public void setSubsample(Double subsample) {
    this.subsample = subsample;
  }

  public TrainingOptions timeSeriesDataColumn(String timeSeriesDataColumn) {
    this.timeSeriesDataColumn = timeSeriesDataColumn;
    return this;
  }

  /**
   * Column to be designated as time series data for ARIMA model.
   * @return timeSeriesDataColumn
   */
  
  @Schema(name = "timeSeriesDataColumn", description = "Column to be designated as time series data for ARIMA model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesDataColumn")
  public String getTimeSeriesDataColumn() {
    return timeSeriesDataColumn;
  }

  public void setTimeSeriesDataColumn(String timeSeriesDataColumn) {
    this.timeSeriesDataColumn = timeSeriesDataColumn;
  }

  public TrainingOptions timeSeriesIdColumn(String timeSeriesIdColumn) {
    this.timeSeriesIdColumn = timeSeriesIdColumn;
    return this;
  }

  /**
   * The time series id column that was used during ARIMA model training.
   * @return timeSeriesIdColumn
   */
  
  @Schema(name = "timeSeriesIdColumn", description = "The time series id column that was used during ARIMA model training.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesIdColumn")
  public String getTimeSeriesIdColumn() {
    return timeSeriesIdColumn;
  }

  public void setTimeSeriesIdColumn(String timeSeriesIdColumn) {
    this.timeSeriesIdColumn = timeSeriesIdColumn;
  }

  public TrainingOptions timeSeriesIdColumns(List<String> timeSeriesIdColumns) {
    this.timeSeriesIdColumns = timeSeriesIdColumns;
    return this;
  }

  public TrainingOptions addTimeSeriesIdColumnsItem(String timeSeriesIdColumnsItem) {
    if (this.timeSeriesIdColumns == null) {
      this.timeSeriesIdColumns = new ArrayList<>();
    }
    this.timeSeriesIdColumns.add(timeSeriesIdColumnsItem);
    return this;
  }

  /**
   * The time series id columns that were used during ARIMA model training.
   * @return timeSeriesIdColumns
   */
  
  @Schema(name = "timeSeriesIdColumns", description = "The time series id columns that were used during ARIMA model training.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesIdColumns")
  public List<String> getTimeSeriesIdColumns() {
    return timeSeriesIdColumns;
  }

  public void setTimeSeriesIdColumns(List<String> timeSeriesIdColumns) {
    this.timeSeriesIdColumns = timeSeriesIdColumns;
  }

  public TrainingOptions timeSeriesLengthFraction(Double timeSeriesLengthFraction) {
    this.timeSeriesLengthFraction = timeSeriesLengthFraction;
    return this;
  }

  /**
   * Get truncated length by fraction in time series.
   * @return timeSeriesLengthFraction
   */
  
  @Schema(name = "timeSeriesLengthFraction", description = "Get truncated length by fraction in time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesLengthFraction")
  public Double getTimeSeriesLengthFraction() {
    return timeSeriesLengthFraction;
  }

  public void setTimeSeriesLengthFraction(Double timeSeriesLengthFraction) {
    this.timeSeriesLengthFraction = timeSeriesLengthFraction;
  }

  public TrainingOptions timeSeriesTimestampColumn(String timeSeriesTimestampColumn) {
    this.timeSeriesTimestampColumn = timeSeriesTimestampColumn;
    return this;
  }

  /**
   * Column to be designated as time series timestamp for ARIMA model.
   * @return timeSeriesTimestampColumn
   */
  
  @Schema(name = "timeSeriesTimestampColumn", description = "Column to be designated as time series timestamp for ARIMA model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeriesTimestampColumn")
  public String getTimeSeriesTimestampColumn() {
    return timeSeriesTimestampColumn;
  }

  public void setTimeSeriesTimestampColumn(String timeSeriesTimestampColumn) {
    this.timeSeriesTimestampColumn = timeSeriesTimestampColumn;
  }

  public TrainingOptions treeMethod(TreeMethodEnum treeMethod) {
    this.treeMethod = treeMethod;
    return this;
  }

  /**
   * Tree construction algorithm for boosted tree models.
   * @return treeMethod
   */
  
  @Schema(name = "treeMethod", description = "Tree construction algorithm for boosted tree models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("treeMethod")
  public TreeMethodEnum getTreeMethod() {
    return treeMethod;
  }

  public void setTreeMethod(TreeMethodEnum treeMethod) {
    this.treeMethod = treeMethod;
  }

  public TrainingOptions trendSmoothingWindowSize(String trendSmoothingWindowSize) {
    this.trendSmoothingWindowSize = trendSmoothingWindowSize;
    return this;
  }

  /**
   * The smoothing window size for the trend component of the time series.
   * @return trendSmoothingWindowSize
   */
  
  @Schema(name = "trendSmoothingWindowSize", description = "The smoothing window size for the trend component of the time series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trendSmoothingWindowSize")
  public String getTrendSmoothingWindowSize() {
    return trendSmoothingWindowSize;
  }

  public void setTrendSmoothingWindowSize(String trendSmoothingWindowSize) {
    this.trendSmoothingWindowSize = trendSmoothingWindowSize;
  }

  public TrainingOptions userColumn(String userColumn) {
    this.userColumn = userColumn;
    return this;
  }

  /**
   * User column specified for matrix factorization models.
   * @return userColumn
   */
  
  @Schema(name = "userColumn", description = "User column specified for matrix factorization models.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userColumn")
  public String getUserColumn() {
    return userColumn;
  }

  public void setUserColumn(String userColumn) {
    this.userColumn = userColumn;
  }

  public TrainingOptions walsAlpha(Double walsAlpha) {
    this.walsAlpha = walsAlpha;
    return this;
  }

  /**
   * Hyperparameter for matrix factoration when implicit feedback type is specified.
   * @return walsAlpha
   */
  
  @Schema(name = "walsAlpha", description = "Hyperparameter for matrix factoration when implicit feedback type is specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("walsAlpha")
  public Double getWalsAlpha() {
    return walsAlpha;
  }

  public void setWalsAlpha(Double walsAlpha) {
    this.walsAlpha = walsAlpha;
  }

  public TrainingOptions warmStart(Boolean warmStart) {
    this.warmStart = warmStart;
    return this;
  }

  /**
   * Whether to train a model from the last checkpoint.
   * @return warmStart
   */
  
  @Schema(name = "warmStart", description = "Whether to train a model from the last checkpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warmStart")
  public Boolean getWarmStart() {
    return warmStart;
  }

  public void setWarmStart(Boolean warmStart) {
    this.warmStart = warmStart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainingOptions trainingOptions = (TrainingOptions) o;
    return Objects.equals(this.adjustStepChanges, trainingOptions.adjustStepChanges) &&
        Objects.equals(this.autoArima, trainingOptions.autoArima) &&
        Objects.equals(this.autoArimaMaxOrder, trainingOptions.autoArimaMaxOrder) &&
        Objects.equals(this.autoArimaMinOrder, trainingOptions.autoArimaMinOrder) &&
        Objects.equals(this.batchSize, trainingOptions.batchSize) &&
        Objects.equals(this.boosterType, trainingOptions.boosterType) &&
        Objects.equals(this.calculatePValues, trainingOptions.calculatePValues) &&
        Objects.equals(this.cleanSpikesAndDips, trainingOptions.cleanSpikesAndDips) &&
        Objects.equals(this.colorSpace, trainingOptions.colorSpace) &&
        Objects.equals(this.colsampleBylevel, trainingOptions.colsampleBylevel) &&
        Objects.equals(this.colsampleBynode, trainingOptions.colsampleBynode) &&
        Objects.equals(this.colsampleBytree, trainingOptions.colsampleBytree) &&
        Objects.equals(this.dartNormalizeType, trainingOptions.dartNormalizeType) &&
        Objects.equals(this.dataFrequency, trainingOptions.dataFrequency) &&
        Objects.equals(this.dataSplitColumn, trainingOptions.dataSplitColumn) &&
        Objects.equals(this.dataSplitEvalFraction, trainingOptions.dataSplitEvalFraction) &&
        Objects.equals(this.dataSplitMethod, trainingOptions.dataSplitMethod) &&
        Objects.equals(this.decomposeTimeSeries, trainingOptions.decomposeTimeSeries) &&
        Objects.equals(this.distanceType, trainingOptions.distanceType) &&
        Objects.equals(this.dropout, trainingOptions.dropout) &&
        Objects.equals(this.earlyStop, trainingOptions.earlyStop) &&
        Objects.equals(this.enableGlobalExplain, trainingOptions.enableGlobalExplain) &&
        Objects.equals(this.feedbackType, trainingOptions.feedbackType) &&
        Objects.equals(this.hiddenUnits, trainingOptions.hiddenUnits) &&
        Objects.equals(this.holidayRegion, trainingOptions.holidayRegion) &&
        Objects.equals(this.horizon, trainingOptions.horizon) &&
        Objects.equals(this.hparamTuningObjectives, trainingOptions.hparamTuningObjectives) &&
        Objects.equals(this.includeDrift, trainingOptions.includeDrift) &&
        Objects.equals(this.initialLearnRate, trainingOptions.initialLearnRate) &&
        Objects.equals(this.inputLabelColumns, trainingOptions.inputLabelColumns) &&
        Objects.equals(this.integratedGradientsNumSteps, trainingOptions.integratedGradientsNumSteps) &&
        Objects.equals(this.itemColumn, trainingOptions.itemColumn) &&
        Objects.equals(this.kmeansInitializationColumn, trainingOptions.kmeansInitializationColumn) &&
        Objects.equals(this.kmeansInitializationMethod, trainingOptions.kmeansInitializationMethod) &&
        Objects.equals(this.l1Regularization, trainingOptions.l1Regularization) &&
        Objects.equals(this.l2Regularization, trainingOptions.l2Regularization) &&
        Objects.equals(this.labelClassWeights, trainingOptions.labelClassWeights) &&
        Objects.equals(this.learnRate, trainingOptions.learnRate) &&
        Objects.equals(this.learnRateStrategy, trainingOptions.learnRateStrategy) &&
        Objects.equals(this.lossType, trainingOptions.lossType) &&
        Objects.equals(this.maxIterations, trainingOptions.maxIterations) &&
        Objects.equals(this.maxParallelTrials, trainingOptions.maxParallelTrials) &&
        Objects.equals(this.maxTimeSeriesLength, trainingOptions.maxTimeSeriesLength) &&
        Objects.equals(this.maxTreeDepth, trainingOptions.maxTreeDepth) &&
        Objects.equals(this.minRelativeProgress, trainingOptions.minRelativeProgress) &&
        Objects.equals(this.minSplitLoss, trainingOptions.minSplitLoss) &&
        Objects.equals(this.minTimeSeriesLength, trainingOptions.minTimeSeriesLength) &&
        Objects.equals(this.minTreeChildWeight, trainingOptions.minTreeChildWeight) &&
        Objects.equals(this.modelUri, trainingOptions.modelUri) &&
        Objects.equals(this.nonSeasonalOrder, trainingOptions.nonSeasonalOrder) &&
        Objects.equals(this.numClusters, trainingOptions.numClusters) &&
        Objects.equals(this.numFactors, trainingOptions.numFactors) &&
        Objects.equals(this.numParallelTree, trainingOptions.numParallelTree) &&
        Objects.equals(this.numTrials, trainingOptions.numTrials) &&
        Objects.equals(this.optimizationStrategy, trainingOptions.optimizationStrategy) &&
        Objects.equals(this.preserveInputStructs, trainingOptions.preserveInputStructs) &&
        Objects.equals(this.sampledShapleyNumPaths, trainingOptions.sampledShapleyNumPaths) &&
        Objects.equals(this.subsample, trainingOptions.subsample) &&
        Objects.equals(this.timeSeriesDataColumn, trainingOptions.timeSeriesDataColumn) &&
        Objects.equals(this.timeSeriesIdColumn, trainingOptions.timeSeriesIdColumn) &&
        Objects.equals(this.timeSeriesIdColumns, trainingOptions.timeSeriesIdColumns) &&
        Objects.equals(this.timeSeriesLengthFraction, trainingOptions.timeSeriesLengthFraction) &&
        Objects.equals(this.timeSeriesTimestampColumn, trainingOptions.timeSeriesTimestampColumn) &&
        Objects.equals(this.treeMethod, trainingOptions.treeMethod) &&
        Objects.equals(this.trendSmoothingWindowSize, trainingOptions.trendSmoothingWindowSize) &&
        Objects.equals(this.userColumn, trainingOptions.userColumn) &&
        Objects.equals(this.walsAlpha, trainingOptions.walsAlpha) &&
        Objects.equals(this.warmStart, trainingOptions.warmStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustStepChanges, autoArima, autoArimaMaxOrder, autoArimaMinOrder, batchSize, boosterType, calculatePValues, cleanSpikesAndDips, colorSpace, colsampleBylevel, colsampleBynode, colsampleBytree, dartNormalizeType, dataFrequency, dataSplitColumn, dataSplitEvalFraction, dataSplitMethod, decomposeTimeSeries, distanceType, dropout, earlyStop, enableGlobalExplain, feedbackType, hiddenUnits, holidayRegion, horizon, hparamTuningObjectives, includeDrift, initialLearnRate, inputLabelColumns, integratedGradientsNumSteps, itemColumn, kmeansInitializationColumn, kmeansInitializationMethod, l1Regularization, l2Regularization, labelClassWeights, learnRate, learnRateStrategy, lossType, maxIterations, maxParallelTrials, maxTimeSeriesLength, maxTreeDepth, minRelativeProgress, minSplitLoss, minTimeSeriesLength, minTreeChildWeight, modelUri, nonSeasonalOrder, numClusters, numFactors, numParallelTree, numTrials, optimizationStrategy, preserveInputStructs, sampledShapleyNumPaths, subsample, timeSeriesDataColumn, timeSeriesIdColumn, timeSeriesIdColumns, timeSeriesLengthFraction, timeSeriesTimestampColumn, treeMethod, trendSmoothingWindowSize, userColumn, walsAlpha, warmStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingOptions {\n");
    sb.append("    adjustStepChanges: ").append(toIndentedString(adjustStepChanges)).append("\n");
    sb.append("    autoArima: ").append(toIndentedString(autoArima)).append("\n");
    sb.append("    autoArimaMaxOrder: ").append(toIndentedString(autoArimaMaxOrder)).append("\n");
    sb.append("    autoArimaMinOrder: ").append(toIndentedString(autoArimaMinOrder)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    boosterType: ").append(toIndentedString(boosterType)).append("\n");
    sb.append("    calculatePValues: ").append(toIndentedString(calculatePValues)).append("\n");
    sb.append("    cleanSpikesAndDips: ").append(toIndentedString(cleanSpikesAndDips)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    colsampleBylevel: ").append(toIndentedString(colsampleBylevel)).append("\n");
    sb.append("    colsampleBynode: ").append(toIndentedString(colsampleBynode)).append("\n");
    sb.append("    colsampleBytree: ").append(toIndentedString(colsampleBytree)).append("\n");
    sb.append("    dartNormalizeType: ").append(toIndentedString(dartNormalizeType)).append("\n");
    sb.append("    dataFrequency: ").append(toIndentedString(dataFrequency)).append("\n");
    sb.append("    dataSplitColumn: ").append(toIndentedString(dataSplitColumn)).append("\n");
    sb.append("    dataSplitEvalFraction: ").append(toIndentedString(dataSplitEvalFraction)).append("\n");
    sb.append("    dataSplitMethod: ").append(toIndentedString(dataSplitMethod)).append("\n");
    sb.append("    decomposeTimeSeries: ").append(toIndentedString(decomposeTimeSeries)).append("\n");
    sb.append("    distanceType: ").append(toIndentedString(distanceType)).append("\n");
    sb.append("    dropout: ").append(toIndentedString(dropout)).append("\n");
    sb.append("    earlyStop: ").append(toIndentedString(earlyStop)).append("\n");
    sb.append("    enableGlobalExplain: ").append(toIndentedString(enableGlobalExplain)).append("\n");
    sb.append("    feedbackType: ").append(toIndentedString(feedbackType)).append("\n");
    sb.append("    hiddenUnits: ").append(toIndentedString(hiddenUnits)).append("\n");
    sb.append("    holidayRegion: ").append(toIndentedString(holidayRegion)).append("\n");
    sb.append("    horizon: ").append(toIndentedString(horizon)).append("\n");
    sb.append("    hparamTuningObjectives: ").append(toIndentedString(hparamTuningObjectives)).append("\n");
    sb.append("    includeDrift: ").append(toIndentedString(includeDrift)).append("\n");
    sb.append("    initialLearnRate: ").append(toIndentedString(initialLearnRate)).append("\n");
    sb.append("    inputLabelColumns: ").append(toIndentedString(inputLabelColumns)).append("\n");
    sb.append("    integratedGradientsNumSteps: ").append(toIndentedString(integratedGradientsNumSteps)).append("\n");
    sb.append("    itemColumn: ").append(toIndentedString(itemColumn)).append("\n");
    sb.append("    kmeansInitializationColumn: ").append(toIndentedString(kmeansInitializationColumn)).append("\n");
    sb.append("    kmeansInitializationMethod: ").append(toIndentedString(kmeansInitializationMethod)).append("\n");
    sb.append("    l1Regularization: ").append(toIndentedString(l1Regularization)).append("\n");
    sb.append("    l2Regularization: ").append(toIndentedString(l2Regularization)).append("\n");
    sb.append("    labelClassWeights: ").append(toIndentedString(labelClassWeights)).append("\n");
    sb.append("    learnRate: ").append(toIndentedString(learnRate)).append("\n");
    sb.append("    learnRateStrategy: ").append(toIndentedString(learnRateStrategy)).append("\n");
    sb.append("    lossType: ").append(toIndentedString(lossType)).append("\n");
    sb.append("    maxIterations: ").append(toIndentedString(maxIterations)).append("\n");
    sb.append("    maxParallelTrials: ").append(toIndentedString(maxParallelTrials)).append("\n");
    sb.append("    maxTimeSeriesLength: ").append(toIndentedString(maxTimeSeriesLength)).append("\n");
    sb.append("    maxTreeDepth: ").append(toIndentedString(maxTreeDepth)).append("\n");
    sb.append("    minRelativeProgress: ").append(toIndentedString(minRelativeProgress)).append("\n");
    sb.append("    minSplitLoss: ").append(toIndentedString(minSplitLoss)).append("\n");
    sb.append("    minTimeSeriesLength: ").append(toIndentedString(minTimeSeriesLength)).append("\n");
    sb.append("    minTreeChildWeight: ").append(toIndentedString(minTreeChildWeight)).append("\n");
    sb.append("    modelUri: ").append(toIndentedString(modelUri)).append("\n");
    sb.append("    nonSeasonalOrder: ").append(toIndentedString(nonSeasonalOrder)).append("\n");
    sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
    sb.append("    numFactors: ").append(toIndentedString(numFactors)).append("\n");
    sb.append("    numParallelTree: ").append(toIndentedString(numParallelTree)).append("\n");
    sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
    sb.append("    optimizationStrategy: ").append(toIndentedString(optimizationStrategy)).append("\n");
    sb.append("    preserveInputStructs: ").append(toIndentedString(preserveInputStructs)).append("\n");
    sb.append("    sampledShapleyNumPaths: ").append(toIndentedString(sampledShapleyNumPaths)).append("\n");
    sb.append("    subsample: ").append(toIndentedString(subsample)).append("\n");
    sb.append("    timeSeriesDataColumn: ").append(toIndentedString(timeSeriesDataColumn)).append("\n");
    sb.append("    timeSeriesIdColumn: ").append(toIndentedString(timeSeriesIdColumn)).append("\n");
    sb.append("    timeSeriesIdColumns: ").append(toIndentedString(timeSeriesIdColumns)).append("\n");
    sb.append("    timeSeriesLengthFraction: ").append(toIndentedString(timeSeriesLengthFraction)).append("\n");
    sb.append("    timeSeriesTimestampColumn: ").append(toIndentedString(timeSeriesTimestampColumn)).append("\n");
    sb.append("    treeMethod: ").append(toIndentedString(treeMethod)).append("\n");
    sb.append("    trendSmoothingWindowSize: ").append(toIndentedString(trendSmoothingWindowSize)).append("\n");
    sb.append("    userColumn: ").append(toIndentedString(userColumn)).append("\n");
    sb.append("    walsAlpha: ").append(toIndentedString(walsAlpha)).append("\n");
    sb.append("    warmStart: ").append(toIndentedString(warmStart)).append("\n");
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

