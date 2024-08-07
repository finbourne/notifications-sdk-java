

# AmazonSqsNotificationTypeResponse

Holds readonly information about an AWS SQS notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  [optional] |
|**apiKeyRef** | **String** | Reference to API key from Configuration Store |  [optional] |
|**apiSecretRef** | **String** | Reference to API secret from Configuration Store |  [optional] |
|**body** | **String** | The body of the Amazon Queue Message |  [optional] |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQS | &quot;AmazonSqs&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


