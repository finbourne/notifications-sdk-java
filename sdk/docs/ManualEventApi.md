# ManualEventApi

All URIs are relative to *https://fbn-prd.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerManualEvent**](ManualEventApi.md#triggerManualEvent) | **POST** /api/manualevent | TriggerManualEvent: Trigger a manual event. |



## triggerManualEvent

> ManualEvent triggerManualEvent(manualEventRequest)

TriggerManualEvent: Trigger a manual event.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.ManualEventApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ManualEventApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ManualEventApi apiInstance = apiFactory.build(ManualEventApi.class);

        ManualEventApi apiInstance = ApiFactoryBuilder.build(fileName).build(ManualEventApi.class);
        ManualEventRequest manualEventRequest = new ManualEventRequest(); // ManualEventRequest | The data required to trigger a manual event.
        try {
            // uncomment the below to set overrides at the request level
            // ManualEvent result = apiInstance.triggerManualEvent(manualEventRequest).execute(opts);

            ManualEvent result = apiInstance.triggerManualEvent(manualEventRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualEventApi#triggerManualEvent");
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
| **manualEventRequest** | [**ManualEventRequest**](ManualEventRequest.md)| The data required to trigger a manual event. | |

### Return type

[**ManualEvent**](ManualEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

