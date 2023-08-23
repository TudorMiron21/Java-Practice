package tudor.practice;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        

        //this is an example of an anonymus class that extends the book class
        Book b = new Book(1,"name","author") {
            
            @Override
            public void printSmth(){
                System.out.println("that is an anonymus class");
            }
        };


        Reader r = new Reader(){
            public void read(Integer printValue){
                System.out.println("that is an anonymus class that implements the reader interface"+ printValue);
            }
        };

        Reader reader = (Integer printValue)->System.out.println("hello" + printValue);


        b.printSmth();

        r.read(5);
        reader.read(3);
    }


}
