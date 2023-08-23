package tudor.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex3 implements Ex {

    @Override
    public void test() {
        List<String> list = Arrays.asList("Java", "Scala", "C++", "Haskel", "Lisp");

        Predicate<String> cond1 = (String s) -> s.startsWith("J", 0);
        Predicate<String> cond2 = (String s) -> s.endsWith("a");
        Predicate<String> cond3 = s -> true;
        Predicate<String> cond4 = s -> false;

        System.out.println("--------");
        filter(list, cond1);
        System.out.println("--------");
        filter(list, cond2);
        System.out.println("--------");
        filter(list, cond3);
        System.out.println("--------");
        filter(list, cond4);

    }

    static public void filter(List<String> list, Predicate<String> condition) {
        list.stream().filter(condition).forEach((String s) -> System.out.println(s));
    }
}
