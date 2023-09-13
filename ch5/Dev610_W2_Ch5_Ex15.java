package ch5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex15 {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(7, 4, 10));
        System.out.println(hasMidpoint(9, 15, 8));
        System.out.println(hasMidpoint(3, 3, 3));
    }

    public static boolean hasMidpoint(int a, int b, int c) {
        return (a + b) / 2.0 == c ||
                (a + c) / 2.0 == b ||
                (b + c) / 2.0 == a;
    }
}

