package io.swagger.client.model;

import io.swagger.client.model.Member;
import io.swagger.client.model.MemberLocation;
import io.swagger.client.model.MemberUser;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class MemberCreateRequest  {
  
  @SerializedName("members")
  private Member members = null;
  @SerializedName("members_users")
  private MemberUser membersUsers = null;
  @SerializedName("members_locations")
  private MemberLocation membersLocations = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Member getMembers() {
    return members;
  }
  public void setMembers(Member members) {
    this.members = members;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MemberUser getMembersUsers() {
    return membersUsers;
  }
  public void setMembersUsers(MemberUser membersUsers) {
    this.membersUsers = membersUsers;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MemberLocation getMembersLocations() {
    return membersLocations;
  }
  public void setMembersLocations(MemberLocation membersLocations) {
    this.membersLocations = membersLocations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCreateRequest {\n");
    
    sb.append("  members: ").append(members).append("\n");
    sb.append("  membersUsers: ").append(membersUsers).append("\n");
    sb.append("  membersLocations: ").append(membersLocations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


