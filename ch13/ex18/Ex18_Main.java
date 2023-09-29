package ch13.ex18;

public class Ex18_Main {

    /**
     * The fundamental operations and comparisons involved in both versions of the algorithm are
     * essentially the same, so the overall efficiency remains unchanged. The time complexity is still
     * O(N^2) in both cases, representing the quadratic nature of the selection sort algorithm,
     * regardless of whether it's sorting from smallest to largest or from largest to smallest.
     */
    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int largestIndex = i;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[largestIndex]) {
                    largestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[largestIndex];
            array[largestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {63, 9, 45, 72, 27, 18, 54, 36};
        sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

