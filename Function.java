import java.util.Scanner;

public class Function {
    // no any function can be defined inside any other function
    public static void print123() {
        System.out.println("hi iam very first function in java");
        System.out.println("hello world");
        System.out.println("123456");
    }// function definition

    public static int sum() {
        System.out.println("==============Add Two number===============");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter number one");
        a = sc.nextInt();
        System.out.println("enter second number ");
        b = sc.nextInt();
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        print123();// function call

        int a1 = sum();
        System.out.println("value of a " + a1);
        int b1 = sum();
        System.out.println("value of b " + b1);
        int c1 = sum();
        System.out.println("value of c " + c1);
        int sum_all = a1 + b1 + c1;
        System.out.println("addition of all numbers" + sum_all);

    }

}
