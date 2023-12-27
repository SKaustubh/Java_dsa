package arrays.BinarySearch;

public class mountain {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 6, 4, 3, 1};
        System.out.print(arr[peakIndexInMountainArray(arr)]);
    }

    static public int peakIndexInMountainArray(int[] arr) {
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
