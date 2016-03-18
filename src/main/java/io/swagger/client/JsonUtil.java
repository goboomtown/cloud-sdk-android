package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.swagger.client.model.*;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("BaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BaseResponse>>(){}.getType();
    }
    
    if ("EnumerationItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnumerationItem>>(){}.getType();
    }
    
    if ("EnumerationItemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnumerationItemResponse>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("Issue".equalsIgnoreCase(className)) {
      return new TypeToken<List<Issue>>(){}.getType();
    }
    
    if ("IssueLog".equalsIgnoreCase(className)) {
      return new TypeToken<List<IssueLog>>(){}.getType();
    }
    
    if ("IssueLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IssueLogsResponse>>(){}.getType();
    }
    
    if ("IssueResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IssueResponse>>(){}.getType();
    }
    
    if ("IssueStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<IssueStatus>>(){}.getType();
    }
    
    if ("IssueStatusesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IssueStatusesResponse>>(){}.getType();
    }
    
    if ("Member".equalsIgnoreCase(className)) {
      return new TypeToken<List<Member>>(){}.getType();
    }
    
    if ("MemberCreateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberCreateRequest>>(){}.getType();
    }
    
    if ("MemberCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberCreateResponse>>(){}.getType();
    }
    
    if ("MemberLocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberLocation>>(){}.getType();
    }
    
    if ("MemberLocationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberLocationResponse>>(){}.getType();
    }
    
    if ("MemberResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberResponse>>(){}.getType();
    }
    
    if ("MemberTuple".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberTuple>>(){}.getType();
    }
    
    if ("MemberUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberUser>>(){}.getType();
    }
    
    if ("MemberUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MemberUserResponse>>(){}.getType();
    }
    
    if ("Provider".equalsIgnoreCase(className)) {
      return new TypeToken<List<Provider>>(){}.getType();
    }
    
    if ("ProviderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProviderResponse>>(){}.getType();
    }
    
    if ("ProviderTeam".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProviderTeam>>(){}.getType();
    }
    
    if ("ProviderTeamResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProviderTeamResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("BaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BaseResponse>(){}.getType();
    }
    
    if ("EnumerationItem".equalsIgnoreCase(className)) {
      return new TypeToken<EnumerationItem>(){}.getType();
    }
    
    if ("EnumerationItemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnumerationItemResponse>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("Issue".equalsIgnoreCase(className)) {
      return new TypeToken<Issue>(){}.getType();
    }
    
    if ("IssueLog".equalsIgnoreCase(className)) {
      return new TypeToken<IssueLog>(){}.getType();
    }
    
    if ("IssueLogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IssueLogsResponse>(){}.getType();
    }
    
    if ("IssueResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IssueResponse>(){}.getType();
    }
    
    if ("IssueStatus".equalsIgnoreCase(className)) {
      return new TypeToken<IssueStatus>(){}.getType();
    }
    
    if ("IssueStatusesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IssueStatusesResponse>(){}.getType();
    }
    
    if ("Member".equalsIgnoreCase(className)) {
      return new TypeToken<Member>(){}.getType();
    }
    
    if ("MemberCreateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<MemberCreateRequest>(){}.getType();
    }
    
    if ("MemberCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MemberCreateResponse>(){}.getType();
    }
    
    if ("MemberLocation".equalsIgnoreCase(className)) {
      return new TypeToken<MemberLocation>(){}.getType();
    }
    
    if ("MemberLocationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MemberLocationResponse>(){}.getType();
    }
    
    if ("MemberResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MemberResponse>(){}.getType();
    }
    
    if ("MemberTuple".equalsIgnoreCase(className)) {
      return new TypeToken<MemberTuple>(){}.getType();
    }
    
    if ("MemberUser".equalsIgnoreCase(className)) {
      return new TypeToken<MemberUser>(){}.getType();
    }
    
    if ("MemberUserResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MemberUserResponse>(){}.getType();
    }
    
    if ("Provider".equalsIgnoreCase(className)) {
      return new TypeToken<Provider>(){}.getType();
    }
    
    if ("ProviderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProviderResponse>(){}.getType();
    }
    
    if ("ProviderTeam".equalsIgnoreCase(className)) {
      return new TypeToken<ProviderTeam>(){}.getType();
    }
    
    if ("ProviderTeamResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProviderTeamResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
