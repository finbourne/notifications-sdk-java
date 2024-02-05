

# NotificationType

Holds information about a Finbourne.Notifications.WebApi.Dtos.Notifications.Notification that is being created

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**apiKeyRef** | **String** | Reference to API key from Configuration Store |  |
|**apiSecretRef** | **String** | Reference to API secret from Configuration Store |  |
|**body** | **String** | The body of the SMS |  |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  |
|**subject** | **String** | The subject of the email |  |
|**plainTextBody** | **String** | The plain text body of the email |  |
|**htmlBody** | **String** | The HTML body of the email (if any) |  [optional] |
|**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email |  |
|**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email |  [optional] |
|**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email |  [optional] |
|**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) |  |
|**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request |  |
|**url** | **String** | The URL to send the request to |  |
|**authenticationType** | **String** | The type of authentication to use on the request, can be one of the following values:  - Lusid - Internal LUSID call  - BasicAuth - User specified Username and password  - BearerToken - Authorization header with Bearer scheme and user specified key  - None - No Authorization required on the webhook call |  |
|**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each  authentication type requires different keys:  - Lusid - None required  - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39;  - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;  - None - None required     e.g. the following would be valid assuming that the config is present in the configuration store at the  specified paths:      \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,   \&quot;authenticationConfigurationItemPaths\&quot;: {   \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,   \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;   } |  [optional] |
|**contentType** | **String** | The type of the content e.g. Json |  |
|**content** | **Object** | The content of the request |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQS | &quot;AmazonSqs&quot; |
| AMAZONSQSPRINCIPALAUTH | &quot;AmazonSqsPrincipalAuth&quot; |
| EMAIL | &quot;Email&quot; |
| SMS | &quot;Sms&quot; |
| WEBHOOK | &quot;Webhook&quot; |



