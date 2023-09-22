package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10, 11, 12);
        System.out.println(alternate(list1, list2));
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < list1.size() && i < list2.size()) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (i < list2.size()) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }

}

