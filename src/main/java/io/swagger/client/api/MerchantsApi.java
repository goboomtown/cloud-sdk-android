package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;
import io.swagger.client.model.*;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

  
  /**
   * Creates a new Merchant
   * Creates a *Merchant* and optionally *MerchantLocation* and *MerchantUser*
   * @param body The *Merchant* to create
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returns a Merchant
   * Returns a *Merchant* ≈
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returns a collection of MerchantUsers
   * Returns a collection of *MerchantUsers* belonging to a *MerchantLocation*
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returns a collection of MerchantLocations
   * Returns a collection of *MerchantLocation* records belonging to a *Merchant*
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returns collection of industries
   * Returns the industries available for a *Merchant*
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returns collection of statuses
   * Returns the statuses available for a *Merchant* or *MerchantUsers*
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Returnsa a collection of MerchantUsers
   * Returns a collection of *MerchantUser* records belonging to a *Merchant*
   * @param memberId The id of the *Merchant*
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
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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

