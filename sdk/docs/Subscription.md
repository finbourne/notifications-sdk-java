

# Subscription

A subscription object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name of the subscription |  |
|**description** | **String** | The summary of the services provided by the subscription |  [optional] |
|**status** | **String** | The current status of the subscription |  |
|**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  |  |
|**createdAt** | **OffsetDateTime** | The time at which the subscription was made |  |
|**userIdCreated** | **String** | The user who made the subscription |  |
|**modifiedAt** | **OffsetDateTime** | The time at which the subscription was last modified |  |
|**userIdModified** | **String** | The user who last modified the subscription |  |
|**useAsAuth** | **String** | The user to use as auth for the subscription |  |
|**href** | **URI** | A URI for retrieving this subscription |  [optional] |



