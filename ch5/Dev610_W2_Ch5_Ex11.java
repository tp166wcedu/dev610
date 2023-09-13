package ch5;

import java.util.Random;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex11 {
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads() {
        Random rand = new Random();
        int consecutiveHeads = 0;
        while (consecutiveHeads < 3) {
            boolean isHead = rand.nextBoolean();

            if (isHead) {
                System.out.print("H ");
                consecutiveHeads++;
            } else {
                System.out.print("T ");
                consecutiveHeads = 0;
            }
        }
        System.out.println();
        System.out.println("Three heads in a row!");
    }
}

