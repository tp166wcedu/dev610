package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * for (each of 2 blocks) {
 *     for (each of 2 horizontal boundaries) {
 *         write "+===";
 *     }
 *     write "+" on the output line;
 *     go to a new output line;
 *
 *     for (each of 3 lines inside the block) {
 *         for (each of 2 cells inside the block) {
 *             write "|   ";
 *         }
 *         write "|" on the output line;
 *         go to a new output line;
 *     }
 *
 *     for (each of 2 horizontal boundaries) {
 *         write "+===";
 *     }
 *     write "+" on the output line;
 *     go to a new output line;
 * }
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex18 {
    public static void main(String[] args) {
        int numBlocks = 2;
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
