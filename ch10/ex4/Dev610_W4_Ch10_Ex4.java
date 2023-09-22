package ch10.ex4;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex4 {
    public static void doubleList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            String element = list.get(i);
            list.add(i, element);
        }
    }

    public static void main(String[] args) {
        // Test case 1: A typical list with several elements
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("how");
        test1.add("are");
        test1.add("you?");
        printTestResult(test1, "Typical list");

        // Test case 2: An empty list
        ArrayList<String> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list with a single string
        ArrayList<String> test3 = new ArrayList<>();
        test3.add("hello");
        printTestResult(test3, "Single string in list");

        // Test case 4: A list with repeated strings
        ArrayList<String> test4 = new ArrayList<>();
        test4.add("repeat");
        test4.add("repeat");
        printTestResult(test4, "Repeated strings in list");
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        doubleList(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

