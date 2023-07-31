import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {

    public static void doSomething() throws ArithmeticException,FileNotFoundException{
        doSomethingMore();

    }
    public static void doSomethingMore() throws FileNotFoundException{
        doSomethingEvenMore();
    }
    public static void doSomethingEvenMore() throws FileNotFoundException{
        FileInputStream fs= new FileInputStream("abc.txt");
    }
    public static void main(String[] args) throws FileNotFoundException {
        doSomething();
    }
}
