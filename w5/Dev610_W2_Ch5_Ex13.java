package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex13 {
    public static void main(String[] args) {
        System.out.println(consecutive(1, 2, 3));
        System.out.println(consecutive(3, 2, 4));
        System.out.println(consecutive(-10, -8, -9));
        System.out.println(consecutive(3, 5, 7));
        System.out.println(consecutive(1, 2, 2));
        System.out.println(consecutive(7, 7, 9));
    }

    public static boolean consecutive(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = (a + b + c) - (max + min);
        return (max - mid == 1 && mid - min == 1);
    }
}

