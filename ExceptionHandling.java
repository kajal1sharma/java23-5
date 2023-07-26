import java.io.FileNotFoundException;

class Car{
    int x;
    int y;

 }

public class ExceptionHandling {
    public static void main(String[] args) {
    
        try{
            Car obj =new Car();
           // obj=null;
            System.out.println(obj.x);
            
            int a=90;
            int b=34;
            int ans=a+b;
            System.out.println(ans);
            int arr[]=new int [5];
            arr[6]=67;
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception");
        }
        catch(ArithmeticException e){
            int a=90;
            System.out.println("arith,emti c exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("exception is handled");
        }

        // int i;
        // int a =90;
        // int b=0;
        //  i=a/b;



    //   for(i=0;i<10;i++){
    //     System.out.println("hello world" );
    //   }  
    }
}
