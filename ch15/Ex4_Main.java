package ch15;

public class Ex4_Main {
    public static void main(String[] args) {
        // Test with odd-sized list
        ArrayIntList list1 = new ArrayIntList();
        list1.add(11);
        list1.add(-7);
        list1.add(3);
        list1.add(42);
        list1.add(0);
        list1.add(14);
        list1.add(56);

        System.out.println("Original List (Odd-sized): " + list1);
        list1.reverse();
        System.out.println("Reversed List (Odd-sized): " + list1);

        // Test with even-sized list
        ArrayIntList list2 = new ArrayIntList();
        list2.add(11);
        list2.add(-7);
        list2.add(3);
        list2.add(42);
        list2.add(0);
        list2.add(14);

        System.out.println("\nOriginal List (Even-sized): " + list2);
        list2.reverse();
        System.out.println("Reversed List (Even-sized): " + list2);
    }
}
