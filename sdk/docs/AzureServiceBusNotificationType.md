# com.finbourne.notifications.model.AzureServiceBusNotificationType
The information required to create or update an Azure Service Bus notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**namespace** | **String** | Reference to namespace from Configuration Store | [default to String]
**queueName** | **String** | Reference to queue name from Configuration Store | [default to String]
**body** | **String** | The body of the Azure Service Bus Message | [default to String]
**tenantId** | **String** | Reference to tenant id from Configuration Store | [default to String]
**clientId** | **String** | Reference to client id from Configuration Store | [default to String]
**clientSecret** | **String** | Reference to client secret from Configuration Store | [default to String]

```java
import com.finbourne.notifications.model.AzureServiceBusNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Namespace = "example Namespace";
String QueueName = "example QueueName";
String Body = "example Body";
String TenantId = "example TenantId";
String ClientId = "example ClientId";
String ClientSecret = "example ClientSecret";


AzureServiceBusNotificationType azureServiceBusNotificationTypeInstance = new AzureServiceBusNotificationType()
    .Type(Type)
    .Namespace(Namespace)
    .QueueName(QueueName)
    .Body(Body)
    .TenantId(TenantId)
    .ClientId(ClientId)
    .ClientSecret(ClientSecret);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
