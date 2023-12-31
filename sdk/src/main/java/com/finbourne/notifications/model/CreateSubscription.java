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
import com.finbourne.notifications.model.MatchingPattern;
import com.finbourne.notifications.model.ResourceId;
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
 * The information required to create a subscription
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSubscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MATCHING_PATTERN = "matchingPattern";
  @SerializedName(SERIALIZED_NAME_MATCHING_PATTERN)
  private MatchingPattern matchingPattern;

  public static final String SERIALIZED_NAME_USE_AS_AUTH = "useAsAuth";
  @SerializedName(SERIALIZED_NAME_USE_AS_AUTH)
  private String useAsAuth;

  public CreateSubscription() {
  }

  public CreateSubscription id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public CreateSubscription displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the subscription
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateSubscription description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The summary of the services provided by the subscription
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateSubscription status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the subscription. Possible values are: Active, Inactive
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CreateSubscription matchingPattern(MatchingPattern matchingPattern) {
    
    this.matchingPattern = matchingPattern;
    return this;
  }

   /**
   * Get matchingPattern
   * @return matchingPattern
  **/
  @jakarta.annotation.Nonnull
  public MatchingPattern getMatchingPattern() {
    return matchingPattern;
  }


  public void setMatchingPattern(MatchingPattern matchingPattern) {
    this.matchingPattern = matchingPattern;
  }


  public CreateSubscription useAsAuth(String useAsAuth) {
    
    this.useAsAuth = useAsAuth;
    return this;
  }

   /**
   * Id of user associated with subscription. All events associated with   the subscription will use this user to check entitlements against   the resource to send a notification. Can be null, in which case   we&#39;ll default to that of the user making this request
   * @return useAsAuth
  **/
  @jakarta.annotation.Nullable
  public String getUseAsAuth() {
    return useAsAuth;
  }


  public void setUseAsAuth(String useAsAuth) {
    this.useAsAuth = useAsAuth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscription createSubscription = (CreateSubscription) o;
    return Objects.equals(this.id, createSubscription.id) &&
        Objects.equals(this.displayName, createSubscription.displayName) &&
        Objects.equals(this.description, createSubscription.description) &&
        Objects.equals(this.status, createSubscription.status) &&
        Objects.equals(this.matchingPattern, createSubscription.matchingPattern) &&
        Objects.equals(this.useAsAuth, createSubscription.useAsAuth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, description, status, matchingPattern, useAsAuth);
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
    sb.append("class CreateSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    matchingPattern: ").append(toIndentedString(matchingPattern)).append("\n");
    sb.append("    useAsAuth: ").append(toIndentedString(useAsAuth)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("matchingPattern");
    openapiFields.add("useAsAuth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("matchingPattern");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscription is not found in the empty JSON string", CreateSubscription.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `matchingPattern`
      MatchingPattern.validateJsonElement(jsonObj.get("matchingPattern"));
      if ((jsonObj.get("useAsAuth") != null && !jsonObj.get("useAsAuth").isJsonNull()) && !jsonObj.get("useAsAuth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useAsAuth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useAsAuth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscription>() {
           @Override
           public void write(JsonWriter out, CreateSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscription
  * @throws IOException if the JSON string is invalid with respect to CreateSubscription
  */
  public static CreateSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscription.class);
  }

 /**
  * Convert an instance of CreateSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
