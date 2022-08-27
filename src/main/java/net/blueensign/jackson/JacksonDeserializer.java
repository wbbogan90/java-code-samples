package net.blueensign.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JacksonDeserializer {
    private static ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        JavaTimeModule jtModule = new JavaTimeModule();
        MAPPER.registerModule(jtModule);
    }

    public static ObjectMapper getMapper() {
        return MAPPER;
    }
}
