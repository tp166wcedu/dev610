package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex6 {
    public static void main(String[] args) {
        System.out.println(largerAbsVal(11, 2));
        System.out.println(largerAbsVal(4, -5));
    }

    public static int largerAbsVal(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        return Math.max(absA, absB);
    }
}
