package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex21 {

    public static void main(String[] args) {
        countBinary(1);
        System.out.println();
        countBinary(2);
        System.out.println();
        countBinary(3);
        System.out.println();
        countBinary(4);
    }

    public static void countBinary(int n) {
        countBinary(n, "");
    }

    private static void countBinary(int n, String binary) {
        if (binary.length() == n) {
            System.out.println(binary);
        } else {
            countBinary(n, binary + "0");
            countBinary(n, binary + "1");
        }
    }

}

