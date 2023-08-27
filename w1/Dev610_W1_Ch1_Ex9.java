package w1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex9 {
    public static void main(String[] args) {
        topPattern();
        bottomPattern();
        middlePattern();
        topPattern();
        bottomPattern();
        middlePattern();
        bottomPattern();
        topPattern();
        middlePattern();
        bottomPattern();
    }

    private static void topPattern() {
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");
        System.out.println("/         \\");
    }

    private static void middlePattern() {
        System.out.println("_\"_'_\"_'_\"_");
    }

    private static void bottomPattern() {
        System.out.println("\\         /");
        System.out.println(" \\_______/ ");
    }
}
