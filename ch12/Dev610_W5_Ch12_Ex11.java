package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex11 {

    public static void main(String[] args) {
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("ok", 1));
        System.out.println(repeat("bye", 0));
        System.out.println(repeat("what", 1000));
    }

    /**
     * The number of concatenations is reduced to log(n),
     * making the solution more efficient compared to concatenating
     * the string in every recursive call.
     */
    public static String repeat(String s, int n) {
        if (n <= 0) {
            return "";
        } else if (n == 1) {
            return s;
        } else if (n % 2 == 0) {
            String half = repeat(s, n / 2);
            return half + half;
        } else {
            String half = repeat(s, n / 2);
            return half + half + s;
        }
    }

}

