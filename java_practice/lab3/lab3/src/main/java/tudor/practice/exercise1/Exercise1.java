package tudor.practice.exercise1;
import tudor.practice.Exercise;

public class Exercise1 implements Exercise {
    
    @Override
    public  void test(){

        Author a = new Author("florin tiriac", "florin_tiriac@gamil.com", 'M');
        Book b = new Book("Cartea carte", a, 12.4, 2);
        System.out.println(b.toString()); 

    } 
}
