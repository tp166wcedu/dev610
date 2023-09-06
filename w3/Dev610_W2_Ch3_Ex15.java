package w3;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processName(scanner);
    }

    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length < 2) {
            System.out.println("Error: Please enter your first and last name separated by a space.");
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];
        System.out.println("Your name in reverse order is " + lastName + ", " + firstName);
    }

}
