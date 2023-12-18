package arrays.BinarySearch;

public class smallestLetter {
    public static void main(String[] args) {
        char[] a = {'c', 'f', 'j'};

        char t = 'j';
        char ans = nextGreatestLetter(a, t);
        System.out.println("index of ceiling number is " + ans);


    }

    static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return letters[start % letters.length];

    }
}
