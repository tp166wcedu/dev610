package ch5;

import java.util.Random;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diceSum(scanner);
    }

    public static void diceSum(Scanner scanner) {
        System.out.print("Desired dice sum: ");
        int desiredSum = scanner.nextInt();

        Random rand = new Random();

        int sum = 0;
        while (sum != desiredSum) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            sum = die1 + die2;

            System.out.println(die1 + " and " + die2 + " = " + sum);
        }
    }
}

