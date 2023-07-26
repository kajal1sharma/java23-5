
public class Exception2 {
    
    public static void doSomethingEvenMore(){
        System.out.println("line 7");
        int a =90/0;//exc
        System.out.println("line 8");
    }
    public static void dosomethingmore(){
        System.out.println("line 5");
        doSomethingEvenMore();
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
