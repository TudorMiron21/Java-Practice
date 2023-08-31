package tudor.practice;

import java.util.Comparator;
import java.util.stream.Collectors;
import tudor.practice.Ex1.Dish;

public class Ex2 implements Ex {

    @Override
    public void test() {
        Comparator<Dish> comp = Comparator.comparing(Dish::getCalories);

        System.out.println( "MAX: " +
                Dish.getDishes().stream().collect(Collectors.maxBy(comp)));

        System.out.println("MIN: "+
                Dish.getDishes().stream().collect(Collectors.minBy(comp)));

    }
}
