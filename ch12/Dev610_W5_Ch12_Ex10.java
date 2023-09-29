package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex10 {

    public static void main(String[] args) {
        System.out.println(digitMatch(1072503891, 62530841));
        System.out.println(digitMatch(0, 0));
        System.out.println(digitMatch(1072503891, 0));
        System.out.println(digitMatch(0, 62530840));
        System.out.println(digitMatch(10000, 62530841));
    }

    public static int digitMatch(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        int lastDigitN1 = n1 % 10;
        int lastDigitN2 = n2 % 10;
        int remainingN1 = n1 / 10;
        int remainingN2 = n2 / 10;

        if (lastDigitN1 == lastDigitN2) {
            return 1 + digitMatch(remainingN1, remainingN2);
        } else {
            return digitMatch(remainingN1, remainingN2);
        }
    }

}

