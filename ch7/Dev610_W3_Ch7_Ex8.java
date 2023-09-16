package ch7;

import java.util.Arrays;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex8 {

    public static void main(String[] args) {
        int[] array1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println((int) median(array1));

        int[] array2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println((int) median(array2));

    }

    public static double median(int[] arr) {
        Arrays.sort(arr);
        int middleIndex = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (arr[middleIndex - 1] + arr[middleIndex]) / 2.0;
        } else {
            return arr[middleIndex];
        }
    }

}

