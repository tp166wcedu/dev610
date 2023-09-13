package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex1 {
    public static void main(String[] args) {
        System.out.println("The sum of the first " + 5 + " terms is: " + fractionSum(5));
        System.out.println("The sum of the first " + 10 + " terms is: " + fractionSum(10));
    }

    public static double fractionSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
