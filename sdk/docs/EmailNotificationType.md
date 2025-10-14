# com.finbourne.notifications.model.EmailNotificationType
The information required to create or update an Email notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**subject** | **String** | The subject of the email | [default to String]
**plainTextBody** | **String** | The plain text body of the email | [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]

```java
import com.finbourne.notifications.model.EmailNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Subject = "example Subject";
String PlainTextBody = "example PlainTextBody";
@jakarta.annotation.Nullable String HtmlBody = "example HtmlBody";
List<String> EmailAddressTo = new List<String>();
@jakarta.annotation.Nullable List<String> EmailAddressCc = new List<String>();
@jakarta.annotation.Nullable List<String> EmailAddressBcc = new List<String>();


EmailNotificationType emailNotificationTypeInstance = new EmailNotificationType()
    .Type(Type)
    .Subject(Subject)
    .PlainTextBody(PlainTextBody)
    .HtmlBody(HtmlBody)
    .EmailAddressTo(EmailAddressTo)
    .EmailAddressCc(EmailAddressCc)
    .EmailAddressBcc(EmailAddressBcc);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
