package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex13 {

    public static void main(String[] args) {
        int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        System.out.println(longestSortedSequence(array));
        int[] array02 = {};
        System.out.println(longestSortedSequence(array02));
    }

    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) return 0;

        int maxSequenceLength = 1;
        int currentSequenceLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentSequenceLength++;
            } else {
                currentSequenceLength = 1;
            }

            if (currentSequenceLength > maxSequenceLength) {
                maxSequenceLength = currentSequenceLength;
            }
        }

        return maxSequenceLength;
    }

}

