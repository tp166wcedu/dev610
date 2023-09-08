package w5;

import java.util.HashSet;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex14 {
    public static void main(String[] args) {
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
        System.out.println(numUnique(6, 6, 6));
        System.out.println(numUnique(1, 2, 3, 4, 4, 3, 5));
    }

    public static int numUnique(int a, int b, int c) {
        if (a == b && b == c) {
            return 1;
        } else if (a != b && b != c && a != c) {
            return 3;
        } else {
            return 2;
        }
    }

    // The right data structure can do the task effectively.
    public static int numUnique(int... nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        return uniqueNums.size();
    }
}

