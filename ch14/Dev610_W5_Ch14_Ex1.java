package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-5);
        stack.push(1);
        stack.push(2);
        stack.push(-4);
        splitStack(stack);
        System.out.println(stack);
    }

    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int size = stack.size();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            if (num < 0) {
                stack.insertElementAt(num, 0);
            } else {
                stack.push(num);
            }
        }
    }

}

