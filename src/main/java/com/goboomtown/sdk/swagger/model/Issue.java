package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Issue  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("reference_num")
  private String referenceNum = null;
  @SerializedName("members_id")
  private String membersId = null;
  @SerializedName("members_name")
  private String membersName = null;
  @SerializedName("members_email")
  private String membersEmail = null;
  @SerializedName("members_locations_id")
  private String membersLocationsId = null;
  @SerializedName("members_locations_name")
  private String membersLocationsName = null;
  @SerializedName("members_users_id")
  private String membersUsersId = null;
  @SerializedName("members_users_name")
  private String membersUsersName = null;
  @SerializedName("members_users_email")
  private String membersUsersEmail = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("details")
  private String details = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("job")
  private String job = null;
  @SerializedName("resolution")
  private String resolution = null;
  @SerializedName("created")
  private Date created = null;
  @SerializedName("updated")
  private Date updated = null;
  @SerializedName("scheduled_time")
  private Date scheduledTime = null;
  @SerializedName("enroute_time")
  private Date enrouteTime = null;
  @SerializedName("arrival_time")
  private Date arrivalTime = null;
  @SerializedName("departure_time")
  private Date departureTime = null;

  
  /**
   * Primary key
   **/
  @ApiModelProperty(value = "Primary key")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Reference number
   **/
  @ApiModelProperty(value = "Reference number")
  public String getReferenceNum() {
    return referenceNum;
  }
  public void setReferenceNum(String referenceNum) {
    this.referenceNum = referenceNum;
  }

  
  /**
   * Related *Merchant* primary key
   **/
  @ApiModelProperty(required = true, value = "Related *Merchant* primary key")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   * Related *Merchant* name
   **/
  @ApiModelProperty(value = "Related *Merchant* name")
  public String getMembersName() {
    return membersName;
  }
  public void setMembersName(String membersName) {
    this.membersName = membersName;
  }

  
  /**
   * Related *Merchant* email
   **/
  @ApiModelProperty(value = "Related *Merchant* email")
  public String getMembersEmail() {
    return membersEmail;
  }
  public void setMembersEmail(String membersEmail) {
    this.membersEmail = membersEmail;
  }

  
  /**
   * Related *MerchantLocation* primary key
   **/
  @ApiModelProperty(required = true, value = "Related *MerchantLocation* primary key")
  public String getMembersLocationsId() {
    return membersLocationsId;
  }
  public void setMembersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
  }

  
  /**
   * Related *MerchantLocation* name
   **/
  @ApiModelProperty(value = "Related *MerchantLocation* name")
  public String getMembersLocationsName() {
    return membersLocationsName;
  }
  public void setMembersLocationsName(String membersLocationsName) {
    this.membersLocationsName = membersLocationsName;
  }

  
  /**
   * Related *MerchantUser* primary key
   **/
  @ApiModelProperty(required = true, value = "Related *MerchantUser* primary key")
  public String getMembersUsersId() {
    return membersUsersId;
  }
  public void setMembersUsersId(String membersUsersId) {
    this.membersUsersId = membersUsersId;
  }

  
  /**
   * Related *MerchantUser* name
   **/
  @ApiModelProperty(value = "Related *MerchantUser* name")
  public String getMembersUsersName() {
    return membersUsersName;
  }
  public void setMembersUsersName(String membersUsersName) {
    this.membersUsersName = membersUsersName;
  }

  
  /**
   * Related *MerchantUser* email
   **/
  @ApiModelProperty(value = "Related *MerchantUser* email")
  public String getMembersUsersEmail() {
    return membersUsersEmail;
  }
  public void setMembersUsersEmail(String membersUsersEmail) {
    this.membersUsersEmail = membersUsersEmail;
  }

  
  /**
   * Type
   **/
  @ApiModelProperty(value = "Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Category
   **/
  @ApiModelProperty(value = "Category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Details
   **/
  @ApiModelProperty(value = "Details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  
  /**
   * Status
   **/
  @ApiModelProperty(value = "Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Job type
   **/
  @ApiModelProperty(value = "Job type")
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }

  
  /**
   * Resolution
   **/
  @ApiModelProperty(value = "Resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   * Created
   **/
  @ApiModelProperty(value = "Created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Updated
   **/
  @ApiModelProperty(value = "Updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  
  /**
   * Technician job scheduled
   **/
  @ApiModelProperty(value = "Technician job scheduled")
  public Date getScheduledTime() {
    return scheduledTime;
  }
  public void setScheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  
  /**
   * Technician en-route for job
   **/
  @ApiModelProperty(value = "Technician en-route for job")
  public Date getEnrouteTime() {
    return enrouteTime;
  }
  public void setEnrouteTime(Date enrouteTime) {
    this.enrouteTime = enrouteTime;
  }

  
  /**
   * Technician arrived at job
   **/
  @ApiModelProperty(value = "Technician arrived at job")
  public Date getArrivalTime() {
    return arrivalTime;
  }
  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  
  /**
   * Technician departed job
   **/
  @ApiModelProperty(value = "Technician departed job")
  public Date getDepartureTime() {
    return departureTime;
  }
  public void setDepartureTime(Date departureTime) {
    this.departureTime = departureTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  referenceNum: ").append(referenceNum).append("\n");
    sb.append("  membersId: ").append(membersId).append("\n");
    sb.append("  membersName: ").append(membersName).append("\n");
    sb.append("  membersEmail: ").append(membersEmail).append("\n");
    sb.append("  membersLocationsId: ").append(membersLocationsId).append("\n");
    sb.append("  membersLocationsName: ").append(membersLocationsName).append("\n");
    sb.append("  membersUsersId: ").append(membersUsersId).append("\n");
    sb.append("  membersUsersName: ").append(membersUsersName).append("\n");
    sb.append("  membersUsersEmail: ").append(membersUsersEmail).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  job: ").append(job).append("\n");
    sb.append("  resolution: ").append(resolution).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  scheduledTime: ").append(scheduledTime).append("\n");
    sb.append("  enrouteTime: ").append(enrouteTime).append("\n");
    sb.append("  arrivalTime: ").append(arrivalTime).append("\n");
    sb.append("  departureTime: ").append(departureTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


