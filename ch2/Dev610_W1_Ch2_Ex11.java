package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex11 {
    public static final int NUM_DIGITS = 10;
    public static final int LINE_WIDTH = 60;

    public static void main(String[] args) {
        printRotatingIncreasingListOfSingleDigitNumbers(NUM_DIGITS, LINE_WIDTH);
        printRotatingIncreasingListOfSingleDigitNumbers(5, 50);
        printRotatingIncreasingListOfSingleDigitNumbers(8, 56);
    }

    private static void printRotatingIncreasingListOfSingleDigitNumbers(int numDigits, int lineWidth) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= lineWidth; j++) {
                switch (i) {
                    case 1 -> {
                        if (j % numDigits == 0) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    case 2 -> System.out.print(j % numDigits);
                }
            }
            System.out.println();
        }
    }
}
