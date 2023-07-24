class Base {
    int a;
    int b;
    int c;

    void xyz(){
        System.out.println("Hello this is xyz function in base class");
    }
    void pqr(){
        System.out.println("hello this is pqr function in base class");
    }
}
class Child extends Base{
    int r ;
    
    void xyz(){
        System.out.println("Hello this is xyz function in child class");
    }
     void pqr(){
        System.out.println("hello this is pqr function in child class");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Base obj = new Base();
        // obj.xyz();
        // obj.pqr();
        // Child  cobj= new Child();
        // cobj.xyz();
        // cobj.pqr();
        Base ref = new Child();
        ref.xyz();
        ref.pqr();
        // cobj.pqr();
    }
}
