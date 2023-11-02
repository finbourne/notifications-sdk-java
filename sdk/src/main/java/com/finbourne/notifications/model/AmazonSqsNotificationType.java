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
 * The information required to create or update an AWS SQS notification
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmazonSqsNotificationType {
  /**
   * The type of delivery mechanism for this notification
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AMAZONSQS("AmazonSqs");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_API_KEY_REF = "apiKeyRef";
  @SerializedName(SERIALIZED_NAME_API_KEY_REF)
  private String apiKeyRef;

  public static final String SERIALIZED_NAME_API_SECRET_REF = "apiSecretRef";
  @SerializedName(SERIALIZED_NAME_API_SECRET_REF)
  private String apiSecretRef;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_QUEUE_URL_REF = "queueUrlRef";
  @SerializedName(SERIALIZED_NAME_QUEUE_URL_REF)
  private String queueUrlRef;

  public AmazonSqsNotificationType() {
  }

  public AmazonSqsNotificationType type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of delivery mechanism for this notification
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AmazonSqsNotificationType apiKeyRef(String apiKeyRef) {
    
    this.apiKeyRef = apiKeyRef;
    return this;
  }

   /**
   * Reference to API key from Configuration Store
   * @return apiKeyRef
  **/
  @jakarta.annotation.Nonnull
  public String getApiKeyRef() {
    return apiKeyRef;
  }


  public void setApiKeyRef(String apiKeyRef) {
    this.apiKeyRef = apiKeyRef;
  }


  public AmazonSqsNotificationType apiSecretRef(String apiSecretRef) {
    
    this.apiSecretRef = apiSecretRef;
    return this;
  }

   /**
   * Reference to API secret from Configuration Store
   * @return apiSecretRef
  **/
  @jakarta.annotation.Nonnull
  public String getApiSecretRef() {
    return apiSecretRef;
  }


  public void setApiSecretRef(String apiSecretRef) {
    this.apiSecretRef = apiSecretRef;
  }


  public AmazonSqsNotificationType body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The body of the Amazon Queue Message
   * @return body
  **/
  @jakarta.annotation.Nonnull
  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public AmazonSqsNotificationType queueUrlRef(String queueUrlRef) {
    
    this.queueUrlRef = queueUrlRef;
    return this;
  }

   /**
   * Reference to queue url from Configuration Store
   * @return queueUrlRef
  **/
  @jakarta.annotation.Nonnull
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
    AmazonSqsNotificationType amazonSqsNotificationType = (AmazonSqsNotificationType) o;
    return Objects.equals(this.type, amazonSqsNotificationType.type) &&
        Objects.equals(this.apiKeyRef, amazonSqsNotificationType.apiKeyRef) &&
        Objects.equals(this.apiSecretRef, amazonSqsNotificationType.apiSecretRef) &&
        Objects.equals(this.body, amazonSqsNotificationType.body) &&
        Objects.equals(this.queueUrlRef, amazonSqsNotificationType.queueUrlRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, apiKeyRef, apiSecretRef, body, queueUrlRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonSqsNotificationType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiKeyRef: ").append(toIndentedString(apiKeyRef)).append("\n");
    sb.append("    apiSecretRef: ").append(toIndentedString(apiSecretRef)).append("\n");
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
    openapiFields.add("apiKeyRef");
    openapiFields.add("apiSecretRef");
    openapiFields.add("body");
    openapiFields.add("queueUrlRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("apiKeyRef");
    openapiRequiredFields.add("apiSecretRef");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("queueUrlRef");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AmazonSqsNotificationType
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AmazonSqsNotificationType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AmazonSqsNotificationType is not found in the empty JSON string", AmazonSqsNotificationType.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AmazonSqsNotificationType.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("apiKeyRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKeyRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKeyRef").toString()));
      }
      if (!jsonObj.get("apiSecretRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiSecretRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiSecretRef").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (!jsonObj.get("queueUrlRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueUrlRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueUrlRef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonSqsNotificationType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonSqsNotificationType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonSqsNotificationType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonSqsNotificationType.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonSqsNotificationType>() {
           @Override
           public void write(JsonWriter out, AmazonSqsNotificationType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AmazonSqsNotificationType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AmazonSqsNotificationType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AmazonSqsNotificationType
  * @throws IOException if the JSON string is invalid with respect to AmazonSqsNotificationType
  */
  public static AmazonSqsNotificationType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonSqsNotificationType.class);
  }

 /**
  * Convert an instance of AmazonSqsNotificationType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
