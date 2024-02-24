package recurrsion;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String s=sc.nextLine();
//        System.out.println("enter your starting value");
//        int i=sc.nextInt();
        System.out.println("enter the number of times you want your name to be printed");
        int n = sc.nextInt();
//        name(i,n,s);
//        number(n);
//        numB(n,n);
        revB(1, n);
        sc.close();
    }

//    print  n number of times your name
//    public static void name(int i,int n,String s){
//        if(i>n){
//            return;
//        }
//        System.out.println(s);
//        name(i+1,n,s);
//
//    }
//        print  n in reverse order
//    public static void number(int n){
//        if(n==0)
//            return;
//        System.out.println(n);
//        number(n-1);
//
//    }

//    print n in linear order 1 to n using backtracking

//            public static void numB(int i,int n){
//                if(i<1){
//                    return;
//                }
//                numB(i-1,n);
//                System.out.println("n " +i+" ");
//            }

//            print n in reverse order using backtrack

    public static void revB(int i, int n) {
        if (i > n) {
            return;
        }
        revB(i + 1, n);
        System.out.println(i);
    }
}



