

# EmailNotificationTypeResponse

Holds readonly information about an Email notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  [optional] |
|**subject** | **String** | The subject of the email |  [optional] |
|**plainTextBody** | **String** | The plain text body of the email |  [optional] |
|**htmlBody** | **String** | The HTML body of the email (if any) |  [optional] |
|**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email |  [optional] |
|**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email |  [optional] |
|**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;Email&quot; |



