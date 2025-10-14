# com.finbourne.notifications.model.SmsNotificationType
The information required to create or update an SMS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**body** | **String** | The body of the SMS | [default to String]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [default to List<String>]

```java
import com.finbourne.notifications.model.SmsNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Body = "example Body";
List<String> Recipients = new List<String>();


SmsNotificationType smsNotificationTypeInstance = new SmsNotificationType()
    .Type(Type)
    .Body(Body)
    .Recipients(Recipients);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
