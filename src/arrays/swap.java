package arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7};
        System.out.println("original array");
        System.out.println(Arrays.toString(a));


        swapping(a, 1, 3);
        System.out.println("Swapped array");
        System.out.println(Arrays.toString(a));
        System.out.println("reverse of my array");
        rev(a);
        System.out.println(Arrays.toString(a));
    }

    static void swapping(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static void rev(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            // swap
            swapping(a, start, end);
            start++;
            end--;
        }

    }
}
