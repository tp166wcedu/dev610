package ch11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 5, 3, 5, 8, 3);
        System.out.println("Maximum Occurrences: " + maxOccurrences(numbers));
    }

    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxOccurrence = 0;
        for (int count : countMap.values()) {
            if (count > maxOccurrence) {
                maxOccurrence = count;
            }
        }

        return maxOccurrence;
    }
}