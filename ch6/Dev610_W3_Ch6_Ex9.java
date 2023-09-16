package ch6;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex9 {

    public static final int MAX_LINE_LENGTH = 60;

    public static void main(String[] args) throws Exception {
        File file = new File("ch6/data/W3_Ch6_Ex9.txt");
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
            int lineLength = 0;
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String word = lineScanner.next();
                if (lineLength + word.length() > MAX_LINE_LENGTH) {
                    sb.append(System.lineSeparator());
                    lineLength = 0;
                }
                sb.append(word).append(' ');
                lineLength += word.length() + 1;
            }
            sb.append(System.lineSeparator());
        }
    }

}

