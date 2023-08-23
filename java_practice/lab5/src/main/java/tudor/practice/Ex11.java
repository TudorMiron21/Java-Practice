package tudor.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex11 implements Ex {

    @Override
    public void test() {
        List<String> listaCuvinte = new ArrayList<>();

        listaCuvinte.add("mere");
        listaCuvinte.add("pere");
        listaCuvinte.add("banana");
        listaCuvinte.add("mere");
        listaCuvinte.add("portocala");
        listaCuvinte.add("kiwi");
        listaCuvinte.add("capsuni");
        listaCuvinte.add("banana");

        listaCuvinte.stream()
                .collect(Collectors.toSet())
                .stream()
                .filter((String s) -> s.length()>4)
                .findAny()
                .ifPresent((String s)->System.out.println("exista cuvinte cu mai mult de 4 caractere si acela este " + s));

    }

}
