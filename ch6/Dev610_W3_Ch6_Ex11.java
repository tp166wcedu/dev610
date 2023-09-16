package ch6;

import java.io.File;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex11 {

    public static void main(String[] args) throws Exception {
        String filePath = "ch6/data/Program.java";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        stripComments(scanner);
    }

    public static void stripComments(Scanner scanner) {
        boolean inBlockComment = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringBuilder outputLine = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (inBlockComment) {
                    if (line.charAt(i) == '*' && i < line.length() - 1 && line.charAt(i + 1) == '/') {
                        inBlockComment = false;
                        i++;
                    }
                } else {
                    if (line.charAt(i) == '/' && i < line.length() - 1) {
                        if (line.charAt(i + 1) == '/') {
                            break;
                        } else if (line.charAt(i + 1) == '*') {
                            inBlockComment = true;
                            i++;
                        } else {
                            outputLine.append(line.charAt(i));
                        }
                    } else {
                        outputLine.append(line.charAt(i));
                    }
                }
            }
            if (!inBlockComment) {
                System.out.println(outputLine);
            }
        }
    }

}

