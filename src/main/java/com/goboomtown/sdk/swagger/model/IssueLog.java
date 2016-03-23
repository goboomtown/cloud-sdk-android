package com.goboomtown.sdk.swagger.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class IssueLog  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("issues_id")
  private String issuesId = null;
  @SerializedName("diff_log")
  private String diffLog = null;
  @SerializedName("notes")
  private String notes = null;
  @SerializedName("created")
  private Date created = null;

  
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
   * Related *Issue* primary key
   **/
  @ApiModelProperty(required = true, value = "Related *Issue* primary key")
  public String getIssuesId() {
    return issuesId;
  }
  public void setIssuesId(String issuesId) {
    this.issuesId = issuesId;
  }

  
  /**
   * Differences
   **/
  @ApiModelProperty(value = "Differences")
  public String getDiffLog() {
    return diffLog;
  }
  public void setDiffLog(String diffLog) {
    this.diffLog = diffLog;
  }

  
  /**
   * Notes
   **/
  @ApiModelProperty(value = "Notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLog {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  issuesId: ").append(issuesId).append("\n");
    sb.append("  diffLog: ").append(diffLog).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


