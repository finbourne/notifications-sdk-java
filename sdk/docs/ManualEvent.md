# com.finbourne.notifications.model.ManualEvent
Details of a manually triggered event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header** | [**ManualEventHeader**](ManualEventHeader.md) |  | [default to ManualEventHeader]
**body** | [**ManualEventBody**](ManualEventBody.md) |  | [default to ManualEventBody]

```java
import com.finbourne.notifications.model.ManualEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ManualEventHeader Header = new ManualEventHeader();
ManualEventBody Body = new ManualEventBody();


ManualEvent manualEventInstance = new ManualEvent()
    .Header(Header)
    .Body(Body);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
