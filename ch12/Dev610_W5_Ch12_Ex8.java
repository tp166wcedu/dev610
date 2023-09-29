package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex8 {

    public static void main(String[] args) {
        try {
            System.out.println("n=1: " + multiplyEvens(1));
            System.out.println("n=4: " + multiplyEvens(4));
            System.out.println("n=1000000: " + multiplyEvens(1000000));
        } catch (StackOverflowError e) {
            System.err.println("Recursion depth too large. Cannot compute result.");
        }

        try {
            System.out.println("n=10: " + multiplyEvens(10L));
            System.out.println("n=200: " + multiplyEvens(200L));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int multiplyEvens(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else if (n == 1) {
            return 2;
        } else {
            return (n * 2) * multiplyEvens(n - 1);
        }
    }

    public static long multiplyEvens(long n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else if (n == 1) {
            return 2;
        } else {
            long result = (n * 2) * multiplyEvens(n - 1);
            if (result / (n * 2) != multiplyEvens(n - 1)) {
                throw new ArithmeticException("With n = " + n + ". Integer overflow occurred");
            }
            return result;
        }
    }

}

