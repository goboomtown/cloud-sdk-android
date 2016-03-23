package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiInvoker;
import com.goboomtown.sdk.swagger.Pair;

import com.goboomtown.sdk.swagger.model.*;

import java.util.*;

import com.goboomtown.sdk.swagger.model.MemberCreateResponse;
import com.goboomtown.sdk.swagger.model.Error;
import com.goboomtown.sdk.swagger.model.MemberCreateRequest;
import com.goboomtown.sdk.swagger.model.MemberResponse;
import com.goboomtown.sdk.swagger.model.MemberUserResponse;
import com.goboomtown.sdk.swagger.model.MemberLocationResponse;
import com.goboomtown.sdk.swagger.model.EnumerationItemResponse;


import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class MerchantsApi {
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
   * Create/update a Merchant, Location, and User
   * Creates/updates a *Merchant* object, *Merchant Location* object, and *Merchant User* object in a single atomic transaction.
   * @param body The *Merchant*, *Merchant Location* and *Merchant User* to create/update
   * @return MemberCreateResponse
   */
  public MemberCreateResponse  createMember (MemberCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling createMember");
    }
    

    // create path and map variables
    String localVarPath = "/members/create".replaceAll("\\{format\\}","json");

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
      String localVarResponse = invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (MemberCreateResponse) ApiInvoker.deserialize(localVarResponse, "", MemberCreateResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a Merchant
   * Returns a *Merchant* object.
   * @param memberId The primary key of the *Merchant*
   * @return MemberResponse
   */
  public MemberResponse  getMember (String memberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
       throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMember");
    }
    

    // create path and map variables
    String localVarPath = "/members/get/{member_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "member_id" + "\\}", apiInvoker.escapeString(memberId.toString()));

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
   * Get a collection of Users for a Merchant Location
   * Returns a paginated collection of *Merchant User* objects related to a *Merchant Location* object.
   * @param memberId The primary key of the *Merchant*
   * @return MemberUserResponse
   */
  public MemberUserResponse  getMemberLocationUsers (String memberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
       throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberLocationUsers");
    }
    

    // create path and map variables
    String localVarPath = "/members/location/users/{member_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "member_id" + "\\}", apiInvoker.escapeString(memberId.toString()));

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
        return (MemberUserResponse) ApiInvoker.deserialize(localVarResponse, "", MemberUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a collection of Locations for a Merchant
   * Returns a paginated collection of *Merchant Location* objects related to a *Merchant* object.
   * @param memberId The primary key of the *Merchant*
   * @param membersLocationsId An optional members_locations_id to filter the results with
   * @return MemberLocationResponse
   */
  public MemberLocationResponse  getMemberLocations (String memberId, String membersLocationsId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
       throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberLocations");
    }
    

    // create path and map variables
    String localVarPath = "/members/location/get/{member_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "member_id" + "\\}", apiInvoker.escapeString(memberId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "members_locations_id", membersLocationsId));
    

    

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
        return (MemberLocationResponse) ApiInvoker.deserialize(localVarResponse, "", MemberLocationResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get &#39;Industry&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Industry&#39; keys to labels on *Merchant* objects.
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getMemberMetaIndustries () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/members/meta/industries".replaceAll("\\{format\\}","json");

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
        return (EnumerationItemResponse) ApiInvoker.deserialize(localVarResponse, "", EnumerationItemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get &#39;Status&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Status&#39; keys to labels on *Merchant* / *Merchant User* objects.
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getMemberMetaStatuses () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/members/meta/statuses".replaceAll("\\{format\\}","json");

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
        return (EnumerationItemResponse) ApiInvoker.deserialize(localVarResponse, "", EnumerationItemResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a collection of Users for a Merchant
   * Returns a paginated collection of *Merchant User* objects related to a *Merchant* object.
   * @param memberId The primary key of the *Merchant*
   * @param userId Optional user_id to filter the results with
   * @return MemberUserResponse
   */
  public MemberUserResponse  getMemberUsers (String memberId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
       throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberUsers");
    }
    

    // create path and map variables
    String localVarPath = "/members/user/get/{member_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "member_id" + "\\}", apiInvoker.escapeString(memberId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "user_id", userId));
    

    

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
        return (MemberUserResponse) ApiInvoker.deserialize(localVarResponse, "", MemberUserResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

