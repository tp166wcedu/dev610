package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex2 {
    public static void main(String[] args) {
        System.out.println("The concatenated string is: " + repl("hello", 3));
        System.out.println("The concatenated string is: " + repl("hello", 5));
    }

    public static String repl(String str, int repetitions) {
        return str.repeat(Math.max(0, repetitions));
    }
}
