# com.finbourne.notifications.model.Subscription
A subscription object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the subscription | [default to String]
**description** | **String** | The summary of the services provided by the subscription | [optional] [default to String]
**status** | **String** | The current status of the subscription | [default to String]
**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  | [default to MatchingPattern]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was made | [default to OffsetDateTime]
**userIdCreated** | **String** | The user who made the subscription | [default to String]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was last modified | [default to OffsetDateTime]
**userIdModified** | **String** | The user who last modified the subscription | [default to String]
**useAsAuth** | **String** | The user to use as auth for the subscription | [default to String]
**href** | [**URI**](URI.md) | A URI for retrieving this subscription | [optional] [default to URI]

```java
import com.finbourne.notifications.model.Subscription;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
MatchingPattern MatchingPattern = new MatchingPattern();
OffsetDateTime CreatedAt = OffsetDateTime.now();
String UserIdCreated = "example UserIdCreated";
OffsetDateTime ModifiedAt = OffsetDateTime.now();
String UserIdModified = "example UserIdModified";
String UseAsAuth = "example UseAsAuth";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


Subscription subscriptionInstance = new Subscription()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .MatchingPattern(MatchingPattern)
    .CreatedAt(CreatedAt)
    .UserIdCreated(UserIdCreated)
    .ModifiedAt(ModifiedAt)
    .UserIdModified(UserIdModified)
    .UseAsAuth(UseAsAuth)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
