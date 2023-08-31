package jackson.Ex3;

import jackson.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class Ex3 implements Ex {

    @Override
    public void test() throws IOException,JsonMappingException,JsonProcessingException{

        InputStream is = Ex3.class.getResourceAsStream("./circleArray.json");

        ObjectMapper om = new ObjectMapper();

        CollectionType collection = om.getTypeFactory().constructCollectionType(List.class, Circle.class);
        List<Circle> circles = om.readValue(is,collection);

        circles.forEach(System.out::println);
    }
    
    
}
