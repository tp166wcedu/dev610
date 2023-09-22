package ch11;

import java.util.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9)
        );

        System.out.println("Original List: " + list);
        sortAndRemoveDuplicates(list);
        System.out.println("Processed List: " + list);
    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
        Collections.sort(list);
    }

}

