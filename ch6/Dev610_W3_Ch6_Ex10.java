package ch6;

import java.io.File;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch6_Ex10 {

    public static void main(String[] args) throws Exception {
        String filePath = "ch6/data/W3_Ch6_Ex10.html";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        stripHtmlTags(scanner);
    }

    public static void stripHtmlTags(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringBuilder outputLine = new StringBuilder();
            boolean insideTag = false;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '<') insideTag = true;
                if (c == 'p' && insideTag) outputLine.append('\n');
                if (!insideTag) outputLine.append(c);
                if (c == '>') insideTag = false;
            }
            String resultLine = outputLine.toString();
            if (!resultLine.isEmpty()) System.out.println(resultLine);
        }
    }

}

