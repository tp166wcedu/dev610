package ch15;

public class Ex12_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {8, 17, 9, 24, 42, 3, 8};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("Original List: " + list);

        list.removeFront(4);
        System.out.println("After removeFront(4): " + list);
    }
}
