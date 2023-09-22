package ch10.ex6;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex6 {
    public static void minToFront(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return;
        }

        int minIndex = 0;
        int minValue = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
                minIndex = i;
            }
        }

        list.remove(minIndex);
        list.add(0, minValue);
    }

    public static void main(String[] args) {
        // Test case 1: A typical list with mixed values.
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(3);
        test1.add(8);
        test1.add(92);
        test1.add(4);
        test1.add(2);
        test1.add(17);
        test1.add(9);
        printTestResult(test1, "Typical list");

        // Test case 2: An empty list.
        ArrayList<Integer> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list where minimum value is already at the front.
        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(1);
        test3.add(5);
        test3.add(7);
        printTestResult(test3, "Minimum at the front");

        // Test case 4: A list where minimum value is at the end.
        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(5);
        test4.add(7);
        test4.add(2);
        printTestResult(test4, "Minimum at the end");
    }

    private static void printTestResult(ArrayList<Integer> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        minToFront(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

