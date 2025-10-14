# com.finbourne.notifications.model.WebhookNotificationTypeResponse
Holds readonly information about a Webhook notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request | [optional] [default to String]
**url** | **String** | The URL to send the request to | [optional] [default to String]
**authenticationType** | **String** | The type of authentication to use on the request | [optional] [default to String]
**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each authentication type requires different keys: - Lusid - None required - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39; - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;   e.g. the following would be valid assuming that the config is present in the configuration store at the specified paths:    \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,  \&quot;authenticationConfigurationItemPaths\&quot;: {  \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,  \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;  } | [optional] [default to Map<String, String>]
**contentType** | **String** | The type of the content e.g. Json | [optional] [default to String]
**content** | **Object** | The content of the request | [optional] [default to Object]

```java
import com.finbourne.notifications.model.WebhookNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String HttpMethod = "example HttpMethod";
@jakarta.annotation.Nullable String Url = "example Url";
@jakarta.annotation.Nullable String AuthenticationType = "example AuthenticationType";
@jakarta.annotation.Nullable Map<String, String> AuthenticationConfigurationItemPaths = new Map<String, String>();
@jakarta.annotation.Nullable String ContentType = "example ContentType";
@jakarta.annotation.Nullable Object 

WebhookNotificationTypeResponse webhookNotificationTypeResponseInstance = new WebhookNotificationTypeResponse()
    .Type(Type)
    .HttpMethod(HttpMethod)
    .Url(Url)
    .AuthenticationType(AuthenticationType)
    .AuthenticationConfigurationItemPaths(AuthenticationConfigurationItemPaths)
    .ContentType(ContentType)
    .Content(Content);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
