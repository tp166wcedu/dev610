package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex15 {

    public static void main(String[] args) {
        int numLines = 5;

        for (int line = 1; line <= numLines; line++) {
            int digit = 2 * line - 1;
            int numDashes = numLines - line;
            int numDigits = 2 * line - 1;

            printChar('-', numDashes);
            printChar(Character.forDigit(digit, 10), numDigits);
            printChar('-', numDashes);

            System.out.println();
        }
    }

    public static void printChar(char ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }

}
