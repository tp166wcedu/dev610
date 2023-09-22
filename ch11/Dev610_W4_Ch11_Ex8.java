package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex8 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>(
                Arrays.asList("apple", "banana", "cherry", "date", "elderberry")
        );
        int maxLength = maxLength(strings);
        System.out.println("The maximum length is: " + maxLength);
    }

    public static int maxLength(Set<String> strings) {
        int max = 0;
        for (String s : strings) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }
}

