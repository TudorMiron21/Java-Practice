package tudor.practice;

import java.util.Arrays;
import java.util.List;

public class Ex3 implements Ex {
    
    @Override
    public void test(){
        List<String> list = Arrays.asList("string1","string2","string3","string4","string5");
        System.out.println(list.get(2));
    }
}
