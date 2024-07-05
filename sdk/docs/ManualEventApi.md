# ManualEventApi

All URIs are relative to *http://localhost.lusid.com:8310*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerManualEvent**](ManualEventApi.md#triggerManualEvent) | **POST** /api/manualevent | [EXPERIMENTAL] TriggerManualEvent: Trigger a manual event. |


<a id="triggerManualEvent"></a>
# **triggerManualEvent**
> ManualEvent triggerManualEvent(manualEventRequest).execute();

[EXPERIMENTAL] TriggerManualEvent: Trigger a manual event.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.ManualEventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost.lusid.com:8310");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManualEventApi apiInstance = new ManualEventApi(defaultClient);
    ManualEventRequest manualEventRequest = new ManualEventRequest(); // ManualEventRequest | The data required to trigger a manual event.
    try {
      ManualEvent result = apiInstance.triggerManualEvent(manualEventRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManualEventApi#triggerManualEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **manualEventRequest** | [**ManualEventRequest**](ManualEventRequest.md)| The data required to trigger a manual event. | |

### Return type

[**ManualEvent**](ManualEvent.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

