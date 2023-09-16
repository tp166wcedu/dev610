package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex9 {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 12};
        System.out.println(minGap(array));
        int[] array02 = {1};
        System.out.println(minGap(array02));

    }

    public static int minGap(int[] arr) {
        if (arr.length < 2) return 0;

        int minGap = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int currentGap = arr[i] - arr[i - 1];
            if (currentGap < minGap) {
                minGap = currentGap;
            }
        }

        return minGap;
    }

}

