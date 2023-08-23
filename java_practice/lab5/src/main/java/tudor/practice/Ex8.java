package tudor.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Ex8 implements Ex {

    @Override
    public void test() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(9);

        List<List<Integer>> mergedList = Stream.of(list1, list2, list3).collect(Collectors.toList());

        
        mergedList.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }

}
