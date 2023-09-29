package ch13.ex14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch13_Ex14 {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> dictionary = loadDictionary("ch13/data/W5_Ch13_Ex14.txt");
        System.out.println(dictionary);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type two words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        scanner.close();

        int pos1 = Collections.binarySearch(dictionary, word1);
        int pos2 = Collections.binarySearch(dictionary, word2);
        if (pos1 < 0 || pos2 < 0) {
            System.out.println("One or both words not found in the dictionary.");
            return;
        }
        int wordsBetween = Math.abs(pos1 - pos2) - 1;
        System.out.println("There are " + wordsBetween + " words between " + word1 + " and " + word2);
    }

    public static List<String> loadDictionary(String filename) throws FileNotFoundException {
        List<String> dictionary = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                dictionary.add(fileScanner.nextLine().trim());
            }
        }
        return dictionary;
    }

}

