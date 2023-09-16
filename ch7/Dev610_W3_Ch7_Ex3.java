package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex3 {

    public static void main(String[] args) {
        int[] array = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(array, 4, 17));
    }

    public static int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int j : arr) {
            if (j >= min && j <= max) {
                count++;
            }
        }
        return count;
    }
}

