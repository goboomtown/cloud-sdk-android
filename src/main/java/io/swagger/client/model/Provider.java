package io.swagger.client.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Provider  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("name_legal")
  private String nameLegal = null;
  @SerializedName("nickname")
  private String nickname = null;
  @SerializedName("comm_id")
  private String commId = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("street_1")
  private String street1 = null;
  @SerializedName("street_2")
  private String street2 = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("zipcode")
  private String zipcode = null;
  @SerializedName("latitude")
  private Float latitude = null;
  @SerializedName("longitude")
  private Float longitude = null;
  @SerializedName("default_partners_teams_id")
  private String defaultPartnersTeamsId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("website")
  private String website = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("created")
  private Date created = null;
  @SerializedName("updated")
  private Date updated = null;

  
  /**
   * Primary key.
   **/
  @ApiModelProperty(value = "Primary key.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Business name.
   **/
  @ApiModelProperty(value = "Business name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Business legal name.
   **/
  @ApiModelProperty(value = "Business legal name.")
  public String getNameLegal() {
    return nameLegal;
  }
  public void setNameLegal(String nameLegal) {
    this.nameLegal = nameLegal;
  }

  
  /**
   * Hashtag nickname for group mentions in chat.
   **/
  @ApiModelProperty(value = "Hashtag nickname for group mentions in chat.")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  
  /**
   * The communication channel id.
   **/
  @ApiModelProperty(value = "The communication channel id.")
  public String getCommId() {
    return commId;
  }
  public void setCommId(String commId) {
    this.commId = commId;
  }

  
  /**
   * Description.
   **/
  @ApiModelProperty(value = "Description.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Street address.
   **/
  @ApiModelProperty(value = "Street address.")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   * Street address continued.
   **/
  @ApiModelProperty(value = "Street address continued.")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   * City.
   **/
  @ApiModelProperty(value = "City.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State Identifier (2 char code).
   **/
  @ApiModelProperty(value = "State Identifier (2 char code).")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Postal Code.
   **/
  @ApiModelProperty(value = "Postal Code.")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  
  /**
   * Business location latitude.
   **/
  @ApiModelProperty(value = "Business location latitude.")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Business location longitude.
   **/
  @ApiModelProperty(value = "Business location longitude.")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Default ProviderTeam's id.
   **/
  @ApiModelProperty(value = "Default ProviderTeam's id.")
  public String getDefaultPartnersTeamsId() {
    return defaultPartnersTeamsId;
  }
  public void setDefaultPartnersTeamsId(String defaultPartnersTeamsId) {
    this.defaultPartnersTeamsId = defaultPartnersTeamsId;
  }

  
  /**
   * Email address.
   **/
  @ApiModelProperty(value = "Email address.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Primary contact phone number.
   **/
  @ApiModelProperty(value = "Primary contact phone number.")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Business website/URL.
   **/
  @ApiModelProperty(value = "Business website/URL.")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   * URL to an avatar.
   **/
  @ApiModelProperty(value = "URL to an avatar.")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  
  /**
   * Date created.
   **/
  @ApiModelProperty(value = "Date created.")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  
  /**
   * Date last updated.
   **/
  @ApiModelProperty(value = "Date last updated.")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nameLegal: ").append(nameLegal).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  commId: ").append(commId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  street1: ").append(street1).append("\n");
    sb.append("  street2: ").append(street2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zipcode: ").append(zipcode).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  defaultPartnersTeamsId: ").append(defaultPartnersTeamsId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  website: ").append(website).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


