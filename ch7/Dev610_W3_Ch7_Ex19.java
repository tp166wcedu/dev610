package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex19 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 25, 3}, {43, 5, 6}, {7, 83, 9}};
        int[][] matrix2 = {{9, 83, 7}, {67, 5, 41}, {3, 2, 10}};
        int[][] result = matrixAdd(matrix1, matrix2);

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices do not have the same dimensions");
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

}

