package arrays.BinarySearch;

public class binary {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        int[] ar = {100, 99, 88, 77, 66, 55, 44, 33, 22, 11};
        int t = 88;
        int ans = binarySearch(a, t);
        System.out.println(ans);
        System.out.println(binarySearch2(ar, t));


    }

    // binary search for ascending order
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;

    }

    // binary search for descending order
    static int binarySearch2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;

    }
}
