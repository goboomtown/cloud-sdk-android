package com.goboomtown.sdk.swagger.model;

import com.goboomtown.sdk.swagger.model.Issue;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class IssueCreateRequest  {
  
  @SerializedName("issues")
  private Issue issues = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Issue getIssues() {
    return issues;
  }
  public void setIssues(Issue issues) {
    this.issues = issues;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCreateRequest {\n");
    
    sb.append("  issues: ").append(issues).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


