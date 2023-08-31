package restful;

import java.util.ArrayList;
import java.util.List;

public class Tools {
    
    public static List<Human> getPeople(){

        List<Human> humanList = new ArrayList<>();

        // Adding Human instances to the list
        humanList.add(new Human(1, "Alice", 25, 'F'));
        humanList.add(new Human(2, "Bob", 30, 'M'));
        humanList.add(new Human(3, "Eve", 22, 'F'));
    
        return humanList;
    }
}
