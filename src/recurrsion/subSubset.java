package recurrsion;

import java.util.*;

public class subSubset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:-");
        int n = sc.nextInt();
        System.out.println("enter the elements:-");

//        calling of first type subset program starts
//        ArrayList<Integer> ds = new ArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            int element = sc.nextInt();
//            ds.add(element);
//        }
//        for (Integer it : ds) {
//            System.out.print(it + " ");
//        }
//        System.out.println();
//        System.out.println("sum=>");
//        ArrayList<Integer> ans;
//        ans = subsetSum(ds, n);
//        for (Integer it : ans) {
//            System.out.print(it + " ");
//        }

        System.out.println("ans for second type subset:-");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        List<List<Integer>> ansL;
        ansL = subsetsWithDup(nums);

        // Iterate and print all elements
        for (List<Integer> innerList : ansL) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
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


//    Given an integer array nums that may contain duplicates, return all possible
//    subsets
//            (the power set).
//
//    The solution set must not contain duplicate subsets. Return the solution in any order.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,2]
//    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [[],[0]]

    static public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSub(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void findSub(int ind, int[] nums, ArrayList<Integer> ds, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            findSub(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
