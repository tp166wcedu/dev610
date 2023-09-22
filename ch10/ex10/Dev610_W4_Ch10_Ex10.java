package ch10.ex10;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex10 {
    public static void removeInRange(ArrayList<String> list, String start, String end) {
        list.removeIf(s -> s.compareTo(start) >= 0 && s.compareTo(end) <= 0);
    }

    public static void main(String[] args) {
        // Test cases for removeInRange method
        ArrayList<String> testList1 = new ArrayList<>(List.of("to", "be", "or", "not", "to", "be", "that", "is", "the", "question"));
        printTestResult(testList1, "free", "rich", "List with elements between 'free' and 'rich'");

        ArrayList<String> testList2 = new ArrayList<>(List.of("apple", "banana", "grape", "orange", "peach", "pear"));
        printTestResult(testList2, "a", "mango", "List with elements between the beginning of the alphabet and 'mango'");

        ArrayList<String> testList3 = new ArrayList<>(List.of("apple", "banana", "grape", "orange", "peach", "pear"));
        printTestResult(testList3, "pineapple", "zzz", "List with elements between 'pineapple' and the end of the alphabet");

        ArrayList<String> testList4 = new ArrayList<>(List.of("apple", "banana", "grape", "orange", "peach", "pear"));
        printTestResult(testList4, "zzz", "zzzz", "List with start and end strings outside the range of the list's elements");

        ArrayList<String> testList5 = new ArrayList<>();
        printTestResult(testList5, "a", "z", "Empty list");

        ArrayList<String> testList6 = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        printTestResult(testList6, "a", "e", "List where all elements are removed");
    }

    private static void printTestResult(ArrayList<String> list, String start, String end, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        removeInRange(list, start, end);
        System.out.println("List after removal: " + list);
        System.out.println("----------------------------");
    }

}

