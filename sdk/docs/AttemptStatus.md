# com.finbourne.notifications.model.AttemptStatus
Status of the delivery attempt.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** | Result of the delivery. | [default to String]
**detailedMessage** | **String** | The detailed message from attempting to deliver the message. | [optional] [default to String]

```java
import com.finbourne.notifications.model.AttemptStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Result = "example Result";
@jakarta.annotation.Nullable String DetailedMessage = "example DetailedMessage";


AttemptStatus attemptStatusInstance = new AttemptStatus()
    .Result(Result)
    .DetailedMessage(DetailedMessage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
