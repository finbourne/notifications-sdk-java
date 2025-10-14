# com.finbourne.notifications.model.UpdateSubscription
The information required to update a subscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the subscription | [default to String]
**description** | **String** | The summary of the services provided by the subscription | [optional] [default to String]
**status** | **String** | The current status of the subscription. Possible values are: Active, Inactive | [default to String]
**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  | [default to MatchingPattern]
**useAsAuth** | **String** | Id of user associated with subscription. All events associated with  the subscription will use this user to check entitlements against  the resource to send a notification. Can be null, in which case  we&#39;ll default to that of the user making this request | [optional] [default to String]

```java
import com.finbourne.notifications.model.UpdateSubscription;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
MatchingPattern MatchingPattern = new MatchingPattern();
@jakarta.annotation.Nullable String UseAsAuth = "example UseAsAuth";


UpdateSubscription updateSubscriptionInstance = new UpdateSubscription()
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .MatchingPattern(MatchingPattern)
    .UseAsAuth(UseAsAuth);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
