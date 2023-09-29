package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex5 {
    public static void main(String[] args) {
        writeBinary(44);
        System.out.println();
        writeBinary(1);
        System.out.println();
        writeBinary(2);
        System.out.println();
        writeBinary(7);
        System.out.println();
        writeBinary(255);
        System.out.println();
    }

    public static void writeBinary(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }
        writeBinary(n / 2);
        System.out.print(n % 2);
    }

}

