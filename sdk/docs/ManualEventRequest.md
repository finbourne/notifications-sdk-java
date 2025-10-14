# com.finbourne.notifications.model.ManualEventRequest
The information required to trigger a manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | [**ManualEventBody**](ManualEventBody.md) |  | [default to ManualEventBody]

```java
import com.finbourne.notifications.model.ManualEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ManualEventBody Body = new ManualEventBody();


ManualEventRequest manualEventRequestInstance = new ManualEventRequest()
    .Body(Body);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
