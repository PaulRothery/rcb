package com.rcb.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalTime;

public class TimeHandler extends StdDeserializer<LocalTime> {

    public TimeHandler() {
        this(null);
    }


    public TimeHandler(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public LocalTime deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {

        String time = jsonParser.getText();
        LocalTime localTime = LocalTime.parse(time);
        return localTime;



    }
}
