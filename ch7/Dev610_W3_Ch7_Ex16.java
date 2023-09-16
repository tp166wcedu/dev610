package ch7;

import java.util.Arrays;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex16 {

    public static void main(String[] args) {
        int[] list1 = {2, 4, 6};
        int[] list2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(append(list1, list2)));
        System.out.println(Arrays.toString(append(list2, list1)));
    }

    public static int[] append(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, result, 0, list1.length);
        System.arraycopy(list2, 0, result, list1.length, list2.length);
        return result;
    }

}

