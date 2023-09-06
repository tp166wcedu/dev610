package w3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex7 {
    public static void main(String[] args) {
        System.out.println(largestAbsVal(7, -2, -11));
        System.out.println(largestAbsVal(-4, 5, 2));
    }

    public static int largestAbsVal(int a, int b, int c) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int absC = Math.abs(c);
        return Math.max(Math.max(absA, absB), absC);
    }
}
