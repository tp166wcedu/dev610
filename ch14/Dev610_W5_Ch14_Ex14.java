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
public class Dev610_W5_Ch14_Ex14 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Collections.addAll(q, 10, 20, 30, 40, 50, 60, 70, 80, 90);
        reverseFirstK(4, q);
        System.out.println(q);
    }

    public static void reverseFirstK(int k, Queue<Integer> queue) {
        if (k < 0 || k > queue.size()) {
            throw new IllegalArgumentException();
        }
        if (k == 0) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.offer(queue.poll());
        }
    }

}

