package ch10.ex9;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex9 {
    public static int rangeBetweenZeroes(ArrayList<Integer> list) {
        int firstIndex = list.indexOf(0);
        int lastIndex = list.lastIndexOf(0);

        if (firstIndex == -1) {
            return 0;
        } else if (firstIndex == lastIndex) {
            return 1;
        } else {
            return (lastIndex - firstIndex) + 1;
        }
    }

    public static void main(String[] args) {
        // Test case 1: A list with multiple zeroes and range of 6.
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(7);
        test1.add(2);
        test1.add(0);
        test1.add(0);
        test1.add(4);
        test1.add(0);
        test1.add(9);
        test1.add(0);
        test1.add(6);
        test1.add(4);
        test1.add(8);
        printTestResult(test1, "List with multiple zeroes and range of 6");

        // Test case 2: An empty list.
        ArrayList<Integer> test2 = new ArrayList<>();
        printTestResult(test2, "Empty list");

        // Test case 3: A list with only one zero.
        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(1);
        test3.add(2);
        test3.add(3);
        test3.add(0);
        printTestResult(test3, "List with only one zero");

        // Test case 4: A list without zeroes.
        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(1);
        test4.add(2);
        test4.add(3);
        printTestResult(test4, "List without zeroes");
    }

    private static void printTestResult(ArrayList<Integer> list, String testCaseName) {
        System.out.println("Testing case: " + testCaseName);
        System.out.println("Original list: " + list);
        int range = rangeBetweenZeroes(list);
        System.out.println("Range between farthest zeroes: " + range);
        System.out.println("----------------------------");
    }

}

