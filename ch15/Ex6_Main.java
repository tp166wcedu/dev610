package ch15;

public class Ex6_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(42);
        list.add(-7);
        list.add(3);
        list.add(0);
        list.add(15);

        System.out.println("Original List: " + list);

        list.fill(2);
        System.out.println("Filled List: " + list);

        // Testing an empty list
        ArrayIntList emptyList = new ArrayIntList();
        System.out.println("Original Empty List: " + emptyList);

        emptyList.fill(5);
        System.out.println("Filled Empty List: " + emptyList);
    }
}
