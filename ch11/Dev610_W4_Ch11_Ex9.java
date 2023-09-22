package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex9 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 11));
        System.out.println(hasOdd(numbers));
        Set<Integer> numbers2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println(hasOdd(numbers2));
        Set<Integer> numbers3 = new HashSet<>(List.of());
        System.out.println(hasOdd(numbers3));
    }

    public static boolean hasOdd(Set<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}

