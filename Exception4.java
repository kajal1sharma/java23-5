import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

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


        //price >50,000
        try{
            int price =0;
            Scanner sc= new Scanner(System.in);
            price= sc.nextInt();
            if(price>50000){
               throw new Exception("price cannot be this high");
            }
            else{
                price=price*100;
            }
            int q=90+80;
            System.out.println("hello world");
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
        int a=90+90;
        System.out.println(a);


        // try{
        
        //     doSomething();
        // }
        // catch(FileNotFoundException e){
        //     // System.out.println(e.getMessage());
        //         try{
        //         FileInputStream fs= new FileInputStream("Arrays5.java");
        //         }
        //         catch( Exception ee){
        //             System.out.println("it did not work");
        //         }
        // }
    }
}
