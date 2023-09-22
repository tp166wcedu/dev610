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
public class Dev610_W4_Ch11_Ex12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape");
        System.out.println("List: " + list);
        System.out.println("Contains any string at least 3 times? " + contains3(list));
    }

    public static boolean contains3(List<String> list) {
        Map<String, Integer> stringCountMap = new HashMap<>();

        for (String str : list) {
            int count = stringCountMap.getOrDefault(str, 0);
            count++;
            if (count >= 3) {
                return true;
            }
            stringCountMap.put(str, count);
        }

        return false;
    }
}