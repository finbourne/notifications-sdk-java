

# UpdateSubscription

The information required to update a subscription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The name of the subscription |  |
|**description** | **String** | The summary of the services provided by the subscription |  [optional] |
|**status** | **String** | The current status of the subscription. Possible values are: Active, Inactive |  |
|**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  |  |
|**useAsAuth** | **String** | Id of user associated with subscription. All events associated with   the subscription will use this user to check entitlements against   the resource to send a notification. Can be null, in which case   we&#39;ll default to that of the user making this request |  [optional] |



