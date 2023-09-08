package w5;

import java.util.Random;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex8 {
    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random rand = new Random();
        int position = 0;
        int maxPosition = 0;
        while (Math.abs(position) < 3) {
            System.out.println("position = " + position);
            if (rand.nextBoolean()) {
                position++;
            } else {
                position--;
            }

            if (position > maxPosition) {
                maxPosition = position;
            }
        }
        System.out.println("position = " + position);
        System.out.println("max position = " + maxPosition);
    }
}

