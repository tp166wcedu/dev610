package ch10.ex1;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch10_Ex1 {
    public static double averageVowels(ArrayList<String> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        int totalVowels = 0;
        for (String s : list) {
            totalVowels += countVowels(s);
        }

        return (double) totalVowels / list.size();
    }

    private static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    private static void printTestResult(ArrayList<String> list) {
        System.out.println("Testing list: " + list);
        System.out.println("Average vowels count: " + averageVowels(list));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("hello");
        test1.add("world");
        test1.add("java");
        printTestResult(test1);

        ArrayList<String> test2 = new ArrayList<>();
        printTestResult(test2);

        ArrayList<String> test3 = new ArrayList<>();
        test3.add("a");
        test3.add("e");
        test3.add("i");
        test3.add("o");
        test3.add("u");
        printTestResult(test3);
    }

}

