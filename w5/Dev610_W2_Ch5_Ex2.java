package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex2 {
    public static void main(String[] args) {
        System.out.println(gcd(56, 48));
        System.out.println(gcd(101, 103));
        System.out.println(gcd(-56, 48));
        System.out.println(gcd(56, -48));
        System.out.println(gcd(-56, -48));
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
