package tudor.practice;

import tudor.practice.Ex1.*;
import tudor.practice.Ex2.*;
import tudor.practice.Ex12.*;

import java.util.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        // new Ex1().test();
        // new Ex2().test();

        Ex ex3 = () -> {

            List<String> list = Arrays.asList("Java", "Scala", "C++", "Haskel", "Lisp");

        };
        new Ex3().test();

        new Ex4().test();
        new Ex5().test();
        new Ex6().test();
        new Ex7().test();
        new Ex8().test();
        new Ex9().test();
        new Ex10().test();
        new Ex11().test();
        new Ex12().test();


    }

}
