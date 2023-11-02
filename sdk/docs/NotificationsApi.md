# NotificationsApi

All URIs are relative to *https://fbn-ci.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNotification**](NotificationsApi.md#createNotification) | **POST** /api/subscriptions/{scope}/{code}/notifications | [EXPERIMENTAL] CreateNotification: Add a Notification to a Subscription. |
| [**deleteNotification**](NotificationsApi.md#deleteNotification) | **DELETE** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] DeleteNotification: Delete a notification for a given subscription. |
| [**getNotification**](NotificationsApi.md#getNotification) | **GET** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] GetNotification: Get a notification on a subscription. |
| [**listNotifications**](NotificationsApi.md#listNotifications) | **GET** /api/subscriptions/{scope}/{code}/notifications | [EXPERIMENTAL] ListNotifications: List all notifications on a subscription. |
| [**updateNotification**](NotificationsApi.md#updateNotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] UpdateNotification: Update a Notification for a Subscription |


<a id="createNotification"></a>
# **createNotification**
> Notification createNotification(scope, code, createNotificationRequest).execute();

[EXPERIMENTAL] CreateNotification: Add a Notification to a Subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    CreateNotificationRequest createNotificationRequest = new CreateNotificationRequest(); // CreateNotificationRequest | The data to create a notification
    try {
      Notification result = apiInstance.createNotification(scope, code, createNotificationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **createNotificationRequest** | [**CreateNotificationRequest**](CreateNotificationRequest.md)| The data to create a notification | |

### Return type

[**Notification**](Notification.md)

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

<a id="deleteNotification"></a>
# **deleteNotification**
> deleteNotification(scope, code, id).execute();

[EXPERIMENTAL] DeleteNotification: Delete a notification for a given subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    try {
      apiInstance.deleteNotification(scope, code, id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

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

<a id="getNotification"></a>
# **getNotification**
> Notification getNotification(scope, code, id).execute();

[EXPERIMENTAL] GetNotification: Get a notification on a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    try {
      Notification result = apiInstance.getNotification(scope, code, id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |

### Return type

[**Notification**](Notification.md)

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
| **404** | No notification exists in current scope |  -  |
| **0** | Error response |  -  |

<a id="listNotifications"></a>
# **listNotifications**
> ResourceListOfNotification listNotifications(scope, code).execute();

[EXPERIMENTAL] ListNotifications: List all notifications on a subscription.

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    try {
      ResourceListOfNotification result = apiInstance.listNotifications(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#listNotifications");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |

### Return type

[**ResourceListOfNotification**](ResourceListOfNotification.md)

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
| **404** | No notifications exists with the provided filter(s) |  -  |
| **0** | Error response |  -  |

<a id="updateNotification"></a>
# **updateNotification**
> Notification updateNotification(scope, code, id, updateNotificationRequest).execute();

[EXPERIMENTAL] UpdateNotification: Update a Notification for a Subscription

### Example
```java
// Import classes:
import com.finbourne.notifications.ApiClient;
import com.finbourne.notifications.ApiException;
import com.finbourne.notifications.Configuration;
import com.finbourne.notifications.auth.*;
import com.finbourne.notifications.models.*;
import com.finbourne.notifications.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/notification");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a subscription
    String code = "code_example"; // String | The code that identifies a subscription
    String id = "id_example"; // String | The unique identifier of the notification
    UpdateNotificationRequest updateNotificationRequest = new UpdateNotificationRequest(); // UpdateNotificationRequest | The data to update a notification
    try {
      Notification result = apiInstance.updateNotification(scope, code, id, updateNotificationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateNotification");
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
| **scope** | **String**| The scope that identifies a subscription | |
| **code** | **String**| The code that identifies a subscription | |
| **id** | **String**| The unique identifier of the notification | |
| **updateNotificationRequest** | [**UpdateNotificationRequest**](UpdateNotificationRequest.md)| The data to update a notification | |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No notification exists in current scope |  -  |
| **0** | Error response |  -  |

