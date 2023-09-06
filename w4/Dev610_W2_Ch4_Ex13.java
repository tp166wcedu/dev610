package w4;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    public static void printPalindrome(Scanner scanner) {
        System.out.print("Please enter one or more words to check if it's a palindrome: ");
        String input = scanner.nextLine();
        String lowerInput = input.toLowerCase(); // Convert to lower case for case-insensitivity

        boolean isPalindrome = true;
        int length = lowerInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (lowerInput.charAt(i) != lowerInput.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

}
