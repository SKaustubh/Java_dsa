package arrays.BinarySearch;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        int t = 88;
        int ans = binarySearch(a, t);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isASc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }


        }
        return -1;

    }
}
