package ch10.ex15;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex15 {
    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        list.removeIf(value -> value >= min && value <= max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(
                4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7)
        );
        filterRange(list, 5, 7);
        System.out.println(list);
    }

}

