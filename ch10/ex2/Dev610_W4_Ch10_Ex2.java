package ch10.ex2;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex2 {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        swapPairs(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // Test case 1: A list with an even number of strings
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("to");
        test1.add("be");
        test1.add("or");
        test1.add("not");
        printTestResult(test1, "Even number of elements");

        // Test case 2: A list with an odd number of strings
        ArrayList<String> test2 = new ArrayList<>();
        test2.add("to");
        test2.add("be");
        test2.add("or");
        test2.add("not");
        test2.add("to");
        test2.add("be");
        test2.add("hamlet");
        printTestResult(test2, "Odd number of elements");

        // Test case 3: An empty list
        ArrayList<String> test3 = new ArrayList<>();
        printTestResult(test3, "Empty list");

        // Test case 4: A list with a single element
        ArrayList<String> test4 = new ArrayList<>();
        test4.add("single");
        printTestResult(test4, "Single element list");
    }

}

