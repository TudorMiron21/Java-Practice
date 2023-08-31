package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex1 implements Ex {

    @Override
    public void test() {
        String jsonVal = "{\"radius\":5,\"color\":\"RED\"}";

        ObjectMapper om = new ObjectMapper();

        try{
        Circle circle =  om.readValue(jsonVal, new TypeReference<Circle>(){});
                System.out.println(circle);

        }
        catch(JsonMappingException jme){
            System.out.println("");
        }
        catch(JsonProcessingException jpe)
        {
            System.out.println("");
        }

    }
    
}
