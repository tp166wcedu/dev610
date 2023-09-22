package ch10.ex16;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex16 {
    public static void clump(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String combined = list.get(i) + " " + list.get(i + 1);
            list.set(i, combined);
            list.remove(i + 1);
        }
    }

    // Testing the method
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("four", "score", "and", "seven", "years", "ago", "our"));
        clump(list);
        System.out.println(list);
    }

}

