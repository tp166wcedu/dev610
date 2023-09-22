package ch10.ex12;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex12 {
    public static void markLength4(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> testList1 = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "Java", "coders"));
        printTestResult(testList1, "Basic test case");

        ArrayList<String> testList2 = new ArrayList<>(List.of("****", "****", "is", "****"));
        printTestResult(testList2, "List already containing asterisks");

        ArrayList<String> testList3 = new ArrayList<>(List.of("one", "two", "three", "four", "five"));
        printTestResult(testList3, "Mixed length strings");
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        markLength4(list);
        System.out.println("List after marking: " + list);
        System.out.println("----------------------------");
    }
}

