# com.finbourne.notifications.model.AzureServiceBusTypeResponse
Holds readonly information about an Azure Service Bus notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**namespaceRef** | **String** | Reference to namespace from Configuration Store | [optional] [default to String]
**queueNameRef** | **String** | Reference to queue name from Configuration Store | [optional] [default to String]
**body** | **String** | The body of the Azure service bus Message | [optional] [default to String]
**tenantIdRef** | **String** | Reference to tenant id from Configuration Store | [optional] [default to String]
**clientIdRef** | **String** | Reference to client id from Configuration Store | [optional] [default to String]
**clientSecretRef** | **String** | Reference to client secret from Configuration Store | [optional] [default to String]

```java
import com.finbourne.notifications.model.AzureServiceBusTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String NamespaceRef = "example NamespaceRef";
@jakarta.annotation.Nullable String QueueNameRef = "example QueueNameRef";
@jakarta.annotation.Nullable String Body = "example Body";
@jakarta.annotation.Nullable String TenantIdRef = "example TenantIdRef";
@jakarta.annotation.Nullable String ClientIdRef = "example ClientIdRef";
@jakarta.annotation.Nullable String ClientSecretRef = "example ClientSecretRef";


AzureServiceBusTypeResponse azureServiceBusTypeResponseInstance = new AzureServiceBusTypeResponse()
    .Type(Type)
    .NamespaceRef(NamespaceRef)
    .QueueNameRef(QueueNameRef)
    .Body(Body)
    .TenantIdRef(TenantIdRef)
    .ClientIdRef(ClientIdRef)
    .ClientSecretRef(ClientSecretRef);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
