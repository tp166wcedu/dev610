package ch11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16)
        );
        System.out.println("Original List: \n" + list);
        removeInRange(list, 0, 5, 13);
        System.out.println("Modified List after removing 0's between indexes 5 and 13: \n" + list);
    }

    public static void removeInRange(LinkedList<Integer> list, int value, int start, int end) {
        Iterator<Integer> iterator = list.listIterator(start);
        int i = start;

        while (iterator.hasNext() && i < end) {
            if (iterator.next() == value) {
                iterator.remove();
                end--;
            } else {
                i++;
            }
        }
    }

}

