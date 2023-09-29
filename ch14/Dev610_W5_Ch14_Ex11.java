package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex11 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(-2);
        queue.offer(4);
        queue.offer(-5);
        queue.offer(8);
        queue.offer(-8);
        queue.offer(12);
        queue.offer(-15);
        reorder(queue);
        System.out.println(queue);  // Output: [-15, -8, -5, -2, 1, 2, 4, 8, 12]
    }

    public static void reorder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int value = queue.poll();
            if (value >= 0) {
                stack.push(value);
            } else {
                queue.add(value);
            }
        }
        while (!queue.isEmpty()) {
            stack.add(0, queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.remove(0));
        }
    }

}

