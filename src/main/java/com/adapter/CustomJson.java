package com.adapter;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.util.ISO8601DateFormat;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;


public final class CustomJson {

    private CustomJson() {
    }


    public static class Deserializer extends JsonDeserializer<Date> {
        @Override
        public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            // return jp.getText();
            return null;
        }
    }

    public static class Serializer extends JsonSerializer<Date> {
        @Override
        public void serialize(Date date, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            String formattedValue;
            ISO8601DateFormat.getInstance();
            formattedValue = ISO8601DateFormat.getInstance().format(date);

            jgen.writeString(formattedValue);
        }
    }
}