package ch15;

public class Ex13_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {8, 17, 8, 24, 42, 3, 8, 17, 8};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("Original List: " + list);

        list.removeAll(8);
        System.out.println("After removing all 8s: " + list);
    }
}
