package tudor.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex4 implements Ex {

    @Override
    public void test(){

        List<String> list = Arrays.asList("Harmony","Serendipity","Labyrinth","Cascade","Jubilant","Tranquil","Whimsical","Euphoria","Mellifluous","Ethereal");

        list.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
    
}
