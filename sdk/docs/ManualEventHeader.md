# com.finbourne.notifications.model.ManualEventHeader
The header of the manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The event type of the manual event | [optional] [readonly] [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the manual event | [optional] [default to OffsetDateTime]
**userId** | **String** | The user ID of the manual event | [optional] [default to String]
**requestId** | **String** | The request ID of the manual event | [optional] [default to String]

```java
import com.finbourne.notifications.model.ManualEventHeader;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EventType = "example EventType";
OffsetDateTime Timestamp = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserId = "example UserId";
@jakarta.annotation.Nullable String RequestId = "example RequestId";


ManualEventHeader manualEventHeaderInstance = new ManualEventHeader()
    .EventType(EventType)
    .Timestamp(Timestamp)
    .UserId(UserId)
    .RequestId(RequestId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
