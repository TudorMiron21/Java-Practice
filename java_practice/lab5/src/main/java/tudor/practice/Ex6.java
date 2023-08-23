package tudor.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 implements Ex {

    @Override
    public void test() {
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("Go");
        lista.add("Ruby");

        List<String> upperList = lista.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        upperList.forEach(System.out::println);
    }
}
