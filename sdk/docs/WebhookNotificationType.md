

# WebhookNotificationType

The information required to create or update a Webhook notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request |  |
|**url** | **String** | The URL to send the request to |  |
|**authenticationType** | **String** | The type of authentication to use on the request, can be one of the following values:  - Lusid - Internal LUSID call  - BasicAuth - User specified Username and password  - BearerToken - Authorization header with Bearer scheme and user specified key  - None - No Authorization required on the webhook call |  |
|**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each  authentication type requires different keys:  - Lusid - None required  - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39;  - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;  - None - None required     e.g. the following would be valid assuming that the config is present in the configuration store at the  specified paths:      \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,   \&quot;authenticationConfigurationItemPaths\&quot;: {   \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,   \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;   } |  [optional] |
|**contentType** | **String** | The type of the content e.g. Json |  |
|**content** | **Object** | The content of the request |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;Webhook&quot; |



