package ch1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex11 {
    public static void main(String[] args) {
        starPattern01();
        starPattern02();
        System.out.println();
        starPattern01();
        starPattern02();
        starPattern01();
        System.out.println();
        starPattern03();
        starPattern01();
        starPattern02();
    }

    private static void starPattern03() {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }

    private static void starPattern02() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    private static void starPattern01() {
        System.out.println("*****");
        System.out.println("*****");
    }
}
