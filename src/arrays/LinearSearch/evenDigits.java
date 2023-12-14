package arrays.LinearSearch;

public class evenDigits {


    public static void main(String[] args) {
        int[] n = {10, 2000, 2345, 673};
        System.out.println(findNumbers(n));
        System.out.println(digits2(12378));
    }

    static int findNumbers(int[] n) {
        int c = 0;

        for (int num : n) {
            if (even(num)) {
                c++;
            }
        }
        return c;
    }

    // function to check whether the number contains even number or not
    static boolean even(int n) {

        int numOFdigits = digit(n);
        return numOFdigits % 2 == 0;
    }

    static int digits2(int n) {
        return (int) (Math.log10(n)) + 1;
    }

    static int digit(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }
}
