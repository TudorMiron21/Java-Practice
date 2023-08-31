package tudor.practice;

import java.util.Map;
import java.util.stream.Collectors;

import tudor.practice.Ex1.Dish;
import tudor.practice.Ex1.DishType;

public class Ex9 implements Ex {

    @Override
    public void test() {
        Map<DishType, Long> groupingResult = Dish.getDishes()
                .stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        groupingResult.forEach((k, v) -> System.out.println("key: " + k + "\nValues: " + v));

    }
}
