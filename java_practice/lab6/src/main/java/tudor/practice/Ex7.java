package tudor.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tudor.practice.Ex1.*;

public class Ex7 implements Ex{

    @Override
    public void test(){
        
        Map<DishType,List<Dish>> groupResult = Dish.getDishes()
        .stream()
        .collect(Collectors.groupingBy(Dish::getType));

        
        groupResult.forEach((k,v)->System.out.println("key: " + k + "\nValues: " + v ));
        
    }
    
}
