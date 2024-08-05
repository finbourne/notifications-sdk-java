

# AzureServiceBusNotificationType

The information required to create or update an Azure Service Bus notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  |
|**namespace** | **String** | Reference to namespace from Configuration Store |  |
|**queueName** | **String** | Reference to queue name from Configuration Store |  |
|**body** | **String** | The body of the Azure Service Bus Message |  |
|**tenantId** | **String** | Reference to tenant id from Configuration Store |  |
|**clientId** | **String** | Reference to client id from Configuration Store |  |
|**clientSecret** | **String** | Reference to client secret from Configuration Store |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AZURESERVICEBUS | &quot;AzureServiceBus&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


