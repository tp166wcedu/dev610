package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex4 {
    public static void main(String[] args) {
        System.out.println(customPow(3, 4));
        System.out.println(customPow(2, 5));
        System.out.println(customPow(5, 0));
        System.out.println(customPow(7, 2));
    }

    public static int customPow(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
