package ch10.ex18;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex18 {
    public static void mirror(ArrayList<String> list) {
        int originalSize = list.size();
        for (int i = originalSize - 1; i >= 0; i--) {
            list.add(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("a", "b", "c"));
        mirror(list);
        System.out.println(list);
    }

}

