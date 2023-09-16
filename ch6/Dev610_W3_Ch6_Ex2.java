package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex2.txt"))) {
            evenNumbers(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void evenNumbers(Scanner scanner) {
        int totalNumbers = 0;
        int sum = 0;
        int evenCount = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                totalNumbers++;
                sum += number;
                if (number % 2 == 0) {
                    evenCount++;
                }
            } else {
                scanner.next();
            }
        }
        double evenPercent = 100.0 * evenCount / totalNumbers;
        System.out.println(totalNumbers + " numbers, sum = " + sum);
        System.out.println(evenCount + " evens (" + String.format("%.2f", evenPercent) + "%)");
    }
}

