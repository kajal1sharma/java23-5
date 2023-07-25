package abc.inheritance;

public class Child extends Base {

    void printInfo(){
        System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
    public static void main(String[] args) {
        Child c=new Child();
        c.printInfo();
    }
    
}
