package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(25);
        System.out.println(list);

        // iteration

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // output

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " , ");
        }

        System.out.println(list);
    }
}
