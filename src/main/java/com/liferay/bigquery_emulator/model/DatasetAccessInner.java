package com.liferay.bigquery_emulator.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.liferay.bigquery_emulator.model.DatasetAccessEntry;
import com.liferay.bigquery_emulator.model.RoutineReference;
import com.liferay.bigquery_emulator.model.TableReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DatasetAccessInner
 */

@JsonTypeName("Dataset_access_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
public class DatasetAccessInner {

  private DatasetAccessEntry dataset;

  private String domain;

  private String groupByEmail;

  private String iamMember;

  private String role;

  private RoutineReference routine;

  private String specialGroup;

  private String userByEmail;

  private TableReference view;

  public DatasetAccessInner dataset(DatasetAccessEntry dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Get dataset
   * @return dataset
   */
  @Valid 
  @Schema(name = "dataset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataset")
  public DatasetAccessEntry getDataset() {
    return dataset;
  }

  public void setDataset(DatasetAccessEntry dataset) {
    this.dataset = dataset;
  }

  public DatasetAccessInner domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: \"example.com\". Maps to IAM policy member \"domain:DOMAIN\".
   * @return domain
   */
  
  @Schema(name = "domain", description = "[Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: \"example.com\". Maps to IAM policy member \"domain:DOMAIN\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DatasetAccessInner groupByEmail(String groupByEmail) {
    this.groupByEmail = groupByEmail;
    return this;
  }

  /**
   * [Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member \"group:GROUP\".
   * @return groupByEmail
   */
  
  @Schema(name = "groupByEmail", description = "[Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member \"group:GROUP\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupByEmail")
  public String getGroupByEmail() {
    return groupByEmail;
  }

  public void setGroupByEmail(String groupByEmail) {
    this.groupByEmail = groupByEmail;
  }

  public DatasetAccessInner iamMember(String iamMember) {
    this.iamMember = iamMember;
    return this;
  }

  /**
   * [Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group.
   * @return iamMember
   */
  
  @Schema(name = "iamMember", description = "[Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iamMember")
  public String getIamMember() {
    return iamMember;
  }

  public void setIamMember(String iamMember) {
    this.iamMember = iamMember;
  }

  public DatasetAccessInner role(String role) {
    this.role = role;
    return this;
  }

  /**
   * [Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER  roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy format. For example, if you set this field to \"roles/bigquery.dataOwner\", it will be returned back as \"OWNER\".
   * @return role
   */
  
  @Schema(name = "role", description = "[Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER  roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy format. For example, if you set this field to \"roles/bigquery.dataOwner\", it will be returned back as \"OWNER\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public DatasetAccessInner routine(RoutineReference routine) {
    this.routine = routine;
    return this;
  }

  /**
   * Get routine
   * @return routine
   */
  @Valid 
  @Schema(name = "routine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routine")
  public RoutineReference getRoutine() {
    return routine;
  }

  public void setRoutine(RoutineReference routine) {
    this.routine = routine;
  }

  public DatasetAccessInner specialGroup(String specialGroup) {
    this.specialGroup = specialGroup;
    return this;
  }

  /**
   * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.
   * @return specialGroup
   */
  
  @Schema(name = "specialGroup", description = "[Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialGroup")
  public String getSpecialGroup() {
    return specialGroup;
  }

  public void setSpecialGroup(String specialGroup) {
    this.specialGroup = specialGroup;
  }

  public DatasetAccessInner userByEmail(String userByEmail) {
    this.userByEmail = userByEmail;
    return this;
  }

  /**
   * [Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member \"user:EMAIL\" or \"serviceAccount:EMAIL\".
   * @return userByEmail
   */
  
  @Schema(name = "userByEmail", description = "[Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member \"user:EMAIL\" or \"serviceAccount:EMAIL\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userByEmail")
  public String getUserByEmail() {
    return userByEmail;
  }

  public void setUserByEmail(String userByEmail) {
    this.userByEmail = userByEmail;
  }

  public DatasetAccessInner view(TableReference view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
   */
  @Valid 
  @Schema(name = "view", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view")
  public TableReference getView() {
    return view;
  }

  public void setView(TableReference view) {
    this.view = view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetAccessInner datasetAccessInner = (DatasetAccessInner) o;
    return Objects.equals(this.dataset, datasetAccessInner.dataset) &&
        Objects.equals(this.domain, datasetAccessInner.domain) &&
        Objects.equals(this.groupByEmail, datasetAccessInner.groupByEmail) &&
        Objects.equals(this.iamMember, datasetAccessInner.iamMember) &&
        Objects.equals(this.role, datasetAccessInner.role) &&
        Objects.equals(this.routine, datasetAccessInner.routine) &&
        Objects.equals(this.specialGroup, datasetAccessInner.specialGroup) &&
        Objects.equals(this.userByEmail, datasetAccessInner.userByEmail) &&
        Objects.equals(this.view, datasetAccessInner.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, domain, groupByEmail, iamMember, role, routine, specialGroup, userByEmail, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetAccessInner {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    groupByEmail: ").append(toIndentedString(groupByEmail)).append("\n");
    sb.append("    iamMember: ").append(toIndentedString(iamMember)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    routine: ").append(toIndentedString(routine)).append("\n");
    sb.append("    specialGroup: ").append(toIndentedString(specialGroup)).append("\n");
    sb.append("    userByEmail: ").append(toIndentedString(userByEmail)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

