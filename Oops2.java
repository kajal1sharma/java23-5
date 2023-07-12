class Car2 {// bnding data members and member func together is called as encapsulation
    int tyres = 4;// properteis/data members
    int window = 4;
    int cost = 200000;

    // member functions/methods
    public void printInfo() {
        System.out.println(tyres);
        System.out.println(window);
        System.out.println(cost);
    }

    public void add() {

    }
}

public class Oops2 {
    public static void main(String[] args) {

        Car2 obj1 = new Car2();
        obj1.cost = 50000;
        obj1.tyres = 8;
        obj1.window = 10;
        Car2 obj2 = new Car2();
        obj2.cost = 100000;
        obj2.tyres = 10;
        obj2.window = 20;
        obj1.printInfo();
        System.out.println("=================================");
        obj2.printInfo();

        Vehicle v = new Vehicle();
        // Car2 obj = new Car2();
        // Car2 obj2;
        // obj2 = obj;
        // obj.tyres = 16;
        // obj2.tyres = 8;
        // obj2.printInfo();
        // System.out.println(obj.tyres);
        // System.out.println(obj.window);

        // System.out.println(obj.cost);
    }
}

class Vehicle {
    int cost;
    String id;

}