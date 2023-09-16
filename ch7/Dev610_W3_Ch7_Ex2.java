package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex2 {

    public static void main(String[] args) {
        int[] list = {36, 12, 25, 19, 46, 31, 22};
        System.out.println(range(list));
    }

    public static int range(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (max - min) + 1;
    }
}

