package jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@FunctionalInterface
public interface Ex {
    
    public void test()throws JsonMappingException,JsonProcessingException,IOException;

}
