# SubscriptionsApi

All URIs are relative to *https://fbn-prd.lusid.com/notification*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /api/subscriptions | [EXPERIMENTAL] CreateSubscription: Create a new subscription. |
| [**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] DeleteSubscription: Delete a subscription. |
| [**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] GetSubscription: Get a subscription. |
| [**listSubscriptions**](SubscriptionsApi.md#listSubscriptions) | **GET** /api/subscriptions | [EXPERIMENTAL] ListSubscriptions: List subscriptions. |
| [**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PUT** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] UpdateSubscription: Update an existing subscription. |



## createSubscription

> Subscription createSubscription(createSubscription)

[EXPERIMENTAL] CreateSubscription: Create a new subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.SubscriptionsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        CreateSubscription createSubscription = new CreateSubscription(); // CreateSubscription | The data to create a subscription
        try {
            // uncomment the below to set overrides at the request level
            // Subscription result = apiInstance.createSubscription(createSubscription).execute(opts);

            Subscription result = apiInstance.createSubscription(createSubscription).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#createSubscription");
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
| **createSubscription** | [**CreateSubscription**](CreateSubscription.md)| The data to create a subscription | |

### Return type

[**Subscription**](Subscription.md)

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


## deleteSubscription

> deleteSubscription(scope, code)

[EXPERIMENTAL] DeleteSubscription: Delete a subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.SubscriptionsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteSubscription(scope, code).execute(opts);

            apiInstance.deleteSubscription(scope, code).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#deleteSubscription");
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

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No subscription exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSubscription

> Subscription getSubscription(scope, code)

[EXPERIMENTAL] GetSubscription: Get a subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.SubscriptionsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        try {
            // uncomment the below to set overrides at the request level
            // Subscription result = apiInstance.getSubscription(scope, code).execute(opts);

            Subscription result = apiInstance.getSubscription(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#getSubscription");
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

[**Subscription**](Subscription.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No subscription exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSubscriptions

> ResourceListOfSubscription listSubscriptions(filter, sortBy, page, limit)

[EXPERIMENTAL] ListSubscriptions: List subscriptions.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.SubscriptionsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about <a href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</a>.
        String sortBy = "sortBy_example"; // String | Fields to order the result set. Read more about <a href=\"https://support.lusid.com/filtering-results-from-lusid\"> filtering results from LUSID</a>
        String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied the filter field should not be supplied.
        Integer limit = 56; // Integer | The maximum number of subscriptions to retrieve.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSubscription result = apiInstance.listSubscriptions(filter, sortBy, page, limit).execute(opts);

            ResourceListOfSubscription result = apiInstance.listSubscriptions(filter, sortBy, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#listSubscriptions");
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
| **filter** | **String**| Expression to filter the result set. Read more about &lt;a href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/a&gt;. | [optional] |
| **sortBy** | **String**| Fields to order the result set. Read more about &lt;a href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/a&gt; | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied the filter field should not be supplied. | [optional] |
| **limit** | **Integer**| The maximum number of subscriptions to retrieve. | [optional] |

### Return type

[**ResourceListOfSubscription**](ResourceListOfSubscription.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateSubscription

> Subscription updateSubscription(scope, code, updateSubscription)

[EXPERIMENTAL] UpdateSubscription: Update an existing subscription.

### Example

```java
import com.finbourne.notifications.model.*;
import com.finbourne.notifications.api.SubscriptionsApi;
import com.finbourne.notifications.extensions.ApiConfigurationException;
import com.finbourne.notifications.extensions.ApiFactoryBuilder;
import com.finbourne.notifications.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a subscription
        String code = "code_example"; // String | The code that identifies a subscription
        UpdateSubscription updateSubscription = new UpdateSubscription(); // UpdateSubscription | The data to update a subscription
        try {
            // uncomment the below to set overrides at the request level
            // Subscription result = apiInstance.updateSubscription(scope, code, updateSubscription).execute(opts);

            Subscription result = apiInstance.updateSubscription(scope, code, updateSubscription).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
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
| **updateSubscription** | [**UpdateSubscription**](UpdateSubscription.md)| The data to update a subscription | |

### Return type

[**Subscription**](Subscription.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No subscription exists in current scope |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

