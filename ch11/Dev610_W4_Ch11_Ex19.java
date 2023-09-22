package ch11;

import java.util.HashMap;
import java.util.Map;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex19 {

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map is empty.");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : map.values()) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        int rarestValue = Integer.MAX_VALUE;
        int rarestCount = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < rarestCount || (entry.getValue() == rarestCount && entry.getKey() < rarestValue)) {
                rarestCount = entry.getValue();
                rarestValue = entry.getKey();
            }
        }

        return rarestValue;
    }

    public static void main(String[] args) {
        // Scenario 1
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Richard Pryor", 3);
        map1.put("George Carlin", 5);
        map1.put("Robin Williams", 7);
        map1.put("Joan Rivers", 5);
        map1.put("Lucille Ball", 7);
        map1.put("Eddie Murphy", 3);
        System.out.println("Expected 3, Got: " + rarest(map1));

        // Scenario 2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Richard Pryor", 8);
        map2.put("George Carlin", 5);
        map2.put("Robin Williams", 3);
        map2.put("Joan Rivers", 5);
        map2.put("Lucille Ball", 7);
        map2.put("Eddie Murphy", 3);
        System.out.println("Expected 7, Got: " + rarest(map2));

        // Scenario 3
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Richard Pryor", 8);
        System.out.println("Expected 8, Got: " + rarest(map3));

        // Scenario 4
        Map<String, Integer> map4 = new HashMap<>();
        try {
            System.out.println(rarest(map4));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for empty map: " + e.getMessage());
        }
    }
}