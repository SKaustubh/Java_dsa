package recurrsion;

import java.util.Scanner;

public class fibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which you want to generate fibonacci series");
        int n = sc.nextInt();
        System.out.println("fibonnaci sum=" + fibo(n));
        sc.close();
    }

    public static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);

    }
}
