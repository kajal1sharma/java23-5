
class Calculator{
    void add(int a , int b){//add(int ,int)
        System.out.println("with two int arg");
    }
    void add(int a, int b, int c){//add(int, int , int)
        System.out.println("calling func with 3 int argumnets");
    }
    void add(float a, float b, float c){//add(float, float, float)
        System.out.println("calling function with 3 float arg");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        c.add(12, 23, 45);
        c.add(34,34);
        c.add(34.34f, 34.34f, 65.56f);

    }
}
