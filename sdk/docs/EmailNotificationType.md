

# EmailNotificationType

The information required to create or update an Email notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**subject** | **String** | The subject of the email |  |
|**plainTextBody** | **String** | The plain text body of the email |  |
|**htmlBody** | **String** | The HTML body of the email (if any) |  [optional] |
|**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email |  |
|**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email |  [optional] |
|**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;Email&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


