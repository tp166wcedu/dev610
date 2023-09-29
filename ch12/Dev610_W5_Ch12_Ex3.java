package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex3 {
    public static void main(String[] args) {
        try {
            writeSequence(1);
            System.out.println();
            writeSequence(2);
            System.out.println();
            writeSequence(3);
            System.out.println();
            writeSequence(4);
            System.out.println();
            writeSequence(5);
            System.out.println();
            writeSequence(6);
            System.out.println();
            writeSequence(7);
            System.out.println();
            writeSequence(8);
            System.out.println();
            writeSequence(9);
            System.out.println();
            writeSequence(10);
            System.out.println();
            writeSequence(-3);
        } catch (IllegalArgumentException e) {
            System.err.println("Input must be greater than 0");
        }
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        if (n == 1) {
            System.out.print("1 ");
        } else if (n == 2) {
            System.out.print("1 1 ");
        } else {
            int outerNumber = (n + 1) / 2;
            System.out.print(outerNumber + " ");
            writeSequence(n - 2);
            System.out.print(outerNumber + " ");
        }
    }

}

