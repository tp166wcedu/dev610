package w5;

import java.util.Random;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex4 {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random rand = new Random();
        int length;

        do {
            length = 5 + rand.nextInt(16);  // Random length between 5 and 20
            for (int i = 0; i < length; i++) {
                System.out.print("x");
            }
            System.out.println();
        } while (length < 16);
    }
}
