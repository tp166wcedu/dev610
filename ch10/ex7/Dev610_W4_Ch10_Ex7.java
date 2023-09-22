package ch10.ex7;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex7 {
    /*
     * Assumption:
     * Because the values will be sorted, all of the duplicates will be grouped together.
     */
    public static void removeDuplicates(ArrayList<String> list) {
        if (list.size() <= 1) {
            return;
        }

        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i + 1);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        // Test case 1: A typical list with duplicates.
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("be");
        test1.add("be");
        test1.add("is");
        test1.add("not");
        test1.add("or");
        test1.add("question");
        test1.add("that");
        test1.add("the");
        test1.add("to");
        test1.add("to");
        printTestResult(test1, "Typical list with duplicates");

        // Test case 2: An empty list.
        ArrayList<String> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list without duplicates.
        ArrayList<String> test3 = new ArrayList<>();
        test3.add("apple");
        test3.add("banana");
        test3.add("cherry");
        printTestResult(test3, "List without duplicates");

        // Test case 4: A list with all duplicate values.
        ArrayList<String> test4 = new ArrayList<>();
        test4.add("hello");
        test4.add("hello");
        test4.add("hello");
        printTestResult(test4, "List with all duplicates");
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        removeDuplicates(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

