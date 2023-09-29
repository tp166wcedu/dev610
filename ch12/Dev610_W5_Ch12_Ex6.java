package ch12;

import java.util.ArrayList;
import java.util.List;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex6 {

    public static void main(String[] args) {
        writeSquares(8);
        System.out.println();
        writeSquares(1);
        System.out.println();
        writeSquares(35);
        System.out.println();
    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be greater than or equal to 1");
        }

        int lastOdd = (n % 2 == 0) ? n - 1 : n;
        int lastEven = (n % 2 == 0) ? n : n - 1;

        List<Integer> oddSquares = getOddSquares(lastOdd);
        List<Integer> evenSquares = getEvenSquares(lastEven);

        // Print odd squares in descending order
        for (int i = oddSquares.size() - 1; i >= 0; i--) {
            System.out.print(oddSquares.get(i));
            if (i != 0 || !evenSquares.isEmpty()) {
                System.out.print(", ");
            }
        }

        // Print even squares
        for (int i = 0; i < evenSquares.size(); i++) {
            System.out.print(evenSquares.get(i));
            if (i != evenSquares.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    private static List<Integer> getOddSquares(int n) {
        if (n <= 0) return new ArrayList<>();
        List<Integer> result = getOddSquares(n - 2);
        result.add(n * n);
        return result;
    }

    private static List<Integer> getEvenSquares(int n) {
        if (n <= 0) return new ArrayList<>();
        List<Integer> result = getEvenSquares(n - 2);
        result.add(n * n);
        return result;
    }

}

