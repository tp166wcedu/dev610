package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex6 {

    public static void main(String[] args) {
        int[] array = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(array));
    }

    public static double stdev(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double mean = sum / arr.length;

        double sumOfSquares = 0;
        for (int j : arr) {
            sumOfSquares += Math.pow(j - mean, 2);
        }

        double variance = sumOfSquares / (arr.length - 1);
        return Math.sqrt(variance);
    }
}

