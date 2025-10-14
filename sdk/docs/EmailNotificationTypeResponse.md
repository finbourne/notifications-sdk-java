# com.finbourne.notifications.model.EmailNotificationTypeResponse
Holds readonly information about an Email notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**subject** | **String** | The subject of the email | [optional] [default to String]
**plainTextBody** | **String** | The plain text body of the email | [optional] [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]

```java
import com.finbourne.notifications.model.EmailNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Subject = "example Subject";
@jakarta.annotation.Nullable String PlainTextBody = "example PlainTextBody";
@jakarta.annotation.Nullable String HtmlBody = "example HtmlBody";
@jakarta.annotation.Nullable List<String> EmailAddressTo = new List<String>();
@jakarta.annotation.Nullable List<String> EmailAddressCc = new List<String>();
@jakarta.annotation.Nullable List<String> EmailAddressBcc = new List<String>();


EmailNotificationTypeResponse emailNotificationTypeResponseInstance = new EmailNotificationTypeResponse()
    .Type(Type)
    .Subject(Subject)
    .PlainTextBody(PlainTextBody)
    .HtmlBody(HtmlBody)
    .EmailAddressTo(EmailAddressTo)
    .EmailAddressCc(EmailAddressCc)
    .EmailAddressBcc(EmailAddressBcc);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
