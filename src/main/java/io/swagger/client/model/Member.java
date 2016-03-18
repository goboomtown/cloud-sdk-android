package io.swagger.client.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Member  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("name_legal")
  private String nameLegal = null;
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
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("industry")
  private String industry = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("created")
  private Date created = null;

  
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
  @ApiModelProperty(required = true, value = "Business name.")
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
  @ApiModelProperty(required = true, value = "Postal Code.")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  
  /**
   * Email address.
   **/
  @ApiModelProperty(required = true, value = "Email address.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
   * Industry.
   **/
  @ApiModelProperty(value = "Industry.")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }

  
  /**
   * Status.
   **/
  @ApiModelProperty(value = "Status.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nameLegal: ").append(nameLegal).append("\n");
    sb.append("  street1: ").append(street1).append("\n");
    sb.append("  street2: ").append(street2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zipcode: ").append(zipcode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  industry: ").append(industry).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


