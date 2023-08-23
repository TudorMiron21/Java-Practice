package tudor.practice.exercise2;
import tudor.practice.*;

public class Exercise2 implements Exercise{
    

    @Override
    public void test() throws IndexOutOfBoundsException{// basicaly the test function says "i am not responsible for handling this type of error"

        int []v = new int[5];
        v[6] = 6;
    }
}
