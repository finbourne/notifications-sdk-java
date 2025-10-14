# com.finbourne.notifications.model.AmazonSqsNotificationType
The information required to create or update an AWS SQS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [default to String]
**body** | **String** | The body of the Amazon Queue Message | [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [default to String]

```java
import com.finbourne.notifications.model.AmazonSqsNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String ApiKeyRef = "example ApiKeyRef";
String ApiSecretRef = "example ApiSecretRef";
String Body = "example Body";
String QueueUrlRef = "example QueueUrlRef";


AmazonSqsNotificationType amazonSqsNotificationTypeInstance = new AmazonSqsNotificationType()
    .Type(Type)
    .ApiKeyRef(ApiKeyRef)
    .ApiSecretRef(ApiSecretRef)
    .Body(Body)
    .QueueUrlRef(QueueUrlRef);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
