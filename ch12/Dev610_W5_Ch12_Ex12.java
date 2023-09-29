package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex12 {

    public static void main(String[] args) {
        System.out.println(isReverse("hello", "eLLoH"));
        System.out.println(isReverse("world", "dlroW"));
        System.out.println(isReverse("java", "JAVA"));
    }

    public static boolean isReverse(String s1, String s2) {
        return isReverseHelper(s1.toLowerCase(), s2.toLowerCase(), 0, s2.length() - 1);
    }

    private static boolean isReverseHelper(String s1, String s2, int start, int end) {
        if (start >= s1.length() || end < 0) {
            return true;
        }
        if (s1.charAt(start) != s2.charAt(end)) {
            return false;
        }
        return isReverseHelper(s1, s2, start + 1, end - 1);
    }

}

