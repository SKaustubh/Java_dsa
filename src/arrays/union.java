package arrays;

import java.util.ArrayList;
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
        ArrayList<Integer> ansOptimal = unionOptimal(a, b);

        System.out.print(Arrays.toString(a) + "+" + Arrays.toString(b) + "=");

        // for brute
        for (Integer auto : ans) {
            System.out.print(" " + auto);
        }
        System.out.println();


        // for optimal soln
        for (Integer auto1 : ansOptimal) {
            System.out.print(" " + auto1);
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

    public static ArrayList<Integer> unionOptimal(int[] array1, int[] array2) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n1 = array1.length;
        int n2 = array2.length;

        while (i < n1 && j < n2) {

            // inputing for array1
            if (array1[i] <= array2[j]) {

                if (ans.size() == 0 || ans.get(ans.size() - 1) != array1[i]) {
                    ans.add(array1[i]);
                }
                i++;
            }

            // inputing for array2
            else {

                if (ans.size() == 0 || ans.get(ans.size() - 1) != array2[j]) {
                    ans.add(array2[j]);
                }
                j++;
            }
        }

        // if i iteration exhausts or it is over before complete iteration of j
        while (j < n2) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != array2[j]) {
                ans.add(array2[j]);
            }
            j++;
        }

        // if j iteration exhausts or it is over before complete iteration of i
        while (i < n1) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != array1[i]) {
                ans.add(array1[1]);
            }
            i++;
        }

        return ans;
    }
}
