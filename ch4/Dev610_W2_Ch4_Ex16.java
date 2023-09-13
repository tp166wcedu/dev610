package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex16 {
    public static void main(String[] args) {
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(4.5, -4.5));
        System.out.println(quadrant(15.5, 41.5));
        System.out.println(quadrant(-15.5, -41.5));
        System.out.println(quadrant(0, 0));
    }

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
