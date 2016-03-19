package com.goboomtown.sdk.swagger.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;



@ApiModel(description = "")
public class MemberResponse {
  
  @SerializedName("pages")
  private Integer pages = null;
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("current_server_time")
  private Date currentServerTime = null;
  @SerializedName("totalCount")
  private Integer totalCount = null;
  @SerializedName("returned")
  private Integer returned = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("results")
  private List<Member> results = null;

  
  /**
   * Total pages available.
   **/
  @ApiModelProperty(value = "Total pages available.")
  public Integer getPages() {
    return pages;
  }
  public void setPages(Integer pages) {
    this.pages = pages;
  }

  
  /**
   * Indicates success of the operation.
   **/
  @ApiModelProperty(value = "Indicates success of the operation.")
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
   * Total records available.
   **/
  @ApiModelProperty(value = "Total records available.")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   * Total records retrieved.
   **/
  @ApiModelProperty(value = "Total records retrieved.")
  public Integer getReturned() {
    return returned;
  }
  public void setReturned(Integer returned) {
    this.returned = returned;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<Member> getResults() {
    return results;
  }
  public void setResults(List<Member> results) {
    this.results = results;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberResponse {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  currentServerTime: ").append(currentServerTime).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("  returned: ").append(returned).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  results: ").append(results).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

