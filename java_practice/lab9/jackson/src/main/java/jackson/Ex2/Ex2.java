package jackson.Ex2;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import jackson.Ex;
import jackson.Circle;

public class Ex2 implements Ex {

    @Override
    public void test() throws IOException,JsonMappingException,JsonProcessingException{

        
        InputStream is = Ex2.class.getResourceAsStream("./circle.json");
        ObjectMapper om = new ObjectMapper();

        Circle circle = om.readValue(is,Circle.class);

        System.out.println(circle);
      
    }
}
