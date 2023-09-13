package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex1 {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }

    public static void printNumbers(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
