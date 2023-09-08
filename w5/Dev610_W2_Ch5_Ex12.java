package w5;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex12 {
    public static void main(String[] args) {
        printAverage();
    }

    public static void printAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Type a number: ");
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            sum += input;
            count += 1;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average was " + average);
        }
    }
}

