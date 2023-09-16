package ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex7 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("ch6/data/W3_Ch6_Ex7.txt"));
        wordWrap(scanner);
    }

    public static void wordWrap(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            while (line.length() > 60) {
                System.out.println(line.substring(0, 60));
                line = line.substring(60);
            }
            System.out.println(line);
        }
    }

}

