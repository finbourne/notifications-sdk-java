# com.finbourne.notifications.model.AmazonSqsPrincipalAuthNotificationType
The information required to create or update an AWS SQS notification with principal authentication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**body** | **String** | The body of the Amazon Queue Message | [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [default to String]

```java
import com.finbourne.notifications.model.AmazonSqsPrincipalAuthNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Body = "example Body";
String QueueUrlRef = "example QueueUrlRef";


AmazonSqsPrincipalAuthNotificationType amazonSqsPrincipalAuthNotificationTypeInstance = new AmazonSqsPrincipalAuthNotificationType()
    .Type(Type)
    .Body(Body)
    .QueueUrlRef(QueueUrlRef);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
