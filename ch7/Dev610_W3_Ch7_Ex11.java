package ch7;

import java.util.HashSet;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex11 {

    public static void main(String[] args) {
        int[] array1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        int[] array2 = {4, 7, 3, 9, 12, -47, 3, 74};
        System.out.println(isUnique(array1));
        System.out.println(isUnique(array2));
    }

    public static boolean isUnique(int[] arr) {
        // Set keeps track of unique elements
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }

}

