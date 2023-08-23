package tudor.practice;

import java.util.ArrayList;
import java.util.List;

public class Ex4 implements Ex {
    
    @Override
    public void test(){
        List<String> lista = new ArrayList<>();
        
        // Adaugă elemente în listă
        lista.add("Java");
        lista.add("");
        lista.add("Python");
        lista.add("");
        lista.add("C++");

        long result = lista.stream().filter((String s)-> s.isEmpty()).count();
        System.out.println(result);

    }

}
