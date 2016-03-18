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
   * The type of Issue this log is associated to.
   **/
  @ApiModelProperty(value = "The type of Issue this log is associated to.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The status of the issue.
   **/
  @ApiModelProperty(value = "The status of the issue.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Resolution type.
   **/
  @ApiModelProperty(value = "Resolution type.")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   * Scheduled date/time.
   **/
  @ApiModelProperty(value = "Scheduled date/time.")
  public Date getScheduledTime() {
    return scheduledTime;
  }
  public void setScheduledTime(Date scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  
  /**
   * Text describing the issue status/log event.
   **/
  @ApiModelProperty(value = "Text describing the issue status/log event.")
  public String getTicketSummaryText() {
    return ticketSummaryText;
  }
  public void setTicketSummaryText(String ticketSummaryText) {
    this.ticketSummaryText = ticketSummaryText;
  }

  
  /**
   * Text describing the issue status/log event.
   **/
  @ApiModelProperty(value = "Text describing the issue status/log event.")
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


