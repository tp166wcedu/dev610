package ch3;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputBirthday(scanner);
    }

    public static void inputBirthday(Scanner scanner) {
        System.out.print("On what day of the month were you born? ");
        int day = scanner.nextInt();

        scanner.nextLine();

        System.out.print("What is the name of the month in which you were born? ");
        String month = scanner.nextLine();

        System.out.print("During what year were you born? ");
        int year = scanner.nextInt();

        System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
    }

}
