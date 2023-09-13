package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex2 {
    public static void main(String[] args) {
        System.out.println("Square sequence using multiplication:");
        squareSeqUsingMultiplication();
        System.out.println();
        System.out.println("Square sequence without using multiplication:");
        squareSeqWithoutUsingMultiplication();
    }

    private static void squareSeqUsingMultiplication() {
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println();
    }

    private static void squareSeqWithoutUsingMultiplication() {
        int square = 1;
        int diff = 3;

        System.out.print(square + " ");

        for (int i = 2; i <= 10; i++) {
            square += diff;
            System.out.print(square + " ");
            diff += 2;
        }

        System.out.println();
    }
}
