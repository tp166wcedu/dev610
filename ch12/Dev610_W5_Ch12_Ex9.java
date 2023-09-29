package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex9 {

    public static void main(String[] args) {
        try {
            System.out.println(sumTo(2));
            System.out.println(sumTo(0));
            System.out.println(sumTo(-1));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        } else if (n == 0) {
            return 0.0;
        } else {
            return 1.0 / n + sumTo(n - 1);
        }
    }

}

