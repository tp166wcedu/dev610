package ch11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex18 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("42", "Marty");
        map.put("81", "Sue");
        map.put("17", "Ed");
        map.put("31", "Dave");
        map.put("56", "Ed");
        map.put("3", "Marty");
        map.put("29", "Ed");
        System.out.println(reverse(map));
    }

    public static Map<String, Set<String>> reverse(Map<String, String> map) {
        Map<String, Set<String>> reversedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!reversedMap.containsKey(value)) {
                reversedMap.put(value, new HashSet<>());
            }
            reversedMap.get(value).add(key);
        }

        return reversedMap;
    }
}