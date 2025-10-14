# com.finbourne.notifications.model.SmsNotificationTypeResponse
Holds readonly information about an SMS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**body** | **String** | The body of the SMS | [optional] [default to String]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [optional] [default to List<String>]

```java
import com.finbourne.notifications.model.SmsNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Body = "example Body";
@jakarta.annotation.Nullable List<String> Recipients = new List<String>();


SmsNotificationTypeResponse smsNotificationTypeResponseInstance = new SmsNotificationTypeResponse()
    .Type(Type)
    .Body(Body)
    .Recipients(Recipients);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
