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
public class Dev610_W5_Ch14_Ex7 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 8, 7, 2, 9, 18, 12, 0));
        reverseHalf(queue);
        System.out.println(queue);
    }

    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int value = q.poll();
            if (i % 2 == 1) {
                stack.push(value);
            } else {
                q.offer(value);
            }
        }

        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                q.offer(stack.pop());
            } else {
                q.offer(q.poll());
            }
        }
    }

}

