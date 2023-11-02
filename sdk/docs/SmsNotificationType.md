

# SmsNotificationType

The information required to create or update an SMS notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**body** | **String** | The body of the SMS |  |
|**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;Sms&quot; |



