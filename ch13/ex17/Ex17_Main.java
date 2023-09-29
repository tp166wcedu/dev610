package ch13.ex17;

import java.util.Arrays;
import java.util.List;

public class Ex17_Main {
    public static void main(String[] args) {
        List<String> formattedStrings = Arrays.asList(
                "276453 Helena, MT",
                "9847 New York, NY",
                "123456 Seattle, WA"
        );
        formattedStrings.sort(new NumericTokenComparator());
        for (String formattedString : formattedStrings) {
            System.out.println(formattedString);
        }
    }
}
