package tudor.practice;

import java.util.ArrayList;
import java.util.List;

public class Ex5 implements Ex {
    @Override
    public void test() {

        List<String> lista = new ArrayList<>();

        // Adaugă elemente în listă
        lista.add("a");
        lista.add("ab");
        lista.add("abc");
        lista.add("abcd");
        lista.add("abcde");
        lista.add("abcdef");
        lista.add("abcdefg");
        lista.add("abcdefgh");

        lista.stream().filter(s -> s.length() > 2).forEach(System.out::println);
    }

}
