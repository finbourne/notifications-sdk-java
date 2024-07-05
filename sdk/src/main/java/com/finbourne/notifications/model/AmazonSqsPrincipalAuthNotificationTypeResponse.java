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
 * Holds readonly information about an AWS SQS with Principal Authentication notification
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmazonSqsPrincipalAuthNotificationTypeResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_QUEUE_URL_REF = "queueUrlRef";
  @SerializedName(SERIALIZED_NAME_QUEUE_URL_REF)
  private String queueUrlRef;

  public AmazonSqsPrincipalAuthNotificationTypeResponse() {
  }

  public AmazonSqsPrincipalAuthNotificationTypeResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of delivery mechanism for this notification
   * @return type
  **/
  @jakarta.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AmazonSqsPrincipalAuthNotificationTypeResponse body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The body of the Amazon Queue Message
   * @return body
  **/
  @jakarta.annotation.Nullable
  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public AmazonSqsPrincipalAuthNotificationTypeResponse queueUrlRef(String queueUrlRef) {
    
    this.queueUrlRef = queueUrlRef;
    return this;
  }

   /**
   * Reference to queue url from Configuration Store
   * @return queueUrlRef
  **/
  @jakarta.annotation.Nullable
  public String getQueueUrlRef() {
    return queueUrlRef;
  }


  public void setQueueUrlRef(String queueUrlRef) {
    this.queueUrlRef = queueUrlRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonSqsPrincipalAuthNotificationTypeResponse amazonSqsPrincipalAuthNotificationTypeResponse = (AmazonSqsPrincipalAuthNotificationTypeResponse) o;
    return Objects.equals(this.type, amazonSqsPrincipalAuthNotificationTypeResponse.type) &&
        Objects.equals(this.body, amazonSqsPrincipalAuthNotificationTypeResponse.body) &&
        Objects.equals(this.queueUrlRef, amazonSqsPrincipalAuthNotificationTypeResponse.queueUrlRef);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, body, queueUrlRef);
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
    sb.append("class AmazonSqsPrincipalAuthNotificationTypeResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    queueUrlRef: ").append(toIndentedString(queueUrlRef)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("body");
    openapiFields.add("queueUrlRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AmazonSqsPrincipalAuthNotificationTypeResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AmazonSqsPrincipalAuthNotificationTypeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonSqsPrincipalAuthNotificationTypeResponse is not found in the empty JSON string", AmazonSqsPrincipalAuthNotificationTypeResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("queueUrlRef") != null && !jsonObj.get("queueUrlRef").isJsonNull()) && !jsonObj.get("queueUrlRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueUrlRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueUrlRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonSqsPrincipalAuthNotificationTypeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonSqsPrincipalAuthNotificationTypeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonSqsPrincipalAuthNotificationTypeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonSqsPrincipalAuthNotificationTypeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonSqsPrincipalAuthNotificationTypeResponse>() {
           @Override
           public void write(JsonWriter out, AmazonSqsPrincipalAuthNotificationTypeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AmazonSqsPrincipalAuthNotificationTypeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AmazonSqsPrincipalAuthNotificationTypeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmazonSqsPrincipalAuthNotificationTypeResponse
  * @throws IOException if the JSON string is invalid with respect to AmazonSqsPrincipalAuthNotificationTypeResponse
  */
  public static AmazonSqsPrincipalAuthNotificationTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonSqsPrincipalAuthNotificationTypeResponse.class);
  }

 /**
  * Convert an instance of AmazonSqsPrincipalAuthNotificationTypeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
