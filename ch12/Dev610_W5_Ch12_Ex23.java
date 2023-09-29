package ch12;

import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex23 {

    public static int maxSum(List<Integer> list, int limit) {
        return helper(list, limit, 0, 0);
    }
    private static int helper(List<Integer> list, int limit, int index, int sumSoFar) {
        if (index >= list.size() || sumSoFar > limit) {
            return sumSoFar <= limit ? sumSoFar : 0;
        }
        int includeSum = helper(list, limit, index + 1, sumSoFar + list.get(index));
        int excludeSum = helper(list, limit, index + 1, sumSoFar);
        return Math.max(includeSum, excludeSum);
    }

    public static void main(String[] args) {
        // Test Case 1
        List<Integer> list1 = List.of(7, 30, 8, 22, 6, 1, 14);
        int limit1 = 19;
        System.out.println(maxSum(list1, limit1));

        // Test Case 2
        List<Integer> list2 = List.of(5, 30, 15, 13, 8);
        int limit2 = 42;
        System.out.println(maxSum(list2, limit2));

        // Test Case 3
        List<Integer> list3 = List.of(30, 15, 20);
        int limit3 = 40;
        System.out.println(maxSum(list3, limit3));

        // Test Case 4
        List<Integer> list4 = List.of(10, 20, 30);
        int limit4 = 7;
        System.out.println(maxSum(list4, limit4));

        // Test Case 5
        List<Integer> list5 = List.of(10, 20, 30);
        int limit5 = 20;
        System.out.println(maxSum(list5, limit5));

    }

}

