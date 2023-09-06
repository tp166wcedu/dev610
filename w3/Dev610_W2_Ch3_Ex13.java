package w3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex13 {
    public static void main(String[] args) {
        printReverse("hello there!");
        printReverse("");
    }

    public static void printReverse(String str) {
        if (str.isEmpty()) {
            return;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
    }
}
