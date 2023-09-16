package ch7;

import java.util.Arrays;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex7 {

    public static void main(String[] args) {
        int[] array = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(kthLargest(2, array));
    }

    public static int kthLargest(int k, int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);
        return copyArr[arr.length - 1 - k];
    }

}

