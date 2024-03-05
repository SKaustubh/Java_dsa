package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:-");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> ans;
        ans = permut(arr);
        for (List<Integer> it : ans) {
            for (Integer auto : it) {
                System.out.print(auto + " ");

            }
            System.out.println();
        }

        sc.close();
    }

    public static List<List<Integer>> permut(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        ArrayList<Integer> ds = new ArrayList<>();
        permtation(nums, freq, ans, ds);
        return ans;
    }

    public static void permtation(int[] nums, boolean[] freq, List<List<Integer>> ans, ArrayList ds) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permtation(nums, freq, ans, ds);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
