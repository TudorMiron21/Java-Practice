package jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import jackson.Ex2.*;
import jackson.Ex3.*;
import jackson.Ex4.*;

import jackson.Ex5.*;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {

        // new Ex1().test();
        //testExercises(new Ex2());
        // testExercises(new Ex3());
        //testExercises(new Ex4());
        testExercises(new Ex5());

    }

    private static void testExercises(Ex testFunc) {

        try {
            testFunc.test();
        } catch (JsonMappingException jme) {
            jme.printStackTrace();
        } catch (JsonProcessingException jpe) {
            jpe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
