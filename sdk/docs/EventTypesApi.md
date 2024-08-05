# EventTypesApi

All URIs are relative to *https://fbn-prd.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventType**](EventTypesApi.md#getEventType) | **GET** /api/eventtypes/{eventType} | [EXPERIMENTAL] GetEventType: Gets the specified event type schema. |
| [**listEventTypes**](EventTypesApi.md#listEventTypes) | **GET** /api/eventtypes | [EXPERIMENTAL] ListEventTypes: Lists all of the available event types. |



## getEventType

> EventTypeSchema getEventType(eventType)

[EXPERIMENTAL] GetEventType: Gets the specified event type schema.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.EventTypesApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventTypesApiExample {

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

        EventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventTypesApi.class);
        String eventType = "eventType_example"; // String | The event type to retrieve schema for.
        try {
            EventTypeSchema result = apiInstance.getEventType(eventType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventTypesApi#getEventType");
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
| **eventType** | **String**| The event type to retrieve schema for. | |

### Return type

[**EventTypeSchema**](EventTypeSchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No event type exists with the specified type |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listEventTypes

> ResourceListOfEventTypeSchema listEventTypes()

[EXPERIMENTAL] ListEventTypes: Lists all of the available event types.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.EventTypesApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventTypesApiExample {

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

        EventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventTypesApi.class);
        try {
            ResourceListOfEventTypeSchema result = apiInstance.listEventTypes().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventTypesApi#listEventTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourceListOfEventTypeSchema**](ResourceListOfEventTypeSchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | No event types found |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

