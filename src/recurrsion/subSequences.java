package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(Arrays.toString(a));
        ArrayList<Integer> ds = new ArrayList<>();
        sub(0, ds, a, n);
        sc.close();
    }

    static void sub(int ind, ArrayList<Integer> ds, int[] arr, int n) {

        if (ind == n) {
            for (Integer it : ds) {
                System.out.print(it + " ");
            }
            if (ds.isEmpty()) {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }

        ds.add(arr[ind]);
        sub(ind + 1, ds, arr, n); //take
        ds.remove(ds.size() - 1);
        sub(ind + 1, ds, arr, n); // delete

    }
}
