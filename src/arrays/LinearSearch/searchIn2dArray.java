package arrays.LinearSearch;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] a = {
                {2, 4, 6, 193},
                {12, 34, 12, 78, 4},
                {2, 7, 45, 13}
        };
        int target = 78;
        int[] ans = search(a, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(a));
    }

    static int[] search(int[][] a, int t) {

        for (int r = 0; r < a.length; r++) {

            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] == t) {
                    return new int[]{r, c};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int max(int[][] a) {
        int m = Integer.MIN_VALUE;
        for (int r = 0; r < a.length; r++) {

            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] > m) {
                    m = a[r][c];
                }
            }
        }

        return m;
    }
}
