package tudor.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tudor.practice.Ex1.Dish;

public class Ex10 implements Ex {

    @Override
    public void test(){

        final Map<Boolean,List<Dish>> pratitioningResult = Dish.getDishes()
        .stream()
        .collect(Collectors.partitioningBy((Dish d)-> d.isVegetarian()));

        pratitioningResult.forEach((k, v) -> System.out.println("key: " + k + "\nValues: " + v));

    }
    
}
