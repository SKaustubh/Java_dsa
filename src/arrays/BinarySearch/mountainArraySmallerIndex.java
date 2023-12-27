package arrays.BinarySearch;

public class mountainArraySmallerIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int t = 3;
        System.out.print(search(arr, t));


    }


    static int search(int[] arr, int target) {
        int peak = findInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        int secondTry = OrderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        if (firstTry != -1) {
            return firstTry;
        }

        return secondTry;

    }


    static int binarySearch(int[] arr, int target, int start, int end) {

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

    static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

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

    static public int findInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans ,but look at left
                // this is why end!=mid-1
                end = mid;
            } else {

                // you are in the ascending part of array
                start = mid + 1; // because we know mid+1 element > mid element

            }
        }

        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always  trying to find max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one because that is what the check say
        // more elaboration : at every point of time for start and end , they have the best possible answer at that time
        // and if we are saying that only one item is remaining ,hence cuz of above line that is the best possible ans
        return start;

    }
}
