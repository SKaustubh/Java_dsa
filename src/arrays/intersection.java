package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class intersection {
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

        ArrayList<Integer> ans = interOptimal(a, b);


        System.out.print(Arrays.toString(a) + "+" + Arrays.toString(b) + "=");

        for (Integer auto : ans) {
            System.out.print(" " + auto);
        }
    }

    public static ArrayList<Integer> interOptimal(int[] array1, int[] array2) {
        int n = array1.length;
        int m = array2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array1[j]) {
                j++;
            } else {
                ans.add(array1[i]);
                i++;
                j++;
            }
        }

        return ans;
    }
}
