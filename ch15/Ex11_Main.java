package ch15;

import java.util.NoSuchElementException;

public class Ex11_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {8, 17, 42, 3, 8};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("Original List: " + list);

        int removedValue = list.removeLast();
        System.out.println("Removed Value: " + removedValue);
        System.out.println("Updated List: " + list);

        removedValue = list.removeLast();
        System.out.println("Removed Value: " + removedValue);
        System.out.println("Updated List: " + list);

        list.clear();

        try {
            removedValue = list.removeLast();
            System.out.println("Removed Value: " + removedValue);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
