package tudor.practice;

import tudor.practice.exercise1.*;
import tudor.practice.exercise2.*;
import tudor.practice.exercise3.*;
import tudor.practice.exercise4.*;
import tudor.practice.exercise6.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {


        //
        Exercise1 ex1 = new Exercise1();
        ex1.test();


        //
        try {
            Exercise2 ex2 = new Exercise2();
            ex2.test();
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println(
                    "Hey man, this is not a valid index for the array given. This is the message error" + ioobe);
        }


        //
        Exercise3 ex3 = new Exercise3();
        ex3.test();


        //
        try{
            Exercise4 ex4 = new Exercise4();
            ex4.test();
        }
        catch(ArithmeticException ae){
            System.out.println("divide by 0 error");
            ae.printStackTrace();
        }
        finally{
            System.out.println("this executes no matter what");
        }


        Exercise6 ex6 = new Exercise6();
        ex6.test();
    }
}
