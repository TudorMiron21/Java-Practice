package tudor.practice;

import java.util.stream.Collectors;

import tudor.practice.Ex1.Dish;

public class Ex6 implements Ex {
    @Override
    public void test() {
        System.out.println("Suma caloriilor: " +
                Dish.getDishes()
                        .stream()
                        .collect(Collectors.reducing(0, Dish::getCalories, Integer::sum)));

    }

}
