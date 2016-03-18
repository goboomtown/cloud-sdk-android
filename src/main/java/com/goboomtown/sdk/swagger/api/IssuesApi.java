package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiInvoker;
import com.goboomtown.sdk.swagger.Pair;

import com.goboomtown.sdk.swagger.model.*;

import java.util.*;

import com.goboomtown.sdk.swagger.model.Error;
import com.goboomtown.sdk.swagger.model.IssueResponse;
import com.goboomtown.sdk.swagger.model.Issue;
import com.goboomtown.sdk.swagger.model.IssueLogsResponse;
import com.goboomtown.sdk.swagger.model.EnumerationItemResponse;
import com.goboomtown.sdk.swagger.model.IssueStatusesResponse;


import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class IssuesApi {
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
   * Set a Issue to a cancelled status
   * Closes a *Issue* with a cancelled status
   * @param issueId The primary key of the *Issue* to cancel.
   * @return void
   */
  public void  cancelIssue (String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling cancelIssue");
    }
    

    // create path and map variables
    String localVarPath = "/issues/cancel/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

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
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Creates a new Issue
   * Creates a new *Issue*
   * @param issues Issue to create
   * @return IssueResponse
   */
  public IssueResponse  createIssue (Issue issues) throws ApiException {
    Object localVarPostBody = issues;
    

    // create path and map variables
    String localVarPath = "/issues/create".replaceAll("\\{format\\}","json");

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
        return (IssueResponse) ApiInvoker.deserialize(localVarResponse, "", IssueResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add a log to a Issue
   * Logs notes to an *Issue*
   * @param issueId The primary key of the related *Issue*
   * @param notes Notes to log against the *Issue*
   * @return IssueLogsResponse
   */
  public IssueLogsResponse  createIssueLog (String issueId, String notes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling createIssueLog");
    }
    
    // verify the required parameter 'notes' is set
    if (notes == null) {
       throw new ApiException(400, "Missing the required parameter 'notes' when calling createIssueLog");
    }
    

    // create path and map variables
    String localVarPath = "/issues/log/create/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    

    

    String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (notes != null) {
        localVarBuilder.addTextBody("notes", ApiInvoker.parameterToString(notes), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
      localVarFormParams.put("notes", ApiInvoker.parameterToString(notes));
      
    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (IssueLogsResponse) ApiInvoker.deserialize(localVarResponse, "", IssueLogsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Returns a Issue
   * Returns a *Issue* record
   * @param issueId The primary key of the *Issue*
   * @return IssueResponse
   */
  public IssueResponse  getIssue (String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssue");
    }
    

    // create path and map variables
    String localVarPath = "/issues/get/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

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
        return (IssueResponse) ApiInvoker.deserialize(localVarResponse, "", IssueResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Returns a collection of IssueLogs
   * Returns a collection of *IssueLog* records
   * @param issueId The primary key of the *Issue*
   * @return IssueLogsResponse
   */
  public IssueLogsResponse  getIssueLogs (String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssueLogs");
    }
    

    // create path and map variables
    String localVarPath = "/issues/log/history/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

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
        return (IssueLogsResponse) ApiInvoker.deserialize(localVarResponse, "", IssueLogsResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Returns collection of categories
   * Returns the categories available for an *Issue*
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getIssueMetaCategories () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/issues/meta/categories".replaceAll("\\{format\\}","json");

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
   * Returns collection of resolutions
   * Returns the resolutions available for an *Issue*
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getIssueMetaResolutions () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/issues/meta/resolutions".replaceAll("\\{format\\}","json");

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
   * Returns the statuses available for an *Issue*
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getIssueMetaStatuses () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/issues/meta/statuses".replaceAll("\\{format\\}","json");

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
   * Returns collection of types
   * Returns the types available for an *Issue*
   * @return EnumerationItemResponse
   */
  public EnumerationItemResponse  getIssueMetaTypes () throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/issues/meta/types".replaceAll("\\{format\\}","json");

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
   * Returns a collection of IssueStatuses
   * Returns a collection of *IssueStatuse* records
   * @param issueId The primary key of the *Issue*
   * @return IssueStatusesResponse
   */
  public IssueStatusesResponse  getIssueStatusHistory (String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssueStatusHistory");
    }
    

    // create path and map variables
    String localVarPath = "/issues/status/history/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

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
        return (IssueStatusesResponse) ApiInvoker.deserialize(localVarResponse, "", IssueStatusesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Returns a collection of Issues
   * Returns a collection of *Issue* records
   * @param limit Pagination result limit (defaults to 10)
   * @param start Pagination starting result number (defaults to 0)
   * @param membersId Optionally limit result to this {members_id}
   * @param membersUsersId Optionally limit result to this {members_users_id}
   * @param membersLocationsId Optionally limit result to this {members_locations_id}
   * @return IssueResponse
   */
  public IssueResponse  getIssues (Integer limit, Integer start, String membersId, String membersUsersId, String membersLocationsId) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/issues/get".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();

    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "members_id", membersId));
    
    localVarQueryParams.addAll(ApiInvoker.parameterToPairs("", "members_users_id", membersUsersId));
    
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
        return (IssueResponse) ApiInvoker.deserialize(localVarResponse, "", IssueResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Set a Issue to a resolved status
   * Closes a *Issue* with a resolved status
   * @param issueId The primary key of the *Issue* to resolve.
   * @return void
   */
  public void  resolveIssue (String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
       throw new ApiException(400, "Missing the required parameter 'issueId' when calling resolveIssue");
    }
    

    // create path and map variables
    String localVarPath = "/issues/resolve/{issue_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "issue_id" + "\\}", apiInvoker.escapeString(issueId.toString()));

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
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

