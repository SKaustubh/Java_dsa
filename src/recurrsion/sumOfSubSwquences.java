package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sumOfSubSwquences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size:-");
        int n = sc.nextInt();
        System.out.print("enter the array elements:-");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("resultant subsequences=>");

        ArrayList<Integer> ds = new ArrayList<>();
        int sum = 2;
        fn(0, ds, 0, sum, arr, n);
        sc.close();

    }

    static void fn(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                System.out.print("[" + " ");
                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
                System.out.print("]");
                System.out.println();

            }
            return;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        fn(ind + 1, ds, s, sum, arr, n); //take
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        fn(ind + 1, ds, s, sum, arr, n); // delete


    }
}
