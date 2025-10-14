# com.finbourne.notifications.model.NotificationType
Holds information about a Finbourne.Notifications.WebApi.Dtos.Notifications.Notification that is being created

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [default to String]
**body** | **String** | The body of the SMS | [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [default to String]
**namespace** | **String** | Reference to namespace from Configuration Store | [default to String]
**queueName** | **String** | Reference to queue name from Configuration Store | [default to String]
**tenantId** | **String** | Reference to tenant id from Configuration Store | [default to String]
**clientId** | **String** | Reference to client id from Configuration Store | [default to String]
**clientSecret** | **String** | Reference to client secret from Configuration Store | [default to String]
**subject** | **String** | The subject of the email | [default to String]
**plainTextBody** | **String** | The plain text body of the email | [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [default to List<String>]
**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request | [default to String]
**url** | **String** | The URL to send the request to | [default to String]
**authenticationType** | **String** | The type of authentication to use on the request, can be one of the following values: - Lusid - Internal LUSID call - BasicAuth - User specified Username and password - BearerToken - Authorization header with Bearer scheme and user specified key - None - No Authorization required on the webhook call | [default to String]
**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each authentication type requires different keys: - Lusid - None required - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39; - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39; - None - None required   e.g. the following would be valid assuming that the config is present in the configuration store at the specified paths:    \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,  \&quot;authenticationConfigurationItemPaths\&quot;: {  \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,  \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;  } | [optional] [default to Map<String, String>]
**contentType** | **String** | The type of the content e.g. Json | [default to String]
**content** | **Object** | The content of the request | [optional] [default to Object]

```java
import com.finbourne.notifications.model.NotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with AmazonSqsNotificationType NotificationType
AmazonSqsNotificationType notificationType = new AmazonSqsNotificationType();
notificationType.setType(AmazonSqsNotificationType.TypeEnum.AMAZONSQSNOTIFICATIONTYPE);
NotificationType config = new NotificationType(notificationType);

```
 See all compatible oneOf types with NotificationType
* [AmazonSqsNotificationType](./AmazonSqsNotificationType.md)

* [AmazonSqsPrincipalAuthNotificationType](./AmazonSqsPrincipalAuthNotificationType.md)

* [AzureServiceBusNotificationType](./AzureServiceBusNotificationType.md)

* [EmailNotificationType](./EmailNotificationType.md)

* [SmsNotificationType](./SmsNotificationType.md)

* [WebhookNotificationType](./WebhookNotificationType.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
