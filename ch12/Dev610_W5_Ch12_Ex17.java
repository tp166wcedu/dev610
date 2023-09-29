package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex17 {

    public static void main(String[] args) {
        // Test cases
        System.out.println(permut(7, 4));
        System.out.println(permut(6, 3));
        System.out.println(permut(10, 3));
        System.out.println(permut(5, 2));
        System.out.println(permut(8, 0));
    }

    public static int permut(int n, int r) {
        if (r == 0) {
            return 1;
        }
        return n * permut(n - 1, r - 1);
    }

}

