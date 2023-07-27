
public class Exception2 {
    
    public static void doSomethingEvenMore(){
        System.out.println("line 7");
        try{
            int a =90/0;//exc
        }
        catch(Exception e){

        }
       
    }
    public static void dosomethingmore(){
        System.out.println("line 5");
        try{
            doSomethingEvenMore();
        }
        catch(Exception e){
            
        }
        System.out.println("line 6");
    }
    public static void dosomething(){
        System.out.println("line 3");
        dosomethingmore();
        System.out.println("line 4");
    }
    public static void main(String[] args) {
        System.out.println("lline 1");
        dosomething();
        System.out.println("line 2");
    }
}
