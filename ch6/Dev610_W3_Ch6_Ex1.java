package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex1.txt"))) {
            boyGirl(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void boyGirl(Scanner scanner) {
        int boysSum = 0;
        int girlsSum = 0;
        int boysCount = 0;
        int girlsCount = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                if (boysCount > girlsCount) {
                    girlsSum += scanner.nextInt();
                    girlsCount++;
                } else {
                    boysSum += scanner.nextInt();
                    boysCount++;
                }
            } else {
                scanner.next();
            }
        }

        System.out.println(boysCount + " boys, " + girlsCount + " girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(boysSum - girlsSum));
    }
}

