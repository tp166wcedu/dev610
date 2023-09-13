package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex2 {
    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }

    public static void printPowersOf2(int max) {
        int value = 1;
        for (int i = 0; i <= max; i++) {
            System.out.print(value + " ");
            value *= 2;
        }
        System.out.println();
    }
}
