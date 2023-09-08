package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex18 {
    public static void main(String[] args) {
        System.out.println(swapDigitPairs(482596));
        System.out.println(swapDigitPairs(1234567));
    }

    public static int swapDigitPairs(int n) {
        int result = 0;
        int place = 1;
        int lastDigit = n % 10;
        n /= 10;
        while (n > 0) {
            int secondLastDigit = n % 10;
            result += lastDigit * place * 10 + secondLastDigit * place;
            place *= 100;
            n /= 10;
            if (n > 0) {
                lastDigit = n % 10;
                n /= 10;
            } else {
                lastDigit = -1;
            }
        }
        if (lastDigit != -1) {
            result += lastDigit * place;
        }
        return result;
    }
}

