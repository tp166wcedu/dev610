package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex10 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        System.out.println(isConsecutive(stack));
    }

    public static boolean isConsecutive(Stack<Integer> stack) {
        if (stack.size() < 2) {
            return true;
        }
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        boolean isConsecutive = true;
        int prevValue = queue.poll();
        stack.push(prevValue);
        while (!queue.isEmpty()) {
            int currentValue = queue.poll();
            if (currentValue != prevValue + 1) {
                isConsecutive = false;
            }
            prevValue = currentValue;
            stack.push(currentValue);
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        return isConsecutive;
    }

}

