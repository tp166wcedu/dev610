package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex14 {
    public static final int NUM_LINES = 4;

    public static void main(String[] args) {
        for (int line = 1; line <= NUM_LINES; line++) {
            printCustomPattern();
            System.out.println();
        }
    }

    public static void printCustomPattern() {
        int[] repetitions = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int digit = 9; digit >= 0; digit--) {
            for (int count = 0; count < repetitions[9 - digit]; count++) {
                System.out.print(digit);
            }
        }
    }

}
