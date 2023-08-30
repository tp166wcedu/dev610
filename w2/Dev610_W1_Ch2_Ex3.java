package w2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        System.out.print("First 12 Fibonacci numbers: ");

        // Print the first two Fibonacci numbers
        System.out.print(a + " " + b + " ");

        // Compute and print the remaining Fibonacci numbers
        for (int i = 3; i <= 12; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }

        System.out.println();
    }
}
