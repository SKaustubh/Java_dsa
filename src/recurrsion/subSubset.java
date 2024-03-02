package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class subSubset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:-");
        int n = sc.nextInt();
        System.out.println("enter the elements:-");
        ArrayList<Integer> ds = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            ds.add(element);
        }
        for (Integer it : ds) {
            System.out.print(it + " ");
        }
        System.out.println();
        System.out.println("sum=>");
        ArrayList<Integer> ans;
        ans = subsetSum(ds, n);
        for (Integer it : ans) {
            System.out.print(it + " ");
        }

        sc.close();
    }

    static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        sub(0, 0, arr, sumSubset, N);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    static void sub(int ind, int sum, ArrayList<Integer> arr, ArrayList<Integer> ds, int N) {
        if (ind == N) {
            ds.add(sum);
            return;
        }
        //picking it up
        sub(ind + 1, sum + arr.get(ind), arr, ds, N);
        //not picking it up;
        sub(ind + 1, sum, arr, ds, N);
    }
}
