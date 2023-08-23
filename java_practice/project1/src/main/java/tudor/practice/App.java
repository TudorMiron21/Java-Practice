package tudor.practice;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // List<Integer> intList = new ArrayList<Integer>();
        // intList.add(2);
        // intList.add(12);
        // intList.add(4);
        // intList.add(25);
        // intList.add(3);
        // intList.add(23);

        

        List<Integer> intList = Arrays.asList(1,2,423,1,3,89,1,8);

        System.out.println(intList);

        Predicate<Integer> myFirstPredicate = n -> n % 2 == 0;

        Stream<Integer> myFirstStream = intList.stream().filter(myFirstPredicate);

        myFirstStream.forEach(n -> System.out.println(n));
    }
}
