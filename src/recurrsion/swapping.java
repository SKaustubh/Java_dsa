package recurrsion;

import java.util.Arrays;

import java.util.Scanner;


public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:-");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(Arrays.toString(a));

        fun(0, a, n);
        System.out.println(Arrays.toString(a));
        sc.close();
    }

    public static void fun(int i, int[] arr, int n) {
        if (i >= n / 2) return;
        swap(arr, i, n - i - 1);
        fun(i + 1, arr, n);
    }

    public static void swap(int[] a, int f, int l) {
        int t = a[f];
        a[f] = a[l];
        a[l] = t;
    }
}
