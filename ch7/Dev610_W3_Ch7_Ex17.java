package ch7;

import java.util.Arrays;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex17 {

    public static void main(String[] args) {
        int[] result = vowelCount("i think, therefore i am");
        System.out.println(Arrays.toString(result));
    }

    public static int[] vowelCount(String str) {
        int[] vowelCounts = new int[5];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a' -> vowelCounts[0]++;
                case 'e' -> vowelCounts[1]++;
                case 'i' -> vowelCounts[2]++;
                case 'o' -> vowelCounts[3]++;
                case 'u' -> vowelCounts[4]++;
            }
        }
        return vowelCounts;
    }

}

