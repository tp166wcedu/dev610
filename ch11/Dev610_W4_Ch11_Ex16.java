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
public class Dev610_W4_Ch11_Ex16 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Marty", "206–9024");
        map1.put("Hawking", "123–4567");
        map1.put("Smith", "949–0504");
        map1.put("Newton", "123–4567");
        System.out.println(is1to1(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Marty", "206–9024");
        map2.put("Hawking", "555–1234");
        map2.put("Smith", "949–0504");
        map2.put("Newton", "123–4567");
        System.out.println(is1to1(map2));
    }

    public static boolean is1to1(Map<String, String> map) {
        Set<String> processedElements = new HashSet<>();

        for (String value : map.values()) {
            if (processedElements.contains(value)) {
                return false;
            }
            processedElements.add(value);
        }

        return true;
    }
}