package tudor.practice.exercise3;

import tudor.practice.Exercise;

public class Exercise3 implements Exercise {

    @Override
    public void test() {
        Shape square = new Square("green", false, 3.2);

        Shape circle = new Circle("blue", true, 2.0);

        Shape rectangle = new Rectangle("black", false, 2.0, 2.0);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
    }

}
