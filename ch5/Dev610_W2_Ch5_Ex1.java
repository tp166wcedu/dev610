package ch5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex1 {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(33);
        showTwos(68);
        showTwos(80);
        showTwos(120);
    }

    public static void showTwos(int n) {
        System.out.print(n + " = ");
        while (n % 2 == 0) {
            System.out.print("2 * ");
            n = n / 2;
        }
        System.out.println(n);
    }
}
