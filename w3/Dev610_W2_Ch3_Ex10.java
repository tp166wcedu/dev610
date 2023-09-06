package w3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex10 {
    public static void main(String[] args) {
        System.out.printf("%.1f", scientific(6.23, 5));
        System.out.println();
        System.out.printf("%.3f", scientific(1.9, -2));
    }

    public static double scientific(double base, int exponent) {
        return base * Math.pow(10, exponent);
    }
}
