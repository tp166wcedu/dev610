package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex14 {
    public static void main(String[] args) {
        System.out.println(swapPairs("example"));
        System.out.println(swapPairs("hello there"));
    }

    public static String swapPairs(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length - 1; i += 2) {
            sb.append(input.charAt(i + 1));
            sb.append(input.charAt(i));
        }

        // If the string has an odd length, append the last character
        if (length % 2 != 0) {
            sb.append(input.charAt(length - 1));
        }

        return sb.toString();
    }
}
