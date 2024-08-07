

# AzureServiceBusTypeResponse

Holds readonly information about an Azure Service Bus notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of delivery mechanism for this notification |  [optional] |
|**namespaceRef** | **String** | Reference to namespace from Configuration Store |  [optional] |
|**queueNameRef** | **String** | Reference to queue name from Configuration Store |  [optional] |
|**body** | **String** | The body of the Azure service bus Message |  [optional] |
|**tenantIdRef** | **String** | Reference to tenant id from Configuration Store |  [optional] |
|**clientIdRef** | **String** | Reference to client id from Configuration Store |  [optional] |
|**clientSecretRef** | **String** | Reference to client secret from Configuration Store |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AZURESERVICEBUS | &quot;AzureServiceBus&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


