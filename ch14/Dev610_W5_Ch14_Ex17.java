package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex17 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(-4);
        stack.push(-4);
        stack.push(-4);
        stack.push(82);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(17);
        stack.push(17);
        compressDuplicates(stack);
        System.out.println(stack);
    }

    public static void compressDuplicates(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            int count = 1;
            int value = queue.poll();

            while (!queue.isEmpty() && queue.peek() == value) {
                count++;
                queue.poll();
            }
            stack.push(value);
            stack.push(count);
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

}

