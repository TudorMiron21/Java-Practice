package tudor.practice;

import java.util.*;
import java.util.stream.Stream;

public class Ex9 implements Ex {
    @Override
    public void test() {
        Stream<Integer> stream = Stream.iterate(0, i -> true, i -> i + 2).limit(20);
        stream.forEach(System.out::println);
    }

}
