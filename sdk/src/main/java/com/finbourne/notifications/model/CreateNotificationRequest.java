/*
 * FINBOURNE Notifications API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.notifications.model;

import java.util.Objects;
import com.finbourne.notifications.model.NotificationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.notifications.JSON;

/**
 * The information required to create a notification
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNotificationRequest {
  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notificationId";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private String notificationId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationType notificationType;

  public CreateNotificationRequest() {
  }

  public CreateNotificationRequest notificationId(String notificationId) {
    
    this.notificationId = notificationId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return notificationId
  **/
  @jakarta.annotation.Nonnull
  public String getNotificationId() {
    return notificationId;
  }


  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }


  public CreateNotificationRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the notification
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateNotificationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The summary of the services provided by the notification
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateNotificationRequest notificationType(NotificationType notificationType) {
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @jakarta.annotation.Nonnull
  public NotificationType getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNotificationRequest createNotificationRequest = (CreateNotificationRequest) o;
    return Objects.equals(this.notificationId, createNotificationRequest.notificationId) &&
        Objects.equals(this.displayName, createNotificationRequest.displayName) &&
        Objects.equals(this.description, createNotificationRequest.description) &&
        Objects.equals(this.notificationType, createNotificationRequest.notificationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, displayName, description, notificationType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationRequest {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("notificationId");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("notificationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("notificationId");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("notificationType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateNotificationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateNotificationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateNotificationRequest is not found in the empty JSON string", CreateNotificationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateNotificationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("notificationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationId").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `notificationType`
      NotificationType.validateJsonElement(jsonObj.get("notificationType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateNotificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateNotificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateNotificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateNotificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateNotificationRequest>() {
           @Override
           public void write(JsonWriter out, CreateNotificationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateNotificationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateNotificationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateNotificationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateNotificationRequest
  */
  public static CreateNotificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateNotificationRequest.class);
  }

 /**
  * Convert an instance of CreateNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
