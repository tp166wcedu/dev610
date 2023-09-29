package ch14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex19 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(4, -8, 12, 7, 2, 3, 2, 19, 3, 8, 2));
        int min = removeMin(stack);
        System.out.println(min);
        System.out.println(stack);
    }

    public static int removeMin(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int value = stack.pop();
            min = Math.min(min, value);
            queue.offer(value);
        }
        boolean isMinRemoved = false;
        while (!queue.isEmpty()) {
            int value = queue.poll();
            if (value == min && !isMinRemoved) {
                isMinRemoved = true;
            } else {
                stack.push(value);
            }
        }
        return min;
    }

}

