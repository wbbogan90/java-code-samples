package net.blueensign.jackson;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDeserializerTest {
    
    @Test
    public void verifyJson() throws StreamReadException, DatabindException, IOException{
        ObjectMapper mapper = JacksonDeserializer.getMapper();
        InputStream jsonStream = JacksonDeserializerTest.class.getClassLoader().getResourceAsStream("test_pojo.json");
        SamplePojo pojo = mapper.readValue(jsonStream, SamplePojo.class);
        Assertions.assertTrue(pojo.getLabel().equals("This is a test POJO"));
    }
}
