# NotificationsApi

All URIs are relative to *https://fbn-prd.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNotification**](NotificationsApi.md#createNotification) | **POST** /api/subscriptions/{scope}/{code}/notifications | CreateNotification: Add a Notification to a Subscription. |
| [**deleteNotification**](NotificationsApi.md#deleteNotification) | **DELETE** /api/subscriptions/{scope}/{code}/notifications/{id} | DeleteNotification: Delete a notification for a given subscription. |
| [**getNotification**](NotificationsApi.md#getNotification) | **GET** /api/subscriptions/{scope}/{code}/notifications/{id} | GetNotification: Get a notification on a subscription. |
| [**listNotifications**](NotificationsApi.md#listNotifications) | **GET** /api/subscriptions/{scope}/{code}/notifications | ListNotifications: List all notifications on a subscription. |
| [**updateNotification**](NotificationsApi.md#updateNotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/{id} | UpdateNotification: Update a Notification for a Subscription |



## createNotification

> Notification createNotification(scope, code, createNotificationRequest)

CreateNotification: Add a Notification to a Subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.NotificationsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NotificationsApiExample {

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
        // NotificationsApi apiInstance = apiFactory.build(NotificationsApi.class);

        NotificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(NotificationsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        CreateNotificationRequest createNotificationRequest = new CreateNotificationRequest(); // CreateNotificationRequest | The data to create a notification
        try {
            // uncomment the below to set overrides at the request level
            // Notification result = apiInstance.createNotification(scope, code, createNotificationRequest).execute(opts);

            Notification result = apiInstance.createNotification(scope, code, createNotificationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **createNotificationRequest** | [**CreateNotificationRequest**](CreateNotificationRequest.md)| The data to create a notification | |

### Return type

[**Notification**](Notification.md)

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


## deleteNotification

> deleteNotification(scope, code, id)

DeleteNotification: Delete a notification for a given subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.NotificationsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NotificationsApiExample {

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
        // NotificationsApi apiInstance = apiFactory.build(NotificationsApi.class);

        NotificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(NotificationsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        String id = "id_example"; // String | The unique identifier of the notification
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteNotification(scope, code, id).execute(opts);

            apiInstance.deleteNotification(scope, code, id).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No notification exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getNotification

> Notification getNotification(scope, code, id)

GetNotification: Get a notification on a subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.NotificationsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NotificationsApiExample {

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
        // NotificationsApi apiInstance = apiFactory.build(NotificationsApi.class);

        NotificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(NotificationsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        String id = "id_example"; // String | The unique identifier of the notification
        try {
            // uncomment the below to set overrides at the request level
            // Notification result = apiInstance.getNotification(scope, code, id).execute(opts);

            Notification result = apiInstance.getNotification(scope, code, id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#getNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |

### Return type

[**Notification**](Notification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No notification exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listNotifications

> ResourceListOfNotification listNotifications(scope, code)

ListNotifications: List all notifications on a subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.NotificationsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NotificationsApiExample {

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
        // NotificationsApi apiInstance = apiFactory.build(NotificationsApi.class);

        NotificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(NotificationsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfNotification result = apiInstance.listNotifications(scope, code).execute(opts);

            ResourceListOfNotification result = apiInstance.listNotifications(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#listNotifications");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |

### Return type

[**ResourceListOfNotification**](ResourceListOfNotification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No notifications exists with the provided filter(s) |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateNotification

> Notification updateNotification(scope, code, id, updateNotificationRequest)

UpdateNotification: Update a Notification for a Subscription

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.NotificationsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NotificationsApiExample {

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
        // NotificationsApi apiInstance = apiFactory.build(NotificationsApi.class);

        NotificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(NotificationsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        String id = "id_example"; // String | The unique identifier of the notification
        UpdateNotificationRequest updateNotificationRequest = new UpdateNotificationRequest(); // UpdateNotificationRequest | The data to update a notification
        try {
            // uncomment the below to set overrides at the request level
            // Notification result = apiInstance.updateNotification(scope, code, id, updateNotificationRequest).execute(opts);

            Notification result = apiInstance.updateNotification(scope, code, id, updateNotificationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#updateNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |
| **updateNotificationRequest** | [**UpdateNotificationRequest**](UpdateNotificationRequest.md)| The data to update a notification | |

### Return type

[**Notification**](Notification.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No notification exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

