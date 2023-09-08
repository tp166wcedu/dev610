package w5;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch5_Ex10 {
    public static void main(String[] args) {
        hopscotch(3);
        System.out.println();
        hopscotch(0);
        System.out.println();
        hopscotch(-1);
    }

    public static void hopscotch(int hops) {
        if (hops < 0) {
            return;
        }

        int currentNumber = 1;
        if (hops == 0) {
            System.out.println("   " + currentNumber + "   ");
            return;
        }

        System.out.println("   " + currentNumber + "   ");
        currentNumber += 1;

        for (int i = 1; i <= hops; i++) {
            System.out.println(currentNumber + "     " + (currentNumber + 1));
            currentNumber += 2;
            if (currentNumber >= 10) {
                System.out.println("  " + currentNumber + "   ");
            } else {
                System.out.println("   " + currentNumber + "   ");
            }
            currentNumber += 1;
        }
    }
}

