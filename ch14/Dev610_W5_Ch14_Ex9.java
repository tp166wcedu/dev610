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
public class Dev610_W5_Ch14_Ex9 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(15);
        stack.push(-1);
        stack.push(6);
        stack.push(8);
        stack.push(2);
        stack.push(1);
        switchPairs(stack);
        System.out.println(stack);
    }

    public static void switchPairs(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            int a = queue.poll();
            if (!queue.isEmpty()) {
                int b = queue.poll();
                stack.push(b);
            }
            stack.push(a);
        }
        if (stack.size() % 2 != 0) {
            while (!stack.isEmpty()) {
                queue.offer(stack.remove(0));
            }
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }
        }
    }

}

