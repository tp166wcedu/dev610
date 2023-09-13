package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex12 {
    public static void main(String[] args) {
        vertical("hey now");
        System.out.println("--------");
        vertical("... now");
    }

    public static void vertical(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
