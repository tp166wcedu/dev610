package ch15;

public class TheRest_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(-5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(17);

        ArrayIntList list2 = list.fromCounts();
        System.out.println("Original List: " + list);
        System.out.println("New List: " + list2);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {10, 25, 31, 47, 52, 68, 77};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        // list.switchPairs();
        // System.out.println("Switched Pairs List: " + list);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {8, 23, 19, 7, 12, 4};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        // list.rotate();
        // System.out.println("Rotated List: " + list);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {1, 7, 3, 9, 4, 6, 5};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        // list.compress();
        // System.out.println("Compressed List: " + list);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {1, 8, 2, 7};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        // list.doubleList();
        // System.out.println("Doubled List: " + list);


        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {18, 7, 4, 24, 11};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        // System.out.println("Original List: " + list);
        // list.stretch(3);
        // System.out.println("Stretched List (factor 3): " + list);
        // list.stretch(0);
        // System.out.println("Stretched List (factor 0): " + list);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {42, 7, 0, -3, 15};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        //
        // list.stutter();
        //
        // System.out.println("Stuttered List: " + list);

        // ArrayIntList list = new ArrayIntList();
        // int[] numbers = {1, 3, 2, 7};
        // for (int num : numbers) {
        //     list.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        //
        // list.mirror();
        //
        // System.out.println("Mirrored List: " + list);

        // ArrayIntList list02 = new ArrayIntList();
        // int[] numbers02 = {4, 3, 2, 1};
        // for (int num : numbers02) {
        //     list02.add(num);
        // }
        //
        // System.out.println("Original List: " + list);
        // System.out.println("Inversions:");
        // list.printInversions();
    }
}
