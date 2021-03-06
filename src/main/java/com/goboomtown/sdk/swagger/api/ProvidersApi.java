package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiInvoker;
import com.goboomtown.sdk.swagger.Pair;

import com.goboomtown.sdk.swagger.model.*;

import java.util.*;

import com.goboomtown.sdk.swagger.model.ProviderResponse;
import com.goboomtown.sdk.swagger.model.Error;
import com.goboomtown.sdk.swagger.model.MemberResponse;
import com.goboomtown.sdk.swagger.model.ProviderTeamResponse;


import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class ProvidersApi {
  String basePath = "https://api.goboomtown.com/api/v2";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  public String invokeAPI(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {
    return getInvoker().invokeAPI(host, path, method, queryParams, body, headerParams, formParams, contentType);
  }

  
  /**
   * Get your Provider
   * Returns a *Provider* object.
   * @return ProviderResponse
   */
  public ProviderResponse  getProvider () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/providers/get".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ProviderResponse) ApiInvoker.deserialize(localVarResponse, "", ProviderResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a collection of Merchants for your Provider
   * Returns a paginated collection of *Merchant* objects related to your *Provider* object.
   * @return MemberResponse
   */
  public MemberResponse  getProviderMembers () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/providers/members".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (MemberResponse) ApiInvoker.deserialize(localVarResponse, "", MemberResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a Provider Team
   * Returns a *Provider Team* object.
   * @param providerTeamId The primary key of the ProviderTeam
   * @return ProviderTeamResponse
   */
  public ProviderTeamResponse  getProviderTeam (String providerTeamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerTeamId' is set
    if (providerTeamId == null) {
       throw new ApiException(400, "Missing the required parameter 'providerTeamId' when calling getProviderTeam");
    }
    

    // create path and map variables
    String localVarPath = "/providers/teams/{provider_team_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "provider_team_id" + "\\}", apiInvoker.escapeString(providerTeamId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ProviderTeamResponse) ApiInvoker.deserialize(localVarResponse, "", ProviderTeamResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a collection of Teams for your Provider
   * Returns a paginated collection of *Provider Team* objects related to your *Provider* object.
   * @return ProviderTeamResponse
   */
  public ProviderTeamResponse  getProviderTeams () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/providers/teams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/json"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      
    }

    try {
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (ProviderTeamResponse) ApiInvoker.deserialize(localVarResponse, "", ProviderTeamResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

