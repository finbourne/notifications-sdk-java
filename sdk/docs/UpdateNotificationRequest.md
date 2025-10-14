# com.finbourne.notifications.model.UpdateNotificationRequest
The information required to update a notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the notification | [default to String]
**description** | **String** | The summary of the services provided by the notification | [optional] [default to String]
**notificationType** | [**NotificationType**](NotificationType.md) |  | [default to NotificationType]

```java
import com.finbourne.notifications.model.UpdateNotificationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
NotificationType NotificationType = new NotificationType();


UpdateNotificationRequest updateNotificationRequestInstance = new UpdateNotificationRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .NotificationType(NotificationType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
