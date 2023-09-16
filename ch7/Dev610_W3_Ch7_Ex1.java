package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex1 {
    public static int lastIndexOf(int[] arr, int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(lastIndexOf(arr, 85));
    }
}

