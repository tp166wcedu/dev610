package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex2 {
    public static void main(String[] args) {
        try {
            writeNums(5);
            System.out.println();
            writeNums(12);
            System.out.println();
            writeNums(-3);
        } catch (IllegalArgumentException e) {
            System.err.println("Input must be greater than 0");
        }
    }

    public static void writeNums(int n) {
        if (n < 1) throw new IllegalArgumentException("Input must be greater than 0");

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (i < n) {
                sb.append(", ");
            }
        }

        System.out.print(sb);
    }

}

