package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex10 {

    public static void main(String[] args) {
        int[] array = {6, 2, 9, 11, 3};
        System.out.println(percentEven(array));
        int[] array02 = {1, 19, 9, 11, 3};
        System.out.println(percentEven(array02));
    }

    public static double percentEven(int[] arr) {
        if (arr.length == 0) return 0.0;

        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        return ((double) evenCount / arr.length) * 100;
    }

}

