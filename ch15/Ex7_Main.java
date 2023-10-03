package ch15;

public class Ex7_Main {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        int[] numbers1 = {3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42};
        for (int num : numbers1) {
            list1.add(num);
        }
        System.out.println("List 1: " + list1 + " is pairwise sorted: " + list1.isPairwiseSorted());

        ArrayIntList list2 = new ArrayIntList();
        int[] numbers2 = {7, 42, 308, 409, 19, 17, 2};
        for (int num : numbers2) {
            list2.add(num);
        }
        System.out.println("List 2: " + list2 + " is pairwise sorted: " + list2.isPairwiseSorted());

        // Testing a very short list (no pairs)
        ArrayIntList list3 = new ArrayIntList();
        list3.add(42);
        System.out.println("List 3: " + list3 + " is pairwise sorted: " + list3.isPairwiseSorted());
    }
}
