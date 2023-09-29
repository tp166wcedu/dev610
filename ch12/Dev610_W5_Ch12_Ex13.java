package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex13 {

    public static void main(String[] args) {
        System.out.println(indexOf("Barack Obama", "bam"));
        System.out.println(indexOf("hello world", "world"));
        System.out.println(indexOf("hello world", "planet"));
    }

    public static int indexOf(String s1, String s2) {
        return indexOfHelper(s1.toLowerCase(), s2.toLowerCase(), 0);
    }

    private static int indexOfHelper(String s1, String s2, int index) {
        if (index + s2.length() > s1.length()) {
            return -1;
        }
        if (s1.startsWith(s2, index)) {
            return index;
        }
        return indexOfHelper(s1, s2, index + 1);
    }

}

