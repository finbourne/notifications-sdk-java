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
import com.finbourne.notifications.model.Link;
import com.finbourne.notifications.model.Subscription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ResourceListOfSubscription
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceListOfSubscription {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Subscription> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public ResourceListOfSubscription() {
  }

  public ResourceListOfSubscription values(List<Subscription> values) {
    
    this.values = values;
    return this;
  }

  public ResourceListOfSubscription addValuesItem(Subscription valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nonnull
  public List<Subscription> getValues() {
    return values;
  }


  public void setValues(List<Subscription> values) {
    this.values = values;
  }


  public ResourceListOfSubscription href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public ResourceListOfSubscription links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public ResourceListOfSubscription addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }


  public ResourceListOfSubscription nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @jakarta.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }


  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public ResourceListOfSubscription previousPage(String previousPage) {
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @jakarta.annotation.Nullable
  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceListOfSubscription resourceListOfSubscription = (ResourceListOfSubscription) o;
    return Objects.equals(this.values, resourceListOfSubscription.values) &&
        Objects.equals(this.href, resourceListOfSubscription.href) &&
        Objects.equals(this.links, resourceListOfSubscription.links) &&
        Objects.equals(this.nextPage, resourceListOfSubscription.nextPage) &&
        Objects.equals(this.previousPage, resourceListOfSubscription.previousPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, href, links, nextPage, previousPage);
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
    sb.append("class ResourceListOfSubscription {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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
    openapiFields.add("values");
    openapiFields.add("href");
    openapiFields.add("links");
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResourceListOfSubscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceListOfSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceListOfSubscription is not found in the empty JSON string", ResourceListOfSubscription.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResourceListOfSubscription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }

      JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
      // validate the required field `values` (array)
      for (int i = 0; i < jsonArrayvalues.size(); i++) {
        Subscription.validateJsonElement(jsonArrayvalues.get(i));
      };
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("previousPage") != null && !jsonObj.get("previousPage").isJsonNull()) && !jsonObj.get("previousPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceListOfSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceListOfSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceListOfSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceListOfSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceListOfSubscription>() {
           @Override
           public void write(JsonWriter out, ResourceListOfSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceListOfSubscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceListOfSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceListOfSubscription
  * @throws IOException if the JSON string is invalid with respect to ResourceListOfSubscription
  */
  public static ResourceListOfSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceListOfSubscription.class);
  }

 /**
  * Convert an instance of ResourceListOfSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
