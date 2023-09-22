package ch11;

import java.util.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        int uniqueCount = countUnique(list);
        System.out.println("The list contains " + uniqueCount + " unique integers.");
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return uniqueSet.size();
    }

}

