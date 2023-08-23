package tudor.practice;

import java.util.*;

public class Ex6 implements Ex{
    
    @Override
    public void test(){
        LinkedList<String> list = new LinkedList();
        list.add("ana");
        list.add("are");
        list.add("mere");
        list.add("verzi");


        Iterator<String> it = list.descendingIterator();

        while(it.hasNext())
            System.out.println(it.next());
     
    }
}
