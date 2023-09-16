package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex14 {

    public static void main(String[] args) {
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        System.out.println(contains(list1, list2));

        int[] list3 = {1, 6};
        int[] list4 = {1, 6};
        System.out.println(contains(list3, list4));

        int[] list5 = {};
        System.out.println(contains(list1, list5));

        int[] list6 = {3, 2};
        System.out.println(contains(list6, list1));
    }

    public static boolean contains(int[] a1, int[] a2) {
        if (a2.length == 0) return true;

        for (int i = 0; i <= a1.length - a2.length; i++) {
            boolean isMatch = true;
            for (int j = 0; j < a2.length; j++) {
                if (a1[i + j] != a2[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) return true;
        }

        return false;
    }

}

