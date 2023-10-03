package ch15;

public class Ex3_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(11);
        list.add(-7);
        list.add(3);
        list.add(42);
        list.add(3);
        list.add(0);
        list.add(14);
        list.add(3);

        System.out.println("Original List: " + list);

        list.replaceAll(3, 999);

        System.out.println("Modified List: " + list);
    }
}
