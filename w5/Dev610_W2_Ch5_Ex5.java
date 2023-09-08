package w5;

import java.util.Random;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex5 {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        Random rand = new Random();
        int numLines = 5 + rand.nextInt(6);

        for (int i = 0; i < numLines; i++) {
            int length = rand.nextInt(81);
            for (int j = 0; j < length; j++) {
                char c = (char) ('a' + rand.nextInt(26));
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
