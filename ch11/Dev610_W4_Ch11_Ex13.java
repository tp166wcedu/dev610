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
public class Dev610_W4_Ch11_Ex13 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");

        System.out.println("Is map1 unique? " + isUnique(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println("Is map2 unique? " + isUnique(map2));
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> processedValues = new HashSet<>();

        for (String value : map.values()) {
            if (processedValues.contains(value)) {
                return false;
            }
            processedValues.add(value);
        }

        return true;
    }
}