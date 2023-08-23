package tudor.practice;

import java.util.ArrayList;
import java.util.List;

public class Ex10 implements Ex {
    
    @Override
    public void test(){

        List<String> listaCuvinte = new ArrayList<>();
        
        listaCuvinte.add("mere");
        listaCuvinte.add("pere");
        listaCuvinte.add("banana");
        listaCuvinte.add("portocala");
        listaCuvinte.add("kiwi");
        listaCuvinte.add("capsuni");
        listaCuvinte.add("cirese");
        listaCuvinte.add("ananas");

        String result = listaCuvinte.stream()
        .map(String::toUpperCase)
        .filter((String s) -> s.startsWith("A") || s.startsWith("B"))
        .findFirst()
        .orElse("none");
        

        System.out.println(result);
    }
}
