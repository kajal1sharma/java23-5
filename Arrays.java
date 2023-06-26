import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // to get input in arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter eleent " + i);
            arr[i] = sc.nextInt();
        }

        // show output

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // int[] nums = new int[5];
        // nums[0] = 67;
        // nums[1] = 90;
        // nums[2] = 78;
        // nums[3] = 70;
        // nums[4] = 34;
        // // nums[5] = 78;

        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);
        // System.out.println(nums[4]);
        // System.out.println(nums[5]);

        // float[] nums2 = new float[5];
        // nums2[0] = 12.23f;
        // nums2[1] = 45.45f;
        // nums2[2] = 12.23f;
        // nums2[3] = 45.45f;
        // nums2[4] = 12.23f;

        // // System.out.println(nums2.length);
        // for (int i = 0; i < nums2.length; i++) {// i => index
        // float temp = nums2[i];
        // System.out.println(temp);
        // }

        // float sum = 0f;

        // // for each
        // for (float temp : nums2) {
        // sum = sum + temp;
        // }
        // System.out.println(sum);

    }
}
