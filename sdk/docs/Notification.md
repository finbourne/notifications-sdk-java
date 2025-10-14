# com.finbourne.notifications.model.Notification
A notification object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notificationId** | **String** | The identifier of the notification | [default to String]
**displayName** | **String** | The name of the notification | [default to String]
**description** | **String** | The summary of the services provided by the notification | [optional] [default to String]
**notificationType** | [**NotificationTypeResponse**](NotificationTypeResponse.md) |  | [default to NotificationTypeResponse]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was made | [default to OffsetDateTime]
**userIdCreated** | **String** | The user who made the subscription | [default to String]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was last modified | [default to OffsetDateTime]
**userIdModified** | **String** | The user who last modified the subscription | [default to String]
**href** | [**URI**](URI.md) | A URI for retrieving this notification | [optional] [default to URI]

```java
import com.finbourne.notifications.model.Notification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NotificationId = "example NotificationId";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
NotificationTypeResponse NotificationType = new NotificationTypeResponse();
OffsetDateTime CreatedAt = OffsetDateTime.now();
String UserIdCreated = "example UserIdCreated";
OffsetDateTime ModifiedAt = OffsetDateTime.now();
String UserIdModified = "example UserIdModified";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


Notification notificationInstance = new Notification()
    .NotificationId(NotificationId)
    .DisplayName(DisplayName)
    .Description(Description)
    .NotificationType(NotificationType)
    .CreatedAt(CreatedAt)
    .UserIdCreated(UserIdCreated)
    .ModifiedAt(ModifiedAt)
    .UserIdModified(UserIdModified)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
