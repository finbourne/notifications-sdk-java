

# AmazonSqsPrincipalAuthNotificationType

The information required to create or update an AWS SQS notification with principal authentication

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**body** | **String** | The body of the Amazon Queue Message |  |
|**queueUrlRef** | **String** | Reference to queue url from Configuration Store |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMAZONSQSPRINCIPALAUTH | &quot;AmazonSqsPrincipalAuth&quot; |



