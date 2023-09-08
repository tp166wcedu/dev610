package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex17 {
    public static void main(String[] args) {
        System.out.println("Range is: " + digitRange(68437));
        System.out.println("Range is: " + digitRange(123456789));
        System.out.println("Range is: " + digitRange(223456789));
    }

    public static int digitRange(int n) {
        if (n == 0) {
            return 1;
        }
        n = Math.abs(n);
        int maxDigit = n % 10;
        int minDigit = n % 10;
        while (n > 0) {
            int digit = n % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            n /= 10;
        }
        return maxDigit - minDigit + 1;
    }

}

