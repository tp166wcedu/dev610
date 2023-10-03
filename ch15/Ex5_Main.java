package ch15;

public class Ex5_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(15);
        list.add(20);
        list.add(7);

        ArrayIntList list2 = list.runningTotal();

        System.out.println("Original List: " + list);
        System.out.println("Running Total: " + list2);

        ArrayIntList emptyList = new ArrayIntList();
        ArrayIntList emptyListResult = emptyList.runningTotal();
        System.out.println("Original Empty List: " + emptyList);
        System.out.println("Running Total of Empty List: " + emptyListResult);
    }
}
