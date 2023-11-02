

# Delivery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The identifier of the delivery. |  |
|**eventId** | **String** | The identifier of the associated event. |  |
|**subscriptionId** | [**ResourceId**](ResourceId.md) |  |  |
|**notificationId** | **String** | The identifier of the associated notification. |  |
|**deliveryChannel** | **String** | The delivery channel of the message. |  |
|**messageDetails** | **String** | The Details of the delivery message as JSON string. |  |
|**attempts** | [**List&lt;Attempt&gt;**](Attempt.md) | A list of all the delivery attempts made for this message. |  |



