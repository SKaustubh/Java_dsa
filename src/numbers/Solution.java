package numbers;


public class Solution {

    public static void main(String[] args) {


        // Write your code here.
        int n = 3;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {

                    sum = sum + j;

                }

            }

        }

        System.out.println(sum);


    }
}



