package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex16 {
    public static void main(String[] args) {
        int numLines = 6;

        for (int line = 0; line < numLines; line++) {
            for (int i = 0; i < line * 2; i++) {
                System.out.print("\\");
            }
            for (int i = 0; i < 22 - line * 4; i++) {
                System.out.print("!");
            }
            for (int i = 0; i < line * 2; i++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
