package tudor.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Ex7 implements Ex {

    @Override
    public void test() {
        List<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(5); // Duplicat
        lista.add(20);
        lista.add(10); // Duplicat

        Integer sumaPatrate = lista.stream()
                .collect(Collectors.toSet())
                .stream()
                .map((Integer i) -> i * i)
                .reduce(0, Integer::sum);
                
        System.out.println(sumaPatrate);

    }

}
