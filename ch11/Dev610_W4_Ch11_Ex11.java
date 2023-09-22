package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex11 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 4, 7, 9));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 5, 6, 7));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Symmetric Set Difference: " + symmetricSetDifference(set1, set2));
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference1 = new HashSet<>(set1);
        Set<Integer> difference2 = new HashSet<>(set2);
        difference1.removeAll(set2);
        difference2.removeAll(set1);
        difference1.addAll(difference2);
        return difference1;
    }

}

