package ch10.ex8;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex8 {
    public static void removeZeroes(ArrayList<Integer> list) {
        while (list.contains(0)) {
            list.remove(Integer.valueOf(0));
        }
    }

    public static void main(String[] args) {
        // Test case 1: A list with multiple zeroes.
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(0);
        test1.add(7);
        test1.add(2);
        test1.add(0);
        test1.add(0);
        test1.add(4);
        test1.add(0);
        printTestResult(test1, "List with multiple zeroes");

        // Test case 2: An empty list.
        ArrayList<Integer> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list without zeroes.
        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(1);
        test3.add(2);
        test3.add(3);
        printTestResult(test3, "List without zeroes");

        // Test case 4: A list with all zero values.
        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(0);
        test4.add(0);
        test4.add(0);
        printTestResult(test4, "List with all zeroes");
    }

    private static void printTestResult(ArrayList<Integer> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        removeZeroes(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

