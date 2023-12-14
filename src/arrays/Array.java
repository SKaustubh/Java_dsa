package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }

        //output
        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));


        }

        int[][] a = {
                {2, 1, 5},
                {67, 45, 3, 7},
                {3, 4, 7, 1, 10, 11}
        };

        for (int[] ints : a) {

            System.out.println(Arrays.toString(ints));


        }


    }
}
