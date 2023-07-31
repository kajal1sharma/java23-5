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
    public static void main(String[] args)  {
        try{
        
            doSomething();
        }
        catch(FileNotFoundException e){
            // System.out.println(e.getMessage());
                try{
                FileInputStream fs= new FileInputStream("Arrays5.java");
                }
                catch( Exception ee){
                    System.out.println("it did not work");
                }
        }
    }
}
