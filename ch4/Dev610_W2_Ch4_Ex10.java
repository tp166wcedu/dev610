package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex10 {
    public static void main(String[] args) {
        double result = average(5, 7);
        System.out.println("The average is: " + result);
    }

    public static double average(int a, int b) {
        return (double) (a + b) / 2;
    }
}
