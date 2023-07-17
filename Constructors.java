import java.util.Scanner;

class Vehicle {
    int x = 90;
    int y = 98;
    float f;
    String name;

    // default constructor doesnot have any parameters
    Vehicle() {// Vehicle()
        x = 90;
        y = 70;
        f = 90.8f;
        name = "riya";
    }

    Vehicle(int a) {// vehilcle(int)
        x = a;
    }

    Vehicle(int a, int b) {// Vehiclle(int , int)
        x = a;
        y = b;

    }

    Vehicle(int a, int b, float ff) {// Vehicle(int , int , float)

        y = b;
        f = ff;
        x = a;
    }

    Vehicle(int ab, float ff, int b) {// Vehicle(int , int , float)

        y = b;
        f = ff;
        x = ab;
    }

    // function signature => name of the fnction(types of the parameter)

    public void printInfo() {// printInfo()
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(name);
    }

    public void sum(int a, float b, char c) {// sum(int, float, char)

    }

}

public class Constructors {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(12, 34);
        Vehicle v2 = new Vehicle(89, 68, 78.8f);
        Vehicle v3 = new Vehicle();

        Scanner sc = new Scanner(System.in);

    }
}
