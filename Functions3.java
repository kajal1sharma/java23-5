public class Functions3 {

    // public static int greatestOfThree(int a, int b, int c) {
    // if (a > b && a > c) {
    // return a;
    // } else if (b > a && b > c)
    // return b;
    // else if (c > a && c > b)
    // return c;
    // else
    // return -1;

    // }

    // public static int sumOfDigits(int a) {

    // int sum = 0;
    // while (a != 0) {
    // int mod = a % 10;
    // sum = sum + mod;
    // a = a / 10;
    // }

    // return sum;

    // }

    // static public int addArrayEle(int[] arr) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum = sum + arr[i];
    // }
    // return sum;
    // }

    // static public int[] doubleArr(int[] brr) {

    // int crr[] = new int[brr.length];

    // for (int i = 0; i < crr.length; i++) {
    // crr[i] = brr[i] * 2;
    // }

    // return crr;
    // }

    static public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static public void sum3(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    static public void sum4(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println(sum);
    }

    public static void sumRest(int size, int... nums) {

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        // int arr[] = new int[Integer.MAX_VALUE];
        int a = 90;
        int b = 80;
        int c = 70;
        int d = 60;
        int e = 50;
        sumRest(1, a);
        sumRest(2, a, b);
        sumRest(3, a, b, c);
        sumRest(4, a, b, c, d);
        sumRest(5, a, b, c, d, e);

        // int arr[] = { 1, 2, 3, 4, 5, 67, 7 };

        // int darr[] = doubleArr(arr);

        // for (int i = 0; i < darr.length; i++) {
        // System.out.println(darr[i]);
        // }
        // for (int ele : darr) {
        // System.out.println(ele);
        // }

        // int sum = addArrayEle(arr);

        // int num = 345345;
        // int result = sumOfDigits(num);

        // System.out.println(result);

        // input => 3 numbers => return heighest of all
        // int a = 90;
        // int aa = 899;
        // int aaa = 6767;
        // int result = greatestOfThree(a, aa, aaa);
        // System.out.println(result);
    }
}
