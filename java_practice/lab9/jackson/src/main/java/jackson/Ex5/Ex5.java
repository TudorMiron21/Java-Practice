package jackson.Ex5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jackson.*;

public class Ex5 implements Ex {

    @Override
    public void test() throws JsonMappingException, JsonProcessingException, IOException {

        ObjectMapper om = new ObjectMapper();

        ObjectNode node = om.createObjectNode();

        node.put("is", 100);
        node.put("email", "tudormiron19@gamil.com");
        node.put("faculty", "fsisc");
        node.put("yearOfStudy", 3);

        try (OutputStream os = new FileOutputStream("circleOut.json")) {
            om.writeValue(os, node);
        }
    }
}
