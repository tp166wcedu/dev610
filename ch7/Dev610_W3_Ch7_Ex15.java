package ch7;

import java.util.Arrays;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex15 {

    public static void main(String[] args) {
        int[] evenElementList = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        System.out.println(Arrays.toString(collapse(evenElementList)));
        int[] oddElementList = {7, 2, 8, 9, 4, 13, 1, 9, 10};
        System.out.println(Arrays.toString(collapse(oddElementList)));
    }

    public static int[] collapse(int[] arr) {
        int newSize = arr.length / 2 + arr.length % 2;
        int[] collapsedArray = new int[newSize];

        for (int i = 0; i < arr.length / 2; i++) {
            collapsedArray[i] = arr[2 * i] + arr[2 * i + 1];
        }

        if (arr.length % 2 != 0) {
            collapsedArray[newSize - 1] = arr[arr.length - 1];
        }

        return collapsedArray;
    }


}

