

# NotificationTypeResponse

Holds readonly information about a Finbourne.Notifications.WebApi.Dtos.Notifications.Notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  [optional] |
|**apiKeyRef** | **String** | Reference to API key from Configuration Store |  [optional] |
|**apiSecretRef** | **String** | Reference to API secret from Configuration Store |  [optional] |
|**body** | **String** | The body of the SMS |  [optional] |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  [optional] |
|**namespaceRef** | **String** | Reference to namespace from Configuration Store |  [optional] |
|**queueNameRef** | **String** | Reference to queue name from Configuration Store |  [optional] |
|**tenantIdRef** | **String** | Reference to tenant id from Configuration Store |  [optional] |
|**clientIdRef** | **String** | Reference to client id from Configuration Store |  [optional] |
|**clientSecretRef** | **String** | Reference to client secret from Configuration Store |  [optional] |
|**subject** | **String** | The subject of the email |  [optional] |
|**plainTextBody** | **String** | The plain text body of the email |  [optional] |
|**htmlBody** | **String** | The HTML body of the email (if any) |  [optional] |
|**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email |  [optional] |
|**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email |  [optional] |
|**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email |  [optional] |
|**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) |  [optional] |
|**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request |  [optional] |
|**url** | **String** | The URL to send the request to |  [optional] |
|**authenticationType** | **String** | The type of authentication to use on the request |  [optional] |
|**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each  authentication type requires different keys:  - Lusid - None required  - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39;  - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;     e.g. the following would be valid assuming that the config is present in the configuration store at the  specified paths:      \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,   \&quot;authenticationConfigurationItemPaths\&quot;: {   \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,   \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;   } |  [optional] |
|**contentType** | **String** | The type of the content e.g. Json |  [optional] |
|**content** | **Object** | The content of the request |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQS | &quot;AmazonSqs&quot; |
| AMAZONSQSPRINCIPALAUTH | &quot;AmazonSqsPrincipalAuth&quot; |
| AZURESERVICEBUS | &quot;AzureServiceBus&quot; |
| EMAIL | &quot;Email&quot; |
| SMS | &quot;Sms&quot; |
| WEBHOOK | &quot;Webhook&quot; |



