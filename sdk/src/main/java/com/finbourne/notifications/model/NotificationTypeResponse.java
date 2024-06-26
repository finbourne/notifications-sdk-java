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
import com.finbourne.notifications.model.AmazonSqsNotificationTypeResponse;
import com.finbourne.notifications.model.AmazonSqsPrincipalAuthNotificationTypeResponse;
import com.finbourne.notifications.model.AzureServiceBusTypeResponse;
import com.finbourne.notifications.model.EmailNotificationTypeResponse;
import com.finbourne.notifications.model.SmsNotificationTypeResponse;
import com.finbourne.notifications.model.WebhookNotificationTypeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.finbourne.notifications.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationTypeResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NotificationTypeResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NotificationTypeResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NotificationTypeResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AmazonSqsNotificationTypeResponse> adapterAmazonSqsNotificationTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(AmazonSqsNotificationTypeResponse.class));
            final TypeAdapter<AmazonSqsPrincipalAuthNotificationTypeResponse> adapterAmazonSqsPrincipalAuthNotificationTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(AmazonSqsPrincipalAuthNotificationTypeResponse.class));
            final TypeAdapter<AzureServiceBusTypeResponse> adapterAzureServiceBusTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(AzureServiceBusTypeResponse.class));
            final TypeAdapter<EmailNotificationTypeResponse> adapterEmailNotificationTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(EmailNotificationTypeResponse.class));
            final TypeAdapter<SmsNotificationTypeResponse> adapterSmsNotificationTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(SmsNotificationTypeResponse.class));
            final TypeAdapter<WebhookNotificationTypeResponse> adapterWebhookNotificationTypeResponse = gson.getDelegateAdapter(this, TypeToken.get(WebhookNotificationTypeResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<NotificationTypeResponse>() {
                @Override
                public void write(JsonWriter out, NotificationTypeResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AmazonSqsNotificationTypeResponse`
                    if (value.getActualInstance() instanceof AmazonSqsNotificationTypeResponse) {
                      JsonElement element = adapterAmazonSqsNotificationTypeResponse.toJsonTree((AmazonSqsNotificationTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `AmazonSqsPrincipalAuthNotificationTypeResponse`
                    if (value.getActualInstance() instanceof AmazonSqsPrincipalAuthNotificationTypeResponse) {
                      JsonElement element = adapterAmazonSqsPrincipalAuthNotificationTypeResponse.toJsonTree((AmazonSqsPrincipalAuthNotificationTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `AzureServiceBusTypeResponse`
                    if (value.getActualInstance() instanceof AzureServiceBusTypeResponse) {
                      JsonElement element = adapterAzureServiceBusTypeResponse.toJsonTree((AzureServiceBusTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EmailNotificationTypeResponse`
                    if (value.getActualInstance() instanceof EmailNotificationTypeResponse) {
                      JsonElement element = adapterEmailNotificationTypeResponse.toJsonTree((EmailNotificationTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SmsNotificationTypeResponse`
                    if (value.getActualInstance() instanceof SmsNotificationTypeResponse) {
                      JsonElement element = adapterSmsNotificationTypeResponse.toJsonTree((SmsNotificationTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `WebhookNotificationTypeResponse`
                    if (value.getActualInstance() instanceof WebhookNotificationTypeResponse) {
                      JsonElement element = adapterWebhookNotificationTypeResponse.toJsonTree((WebhookNotificationTypeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse");
                }

                @Override
                public NotificationTypeResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AmazonSqsNotificationTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AmazonSqsNotificationTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterAmazonSqsNotificationTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AmazonSqsNotificationTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AmazonSqsNotificationTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AmazonSqsNotificationTypeResponse'", e);
                    }
                    // deserialize AmazonSqsPrincipalAuthNotificationTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AmazonSqsPrincipalAuthNotificationTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterAmazonSqsPrincipalAuthNotificationTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AmazonSqsPrincipalAuthNotificationTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AmazonSqsPrincipalAuthNotificationTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AmazonSqsPrincipalAuthNotificationTypeResponse'", e);
                    }
                    // deserialize AzureServiceBusTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AzureServiceBusTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterAzureServiceBusTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AzureServiceBusTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AzureServiceBusTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AzureServiceBusTypeResponse'", e);
                    }
                    // deserialize EmailNotificationTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EmailNotificationTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterEmailNotificationTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EmailNotificationTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EmailNotificationTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EmailNotificationTypeResponse'", e);
                    }
                    // deserialize SmsNotificationTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SmsNotificationTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterSmsNotificationTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SmsNotificationTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SmsNotificationTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SmsNotificationTypeResponse'", e);
                    }
                    // deserialize WebhookNotificationTypeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      WebhookNotificationTypeResponse.validateJsonElement(jsonElement);
                      actualAdapter = adapterWebhookNotificationTypeResponse;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'WebhookNotificationTypeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for WebhookNotificationTypeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'WebhookNotificationTypeResponse'", e);
                    }

                    if (match == 1) {
                        NotificationTypeResponse ret = new NotificationTypeResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for NotificationTypeResponse: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public NotificationTypeResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public NotificationTypeResponse(AmazonSqsNotificationTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTypeResponse(AmazonSqsPrincipalAuthNotificationTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTypeResponse(AzureServiceBusTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTypeResponse(EmailNotificationTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTypeResponse(SmsNotificationTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotificationTypeResponse(WebhookNotificationTypeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AmazonSqsNotificationTypeResponse", AmazonSqsNotificationTypeResponse.class);
        schemas.put("AmazonSqsPrincipalAuthNotificationTypeResponse", AmazonSqsPrincipalAuthNotificationTypeResponse.class);
        schemas.put("AzureServiceBusTypeResponse", AzureServiceBusTypeResponse.class);
        schemas.put("EmailNotificationTypeResponse", EmailNotificationTypeResponse.class);
        schemas.put("SmsNotificationTypeResponse", SmsNotificationTypeResponse.class);
        schemas.put("WebhookNotificationTypeResponse", WebhookNotificationTypeResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return NotificationTypeResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AmazonSqsNotificationTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AmazonSqsPrincipalAuthNotificationTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AzureServiceBusTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EmailNotificationTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SmsNotificationTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WebhookNotificationTypeResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse
     *
     * @return The actual instance (AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AmazonSqsNotificationTypeResponse`. If the actual instance is not `AmazonSqsNotificationTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AmazonSqsNotificationTypeResponse`
     * @throws ClassCastException if the instance is not `AmazonSqsNotificationTypeResponse`
     */
    public AmazonSqsNotificationTypeResponse getAmazonSqsNotificationTypeResponse() throws ClassCastException {
        return (AmazonSqsNotificationTypeResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AmazonSqsPrincipalAuthNotificationTypeResponse`. If the actual instance is not `AmazonSqsPrincipalAuthNotificationTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AmazonSqsPrincipalAuthNotificationTypeResponse`
     * @throws ClassCastException if the instance is not `AmazonSqsPrincipalAuthNotificationTypeResponse`
     */
    public AmazonSqsPrincipalAuthNotificationTypeResponse getAmazonSqsPrincipalAuthNotificationTypeResponse() throws ClassCastException {
        return (AmazonSqsPrincipalAuthNotificationTypeResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AzureServiceBusTypeResponse`. If the actual instance is not `AzureServiceBusTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AzureServiceBusTypeResponse`
     * @throws ClassCastException if the instance is not `AzureServiceBusTypeResponse`
     */
    public AzureServiceBusTypeResponse getAzureServiceBusTypeResponse() throws ClassCastException {
        return (AzureServiceBusTypeResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EmailNotificationTypeResponse`. If the actual instance is not `EmailNotificationTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EmailNotificationTypeResponse`
     * @throws ClassCastException if the instance is not `EmailNotificationTypeResponse`
     */
    public EmailNotificationTypeResponse getEmailNotificationTypeResponse() throws ClassCastException {
        return (EmailNotificationTypeResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SmsNotificationTypeResponse`. If the actual instance is not `SmsNotificationTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SmsNotificationTypeResponse`
     * @throws ClassCastException if the instance is not `SmsNotificationTypeResponse`
     */
    public SmsNotificationTypeResponse getSmsNotificationTypeResponse() throws ClassCastException {
        return (SmsNotificationTypeResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WebhookNotificationTypeResponse`. If the actual instance is not `WebhookNotificationTypeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookNotificationTypeResponse`
     * @throws ClassCastException if the instance is not `WebhookNotificationTypeResponse`
     */
    public WebhookNotificationTypeResponse getWebhookNotificationTypeResponse() throws ClassCastException {
        return (WebhookNotificationTypeResponse)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NotificationTypeResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AmazonSqsNotificationTypeResponse
    try {
      AmazonSqsNotificationTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AmazonSqsNotificationTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AmazonSqsPrincipalAuthNotificationTypeResponse
    try {
      AmazonSqsPrincipalAuthNotificationTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AmazonSqsPrincipalAuthNotificationTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AzureServiceBusTypeResponse
    try {
      AzureServiceBusTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AzureServiceBusTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EmailNotificationTypeResponse
    try {
      EmailNotificationTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EmailNotificationTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SmsNotificationTypeResponse
    try {
      SmsNotificationTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SmsNotificationTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with WebhookNotificationTypeResponse
    try {
      WebhookNotificationTypeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WebhookNotificationTypeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for NotificationTypeResponse with oneOf schemas: AmazonSqsNotificationTypeResponse, AmazonSqsPrincipalAuthNotificationTypeResponse, AzureServiceBusTypeResponse, EmailNotificationTypeResponse, SmsNotificationTypeResponse, WebhookNotificationTypeResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of NotificationTypeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationTypeResponse
  * @throws IOException if the JSON string is invalid with respect to NotificationTypeResponse
  */
  public static NotificationTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationTypeResponse.class);
  }

 /**
  * Convert an instance of NotificationTypeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

