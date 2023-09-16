package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex3.txt"))) {
            negativeSum(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void negativeSum(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            int step = 0;
            int sum = 0;
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    int number = lineScanner.nextInt();
                    sum += number;
                    step++;
                    if (sum < 0) {
                        System.out.println("sum of " + sum + " after " + step + " steps");
                        break;
                    }
                } else {
                    lineScanner.next();
                }
            }
            if (sum >= 0) {
                System.out.println("no negative sum");
            }
            lineScanner.close();
        }
    }
}

