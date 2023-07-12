import java.util.Scanner;

public class Functions {

    // public static void add() {
    // System.out.println("enter values");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println(sum);
    // }

    static void dosomething() {
        System.out.println("iam line 1");
        dosomethingMore();
        System.out.println("hi iam line 2");

    }

    static void dosomethingMore() {
        System.out.println("iam line 3");
        dosomethingEvenMore();
        System.out.println("hi iam line 4");
    }

    static void dosomethingEvenMore() {
        System.out.println("iam line 5");
    }

    public static void main(String[] args) {

        dosomething();
        System.out.println("hello world");
    }
}
