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
public class Dev610_W5_Ch14_Ex21 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Collections.addAll(stack, 19, 0, -11, 42, 5, 27);
        maxToTop(stack);
        System.out.println(stack);
    }

    public static void maxToTop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        int maxElement = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            int element = stack.pop();
            maxElement = Math.max(maxElement, element);
            queue.offer(element);
        }
        boolean maxElementSkipped = false;
        while (!queue.isEmpty()) {
            int element = queue.poll();
            if (element == maxElement && !maxElementSkipped) {
                maxElementSkipped = true;
            } else {
                stack.push(element);
            }
        }
        stack.push(maxElement);
    }

}

