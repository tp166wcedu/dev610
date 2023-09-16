package ch6;

import java.io.File;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex12 {

    public static void main(String[] args) throws Exception {
        String filePath = "ch6/data/W3_Ch6_Ex12.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        printDuplicates(scanner);
    }

    public static void printDuplicates(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            int count = 1;
            for (int i = 1; i < tokens.length; i++) {
                if (tokens[i].equals(tokens[i - 1])) {
                    count++;
                } else {
                    if (count > 1) {
                        System.out.print(tokens[i - 1] + "*" + count + " ");
                    }
                    count = 1;
                }
            }
            if (count > 1) {
                System.out.print(tokens[tokens.length - 1] + "*" + count + " ");
            }
            System.out.println();
        }
    }

}

