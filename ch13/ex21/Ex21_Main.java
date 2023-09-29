package ch13.ex21;

import java.util.Arrays;
import java.util.Random;

public class Ex21_Main {

    public static void bogoSort(int[] array) {
        int count = 0;
        while (!isSorted(array)) {
            count++;
            System.out.println(count + ": " + Arrays.toString(array));
            shuffle(array);
        }
    }

    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = i + rand.nextInt(array.length - i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 1, 5, 3, 0};
        bogoSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

