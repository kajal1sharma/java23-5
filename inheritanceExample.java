class Car {
    int tyre;
    int window;

    Car() {
        System.out.println("this is a car default constructor");
    }

    Car(int a, int b) {
        this.tyre = a;
        this.window = b;
        System.out.println("this is a car para constructor");
    }
}

class TataMotorsCars extends Car {
    int dashboard;
    int ac;

    TataMotorsCars() {

        System.out.println("this is a tata cars default construct");
    }

    TataMotorsCars(int a, int b) {
        System.out.println("this is a tata cars parameterized construct");
    }

    TataMotorsCars(int a, int b, int c, int d) {
        super(c, d);
        dashboard = a;
        ac = b;
        System.out.println("this is a tata cars parameterized construct");
        // tyre = c;
        // window = d;
    }
}

public class inheritanceExample {
    public static void main(String[] args) {
        TataMotorsCars obj = new TataMotorsCars(12, 13, 45, 65);
    }
}
