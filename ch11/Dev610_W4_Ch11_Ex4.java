package ch11;

import java.util.*;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9)
        );

        System.out.println("Original List: " + list);
        partition(list, 5);
        System.out.println("Partitioned List: " + list);
    }

    public static void partition(LinkedList<Integer> list, int E) {
        Iterator<Integer> iterator = list.iterator();
        List<Integer> greaterThanE = new ArrayList<>();

        while (iterator.hasNext()) {
            int currentValue = iterator.next();

            if (currentValue > E) {
                greaterThanE.add(currentValue);
                iterator.remove();
            }
        }

        list.addAll(greaterThanE);
    }

}

