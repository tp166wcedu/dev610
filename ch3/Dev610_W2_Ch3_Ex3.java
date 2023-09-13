package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex3 {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }

    public static void printPowersOfN(int base, int exponent) {
        int value = 1;
        for (int i = 0; i <= exponent; i++) {
            System.out.print(value + " ");
            value *= base;
        }
        System.out.println();
    }
}
