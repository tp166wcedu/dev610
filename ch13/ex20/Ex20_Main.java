package ch13.ex20;

import java.util.Arrays;
import java.util.Random;

public class Ex20_Main {

    public static void shuffle(Object[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = i + rand.nextInt(array.length - i);
            Object temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

