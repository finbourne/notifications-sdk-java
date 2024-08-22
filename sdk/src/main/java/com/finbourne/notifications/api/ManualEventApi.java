/*
 * FINBOURNE Notifications API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.notifications.api;

import com.finbourne.notifications.ApiCallback;
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.ApiResponse;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.Pair;
import com.finbourne.notifications.ProgressRequestBody;
import com.finbourne.notifications.ProgressResponseBody;
import com.finbourne.notifications.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.notifications.model.LusidProblemDetails;
import com.finbourne.notifications.model.LusidValidationProblemDetails;
import com.finbourne.notifications.model.ManualEvent;
import com.finbourne.notifications.model.ManualEventRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManualEventApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ManualEventApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManualEventApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call triggerManualEventCall(ManualEventRequest manualEventRequest, final ApiCallback _callback) throws ApiException {
        return triggerManualEventCall(manualEventRequest,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call triggerManualEventCall(ManualEventRequest manualEventRequest, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = manualEventRequest;

        // create path and map variables
        String localVarPath = "/api/manualevent";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call triggerManualEventValidateBeforeCall(ManualEventRequest manualEventRequest, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'manualEventRequest' is set
        if (manualEventRequest == null) {
            throw new ApiException("Missing the required parameter 'manualEventRequest' when calling triggerManualEvent(Async)");
        }

        return triggerManualEventCall(manualEventRequest, _callback, opts);

    }


    private ApiResponse<ManualEvent> triggerManualEventWithHttpInfo(ManualEventRequest manualEventRequest) throws ApiException {
        okhttp3.Call localVarCall = triggerManualEventValidateBeforeCall(manualEventRequest, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ManualEvent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ManualEvent> triggerManualEventWithHttpInfo(ManualEventRequest manualEventRequest, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = triggerManualEventValidateBeforeCall(manualEventRequest, null, opts);
        Type localVarReturnType = new TypeToken<ManualEvent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call triggerManualEventAsync(ManualEventRequest manualEventRequest, final ApiCallback<ManualEvent> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerManualEventValidateBeforeCall(manualEventRequest, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ManualEvent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call triggerManualEventAsync(ManualEventRequest manualEventRequest, final ApiCallback<ManualEvent> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = triggerManualEventValidateBeforeCall(manualEventRequest, _callback, opts);
        Type localVarReturnType = new TypeToken<ManualEvent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APItriggerManualEventRequest {
        private final ManualEventRequest manualEventRequest;

        private APItriggerManualEventRequest(ManualEventRequest manualEventRequest) {
            this.manualEventRequest = manualEventRequest;
        }

        /**
         * Build call for triggerManualEvent
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return triggerManualEventCall(manualEventRequest, _callback);
        }

        /**
         * Execute triggerManualEvent request
         * @return ManualEvent
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ManualEvent execute() throws ApiException {
            ApiResponse<ManualEvent> localVarResp = triggerManualEventWithHttpInfo(manualEventRequest);
            return localVarResp.getData();
        }

        /**
         * Execute triggerManualEvent request. Use any specified configuration options to override any other configuration for this request only.
         * @return ManualEvent
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ManualEvent execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ManualEvent> localVarResp = triggerManualEventWithHttpInfo(manualEventRequest, opts);
            return localVarResp.getData();
        }

        /**
         * Execute triggerManualEvent request with HTTP info returned
         * @return ApiResponse&lt;ManualEvent&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ManualEvent> executeWithHttpInfo() throws ApiException {
            return triggerManualEventWithHttpInfo(manualEventRequest);
        }

        /**
         * Execute triggerManualEvent request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ManualEvent&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ManualEvent> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return triggerManualEventWithHttpInfo(manualEventRequest, opts);
        }

        /**
         * Execute triggerManualEvent request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ManualEvent> _callback) throws ApiException {
            return triggerManualEventAsync(manualEventRequest, _callback);
        }

        /**
         * Execute triggerManualEvent request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ManualEvent> _callback, ConfigurationOptions opts) throws ApiException {
            return triggerManualEventAsync(manualEventRequest, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] TriggerManualEvent: Trigger a manual event.
     * 
     * @param manualEventRequest The data required to trigger a manual event. (required)
     * @return APItriggerManualEventRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APItriggerManualEventRequest triggerManualEvent(ManualEventRequest manualEventRequest) {
        return new APItriggerManualEventRequest(manualEventRequest);
    }
}
