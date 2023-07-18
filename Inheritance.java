
class Parent {
    int x;
    int y;
    int z;
    int land;

    // this => the current object that is calling a fucntion or constructor

    Parent() {

    }

    Parent(int x, int y, int z, int land) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.land = land;
    }

    Parent(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
}

class Child extends Parent {
    // int x;
    // int y;
    // int z;
    // int land;
    int cars;
    int phones;
    int flat;

    Child(int x, int y, int z, int land, int cars, int phones, int flat) {
        // super(x, y, z);
        // super();
        // this.x = x;
        // this.y = y;
        // this.z = z;
        // this.land = land;
        this.cars = cars;
        this.phones = phones;
        this.flat = flat;
    }

    void printInfo() {
        System.out.println(x);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Parent(10, 20, 30, 40);
        Child c = new Child(10, 20, 30, 40, 50, 60, 70);
        p.x = 100;
        c.x = 200;
        c.printInfo();

    }
}
