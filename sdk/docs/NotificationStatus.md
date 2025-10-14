# com.finbourne.notifications.model.NotificationStatus
The status object of a notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** | The status of the notification | [optional] [default to String]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the notification status was last updated | [optional] [default to OffsetDateTime]

```java
import com.finbourne.notifications.model.NotificationStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Result = "example Result";
OffsetDateTime LastUpdated = OffsetDateTime.now();


NotificationStatus notificationStatusInstance = new NotificationStatus()
    .Result(Result)
    .LastUpdated(LastUpdated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
