package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class BaseResponse  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("current_server_time")
  private Date currentServerTime = null;
  @SerializedName("totalCount")
  private Integer totalCount = null;
  @SerializedName("returned")
  private Integer returned = null;
  @SerializedName("pages")
  private Integer pages = null;
  @SerializedName("message")
  private String message = null;

  
  /**
   * Indicates success of the operation
   **/
  @ApiModelProperty(value = "Indicates success of the operation")
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
   * Total objects available
   **/
  @ApiModelProperty(value = "Total objects available")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   * Total objects retrieved
   **/
  @ApiModelProperty(value = "Total objects retrieved")
  public Integer getReturned() {
    return returned;
  }
  public void setReturned(Integer returned) {
    this.returned = returned;
  }

  
  /**
   * Total pages available
   **/
  @ApiModelProperty(value = "Total pages available")
  public Integer getPages() {
    return pages;
  }
  public void setPages(Integer pages) {
    this.pages = pages;
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
    sb.append("class BaseResponse {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  currentServerTime: ").append(currentServerTime).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("  returned: ").append(returned).append("\n");
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


