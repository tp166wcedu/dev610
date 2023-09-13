package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex13 {
    public static final int NUM_LINES = 5;
    public static final int NUM_DIGITS = 10;
    public static final int REPEAT_DIGIT = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= NUM_LINES; i++) {
            for (int j = NUM_DIGITS - 1; j >= 0; j--) {
                for (int k = 1; k <= REPEAT_DIGIT; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

}
