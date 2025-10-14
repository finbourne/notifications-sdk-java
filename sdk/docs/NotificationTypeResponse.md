# com.finbourne.notifications.model.NotificationTypeResponse
Holds readonly information about a Finbourne.Notifications.WebApi.Dtos.Notifications.Notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [optional] [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [optional] [default to String]
**body** | **String** | The body of the SMS | [optional] [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [optional] [default to String]
**namespaceRef** | **String** | Reference to namespace from Configuration Store | [optional] [default to String]
**queueNameRef** | **String** | Reference to queue name from Configuration Store | [optional] [default to String]
**tenantIdRef** | **String** | Reference to tenant id from Configuration Store | [optional] [default to String]
**clientIdRef** | **String** | Reference to client id from Configuration Store | [optional] [default to String]
**clientSecretRef** | **String** | Reference to client secret from Configuration Store | [optional] [default to String]
**subject** | **String** | The subject of the email | [optional] [default to String]
**plainTextBody** | **String** | The plain text body of the email | [optional] [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [optional] [default to List<String>]
**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request | [optional] [default to String]
**url** | **String** | The URL to send the request to | [optional] [default to String]
**authenticationType** | **String** | The type of authentication to use on the request | [optional] [default to String]
**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each authentication type requires different keys: - Lusid - None required - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39; - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;   e.g. the following would be valid assuming that the config is present in the configuration store at the specified paths:    \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,  \&quot;authenticationConfigurationItemPaths\&quot;: {  \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,  \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;  } | [optional] [default to Map<String, String>]
**contentType** | **String** | The type of the content e.g. Json | [optional] [default to String]
**content** | **Object** | The content of the request | [optional] [default to Object]

```java
import com.finbourne.notifications.model.NotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with AmazonSqsNotificationTypeResponse NotificationTypeResponse
AmazonSqsNotificationTypeResponse notificationTypeResponse = new AmazonSqsNotificationTypeResponse();
notificationTypeResponse.setType(AmazonSqsNotificationTypeResponse.TypeEnum.AMAZONSQSNOTIFICATIONTYPERESPONSE);
NotificationTypeResponse config = new NotificationTypeResponse(notificationTypeResponse);

```
 See all compatible oneOf types with NotificationTypeResponse
* [AmazonSqsNotificationTypeResponse](./AmazonSqsNotificationTypeResponse.md)

* [AmazonSqsPrincipalAuthNotificationTypeResponse](./AmazonSqsPrincipalAuthNotificationTypeResponse.md)

* [AzureServiceBusTypeResponse](./AzureServiceBusTypeResponse.md)

* [EmailNotificationTypeResponse](./EmailNotificationTypeResponse.md)

* [SmsNotificationTypeResponse](./SmsNotificationTypeResponse.md)

* [WebhookNotificationTypeResponse](./WebhookNotificationTypeResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
