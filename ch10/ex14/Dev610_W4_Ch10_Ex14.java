package ch10.ex14;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex14 {
    public static void removeShorterStrings(ArrayList<String> list) {
        List<Integer> indicesToRemove = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i += 2) {
            String first = list.get(i);
            String second = list.get(i + 1);
            if (first.length() <= second.length()) {
                indicesToRemove.add(i);
            } else {
                indicesToRemove.add(i + 1);
            }
        }

        for (int i = indicesToRemove.size() - 1; i >= 0; i--) {
            int index = indicesToRemove.get(i);
            list.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> testList1 = new ArrayList<>(List.of("four", "score", "and", "seven", "years", "ago", "our"));
        printTestResult(testList1, "Basic test case");

        ArrayList<String> testList2 = new ArrayList<>(List.of("apple", "banana", "cherry", "date"));
        printTestResult(testList2, "Pairs of different length");

        ArrayList<String> testList3 = new ArrayList<>(List.of("apple", "grape", "cherry", "berry"));
        printTestResult(testList3, "Pairs of same length");

        ArrayList<String> testList4 = new ArrayList<>(List.of("apple"));
        printTestResult(testList4, "Single string in list");
    }

    private static void printTestResult(ArrayList<String> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        removeShorterStrings(list);
        System.out.println("List after removing shorter strings: " + list);
        System.out.println("----------------------------");
    }
}

