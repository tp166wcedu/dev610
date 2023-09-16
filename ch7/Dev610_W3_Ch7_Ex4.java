package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex4 {

    public static void main(String[] args) {
        double[] list1 = {16.1, 12.3, 22.2, 14.4};
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(list1));
        System.out.println(isSorted(list2));
    }

    public static boolean isSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

