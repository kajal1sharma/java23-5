import java.io.FileInputStream;



public class Exception3 {


    // static  void divide() throws ArithmeticException{
    //     int a =90;
    //     int b=a/0;
    // }
    // static void fileIO() throws FileNotFoundException{
    //     int a =0;
    //     int b=89;
    // }
    static void doSomething() throws Exception{
        FileInputStream fs = new FileInputStream("abc.txt");
        fs.close();
    }
    public static void main(String[] args) {
       try{
            doSomething();
       }
       catch(Exception e){
        
       }
       
       
        //checked unchecked 
        // divide();
        // try{
        //     fileIO();
        // }
        // catch(Exception e){

        // }
        
    }
}
