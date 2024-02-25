package recurrsion;

public class sumOfn {
    public static void main(String[] args) {
        sum(3, 0);
        System.out.println("factorial=" + fact(3));

    }

    public static void sum(int i, int s) {
        if (i < 1) {
            System.out.println("sum=" + s);
            return;
        }
        sum(i - 1, s * i);
    }

    public static int fact(int i) {
        if (i < 1) {

            return 1;
        }
        return i * fact(i - 1);
    }
}
