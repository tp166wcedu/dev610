package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex12 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        shift(stack, 3);
        System.out.println(stack);
    }

    public static void shift(Stack<Integer> stack, int n) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        for (int i = 0; i < n; i++) {
            stack.push(queue.poll());
        }
        int remainingSize = queue.size();
        for (int i = 0; i < remainingSize; i++) {
            queue.offer(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

}

