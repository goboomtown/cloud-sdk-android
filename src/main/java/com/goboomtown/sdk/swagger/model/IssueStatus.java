package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class IssueStatus  {
  
  @SerializedName("created")
  private Date created = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("resolution")
  private String resolution = null;
  @SerializedName("scheduled_time")
  private Date scheduledTime = null;
  @SerializedName("ticketSummaryText")
  private String ticketSummaryText = null;
  @SerializedName("historySummaryText")
  private String historySummaryText = null;

  
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
   * State description
   **/
  @ApiModelProperty(value = "State description")
  public String getTicketSummaryText() {
    return ticketSummaryText;
  }
  public void setTicketSummaryText(String ticketSummaryText) {
    this.ticketSummaryText = ticketSummaryText;
  }

  
  /**
   * Event/trigger description
   **/
  @ApiModelProperty(value = "Event/trigger description")
  public String getHistorySummaryText() {
    return historySummaryText;
  }
  public void setHistorySummaryText(String historySummaryText) {
    this.historySummaryText = historySummaryText;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueStatus {\n");
    
    sb.append("  created: ").append(created).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  resolution: ").append(resolution).append("\n");
    sb.append("  scheduledTime: ").append(scheduledTime).append("\n");
    sb.append("  ticketSummaryText: ").append(ticketSummaryText).append("\n");
    sb.append("  historySummaryText: ").append(historySummaryText).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


