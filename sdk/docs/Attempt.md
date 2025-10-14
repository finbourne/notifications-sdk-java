# com.finbourne.notifications.model.Attempt
Details of an attempt of delivery.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptNumber** | **Integer** | The attempt number of the delivery. | [default to Integer]
**attemptTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time that the delivery was attempted. | [default to OffsetDateTime]
**status** | [**AttemptStatus**](AttemptStatus.md) |  | [default to AttemptStatus]

```java
import com.finbourne.notifications.model.Attempt;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer AttemptNumber = new Integer("100.00");
OffsetDateTime AttemptTime = OffsetDateTime.now();
AttemptStatus Status = new AttemptStatus();


Attempt attemptInstance = new Attempt()
    .AttemptNumber(AttemptNumber)
    .AttemptTime(AttemptTime)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
