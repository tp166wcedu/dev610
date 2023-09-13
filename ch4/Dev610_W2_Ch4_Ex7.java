package ch4;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        evenSumMax(scanner);
    }

    public static void evenSumMax(Scanner scanner) {
        System.out.print("How many integers? ");
        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.println("You must enter a number greater than 0.");
            return;
        }

        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;
        for (int i = 1; i <= count; i++) {
            System.out.print("Next integer? ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;

                if (number > evenMax) {
                    evenMax = number;
                }
            }
        }
        System.out.println("Even sum = " + evenSum + ", even max = " + evenMax);
    }

}
