package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex5 {
    public static void main(String[] args) {
        printGrid(4, 6);
    }

    public static void printGrid(int rows, int columns) {
        for (int row = 1; row <= rows; row++) {
            int number = row;
            for (int col = 1; col <= columns; col++) {
                System.out.print(number);
                if (col < columns) {
                    System.out.print(" ");
                }
                number += rows;
            }
            System.out.println();
        }
    }
}
