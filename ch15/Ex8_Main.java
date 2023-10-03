package ch15;

public class Ex8_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {2, -3, 2, 0, 5, 2, 2, 6};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("List: " + list);
        int value = 2;
        System.out.println("Number of occurrences of " + value + ": " + list.count(value));

        value = 5;
        System.out.println("Number of occurrences of " + value + ": " + list.count(value));

        value = 7; // An element that does not exist in the list
        System.out.println("Number of occurrences of " + value + ": " + list.count(value));
    }
}
