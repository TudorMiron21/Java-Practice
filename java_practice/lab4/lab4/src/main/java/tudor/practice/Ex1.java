package tudor.practice;
import java.util.*;

public class Ex1 implements Ex{
    
    @Override
    public void test(){

        List<String> list = Arrays.asList("string1","string2","string3","string4","string5");

        list.forEach(System.out::println);
        
    }

}
