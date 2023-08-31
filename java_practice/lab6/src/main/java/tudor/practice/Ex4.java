package tudor.practice;

import java.util.stream.Collectors;

import tudor.practice.Ex1.Dish;

public class Ex4 implements Ex {
    
    @Override
    public void test(){
                System.out.println("Statisticile caloriilor: " +
            Dish.getDishes().stream().collect(Collectors.summarizingInt(Dish::getCalories))
        );

    }
}
