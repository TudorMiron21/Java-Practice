package tudor.practice;

import tudor.practice.Ex1.Dish;
import java.util.stream.Collectors;
public class Ex3 implements Ex {
    
    @Override
    public void test(){

        System.out.println("Suma caloriilor: " +
            Dish.getDishes().stream().collect(Collectors.summingInt(Dish::getCalories))
        );

                System.out.println("Media caloriilor: " +
            Dish.getDishes().stream().collect(Collectors.averagingInt(Dish::getCalories))
        );

    }
}
