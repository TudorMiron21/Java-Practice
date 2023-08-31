package jackson.Ex4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jackson.*;

public class Ex4 implements Ex {

    @Override
    public void test() throws JsonMappingException, JsonProcessingException, IOException {

        Circle circle = new Circle(1, "RED");
        ObjectMapper om = new ObjectMapper();

        try (OutputStream os = new FileOutputStream("./circleOut.json")) {
            om.writeValue(os, circle);
        }
    }
}
