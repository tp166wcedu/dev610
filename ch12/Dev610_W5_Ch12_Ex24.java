package ch12;

import java.util.ArrayList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex24 {

    public static void main(String[] args) {
        printSquares(300);
    }

    public static void printSquares(int n) {
        ArrayList<Integer> squares = new ArrayList<>();
        printSquaresHelper(n, 1, squares);
    }

    public static void printSquaresHelper(int n, int start, ArrayList<Integer> squares) {
        int sum = getSumOfSquares(squares);
        if (sum == n) {
            printSquaresList(squares);
            return;
        }
        if (sum > n || start > Math.sqrt(n - sum)) {
            return;
        }
        squares.add(start);
        printSquaresHelper(n, start + 1, squares);

        squares.remove(squares.size() - 1);
        printSquaresHelper(n, start + 1, squares);
    }

    public static int getSumOfSquares(ArrayList<Integer> squares) {
        int sum = 0;
        for (int num : squares) {
            sum += num * num;
        }
        return sum;
    }

    public static void printSquaresList(ArrayList<Integer> squares) {
        for (int i = 0; i < squares.size(); i++) {
            System.out.print(squares.get(i) + "^2");
            if (i < squares.size() - 1) {
                System.out.print(" + ");
            } else {
                System.out.println();
            }
        }
    }

}

