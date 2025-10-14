# com.finbourne.notifications.model.EventTypeSchema
An EventType object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the event type | [optional] [default to String]
**displayName** | **String** | Identifier name of the event | [optional] [default to String]
**description** | **String** | The summary of the event | [optional] [default to String]
**application** | **String** | The application associated with the event | [optional] [default to String]
**headerSchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The header schema for the event type | [optional] [readonly] [default to List<EventFieldDefinition>]
**bodySchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The body schema for the event type | [optional] [readonly] [default to List<EventFieldDefinition>]
**href** | [**URI**](URI.md) | A URI for retrieving this schema | [optional] [default to URI]

```java
import com.finbourne.notifications.model.EventTypeSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Application = "example Application";
@jakarta.annotation.Nullable List<EventFieldDefinition> HeaderSchema = new List<EventFieldDefinition>();
@jakarta.annotation.Nullable List<EventFieldDefinition> BodySchema = new List<EventFieldDefinition>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


EventTypeSchema eventTypeSchemaInstance = new EventTypeSchema()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Application(Application)
    .HeaderSchema(HeaderSchema)
    .BodySchema(BodySchema)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
