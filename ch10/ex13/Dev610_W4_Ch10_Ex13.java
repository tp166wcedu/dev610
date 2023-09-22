package ch10.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex13 {
    public static void reverse3(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size() - 3; i += 3) {
            Collections.reverse(list.subList(i, i + 3));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testList1 = new ArrayList<>(List.of(3, 8, 19, 42, 7, 26, 19, -8));
        printTestResult(testList1, "Basic test case");

        ArrayList<Integer> testList2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        printTestResult(testList2, "Multiple of 3 list size");

        ArrayList<Integer> testList3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        printTestResult(testList3, "More than multiple of 3 list size");

        ArrayList<Integer> testList4 = new ArrayList<>(List.of(1, 2));
        printTestResult(testList4, "Less than 3 list size");
    }

    private static void printTestResult(ArrayList<Integer> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        reverse3(list);
        System.out.println("List after reversing: " + list);
        System.out.println("----------------------------");
    }
}

