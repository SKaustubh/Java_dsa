package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class seconLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int[] ans = new int[2];
        ans = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int[] ans = new int[2];
        ans[0] = secL(n, a);
        ans[1] = secS(n, a);
        return ans;

    }

    public static int secL(int n, int[] a) {
        int largest = a[0];
        int secondl = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                secondl = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondl) {
                secondl = a[i];
            }
        }
        return secondl;

    }

    public static int secS(int n, int[] a) {
        int lowest = a[0];
        int sLowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < lowest) {
                sLowest = lowest;
                lowest = a[0];
            } else if (a[i] != lowest && a[i] < sLowest) {
                sLowest = a[i];
            }
        }
        return sLowest;

    }
}
