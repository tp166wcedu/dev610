package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex11 {
    public static void main(String[] args) {
        System.out.println("\"" + padString("hello", 8) + "\"");
        System.out.println("\"" + padString("congratulations", 10) + "\"");
    }

    public static String padString(String str, int length) {
        StringBuilder paddedString = new StringBuilder(str);
        int numOfSpaces = length - str.length();
        for (int i = 0; i < numOfSpaces; i++) {
            paddedString.append(" ");
        }
        return paddedString.toString();
    }
}
