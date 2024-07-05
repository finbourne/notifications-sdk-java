

# AmazonSqsPrincipalAuthNotificationTypeResponse

Holds readonly information about an AWS SQS with Principal Authentication notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  [optional] |
|**body** | **String** | The body of the Amazon Queue Message |  [optional] |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQSPRINCIPALAUTH | &quot;AmazonSqsPrincipalAuth&quot; |



