package tudor.practice.Ex2;
import tudor.practice.Ex;
public class Ex2 implements Ex{

    @Override 
    public void test(){

        Greetings g1 = System.out::println;
        Greetings g2 = (String s) -> System.out.println("MESSAGE"+s.toUpperCase());
        Greetings g3 = (String s) -> System.out.println("message "+s.toLowerCase());

        String message = "Ce Mult Imi Place Java";

        g1.say(message);
        g2.say(message);
        g3.say(message);

    }

}
