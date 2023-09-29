package ch14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex16 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(53);
        stack.push(19);
        stack.push(24);
        mirror(stack);
        System.out.println(stack);
    }

    public static void mirror(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.offer(stack.remove(0));
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int value = queue.poll();
            stack.push(value);
            queue.offer(value);
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

}

