package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex9 {
    public static void main(String[] args) {
        System.out.printf("%.2f", distance(1, 0, 4, 4));
        System.out.println();
        System.out.printf("%.2f", distance(10, 2, 3, 5));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
