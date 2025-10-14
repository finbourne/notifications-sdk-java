# com.finbourne.notifications.model.ManualEventBody
The body of the manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **String** | The subject of the manual event | [default to String]
**message** | **String** | The message of the manual event | [default to String]
**jsonMessage** | **Object** | The JSON message of the manual event | [optional] [default to Object]

```java
import com.finbourne.notifications.model.ManualEventBody;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Subject = "example Subject";
String Message = "example Message";
@jakarta.annotation.Nullable Object 

ManualEventBody manualEventBodyInstance = new ManualEventBody()
    .Subject(Subject)
    .Message(Message)
    .JsonMessage(JsonMessage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
