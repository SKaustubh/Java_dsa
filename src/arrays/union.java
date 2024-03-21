package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array:=-");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of first array:=-");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println("enter the size of Second array:=-");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("enter the elements of Second array:=-");
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        // TreeSet for unique and ordered set

        TreeSet<Integer> ans = union(a, b);

        System.out.print(Arrays.toString(a) + "+" + Arrays.toString(b) + "=");
        for (Integer auto : ans) {
            System.out.print(" " + auto);
        }


    }

    public static TreeSet<Integer> union(int[] array1, int[] array2) {
        TreeSet<Integer> ans = new TreeSet<>();

        for (int i = 0; i < array1.length; i++) {
            ans.add(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            ans.add(array2[j]);
        }
        return ans;
    }
}
