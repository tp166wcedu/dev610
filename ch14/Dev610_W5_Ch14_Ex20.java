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
public class Dev610_W5_Ch14_Ex20 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(2, 8, -5, 19, 7, 3, 24, 42));
        interleave(queue);
        System.out.println(queue);
    }

    public static void interleave(Queue<Integer> queue) {
        int size = queue.size();
        if (size % 2 != 0) {
            throw new IllegalArgumentException("Queue size must be even");
        }
        int halfSize = size / 2;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.poll());
        }
        for (int i = 0; i < halfSize; i++) {
            queue.offer(stack.remove(0));
            queue.offer(queue.poll());
        }
    }

}

