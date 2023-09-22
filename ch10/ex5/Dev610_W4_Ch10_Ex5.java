package ch10.ex5;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex5 {
    public static void scaleByK(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            int value = list.get(i);

            if (value <= 0) {
                list.remove(i);
            } else {
                for (int count = 1; count < value; count++) {
                    list.add(i, value);
                }
                i += value;
            }
        }
    }

    public static void main(String[] args) {
        // Test case 1: A typical list with mixed values
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(4);
        test1.add(1);
        test1.add(2);
        test1.add(0);
        test1.add(3);
        printTestResult(test1, "Typical list");

        // Test case 2: An empty list
        ArrayList<Integer> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list with only zeroes and negatives
        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(-4);
        test3.add(0);
        printTestResult(test3, "Only zeros and negatives");

        // Test case 4: A list with large values
        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(5);
        test4.add(3);
        printTestResult(test4, "List with large values");
    }

    private static void printTestResult(ArrayList<Integer> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        scaleByK(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

