package ch6;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex8 {

    public static final int MAX_LINE_LENGTH = 60;

    public static void main(String[] args) throws Exception {
        File file = new File("ch6/data/W3_Ch6_Ex8.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        wordWrap(scanner, sb);
        PrintWriter writer = new PrintWriter(file);
        writer.write(sb.toString());
        writer.close();
    }

    public static void wordWrap(Scanner scanner, StringBuilder sb) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            while (line.length() > MAX_LINE_LENGTH) {
                sb.append(line, 0, MAX_LINE_LENGTH).append(System.lineSeparator());
                line = line.substring(MAX_LINE_LENGTH);
            }
            sb.append(line).append(System.lineSeparator());
        }
    }

}

