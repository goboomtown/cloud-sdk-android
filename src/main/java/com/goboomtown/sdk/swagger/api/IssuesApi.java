package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiInvoker;
import com.goboomtown.sdk.swagger.Pair;
import com.goboomtown.sdk.swagger.model.*;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

  public String invokeAPI(String host, String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {
    return getInvoker().invokeAPI(host, path, method, queryParams, body, headerParams, formParams, contentType);
  }

  
  /**
   * Cancel an Issue for a Merchant
   * Transitions an *Issue* to a &#39;Canceled&#39; status in the workflow.
   * @param issueId The primary key of the *Issue*
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Create an Issue for a Merchant
   * Creates an *Issue* object related to a *Merchant* object.
   * @param issues The *Issue* to create
   * @return IssueResponse
   */
  public IssueResponse  createIssue (IssueCreateRequest issues) throws ApiException {
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Add an entry to an Issue&#39;s log
   * Creates a new log entry related to an *Issue* object.
   * @param issueId The primary key of the *Issue*
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Get an Issue
   * Returns an *Issue* object.
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Get a collection of all Issue changes
   * Returns a paginated collection of all changes for an *Issue* object.
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Get &#39;Category&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Category&#39; keys to labels on *Issue* objects.
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
   * Get &#39;Resolution&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Resolution&#39; keys to labels on *Issue* objects.
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
   * Returns a dictionary for mapping &#39;Status&#39; keys to labels on *Issue* objects.
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
   * Get &#39;Type&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Type&#39; keys to labels on *Issue* objects.
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
   * Get a collection of Issue status changes
   * Returns a paginated collection of status changes for an *Issue* object.
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Get a collection of Issues
   * Returns a paginated collection of *Issue* objects.
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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
   * Resolve an Issue for a Merchant
   * Transitions an *Issue* to a &#39;Resolved&#39; status in the workflow.
   * @param issueId The primary key of the *Issue*
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
      String localVarResponse = invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
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

