

# AmazonSqsNotificationType

The information required to create or update an AWS SQS notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**apiKeyRef** | **String** | Reference to API key from Configuration Store |  |
|**apiSecretRef** | **String** | Reference to API secret from Configuration Store |  |
|**body** | **String** | The body of the Amazon Queue Message |  |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQS | &quot;AmazonSqs&quot; |



