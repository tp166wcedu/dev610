package ch13.ex17;


import java.util.Comparator;
import java.util.Scanner;

public class NumericTokenComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int num1 = extractLeadingNumber(str1);
        int num2 = extractLeadingNumber(str2);
        return Integer.compare(num1, num2);
    }

    private int extractLeadingNumber(String str) {
        try (Scanner scanner = new Scanner(str)) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                throw new IllegalArgumentException("String does not start with a numeric token: " + str);
            }
        }
    }
}



