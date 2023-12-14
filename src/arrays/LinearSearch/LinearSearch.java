package arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

        int[] a = {1, 56, 82, 13, 56, 24, 67, 13, 8, 5};
        int target = 24;
        int ans = linearSearch(a, target);
        System.out.println(ans);
    }

    // search in the array

    static int linearSearch(int[] a, int target) {
        if (a.length == 0) {
            return -1;
        }

        // loop
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            if (element == target)
                return i;
        }
        // target not found
        // if we are returning element rather than index than we will return Integer.MAX_VALUE
        return -1;
    }
}
