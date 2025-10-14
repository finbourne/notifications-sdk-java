# com.finbourne.notifications.model.Delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The identifier of the delivery. | [default to UUID]
**eventId** | **String** | The identifier of the associated event. | [default to String]
**subscriptionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**notificationId** | **String** | The identifier of the associated notification. | [default to String]
**deliveryChannel** | **String** | The delivery channel of the message. | [default to String]
**messageDetails** | **String** | The Details of the delivery message as JSON string. | [default to String]
**attempts** | [**List&lt;Attempt&gt;**](Attempt.md) | A list of all the delivery attempts made for this message. | [default to List<Attempt>]

```java
import com.finbourne.notifications.model.Delivery;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID Id = "example Id";
String EventId = "example EventId";
ResourceId SubscriptionId = new ResourceId();
String NotificationId = "example NotificationId";
String DeliveryChannel = "example DeliveryChannel";
String MessageDetails = "example MessageDetails";
List<Attempt> Attempts = new List<Attempt>();


Delivery deliveryInstance = new Delivery()
    .Id(Id)
    .EventId(EventId)
    .SubscriptionId(SubscriptionId)
    .NotificationId(NotificationId)
    .DeliveryChannel(DeliveryChannel)
    .MessageDetails(MessageDetails)
    .Attempts(Attempts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
