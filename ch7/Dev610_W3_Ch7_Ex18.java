package ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex18 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("ch7/data/W3_Ch7_Ex18.txt"));
            wordLengths(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void wordLengths(Scanner scanner) {
        int[] lengthCounts = new int[81];
        int maxWordLength = 0;

        while (scanner.hasNext()) {
            String word = scanner.next();
            int length = word.length();
            lengthCounts[length]++;
            if (length > maxWordLength) {
                maxWordLength = length;
            }
        }

        for (int i = 1; i <= maxWordLength; i++) {
            System.out.print(i + ": " + lengthCounts[i] + "\t");
            for (int j = 0; j < lengthCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

