package ch13.ex19;

public class Ex19_Main {

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int minIndex = i;
            int maxIndex = i;
            for (int j = i + 1; j < n - i; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            int tempMin = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tempMin;

            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            int tempMax = array[n - i - 1];
            array[n - i - 1] = array[maxIndex];
            array[maxIndex] = tempMax;
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

