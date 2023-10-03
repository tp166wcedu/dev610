package ch15;

public class Ex9_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        int[] numbers = {1, 3, 4, 7, 7, 7, 7, 9, 9, 11, 13, 14, 14, 14, 16, 16, 18, 19, 19, 19};
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("List: " + list);
        System.out.println("Max count: " + list.maxCount());

        list.clear();
        int[] numbers2 = {1, 1, 2, 3, 4, 4, 4, 5, 6};
        for (int num : numbers2) {
            list.add(num);
        }

        System.out.println("List: " + list);
        System.out.println("Max count: " + list.maxCount());

        list.clear();
        System.out.println("List: " + list);
        System.out.println("Max count: " + list.maxCount());
    }
}
