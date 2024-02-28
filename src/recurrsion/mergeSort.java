package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:-");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, n);
        System.out.println("After sorting array: ");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] ds, int n) {
        mS(ds, 0, n - 1);
    }

    static void mS(int[] ds, int low, int high) {

        if (low == high) return;
        int mid = (low + high) / 2;
        mS(ds, low, mid);
        mS(ds, mid + 1, high);
        merge(ds, low, mid, high);
    }

    static void merge(int[] ds, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;


        //storing elements in the temporary array in a sorted manner//
        while (left <= mid && right <= high) {
            if (ds[left] <= ds[right]) {
                temp.add(ds[left]);
                left++;
            } else {
                temp.add(ds[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(ds[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(ds[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            ds[i] = temp.get(i - low);
        }


    }
}
