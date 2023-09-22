package ch10.ex17;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex17 {
    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < a1.size() && j < a2.size()) {
            result.add(a1.get(i++));
            result.add(a2.get(j++));
        }

        while (i < a1.size()) {
            result.add(a1.get(i++));
        }

        while (j < a2.size()) {
            result.add(a2.get(j++));
        }

        a1.clear();
        a1.addAll(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(10, 20, 30));
        ArrayList<Integer> a2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));
        interleave(a1, a2);
        System.out.println(a1);

        ArrayList<Integer> a3 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        ArrayList<Integer> a4 = new ArrayList<>(List.of(6, 7, 8));
        interleave(a3, a4);
        System.out.println(a3);
    }

}

