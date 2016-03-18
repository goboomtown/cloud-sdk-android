package io.swagger.client.model;

import io.swagger.client.model.Member;
import io.swagger.client.model.MemberLocation;
import io.swagger.client.model.MemberUser;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class MemberTuple  {
  
  @SerializedName("member")
  private Member member = null;
  @SerializedName("member_user")
  private MemberUser memberUser = null;
  @SerializedName("member_location")
  private MemberLocation memberLocation = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Member getMember() {
    return member;
  }
  public void setMember(Member member) {
    this.member = member;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MemberUser getMemberUser() {
    return memberUser;
  }
  public void setMemberUser(MemberUser memberUser) {
    this.memberUser = memberUser;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MemberLocation getMemberLocation() {
    return memberLocation;
  }
  public void setMemberLocation(MemberLocation memberLocation) {
    this.memberLocation = memberLocation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberTuple {\n");
    
    sb.append("  member: ").append(member).append("\n");
    sb.append("  memberUser: ").append(memberUser).append("\n");
    sb.append("  memberLocation: ").append(memberLocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


