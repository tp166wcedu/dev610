package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex5.txt"))) {
            String content = readEntireFile(scanner);
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static String readEntireFile(Scanner scanner) {
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
            if (scanner.hasNextLine()) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

}

