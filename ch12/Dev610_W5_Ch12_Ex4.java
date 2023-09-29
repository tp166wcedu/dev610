package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex4 {
    public static void main(String[] args) {
        System.out.println(doubleDigits(612));
        System.out.println(doubleDigits(348));
        System.out.println(doubleDigits(0));
        System.out.println(doubleDigits(-789));
        System.out.println(doubleDigits(-987));
    }

    public static int doubleDigits(int n) {
        if (n >= 0 && n < 10) {
            return n * 10 + n;
        } else if (n > -10 && n < 0) {
            return n * 10 + n;
        } else {
            int lastDigit = n % 10;
            int restOfNumber = n / 10;
            int doubledRestOfNumber = doubleDigits(restOfNumber);
            int doubledLastDigit = lastDigit * 10 + lastDigit;
            int factor = (n < 0) ? -1 : 1;
            return factor * (Math.abs(doubledRestOfNumber) * 100 + Math.abs(doubledLastDigit));
        }
    }

}

