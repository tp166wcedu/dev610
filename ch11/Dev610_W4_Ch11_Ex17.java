package ch11;

import java.util.HashMap;
import java.util.Map;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex17 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Smith", "949–0504");
        map1.put("Marty", "206–9024");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Marty", "206–9024");
        map2.put("Hawking", "123–4567");
        map2.put("Smith", "949–0504");
        map2.put("Newton", "123–4567");

        System.out.println(subMap(map1, map2));
        System.out.println(subMap(new HashMap<>(), map1));
        System.out.println(subMap(map2, new HashMap<>()));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!map2.containsKey(key) || !map2.get(key).equals(value)) {
                return false;
            }
        }

        return true;
    }
}