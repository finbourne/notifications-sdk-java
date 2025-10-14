# com.finbourne.notifications.model.AmazonSqsNotificationTypeResponse
Holds readonly information about an AWS SQS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [optional] [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [optional] [default to String]
**body** | **String** | The body of the Amazon Queue Message | [optional] [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [optional] [default to String]

```java
import com.finbourne.notifications.model.AmazonSqsNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String ApiKeyRef = "example ApiKeyRef";
@jakarta.annotation.Nullable String ApiSecretRef = "example ApiSecretRef";
@jakarta.annotation.Nullable String Body = "example Body";
@jakarta.annotation.Nullable String QueueUrlRef = "example QueueUrlRef";


AmazonSqsNotificationTypeResponse amazonSqsNotificationTypeResponseInstance = new AmazonSqsNotificationTypeResponse()
    .Type(Type)
    .ApiKeyRef(ApiKeyRef)
    .ApiSecretRef(ApiSecretRef)
    .Body(Body)
    .QueueUrlRef(QueueUrlRef);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
