package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex10 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(
                Arrays.asList("apple", "banana", "cherry", "date", "fig")
        );
        System.out.println("Original set: " + words);
        words.removeIf(s -> s.length() % 2 == 0);
        System.out.println("After removal: " + words);
    }

}

