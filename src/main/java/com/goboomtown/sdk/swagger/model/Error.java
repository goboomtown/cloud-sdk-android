package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Error  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("current_server_time")
  private Date currentServerTime = null;
  @SerializedName("message")
  private String message = null;

  
  /**
   * Indicates whether the request was or was not successful
   **/
  @ApiModelProperty(value = "Indicates whether the request was or was not successful")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCurrentServerTime() {
    return currentServerTime;
  }
  public void setCurrentServerTime(Date currentServerTime) {
    this.currentServerTime = currentServerTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  currentServerTime: ").append(currentServerTime).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


