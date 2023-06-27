import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        // {{0,0,0},{0,0,0},{0,0,0}}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // int[][] arr = new int[2][3];
        // arr[0][0] = 12;
        // arr[0][1] = 13;
        // arr[0][2] = 14;

        // arr[1][0] = 54;
        // arr[1][1] = 67;
        // arr[1][2] = 89;

        // // int[] num = { 12, 1, 31, 4, 15 };
        // int[][] arr2 = { { 12, 13, 14, 15, 16 }, { 67, 68, 69 }, { 45, 46, 47, 48,
        // 49, 50 }, { 89, 87, 67, 56 } };

        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {
        // if (arr2[i][j] % 2 == 0) {
        // System.out.print(arr2[i][j] + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {

        // System.out.print(arr2[i][j] + " ");
        // }
        // System.out.println();

        // }

    }
}
