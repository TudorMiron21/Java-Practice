package tudor.practice;

import tudor.practice.Ex1.Dish;
import java.util.stream.Collectors;
public class Ex5 implements Ex {

    @Override
    public void test(){

        System.out.println("litsa numelor dishurilor: "+
            Dish.getDishes().stream().map(Dish::getName).collect(Collectors.joining(", "))
        );
    }
    
}
