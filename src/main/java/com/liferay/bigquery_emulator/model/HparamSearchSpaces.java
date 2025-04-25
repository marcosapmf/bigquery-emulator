package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.liferay.bigquery_emulator.model.DoubleHparamSearchSpace;
import com.liferay.bigquery_emulator.model.IntArrayHparamSearchSpace;
import com.liferay.bigquery_emulator.model.IntHparamSearchSpace;
import com.liferay.bigquery_emulator.model.StringHparamSearchSpace;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Hyperparameter search spaces. These should be a subset of training_options.
 */

@Schema(name = "HparamSearchSpaces", description = "Hyperparameter search spaces. These should be a subset of training_options.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class HparamSearchSpaces {

  private StringHparamSearchSpace activationFn;

  private IntHparamSearchSpace batchSize;

  private StringHparamSearchSpace boosterType;

  private DoubleHparamSearchSpace colsampleBylevel;

  private DoubleHparamSearchSpace colsampleBynode;

  private DoubleHparamSearchSpace colsampleBytree;

  private StringHparamSearchSpace dartNormalizeType;

  private DoubleHparamSearchSpace dropout;

  private IntArrayHparamSearchSpace hiddenUnits;

  private DoubleHparamSearchSpace l1Reg;

  private DoubleHparamSearchSpace l2Reg;

  private DoubleHparamSearchSpace learnRate;

  private IntHparamSearchSpace maxTreeDepth;

  private DoubleHparamSearchSpace minSplitLoss;

  private IntHparamSearchSpace minTreeChildWeight;

  private IntHparamSearchSpace numClusters;

  private IntHparamSearchSpace numFactors;

  private IntHparamSearchSpace numParallelTree;

  private StringHparamSearchSpace optimizer;

  private DoubleHparamSearchSpace subsample;

  private StringHparamSearchSpace treeMethod;

  private DoubleHparamSearchSpace walsAlpha;

  public HparamSearchSpaces activationFn(StringHparamSearchSpace activationFn) {
    this.activationFn = activationFn;
    return this;
  }

  /**
   * Get activationFn
   * @return activationFn
   */
  @Valid 
  @Schema(name = "activationFn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activationFn")
  public StringHparamSearchSpace getActivationFn() {
    return activationFn;
  }

  public void setActivationFn(StringHparamSearchSpace activationFn) {
    this.activationFn = activationFn;
  }

  public HparamSearchSpaces batchSize(IntHparamSearchSpace batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * Get batchSize
   * @return batchSize
   */
  @Valid 
  @Schema(name = "batchSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchSize")
  public IntHparamSearchSpace getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(IntHparamSearchSpace batchSize) {
    this.batchSize = batchSize;
  }

  public HparamSearchSpaces boosterType(StringHparamSearchSpace boosterType) {
    this.boosterType = boosterType;
    return this;
  }

  /**
   * Get boosterType
   * @return boosterType
   */
  @Valid 
  @Schema(name = "boosterType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boosterType")
  public StringHparamSearchSpace getBoosterType() {
    return boosterType;
  }

  public void setBoosterType(StringHparamSearchSpace boosterType) {
    this.boosterType = boosterType;
  }

  public HparamSearchSpaces colsampleBylevel(DoubleHparamSearchSpace colsampleBylevel) {
    this.colsampleBylevel = colsampleBylevel;
    return this;
  }

  /**
   * Get colsampleBylevel
   * @return colsampleBylevel
   */
  @Valid 
  @Schema(name = "colsampleBylevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBylevel")
  public DoubleHparamSearchSpace getColsampleBylevel() {
    return colsampleBylevel;
  }

  public void setColsampleBylevel(DoubleHparamSearchSpace colsampleBylevel) {
    this.colsampleBylevel = colsampleBylevel;
  }

  public HparamSearchSpaces colsampleBynode(DoubleHparamSearchSpace colsampleBynode) {
    this.colsampleBynode = colsampleBynode;
    return this;
  }

  /**
   * Get colsampleBynode
   * @return colsampleBynode
   */
  @Valid 
  @Schema(name = "colsampleBynode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBynode")
  public DoubleHparamSearchSpace getColsampleBynode() {
    return colsampleBynode;
  }

  public void setColsampleBynode(DoubleHparamSearchSpace colsampleBynode) {
    this.colsampleBynode = colsampleBynode;
  }

  public HparamSearchSpaces colsampleBytree(DoubleHparamSearchSpace colsampleBytree) {
    this.colsampleBytree = colsampleBytree;
    return this;
  }

  /**
   * Get colsampleBytree
   * @return colsampleBytree
   */
  @Valid 
  @Schema(name = "colsampleBytree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colsampleBytree")
  public DoubleHparamSearchSpace getColsampleBytree() {
    return colsampleBytree;
  }

  public void setColsampleBytree(DoubleHparamSearchSpace colsampleBytree) {
    this.colsampleBytree = colsampleBytree;
  }

  public HparamSearchSpaces dartNormalizeType(StringHparamSearchSpace dartNormalizeType) {
    this.dartNormalizeType = dartNormalizeType;
    return this;
  }

  /**
   * Get dartNormalizeType
   * @return dartNormalizeType
   */
  @Valid 
  @Schema(name = "dartNormalizeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dartNormalizeType")
  public StringHparamSearchSpace getDartNormalizeType() {
    return dartNormalizeType;
  }

  public void setDartNormalizeType(StringHparamSearchSpace dartNormalizeType) {
    this.dartNormalizeType = dartNormalizeType;
  }

  public HparamSearchSpaces dropout(DoubleHparamSearchSpace dropout) {
    this.dropout = dropout;
    return this;
  }

  /**
   * Get dropout
   * @return dropout
   */
  @Valid 
  @Schema(name = "dropout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropout")
  public DoubleHparamSearchSpace getDropout() {
    return dropout;
  }

  public void setDropout(DoubleHparamSearchSpace dropout) {
    this.dropout = dropout;
  }

  public HparamSearchSpaces hiddenUnits(IntArrayHparamSearchSpace hiddenUnits) {
    this.hiddenUnits = hiddenUnits;
    return this;
  }

  /**
   * Get hiddenUnits
   * @return hiddenUnits
   */
  @Valid 
  @Schema(name = "hiddenUnits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hiddenUnits")
  public IntArrayHparamSearchSpace getHiddenUnits() {
    return hiddenUnits;
  }

  public void setHiddenUnits(IntArrayHparamSearchSpace hiddenUnits) {
    this.hiddenUnits = hiddenUnits;
  }

  public HparamSearchSpaces l1Reg(DoubleHparamSearchSpace l1Reg) {
    this.l1Reg = l1Reg;
    return this;
  }

  /**
   * Get l1Reg
   * @return l1Reg
   */
  @Valid 
  @Schema(name = "l1Reg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l1Reg")
  public DoubleHparamSearchSpace getL1Reg() {
    return l1Reg;
  }

  public void setL1Reg(DoubleHparamSearchSpace l1Reg) {
    this.l1Reg = l1Reg;
  }

  public HparamSearchSpaces l2Reg(DoubleHparamSearchSpace l2Reg) {
    this.l2Reg = l2Reg;
    return this;
  }

  /**
   * Get l2Reg
   * @return l2Reg
   */
  @Valid 
  @Schema(name = "l2Reg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("l2Reg")
  public DoubleHparamSearchSpace getL2Reg() {
    return l2Reg;
  }

  public void setL2Reg(DoubleHparamSearchSpace l2Reg) {
    this.l2Reg = l2Reg;
  }

  public HparamSearchSpaces learnRate(DoubleHparamSearchSpace learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * Get learnRate
   * @return learnRate
   */
  @Valid 
  @Schema(name = "learnRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learnRate")
  public DoubleHparamSearchSpace getLearnRate() {
    return learnRate;
  }

  public void setLearnRate(DoubleHparamSearchSpace learnRate) {
    this.learnRate = learnRate;
  }

  public HparamSearchSpaces maxTreeDepth(IntHparamSearchSpace maxTreeDepth) {
    this.maxTreeDepth = maxTreeDepth;
    return this;
  }

  /**
   * Get maxTreeDepth
   * @return maxTreeDepth
   */
  @Valid 
  @Schema(name = "maxTreeDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTreeDepth")
  public IntHparamSearchSpace getMaxTreeDepth() {
    return maxTreeDepth;
  }

  public void setMaxTreeDepth(IntHparamSearchSpace maxTreeDepth) {
    this.maxTreeDepth = maxTreeDepth;
  }

  public HparamSearchSpaces minSplitLoss(DoubleHparamSearchSpace minSplitLoss) {
    this.minSplitLoss = minSplitLoss;
    return this;
  }

  /**
   * Get minSplitLoss
   * @return minSplitLoss
   */
  @Valid 
  @Schema(name = "minSplitLoss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minSplitLoss")
  public DoubleHparamSearchSpace getMinSplitLoss() {
    return minSplitLoss;
  }

  public void setMinSplitLoss(DoubleHparamSearchSpace minSplitLoss) {
    this.minSplitLoss = minSplitLoss;
  }

  public HparamSearchSpaces minTreeChildWeight(IntHparamSearchSpace minTreeChildWeight) {
    this.minTreeChildWeight = minTreeChildWeight;
    return this;
  }

  /**
   * Get minTreeChildWeight
   * @return minTreeChildWeight
   */
  @Valid 
  @Schema(name = "minTreeChildWeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minTreeChildWeight")
  public IntHparamSearchSpace getMinTreeChildWeight() {
    return minTreeChildWeight;
  }

  public void setMinTreeChildWeight(IntHparamSearchSpace minTreeChildWeight) {
    this.minTreeChildWeight = minTreeChildWeight;
  }

  public HparamSearchSpaces numClusters(IntHparamSearchSpace numClusters) {
    this.numClusters = numClusters;
    return this;
  }

  /**
   * Get numClusters
   * @return numClusters
   */
  @Valid 
  @Schema(name = "numClusters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numClusters")
  public IntHparamSearchSpace getNumClusters() {
    return numClusters;
  }

  public void setNumClusters(IntHparamSearchSpace numClusters) {
    this.numClusters = numClusters;
  }

  public HparamSearchSpaces numFactors(IntHparamSearchSpace numFactors) {
    this.numFactors = numFactors;
    return this;
  }

  /**
   * Get numFactors
   * @return numFactors
   */
  @Valid 
  @Schema(name = "numFactors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numFactors")
  public IntHparamSearchSpace getNumFactors() {
    return numFactors;
  }

  public void setNumFactors(IntHparamSearchSpace numFactors) {
    this.numFactors = numFactors;
  }

  public HparamSearchSpaces numParallelTree(IntHparamSearchSpace numParallelTree) {
    this.numParallelTree = numParallelTree;
    return this;
  }

  /**
   * Get numParallelTree
   * @return numParallelTree
   */
  @Valid 
  @Schema(name = "numParallelTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numParallelTree")
  public IntHparamSearchSpace getNumParallelTree() {
    return numParallelTree;
  }

  public void setNumParallelTree(IntHparamSearchSpace numParallelTree) {
    this.numParallelTree = numParallelTree;
  }

  public HparamSearchSpaces optimizer(StringHparamSearchSpace optimizer) {
    this.optimizer = optimizer;
    return this;
  }

  /**
   * Get optimizer
   * @return optimizer
   */
  @Valid 
  @Schema(name = "optimizer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optimizer")
  public StringHparamSearchSpace getOptimizer() {
    return optimizer;
  }

  public void setOptimizer(StringHparamSearchSpace optimizer) {
    this.optimizer = optimizer;
  }

  public HparamSearchSpaces subsample(DoubleHparamSearchSpace subsample) {
    this.subsample = subsample;
    return this;
  }

  /**
   * Get subsample
   * @return subsample
   */
  @Valid 
  @Schema(name = "subsample", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsample")
  public DoubleHparamSearchSpace getSubsample() {
    return subsample;
  }

  public void setSubsample(DoubleHparamSearchSpace subsample) {
    this.subsample = subsample;
  }

  public HparamSearchSpaces treeMethod(StringHparamSearchSpace treeMethod) {
    this.treeMethod = treeMethod;
    return this;
  }

  /**
   * Get treeMethod
   * @return treeMethod
   */
  @Valid 
  @Schema(name = "treeMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("treeMethod")
  public StringHparamSearchSpace getTreeMethod() {
    return treeMethod;
  }

  public void setTreeMethod(StringHparamSearchSpace treeMethod) {
    this.treeMethod = treeMethod;
  }

  public HparamSearchSpaces walsAlpha(DoubleHparamSearchSpace walsAlpha) {
    this.walsAlpha = walsAlpha;
    return this;
  }

  /**
   * Get walsAlpha
   * @return walsAlpha
   */
  @Valid 
  @Schema(name = "walsAlpha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("walsAlpha")
  public DoubleHparamSearchSpace getWalsAlpha() {
    return walsAlpha;
  }

  public void setWalsAlpha(DoubleHparamSearchSpace walsAlpha) {
    this.walsAlpha = walsAlpha;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HparamSearchSpaces hparamSearchSpaces = (HparamSearchSpaces) o;
    return Objects.equals(this.activationFn, hparamSearchSpaces.activationFn) &&
        Objects.equals(this.batchSize, hparamSearchSpaces.batchSize) &&
        Objects.equals(this.boosterType, hparamSearchSpaces.boosterType) &&
        Objects.equals(this.colsampleBylevel, hparamSearchSpaces.colsampleBylevel) &&
        Objects.equals(this.colsampleBynode, hparamSearchSpaces.colsampleBynode) &&
        Objects.equals(this.colsampleBytree, hparamSearchSpaces.colsampleBytree) &&
        Objects.equals(this.dartNormalizeType, hparamSearchSpaces.dartNormalizeType) &&
        Objects.equals(this.dropout, hparamSearchSpaces.dropout) &&
        Objects.equals(this.hiddenUnits, hparamSearchSpaces.hiddenUnits) &&
        Objects.equals(this.l1Reg, hparamSearchSpaces.l1Reg) &&
        Objects.equals(this.l2Reg, hparamSearchSpaces.l2Reg) &&
        Objects.equals(this.learnRate, hparamSearchSpaces.learnRate) &&
        Objects.equals(this.maxTreeDepth, hparamSearchSpaces.maxTreeDepth) &&
        Objects.equals(this.minSplitLoss, hparamSearchSpaces.minSplitLoss) &&
        Objects.equals(this.minTreeChildWeight, hparamSearchSpaces.minTreeChildWeight) &&
        Objects.equals(this.numClusters, hparamSearchSpaces.numClusters) &&
        Objects.equals(this.numFactors, hparamSearchSpaces.numFactors) &&
        Objects.equals(this.numParallelTree, hparamSearchSpaces.numParallelTree) &&
        Objects.equals(this.optimizer, hparamSearchSpaces.optimizer) &&
        Objects.equals(this.subsample, hparamSearchSpaces.subsample) &&
        Objects.equals(this.treeMethod, hparamSearchSpaces.treeMethod) &&
        Objects.equals(this.walsAlpha, hparamSearchSpaces.walsAlpha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationFn, batchSize, boosterType, colsampleBylevel, colsampleBynode, colsampleBytree, dartNormalizeType, dropout, hiddenUnits, l1Reg, l2Reg, learnRate, maxTreeDepth, minSplitLoss, minTreeChildWeight, numClusters, numFactors, numParallelTree, optimizer, subsample, treeMethod, walsAlpha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HparamSearchSpaces {\n");
    sb.append("    activationFn: ").append(toIndentedString(activationFn)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    boosterType: ").append(toIndentedString(boosterType)).append("\n");
    sb.append("    colsampleBylevel: ").append(toIndentedString(colsampleBylevel)).append("\n");
    sb.append("    colsampleBynode: ").append(toIndentedString(colsampleBynode)).append("\n");
    sb.append("    colsampleBytree: ").append(toIndentedString(colsampleBytree)).append("\n");
    sb.append("    dartNormalizeType: ").append(toIndentedString(dartNormalizeType)).append("\n");
    sb.append("    dropout: ").append(toIndentedString(dropout)).append("\n");
    sb.append("    hiddenUnits: ").append(toIndentedString(hiddenUnits)).append("\n");
    sb.append("    l1Reg: ").append(toIndentedString(l1Reg)).append("\n");
    sb.append("    l2Reg: ").append(toIndentedString(l2Reg)).append("\n");
    sb.append("    learnRate: ").append(toIndentedString(learnRate)).append("\n");
    sb.append("    maxTreeDepth: ").append(toIndentedString(maxTreeDepth)).append("\n");
    sb.append("    minSplitLoss: ").append(toIndentedString(minSplitLoss)).append("\n");
    sb.append("    minTreeChildWeight: ").append(toIndentedString(minTreeChildWeight)).append("\n");
    sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
    sb.append("    numFactors: ").append(toIndentedString(numFactors)).append("\n");
    sb.append("    numParallelTree: ").append(toIndentedString(numParallelTree)).append("\n");
    sb.append("    optimizer: ").append(toIndentedString(optimizer)).append("\n");
    sb.append("    subsample: ").append(toIndentedString(subsample)).append("\n");
    sb.append("    treeMethod: ").append(toIndentedString(treeMethod)).append("\n");
    sb.append("    walsAlpha: ").append(toIndentedString(walsAlpha)).append("\n");
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

