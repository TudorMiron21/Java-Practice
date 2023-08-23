package tudor.practice.Ex1;

import tudor.practice.Ex;

public class Ex1 implements Ex {

    @Override
    public void test() {
        MathOperation adunare = (Integer a, Integer b) -> a + b;
        MathOperation scadere = (Integer a, Integer b) -> a - b;
        MathOperation inmultire = (Integer a, Integer b) -> a * b;
        MathOperation impartire = (Integer a, Integer b) -> a / b;

        System.out.println(calculate(10, 5, adunare));
        System.out.println(calculate(10, 5, scadere));
        System.out.println(calculate(10, 5, inmultire));
        System.out.println(calculate(10, 5, impartire));

    }

    static public Integer calculate(int a, int b, MathOperation op) {

        return op.operation(a, b);
    }

}
