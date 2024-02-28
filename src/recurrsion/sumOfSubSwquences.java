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
        System.out.println("second output:-any one subsquence");
        boolean bs = oneSubSequencePrint(0, ds, 0, sum, arr, n);
        System.out.println(bs);

        System.out.println("third output:-number of subsequences");
        int k = subsequencesumK(0, 0, sum, arr, n);
        System.out.println(k);
        sc.close();

    }

    // function to print all the subsequences equal to sum
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

    // function to print only one subsequences equal to sum

    static boolean oneSubSequencePrint(int ind, ArrayList<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {

                for (Integer it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
                return true;

            }
            return false;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        if (oneSubSequencePrint(ind + 1, ds, s, sum, arr, n) == true) return true; //take
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        if (oneSubSequencePrint(ind + 1, ds, s, sum, arr, n) == true) return true;
        return false;// delete
    }

    // number of subsequences
    static int subsequencesumK(int ind, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }


        s += arr[ind];
        int l = subsequencesumK(ind + 1, s, sum, arr, n); //take
        s -= arr[ind];

        int r = subsequencesumK(ind + 1, s, sum, arr, n);
        return l + r;// delete
    }
}
