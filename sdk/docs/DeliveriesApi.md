# DeliveriesApi

All URIs are relative to *https://fbn-ci.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDeliveries**](DeliveriesApi.md#listDeliveries) | **GET** /api/deliveries | [EXPERIMENTAL] ListDeliveries: List Deliveries |


<a id="listDeliveries"></a>
# **listDeliveries**
> ResourceListOfDelivery listDeliveries().page(page).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListDeliveries: List Deliveries

Currently only returns deliveries with failed attempts.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.DeliveriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DeliveriesApi apiInstance = new DeliveriesApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied.
    Integer limit = 56; // Integer | The maximum number of delivery attempts to retrieve. Defaults to 200 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.  By default, we set this filter to only query for the last week's worth of Deliveries, however if a filter is explicitly set, this will be overriden.  An example filter to override the attempt time date might be 'AttemptTime gt 2023-08-25' for example
    try {
      ResourceListOfDelivery result = apiInstance.listDeliveries()
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveriesApi#listDeliveries");
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
| **page** | **String**| The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied. | [optional] |
| **limit** | **Integer**| The maximum number of delivery attempts to retrieve. Defaults to 200 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.  By default, we set this filter to only query for the last week&#39;s worth of Deliveries, however if a filter is explicitly set, this will be overriden.  An example filter to override the attempt time date might be &#39;AttemptTime gt 2023-08-25&#39; for example | [optional] |

### Return type

[**ResourceListOfDelivery**](ResourceListOfDelivery.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No deliveries exists with the provided filter(s) |  -  |
| **0** | Error response |  -  |

