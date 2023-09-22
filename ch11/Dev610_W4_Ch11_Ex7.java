package ch11;

import java.util.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));
        int commonCount = countCommon(list1, list2);
        System.out.println("Number of common unique integers: " + commonCount);
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> commonSet = new HashSet<>();
        for (int num : list2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet.size();
    }
}

