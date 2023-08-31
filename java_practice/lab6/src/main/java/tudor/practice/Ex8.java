package tudor.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tudor.practice.Ex1.Dish;

public class Ex8 implements Ex {
    
    public enum CaloricLevel {
        Diet,
        Normal,
        Fat
    };

    @Override
    public void test(){
        Map<CaloricLevel,List<Dish>> groupingResult = 
        Dish.getDishes()
        .stream()
        .collect(Collectors.groupingBy(
            d->{
                if(d.getCalories() <= 400)
                    return CaloricLevel.Diet;
                else if(d.getCalories() > 400 && d.getCalories()<=700)
                    return CaloricLevel.Normal;
                else if(d.getCalories() > 700)
                    return CaloricLevel.Fat;   
                else 
                    return null;
        })); 

        groupingResult.forEach((k,v)->System.out.println("key: " + k + "\nValues: " + v ));
    }
}
