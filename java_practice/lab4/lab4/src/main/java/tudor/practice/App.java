package tudor.practice;

import java.util.*;

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

        // new Ex1().test();
        // new Ex3().test();
        // new Ex4().test();
        // new Ex5().test();
        // new Ex6().test();

        // Ex ex9 = () -> {
        //     List<String> list = new LinkedList();

        //     list.add("Ana1");
        //     list.add("Ana2");
        //     list.add("Ana3");
        //     list.add("Ana4");

        //     list.forEach((String s) -> System.out.println(s));

        //     Collections.shuffle(list);

        //     list.forEach((String s) -> System.out.println(s));
        // };
        // ex9.test();

        // new Ex() {
        //     @Override
        //     public void test() {

        //         List<Square> list = Arrays.asList(new Square("green", 3.0),
        //                 new Square("yellow", 4.0),
        //                 new Square("black", 2.6),
        //                 new Square("green", 1.7));

        //         list.stream().forEach((s)-> System.out.println(s));

        //         // Comparator<Square> comp = Comparator.comparing(Square::getArea);
        //         Comparator<Square> comp = (Square s1, Square s2) -> s1.getArea().compareTo(s2.getArea());

        //         Collections.sort(list,comp);

        //         list.stream().forEach((s)-> System.out.println(s));

        //     }
        // }.test();


        Ex ex13 = ()->{

            Set<Integer> treeSet = new TreeSet<>();
            treeSet.add(12);
            treeSet.add(33);
            treeSet.add(49);
            treeSet.add(52);
            treeSet.add(87);
            treeSet.add(1);
            treeSet.add(18);
            treeSet.add(92);
            treeSet.add(65);
            treeSet.add(21);

            treeSet.stream().filter((Integer i)-> i== 1).findFirst().ifPresent((Integer i) -> System.out.println(i));

        };
        


    }
}
