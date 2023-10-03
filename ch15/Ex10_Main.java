package ch15;

public class Ex10_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("List: " + list);
        System.out.println("Longest Sorted Sequence: " + list.longestSortedSequence());

        list.clear();
        int[] numbers2 = {1, 3, 5, 7, 9, 10, 11, 12};
        for (int num : numbers2) {
            list.add(num);
        }

        System.out.println("List: " + list);
        System.out.println("Longest Sorted Sequence: " + list.longestSortedSequence());

        list.clear();
        System.out.println("List: " + list);
        System.out.println("Longest Sorted Sequence: " + list.longestSortedSequence());
    }
}
