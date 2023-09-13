package ch4;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printGPA(scanner);
    }

    public static void printGPA(Scanner scanner) {
        System.out.print("Enter a student record: ");
        String input = scanner.nextLine();

        Scanner lineScanner = new Scanner(input);
        String name = lineScanner.next();
        int numScores = lineScanner.nextInt();

        double sum = 0;
        for (int i = 0; i < numScores; i++) {
            int score = lineScanner.nextInt();
            sum += score;
        }

        double average = sum / numScores;
        System.out.println(name + "'s grade is " + average);
    }

}
