package com.goboomtown.sdk.swagger.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class MemberLocation  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("members_id")
  private String membersId = null;
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
  private Double latitude = null;
  @SerializedName("longitude")
  private Double longitude = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("site_name")
  private String siteName = null;

  
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
   * The primary key of the related *Merchant*.
   **/
  @ApiModelProperty(value = "The primary key of the related *Merchant*.")
  public String getMembersId() {
    return membersId;
  }
  public void setMembersId(String membersId) {
    this.membersId = membersId;
  }

  
  /**
   * Street address.
   **/
  @ApiModelProperty(required = true, value = "Street address.")
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
  @ApiModelProperty(required = true, value = "City.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State Identifier (2 char code).
   **/
  @ApiModelProperty(required = true, value = "State Identifier (2 char code).")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Postal Code.
   **/
  @ApiModelProperty(required = true, value = "Postal Code.")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  
  /**
   * Latitude.
   **/
  @ApiModelProperty(value = "Latitude.")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude.
   **/
  @ApiModelProperty(value = "Longitude.")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Phone number.
   **/
  @ApiModelProperty(value = "Phone number.")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Informal reference, an alias.
   **/
  @ApiModelProperty(value = "Informal reference, an alias.")
  public String getSiteName() {
    return siteName;
  }
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberLocation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  membersId: ").append(membersId).append("\n");
    sb.append("  street1: ").append(street1).append("\n");
    sb.append("  street2: ").append(street2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zipcode: ").append(zipcode).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  siteName: ").append(siteName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


