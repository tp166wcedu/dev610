package ch10.ex11;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex11 {
    public static void stutter(ArrayList<String> list, int k) {
        if (k <= 0) {
            list.clear();
            return;
        }

        int originalSize = list.size();
        for (int i = 0; i < originalSize; i++) {
            String current = list.get(i * k);
            for (int j = 1; j < k; j++) {
                list.add(i * k + j, current);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> testList1 = new ArrayList<>(List.of("how", "are", "you?"));
        printTestResult(testList1, 4, "List stuttered 4 times");

        ArrayList<String> testList2 = new ArrayList<>(List.of("hello", "world"));
        printTestResult(testList2, 2, "List stuttered 2 times");

        ArrayList<String> testList3 = new ArrayList<>(List.of("a", "b", "c"));
        printTestResult(testList3, 0, "List with 0 stutter count");

        ArrayList<String> testList4 = new ArrayList<>(List.of("this", "is", "a", "test"));
        printTestResult(testList4, -3, "List with negative stutter count");
    }

    private static void printTestResult(ArrayList<String> list, int k, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        stutter(list, k);
        System.out.println("List after stuttering: " + list);
        System.out.println("----------------------------");
    }
}

