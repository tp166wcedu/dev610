package w4;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        smallestLargest(scanner);
    }

    public static void smallestLargest(Scanner scanner) {
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.println("You must enter a number greater than 0.");
            return;
        }

        System.out.print("Number 1: ");
        int number = scanner.nextInt();
        int smallest = number;
        int largest = number;

        for (int i = 2; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            number = scanner.nextInt();

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

}
