package ch16;

public class Main {
    public static void main(String[] args) {
        // Ex22_Main
        LinkedIntList list = new LinkedIntList();

        list.add(1);
        list.add(8);
        list.add(19);
        list.add(4);
        list.add(17);

        System.out.println("Original list: " + list);
        list.reverse();
        System.out.println("Reversed list: " + list);

        // Ex21_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(0);
        // list1.add(1);
        // list1.add(2);
        // list1.add(1);
        // System.out.println("Original list1: " + list1);
        // list1.surroundWith(1, 4);
        // System.out.println("List1 after surroundWith(1, 4): " + list1);
        //
        // LinkedIntList list2 = new LinkedIntList();
        // list2.add(0);
        // list2.add(1);
        // list2.add(0);
        // System.out.println("Original list2: " + list2);
        // list2.surroundWith(1, 1);
        // System.out.println("List2 after surroundWith(1, 1): " + list2);
        //
        // LinkedIntList list3 = new LinkedIntList();
        // list3.add(0);
        // list3.add(1);
        // list3.add(2);
        // System.out.println("Original list3: " + list3);
        // list3.surroundWith(3, 4);
        // System.out.println("List3 after surroundWith(3, 4): " + list3);

        // Ex20_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(10);
        // list.add(31);
        // list.add(42);
        // list.add(23);
        // list.add(44);
        // list.add(75);
        // list.add(86);
        //
        // System.out.println("Original list: " + list);
        // list.shift();
        // System.out.println("List after shift: " + list);

        // Ex19_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(8);
        // list.add(23);
        // list.add(19);
        // list.add(7);
        // list.add(45);
        // list.add(98);
        // list.add(102);
        // list.add(4);
        //
        // System.out.println("Original list: " + list);
        // list.rotate();
        // System.out.println("List after rotate: " + list);

        // Ex18_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(1);
        // list.add(3);
        // list.add(2);
        // list.add(7);
        //
        // System.out.println("Original list: " + list);
        // list.doubleList();
        // System.out.println("List after doubleList: " + list);

        // Ex17_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(8);
        // list.add(13);
        // list.add(17);
        // list.add(4);
        // list.add(9);
        // list.add(12);
        // list.add(98);
        // list.add(41);
        // list.add(7);
        // list.add(23);
        // list.add(0);
        // list.add(92);
        //
        // System.out.println("Original list: " + list);
        // list.removeRange(3, 8);
        // System.out.println("List after removeRange: " + list);

        // Ex16_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(8);
        // list1.add(13);
        // list1.add(17);
        // list1.add(4);
        // list1.add(9);
        // list1.add(12);
        // list1.add(98);
        // list1.add(41);
        // list1.add(7);
        // list1.add(23);
        // list1.add(0);
        // list1.add(92);
        //
        // System.out.println("List1 before removeEvens: " + list1);
        // LinkedIntList list2 = list1.removeEvens();
        // System.out.println("List1 after removeEvens: " + list1);
        // System.out.println("List2 containing even indexed elements: " + list2);

        // Ex15_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(3);
        // list1.add(9);
        // list1.add(4);
        // list1.add(2);
        //
        // LinkedIntList list2 = new LinkedIntList();
        // list2.add(3);
        // list2.add(9);
        // list2.add(4);
        // list2.add(2);
        //
        // LinkedIntList list3 = new LinkedIntList();
        // list3.add(3);
        // list3.add(9);
        // list3.add(5);
        // list3.add(2);
        //
        // System.out.println("List1 equals List2: " + list1.equals(list2)); // true
        // System.out.println("List1 equals List3: " + list1.equals(list3)); // false

        // Ex14_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(3);
        // list.add(9);
        // list.add(4);
        // list.add(2);
        // list.add(3);
        // list.add(8);
        // list.add(17);
        // list.add(4);
        // list.add(3);
        // list.add(18);
        //
        // System.out.println("List Before: " + list);
        // list.removeAll(3);
        // System.out.println("List After: " + list);

        // Ex13_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(8);
        // list1.add(17);
        // list1.add(2);
        // list1.add(4);
        //
        // LinkedIntList list2 = new LinkedIntList();
        // list2.add(1);
        // list2.add(2);
        // list2.add(3);
        //
        // System.out.println("List1 Before: " + list1);
        // System.out.println("List2 Before: " + list2);
        //
        // list1.transferFrom(list2);
        //
        // System.out.println("List1 After: " + list1);
        // System.out.println("List2 After: " + list2);

        // Ex12_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(8);
        // list.add(7);
        // list.add(-4);
        // list.add(19);
        // list.add(0);
        // list.add(43);
        // list.add(-8);
        // list.add(-7);
        // list.add(2);
        //
        // System.out.println("Original List: " + list);
        // list.split();
        // System.out.println("After Splitting: " + list);

        // Ex11_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(1);
        // list.add(7);
        // list.add(3);
        // list.add(9);
        // list.add(4);
        // list.add(6);
        // list.add(5);
        //
        // System.out.println("Original List: " + list);
        // list.compress();
        // System.out.println("Compressed List: " + list);  // should print [8, 12, 10, 5]

        // Ex10_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(18);
        // list.add(7);
        // list.add(4);
        // list.add(24);
        // list.add(11);
        //
        // System.out.println("Original List: " + list);
        // list.stretch(3);
        // System.out.println("Stretched by 3: " + list);
        //
        // list.stretch(0);
        // System.out.println("Stretched by 0: " + list);

        // Ex9_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(1);
        // list.add(8);
        // list.add(19);
        // list.add(4);
        // list.add(17);
        //
        // System.out.println("Before stutter: " + list);
        // list.stutter();
        // System.out.println("After stutter: " + list);

        // Ex8_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(10);
        // list.add(25);
        // list.add(31);
        // list.add(47);
        // list.add(52);
        // list.add(68);
        // list.add(77);
        //
        // System.out.println("Before switchPairs: " + list);
        // list.switchPairs();
        // System.out.println("After switchPairs: " + list);

        // Ex7_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(1);
        // list1.add(18);
        // list1.add(2);
        // list1.add(7);
        // list1.add(8);
        // list1.add(39);
        // list1.add(18);
        // list1.add(40);
        //
        // System.out.println("List: " + list1);
        // System.out.println("Deleted value: " + list1.deleteBack());
        // System.out.println("After deletion: " + list1);
        //
        // try {
        //     LinkedIntList list2 = new LinkedIntList();
        //     list2.deleteBack();
        // } catch (NoSuchElementException e) {
        //     System.out.println("\nCaught exception: " + e.getMessage());
        // }

        // Ex6_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(1);
        // list1.add(18);
        // list1.add(2);
        // list1.add(7);
        // list1.add(8);
        // list1.add(39);
        // list1.add(18);
        // list1.add(40);
        //
        // System.out.println("List: " + list1);
        // System.out.println("Has two consecutive: " + list1.hasTwoConsecutive());
        //
        // LinkedIntList list2 = new LinkedIntList();
        // list2.add(1);
        // list2.add(3);
        // list2.add(5);
        // list2.add(7);
        // list2.add(9);
        // list2.add(11);
        //
        // System.out.println("\nList: " + list2);
        // System.out.println("Has two consecutive: " + list2.hasTwoConsecutive());

        // Ex5_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(3);
        // list.add(3);
        // list.add(6);
        // list.add(9);
        // list.add(15);
        // list.add(15);
        // list.add(23);
        // list.add(23);
        // list.add(23);
        // list.add(40);
        // list.add(40);
        //
        // System.out.println("List: " + list);
        // System.out.println("Duplicate count: " + list.countDuplicates());

        // Ex4_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(1);
        // list.add(18);
        // list.add(2);
        // list.add(7);
        // list.add(18);
        // list.add(39);
        // list.add(18);
        // list.add(40);
        //
        // System.out.println("List: " + list);
        // System.out.println("Last index of 18: " + list.lastIndexOf(18));
        // System.out.println("Last index of 3: " + list.lastIndexOf(3));

        // Ex3_Main
        // LinkedIntList list1 = new LinkedIntList();
        // list1.add(10);
        // list1.add(20);
        // list1.add(30);
        // list1.add(40);
        // list1.add(50);
        //
        // System.out.println("List1: " + list1);
        // System.out.println("Is List1 sorted? " + list1.isSorted());
        //
        // LinkedIntList list2 = new LinkedIntList();
        // list2.add(10);
        // list2.add(20);
        // list2.add(5);
        // list2.add(40);
        // list2.add(50);
        //
        // System.out.println("\nList2: " + list2);
        // System.out.println("Is List2 sorted? " + list2.isSorted());
        //
        // LinkedIntList emptyList = new LinkedIntList();
        // System.out.println("\nEmpty List: " + emptyList);
        // System.out.println("Is Empty List sorted? " + emptyList.isSorted());

        // Ex2_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(10);
        // list.add(20);
        // list.add(3);
        // list.add(40);
        // list.add(50);
        //
        // System.out.println("List: " + list);
        // System.out.println("Minimum value: " + list.min());
        //
        // LinkedIntList emptyList = new LinkedIntList();
        // try {
        //     System.out.println("Minimum value in empty list: " + emptyList.min());
        // } catch (NoSuchElementException e) {
        //     System.out.println("Caught exception: " + e.getMessage());
        // }

        // Ex1_Main
        // LinkedIntList list = new LinkedIntList();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        //
        // System.out.println("Original List: " + list);
        //
        // list.set(2, 99);
        // System.out.println("After setting index 2 to 99: " + list);
        //
        // list.set(0, 77);
        // System.out.println("After setting index 0 to 77: " + list);
    }
}
