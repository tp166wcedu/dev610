package ch15;

public class Ex1_Main {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println("List: " + list);
        System.out.println("Last index of 18: " + list.lastIndexOf(18));
        System.out.println("Last index of 3: " + list.lastIndexOf(3));
    }
}
