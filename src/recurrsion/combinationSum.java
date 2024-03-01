package recurrsion;

import java.util.*;

public class combinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:-");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.print("enter the target:-");
        int target = sc.nextInt();


        List<List<Integer>> result1 = combinationS(arr, target);
        List<List<Integer>> result2 = combinationSum2(arr, target);

        for (List<Integer> it : result1) {
            System.out.print(it);
        }
        System.out.println();
        System.out.println("ans for combination sum 2:");
        for (List<Integer> it : result2) {
            System.out.print(it);
        }
        sc.close();
    }

    public static List<List<Integer>> combinationS(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // pick case
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1); // for removing last value in the backtracking
        }

        // not pick case
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations2(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations2(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {

            if (target == 0) {
                ans.add(new ArrayList<>(ds));
                return;
            }


        // pick case
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations2(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1); // for removing last value in the backtracking
        }


    }
}
