package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex15 {

    public static void main(String[] args) {
        System.out.println(vowelsToEnd("beautifully"));
    }

    public static String vowelsToEnd(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char c = s.charAt(0);
        String rest = vowelsToEnd(s.substring(1));
        if (isVowel(c)) {
            return rest + c;
        } else {
            return c + rest;
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}

