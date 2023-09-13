package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex19 {
    public static void main(String[] args) {
        printFigure(2);
        System.out.println();
        printFigure(3);
        System.out.println();
        printFigure(4);
    }

    private static void printFigure(int numBlocks) {
        for (int block = 0; block < numBlocks; block++) {
            drawHorizontalBoundary();
            for (int line = 0; line < 3; line++) {
                drawInsideBlock();
            }
        }
        drawHorizontalBoundary();
    }

    public static void drawHorizontalBoundary() {
        for (int i = 0; i < 2; i++) {
            System.out.print("+===");
        }
        System.out.println("+");
    }

    public static void drawInsideBlock() {
        for (int cell = 0; cell < 2; cell++) {
            System.out.print("|   ");
        }
        System.out.println("|");
    }
}
