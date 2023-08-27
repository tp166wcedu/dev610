package w1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex12 {
    public static void main(String[] args) {
        printPattern(false);
        System.out.println();
        printPattern(false);
        printDivider();
        System.out.println();
        printPattern(true);
        printDivider();
    }

    private static void printPattern(boolean isMsgIncluded) {
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");
        System.out.println("/         \\");
        if (isMsgIncluded) {
            System.out.println("|   STOP  |");
        }
        System.out.println("\\         /");
        System.out.println(" \\_______/ ");
    }

    private static void printDivider() {
        System.out.println(" +-------+ ");
    }
}
