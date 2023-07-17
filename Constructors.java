import java.util.Scanner;

class Account {
    private int accountNumber;
    private int balance;

    public void changeBalance(int acc, int bal) {
        if (acc == 1234) {
            balance = bal;
        } else {
            balance = 0;
        }
    }

    public void printAccountInfo() {
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}

class Vehicle {
    private int x = 90;
    private int y = 98;
    private float f;
    private String name;

    // default constructor doesnot have any parameters
    Vehicle() {

    }
    // Vehicle() {// Vehicle()
    // x = 90;
    // y = 70;
    // f = 90.8f;
    // name = "riya";
    // }

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

    Vehicle(int ab, float ff, int b, String s) {// Vehicle(int , int , float)

        y = b;
        f = ff;
        x = ab;
        name = s;
    }
    // function signature => name of the fnction(types of the parameter)

    public void printInfo() {// printInfo()
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(name);
    }

    public void sum(int a, float b, char c) {// sum(int, float, char)
        Account aobj = new Account();
        aobj.changeBalance(1234, 34234);
        aobj.printAccountInfo();
    }

}

public class Constructors {
    public static void main(String[] args) {
        Account a = new Account();
        a.changeBalance(345354, 4545);
        a.changeBalance(1234, 60000);
        Vehicle v1 = new Vehicle(12, 34);

        Vehicle v2 = new Vehicle(89, 68, 78.8f);
        String s = "sdfsedF";
        Vehicle v3 = new Vehicle(34, 45.45f, 454, s);
        v1.printInfo();
        v2.printInfo();
        v3.printInfo();
        v1.sum(89, 89.78f, 'a');
        // Scanner sc = new Scanner();

    }
}
