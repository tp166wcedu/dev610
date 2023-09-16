package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex4.txt"))) {
            collapseSpaces(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void collapseSpaces(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            StringBuilder sb = new StringBuilder();
            while (lineScanner.hasNext()) {
                sb.append(lineScanner.next());
                if (lineScanner.hasNext()) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
            lineScanner.close();
        }
    }

}

