package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex20_Vocabulary {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("ch11/data/Dev610_W4_Ch11_Ex20_Vocabulary1.txt"));
        Scanner in2 = new Scanner(new File("ch11/data/Dev610_W4_Ch11_Ex20_Vocabulary2.txt"));

        Set<String> set1 = getWords(in1);
        Set<String> set2 = getWords(in2);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
    }

    public static Set<String> getWords(Scanner input) {
        Set<String> words = new HashSet<>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
        }
        return words;
    }

}