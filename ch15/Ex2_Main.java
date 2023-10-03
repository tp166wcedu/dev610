package ch15;

public class Ex2_Main {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        list1.add(11);
        list1.add(-7);
        list1.add(3);
        list1.add(42);
        list1.add(0);
        list1.add(14);

        ArrayIntList list2 = new ArrayIntList();
        list2.add(3);
        list2.add(42);
        list2.add(0);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Index of list2 in list1: " + list1.indexOfSubList(list2));

        ArrayIntList list3 = new ArrayIntList();
        list3.add(42);
        list3.add(0);
        list3.add(14);

        System.out.println("List3: " + list3);
        System.out.println("Index of list3 in list1: " + list1.indexOfSubList(list3));

        ArrayIntList list4 = new ArrayIntList();
        list4.add(42);
        list4.add(0);
        list4.add(15);

        System.out.println("List4: " + list4);
        System.out.println("Index of list4 in list1: " + list1.indexOfSubList(list4));
    }
}

