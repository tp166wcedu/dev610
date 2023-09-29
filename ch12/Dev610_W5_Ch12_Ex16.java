package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex16 {

    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));
        System.out.println(evenDigits(-34512));
        System.out.println(evenDigits(35159));
        System.out.println(evenDigits(7));
    }

    public static int evenDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;
        int remaining = evenDigits(n / 10);

        if (digit % 2 == 0) {
            int temp = remaining;
            while (temp > 0) {
                temp /= 10;
            }
            return remaining * 10 + digit;
        } else {
            return remaining;
        }
    }

}

