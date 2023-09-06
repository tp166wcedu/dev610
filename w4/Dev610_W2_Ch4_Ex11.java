package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex11 {
    public static void main(String[] args) {
        System.out.println(pow2(-4.0, 3));
        System.out.println(pow2(4.0, -2));
    }

    public static double pow2(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        double result = 1.0;
        int positiveExponent = Math.abs(exponent);

        for (int i = 1; i <= positiveExponent; i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1.0 / result;  // For negative exponent, return reciprocal
        } else {
            return result;
        }
    }
}
