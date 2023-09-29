package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex14 {

    public static void main(String[] args) {
        System.out.println(dedup("bookkkkkeeper"));
    }

    public static String dedup(String s) {
        if (s.length() <= 1) {
            return s;
        }

        if (s.charAt(0) == s.charAt(1)) {
            return dedup(s.charAt(0) + s.substring(2));
        } else {
            return s.charAt(0) + dedup(s.substring(1));
        }
    }

}

