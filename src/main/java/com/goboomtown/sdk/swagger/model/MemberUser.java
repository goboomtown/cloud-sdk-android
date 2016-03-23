package com.goboomtown.sdk.swagger.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class MemberUser  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("members_id")
  private String membersId = null;
  @SerializedName("members_locations_id")
  private String membersLocationsId = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("full_name")
  private String fullName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("sms_number")
  private String smsNumber = null;
  @SerializedName("lang")
  private String lang = null;
  @SerializedName("status")
  private String status = null;

  
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
   * Related *Merchant* primary key
   **/
  @ApiModelProperty(value = "Related *Merchant* primary key")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   * Related *MerchantLocation* primary key
   **/
  @ApiModelProperty(value = "Related *MerchantLocation* primary key")
  public String getMembersLocationsId() {
    return membersLocationsId;
  }
  public void setMembersLocationsId(String membersLocationsId) {
    this.membersLocationsId = membersLocationsId;
  }

  
  /**
   * First name
   **/
  @ApiModelProperty(required = true, value = "First name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last name
   **/
  @ApiModelProperty(required = true, value = "Last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Full name
   **/
  @ApiModelProperty(value = "Full name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   * Email
   **/
  @ApiModelProperty(required = true, value = "Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Mobile/SMS phone
   **/
  @ApiModelProperty(value = "Mobile/SMS phone")
  public String getSmsNumber() {
    return smsNumber;
  }
  public void setSmsNumber(String smsNumber) {
    this.smsNumber = smsNumber;
  }

  
  /**
   * Language (ISO-2)
   **/
  @ApiModelProperty(value = "Language (ISO-2)")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  membersId: ").append(membersId).append("\n");
    sb.append("  membersLocationsId: ").append(membersLocationsId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  smsNumber: ").append(smsNumber).append("\n");
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


