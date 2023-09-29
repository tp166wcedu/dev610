package ch12;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex22 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Janet");
        list.add("Robert");
        list.add("Morgan");
        list.add("Char");
        subsets(list);
    }

    public static void subsets(List<String> list) {
        subsets(list, new ArrayList<>(), 0);
    }

    private static void subsets(List<String> list, List<String> subset, int index) {
        if (index == list.size()) {
            System.out.println(subset);
        } else {
            // Include the current element and recurse
            List<String> newSubsetWithElement = new ArrayList<>(subset);
            newSubsetWithElement.add(list.get(index));
            subsets(list, newSubsetWithElement, index + 1);

            // Exclude the current element and recurse
            subsets(list, new ArrayList<>(subset), index + 1);
        }
    }

}

