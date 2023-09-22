package ch10.ex3;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex3 {
    public static void removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        // Test case 1: A list with strings of various lengths
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("to");
        test1.add("be");
        test1.add("or");
        test1.add("not");
        test1.add("to");
        test1.add("be");
        test1.add("hamlet");
        printTestResult(test1, "Mixed string lengths");

        // Test case 2: An empty list
        ArrayList<String> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list with all even-length strings
        ArrayList<String> test3 = new ArrayList<>();
        test3.add("even");
        test3.add("length");
        test3.add("test");
        printTestResult(test3, "All even-length strings");

        // Test case 4: A list with all odd-length strings
        ArrayList<String> test4 = new ArrayList<>();
        test4.add("odd");
        test4.add("lengths");
        test4.add("only");
        printTestResult(test4, "All odd-length strings");
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        removeEvenLength(list);
        System.out.println("Modified list: " + list);
        System.out.println("----------------------------");
    }

}

