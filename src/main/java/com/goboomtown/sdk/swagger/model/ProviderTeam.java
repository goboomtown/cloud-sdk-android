package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ProviderTeam  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("nickname")
  private String nickname = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("auto_assign_route")
  private Boolean autoAssignRoute = null;
  @SerializedName("auto_assign_sponsor")
  private Boolean autoAssignSponsor = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("exclusive")
  private Boolean exclusive = null;
  @SerializedName("published")
  private Boolean published = null;
  @SerializedName("published_name")
  private String publishedName = null;
  @SerializedName("private_label")
  private Boolean privateLabel = null;
  @SerializedName("brand_color1")
  private String brandColor1 = null;
  @SerializedName("brand_logo_1x")
  private String brandLogo1x = null;
  @SerializedName("brand_logo_2x")
  private String brandLogo2x = null;
  @SerializedName("brand_logo_3x")
  private String brandLogo3x = null;
  @SerializedName("support_email")
  private String supportEmail = null;
  @SerializedName("support_phone")
  private String supportPhone = null;
  @SerializedName("support_url")
  private String supportUrl = null;
  @SerializedName("created")
  private Date created = null;
  @SerializedName("updated")
  private Date updated = null;

  
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
   * Name
   **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Hashtag nickname for group mentions in chat
   **/
  @ApiModelProperty(value = "Hashtag nickname for group mentions in chat")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  
  /**
   * Description
   **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Email
   **/
  @ApiModelProperty(value = "Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Phone
   **/
  @ApiModelProperty(value = "Phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Avatar (URL)
   **/
  @ApiModelProperty(value = "Avatar (URL)")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  
  /**
   * Automatically set this ProviderTeam as first contact on new *Issues* from related *Merchants*
   **/
  @ApiModelProperty(value = "Automatically set this ProviderTeam as first contact on new *Issues* from related *Merchants*")
  public Boolean getAutoAssignRoute() {
    return autoAssignRoute;
  }
  public void setAutoAssignRoute(Boolean autoAssignRoute) {
    this.autoAssignRoute = autoAssignRoute;
  }

  
  /**
   * Automatically set this ProviderTeam as sponsor for related *Merchant* billing
   **/
  @ApiModelProperty(value = "Automatically set this ProviderTeam as sponsor for related *Merchant* billing")
  public Boolean getAutoAssignSponsor() {
    return autoAssignSponsor;
  }
  public void setAutoAssignSponsor(Boolean autoAssignSponsor) {
    this.autoAssignSponsor = autoAssignSponsor;
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
   * Type/Category
   **/
  @ApiModelProperty(value = "Type/Category")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * This ProviderTeam is exclusive within its type/category
   **/
  @ApiModelProperty(value = "This ProviderTeam is exclusive within its type/category")
  public Boolean getExclusive() {
    return exclusive;
  }
  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  
  /**
   * This ProviderTeam is published in the Connect app
   **/
  @ApiModelProperty(value = "This ProviderTeam is published in the Connect app")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Name of this ProviderTeam as it appears in the Connect app
   **/
  @ApiModelProperty(value = "Name of this ProviderTeam as it appears in the Connect app")
  public String getPublishedName() {
    return publishedName;
  }
  public void setPublishedName(String publishedName) {
    this.publishedName = publishedName;
  }

  
  /**
   * This ProviderTeam has private label branding in the Connect app
   **/
  @ApiModelProperty(value = "This ProviderTeam has private label branding in the Connect app")
  public Boolean getPrivateLabel() {
    return privateLabel;
  }
  public void setPrivateLabel(Boolean privateLabel) {
    this.privateLabel = privateLabel;
  }

  
  /**
   * Private label brand color (if private_label is true)
   **/
  @ApiModelProperty(value = "Private label brand color (if private_label is true)")
  public String getBrandColor1() {
    return brandColor1;
  }
  public void setBrandColor1(String brandColor1) {
    this.brandColor1 = brandColor1;
  }

  
  /**
   * Private label logo (if private_label is true)
   **/
  @ApiModelProperty(value = "Private label logo (if private_label is true)")
  public String getBrandLogo1x() {
    return brandLogo1x;
  }
  public void setBrandLogo1x(String brandLogo1x) {
    this.brandLogo1x = brandLogo1x;
  }

  
  /**
   * Private label logo [x2] (if private_label is true)
   **/
  @ApiModelProperty(value = "Private label logo [x2] (if private_label is true)")
  public String getBrandLogo2x() {
    return brandLogo2x;
  }
  public void setBrandLogo2x(String brandLogo2x) {
    this.brandLogo2x = brandLogo2x;
  }

  
  /**
   * Private label logo [x3] (if private_label is true)
   **/
  @ApiModelProperty(value = "Private label logo [x3] (if private_label is true)")
  public String getBrandLogo3x() {
    return brandLogo3x;
  }
  public void setBrandLogo3x(String brandLogo3x) {
    this.brandLogo3x = brandLogo3x;
  }

  
  /**
   * Support Email
   **/
  @ApiModelProperty(value = "Support Email")
  public String getSupportEmail() {
    return supportEmail;
  }
  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }

  
  /**
   * Support Phone
   **/
  @ApiModelProperty(value = "Support Phone")
  public String getSupportPhone() {
    return supportPhone;
  }
  public void setSupportPhone(String supportPhone) {
    this.supportPhone = supportPhone;
  }

  
  /**
   * Support Website (URL)
   **/
  @ApiModelProperty(value = "Support Website (URL)")
  public String getSupportUrl() {
    return supportUrl;
  }
  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderTeam {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  autoAssignRoute: ").append(autoAssignRoute).append("\n");
    sb.append("  autoAssignSponsor: ").append(autoAssignSponsor).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  exclusive: ").append(exclusive).append("\n");
    sb.append("  published: ").append(published).append("\n");
    sb.append("  publishedName: ").append(publishedName).append("\n");
    sb.append("  privateLabel: ").append(privateLabel).append("\n");
    sb.append("  brandColor1: ").append(brandColor1).append("\n");
    sb.append("  brandLogo1x: ").append(brandLogo1x).append("\n");
    sb.append("  brandLogo2x: ").append(brandLogo2x).append("\n");
    sb.append("  brandLogo3x: ").append(brandLogo3x).append("\n");
    sb.append("  supportEmail: ").append(supportEmail).append("\n");
    sb.append("  supportPhone: ").append(supportPhone).append("\n");
    sb.append("  supportUrl: ").append(supportUrl).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


