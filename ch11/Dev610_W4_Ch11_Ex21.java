package ch11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex21 {
    public static void main(String[] args) {
        List<String> words = List.of("banana", "bends", "i", "mend", "sandy");
        System.out.println("Test 1: " + pairCounts(words));

        List<String> test1 = List.of("apple", "happy", "pee", "hello");
        System.out.println("Test 2: " + pairCounts(test1));

        List<String> test2 = List.of("test", "setter", "net", "bet", "set");
        System.out.println("Test 3: " + pairCounts(test2));
    }

    public static Map<String, Integer> pairCounts(List<String> words) {
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            for (int i = 0; i < word.length() - 1; i++) {
                String pair = word.substring(i, i + 2);
                counts.put(pair, counts.getOrDefault(pair, 0) + 1);
            }
        }

        return counts;
    }
}