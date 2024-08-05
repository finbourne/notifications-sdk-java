# DeliveriesApi

All URIs are relative to *https://fbn-prd.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDeliveries**](DeliveriesApi.md#listDeliveries) | **GET** /api/deliveries | [EXPERIMENTAL] ListDeliveries: List Deliveries |



## listDeliveries

> ResourceListOfDelivery listDeliveries(page, limit, filter)

[EXPERIMENTAL] ListDeliveries: List Deliveries

Currently only returns deliveries with failed attempts.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.DeliveriesApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeliveriesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"notificationsUrl\": \"https://<your-domain>.lusid.com/notification\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        DeliveriesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeliveriesApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing delivery attempts. This value is returned from the previous call. When this field is supplied the filter field should not be supplied.
        Integer limit = 56; // Integer | The maximum number of delivery attempts to retrieve. Defaults to 200 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.  By default, we set this filter to only query for the last week's worth of Deliveries, however if a filter is explicitly set, this will be overriden.  An example filter to override the attempt time date might be 'AttemptTime gt 2023-08-25' for example
        try {
            ResourceListOfDelivery result = apiInstance.listDeliveries(page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveriesApi#listDeliveries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

