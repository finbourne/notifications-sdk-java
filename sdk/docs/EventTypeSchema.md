

# EventTypeSchema

An EventType object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the event type |  [optional] |
|**displayName** | **String** | Identifier name of the event |  [optional] |
|**description** | **String** | The summary of the event |  [optional] |
|**application** | **String** | The application associated with the event |  [optional] |
|**headerSchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The header schema for the event type |  [optional] [readonly] |
|**bodySchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The body schema for the event type |  [optional] [readonly] |
|**href** | **URI** | A URI for retrieving this schema |  [optional] |



