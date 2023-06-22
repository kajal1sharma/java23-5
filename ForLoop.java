public class ForLoop {

    public static void main(String[] args) {

        // int i = 0;
        // do {
        // i = i + 1;
        // System.out.println("hello world");

        // } while (i < 5);

        for (int i = 0; i < 5; i++) {

            // spaces
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // int i = 0;
        // int a = 90;
        // int b = 80;
        // int sum = a + b;

        // while (i < 20) {
        // i = i + 1;
        // System.out.println("hello world");
        // if (i == 10) {
        // break;
        // }

        // }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // rows
        // for (int i = 1; i <= 5; i++) {

        // // stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 100=1+2+3+...100

        // int totalSum = 0;

        // for (int table = 1; table <= 5; table++) {

        // for (int i = 1; i <= 5; i++) {
        // totalSum = totalSum + i * table;
        // }
        // }
        // System.out.println(totalSum);

        // for (int i = 1; i <= 100; i = i + 1) {
        // totalSum = totalSum + i;

        // }
        // System.out.println(totalSum);
        // int sum = 0;
        // for (int i = 1; i <= 10; i = i + 1) {

        // sum = sum + i * 7;

        // }
        // System.out.println(sum);

        // // for (int a = 0; a < 5; a = a + 2) {
        // // System.out.println("hello world");
        // // }

        // int sum2 = 0;
        // for (int i = 0; i <= 70; i = i + 1) {
        // if (i % 7 == 0) {
        // sum2 = sum2 + i;
        // // System.out.println(i);
        // }
        // }
        // System.out.println(sum2);

        // effcient
        // for (int a = 7; a <= 70; a = a + 7) {
        // System.out.println(a);
        // }
    }
}
