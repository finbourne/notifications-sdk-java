# com.finbourne.notifications.model.AmazonSqsPrincipalAuthNotificationTypeResponse
Holds readonly information about an AWS SQS with Principal Authentication notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**body** | **String** | The body of the Amazon Queue Message | [optional] [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [optional] [default to String]

```java
import com.finbourne.notifications.model.AmazonSqsPrincipalAuthNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Body = "example Body";
@jakarta.annotation.Nullable String QueueUrlRef = "example QueueUrlRef";


AmazonSqsPrincipalAuthNotificationTypeResponse amazonSqsPrincipalAuthNotificationTypeResponseInstance = new AmazonSqsPrincipalAuthNotificationTypeResponse()
    .Type(Type)
    .Body(Body)
    .QueueUrlRef(QueueUrlRef);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
