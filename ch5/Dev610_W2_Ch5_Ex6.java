package ch5;

import java.util.Random;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex6 {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random rand = new Random();
        int guess;
        int totalGuesses = 0;

        do {
            guess = 1 + rand.nextInt(50);
            System.out.println("guess = " + guess);
            totalGuesses++;
        } while (guess < 48);

        System.out.println("total guesses = " + totalGuesses);
    }
}
