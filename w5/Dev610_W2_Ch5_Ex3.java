package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex3 {
    public static void main(String[] args) {
        System.out.println(toBinary(44));
        System.out.println(toBinary(5));
        System.out.println(toBinary(0));
    }

    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }
        return binary.reverse().toString();
    }
}
