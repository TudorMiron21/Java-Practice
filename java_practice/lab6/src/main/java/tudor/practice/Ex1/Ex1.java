package tudor.practice.Ex1;

import tudor.practice.Ex;
import java.util.stream.Collectors;
public class Ex1 implements Ex {
    
    @Override
    public void test(){

        System.out.println(
            Dish.getDishes().stream().collect(Collectors.counting())
        );
    }

}
