package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex6.txt"));
             PrintStream out = new PrintStream("ch6/output/W3_Ch6_Ex6_generated.txt")) {
            doubleSpace(scanner, out);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void doubleSpace(Scanner scanner, PrintStream out) {
        while (scanner.hasNextLine()) {
            out.println(scanner.nextLine());
            if (scanner.hasNextLine()) {
                out.println();
            }
        }
    }

}

