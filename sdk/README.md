<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/notification*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | [EARLY ACCESS] ListAccessControlledResources: Get resources available for access control
*DeliveriesApi* | [**listDeliveries**](docs/DeliveriesApi.md#listdeliveries) | **GET** /api/deliveries | [EXPERIMENTAL] ListDeliveries: List Deliveries
*EventTypesApi* | [**getEventType**](docs/EventTypesApi.md#geteventtype) | **GET** /api/eventtypes/{eventType} | [EXPERIMENTAL] GetEventType: Gets the specified event type schema.
*EventTypesApi* | [**listEventTypes**](docs/EventTypesApi.md#listeventtypes) | **GET** /api/eventtypes | [EXPERIMENTAL] ListEventTypes: Lists all of the available event types.
*ManualEventApi* | [**triggerManualEvent**](docs/ManualEventApi.md#triggermanualevent) | **POST** /api/manualevent | [EXPERIMENTAL] TriggerManualEvent: Trigger a manual event.
*NotificationsApi* | [**createNotification**](docs/NotificationsApi.md#createnotification) | **POST** /api/subscriptions/{scope}/{code}/notifications | [EXPERIMENTAL] CreateNotification: Add a Notification to a Subscription.
*NotificationsApi* | [**deleteNotification**](docs/NotificationsApi.md#deletenotification) | **DELETE** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] DeleteNotification: Delete a notification for a given subscription.
*NotificationsApi* | [**getNotification**](docs/NotificationsApi.md#getnotification) | **GET** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] GetNotification: Get a notification on a subscription.
*NotificationsApi* | [**listNotifications**](docs/NotificationsApi.md#listnotifications) | **GET** /api/subscriptions/{scope}/{code}/notifications | [EXPERIMENTAL] ListNotifications: List all notifications on a subscription.
*NotificationsApi* | [**updateNotification**](docs/NotificationsApi.md#updatenotification) | **PUT** /api/subscriptions/{scope}/{code}/notifications/{id} | [EXPERIMENTAL] UpdateNotification: Update a Notification for a Subscription
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createsubscription) | **POST** /api/subscriptions | [EXPERIMENTAL] CreateSubscription: Create a new subscription.
*SubscriptionsApi* | [**deleteSubscription**](docs/SubscriptionsApi.md#deletesubscription) | **DELETE** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] DeleteSubscription: Delete a subscription.
*SubscriptionsApi* | [**getSubscription**](docs/SubscriptionsApi.md#getsubscription) | **GET** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] GetSubscription: Get a subscription.
*SubscriptionsApi* | [**listSubscriptions**](docs/SubscriptionsApi.md#listsubscriptions) | **GET** /api/subscriptions | [EXPERIMENTAL] ListSubscriptions: List subscriptions.
*SubscriptionsApi* | [**updateSubscription**](docs/SubscriptionsApi.md#updatesubscription) | **PUT** /api/subscriptions/{scope}/{code} | [EXPERIMENTAL] UpdateSubscription: Update an existing subscription.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionId](docs/ActionId.md)
 - [AmazonSqsNotificationType](docs/AmazonSqsNotificationType.md)
 - [AmazonSqsNotificationTypeResponse](docs/AmazonSqsNotificationTypeResponse.md)
 - [AmazonSqsPrincipalAuthNotificationType](docs/AmazonSqsPrincipalAuthNotificationType.md)
 - [AmazonSqsPrincipalAuthNotificationTypeResponse](docs/AmazonSqsPrincipalAuthNotificationTypeResponse.md)
 - [Attempt](docs/Attempt.md)
 - [AttemptStatus](docs/AttemptStatus.md)
 - [AzureServiceBusNotificationType](docs/AzureServiceBusNotificationType.md)
 - [AzureServiceBusTypeResponse](docs/AzureServiceBusTypeResponse.md)
 - [CreateNotificationRequest](docs/CreateNotificationRequest.md)
 - [CreateSubscription](docs/CreateSubscription.md)
 - [Delivery](docs/Delivery.md)
 - [EmailNotificationType](docs/EmailNotificationType.md)
 - [EmailNotificationTypeResponse](docs/EmailNotificationTypeResponse.md)
 - [EventFieldDefinition](docs/EventFieldDefinition.md)
 - [EventTypeSchema](docs/EventTypeSchema.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [Link](docs/Link.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [ManualEvent](docs/ManualEvent.md)
 - [ManualEventBody](docs/ManualEventBody.md)
 - [ManualEventHeader](docs/ManualEventHeader.md)
 - [ManualEventRequest](docs/ManualEventRequest.md)
 - [MatchingPattern](docs/MatchingPattern.md)
 - [Notification](docs/Notification.md)
 - [NotificationStatus](docs/NotificationStatus.md)
 - [NotificationType](docs/NotificationType.md)
 - [NotificationTypeResponse](docs/NotificationTypeResponse.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfDelivery](docs/ResourceListOfDelivery.md)
 - [ResourceListOfEventTypeSchema](docs/ResourceListOfEventTypeSchema.md)
 - [ResourceListOfNotification](docs/ResourceListOfNotification.md)
 - [ResourceListOfSubscription](docs/ResourceListOfSubscription.md)
 - [SmsNotificationType](docs/SmsNotificationType.md)
 - [SmsNotificationTypeResponse](docs/SmsNotificationTypeResponse.md)
 - [Subscription](docs/Subscription.md)
 - [UpdateNotificationRequest](docs/UpdateNotificationRequest.md)
 - [UpdateSubscription](docs/UpdateSubscription.md)
 - [WebhookNotificationType](docs/WebhookNotificationType.md)
 - [WebhookNotificationTypeResponse](docs/WebhookNotificationTypeResponse.md)

