package ch5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex9 {
    public static void main(String[] args) {
        printFactors(56);
        printFactors(24);
        printFactors(-1);
    }

    public static void printFactors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Parameter should be greater than 0.");
        }

        System.out.print("1");
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }
        System.out.println();
    }
}

