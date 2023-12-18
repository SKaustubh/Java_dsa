package arrays.BinarySearch;

public class floor {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};

        int t = 15;
        int ans = floorNumber(a, t);
        System.out.println(a[ans]);


    }

    // return the index:greatest number <=target
    static int floorNumber(int[] arr, int target) {
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
        return end;

    }
}
