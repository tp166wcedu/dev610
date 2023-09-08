package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex16 {
    public static void main(String[] args) {
        System.out.println(monthApart(4, 15, 5, 22));
        System.out.println(monthApart(9, 19, 10, 17));
    }

    public static boolean monthApart(int m1, int d1, int m2, int d2) {
        if (Math.abs(m1 - m2) > 1) {
            return true;
        } else if (m1 == m2) {
            return false;
        } else {
            if (m1 < m2) {
                return d1 < d2;
            } else {
                return d2 < d1;
            }
        }
    }
}

