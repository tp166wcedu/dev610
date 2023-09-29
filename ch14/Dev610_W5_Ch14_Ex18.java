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
public class Dev610_W5_Ch14_Ex18 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 50, 19, 54, 30, 67));
        mirrorHalves(queue);
        System.out.println(queue);
    }

    public static void mirrorHalves(Queue<Integer> queue) {
        int size = queue.size();
        if (size % 2 != 0) {
            throw new IllegalArgumentException("Queue size must be even");
        }
        int halfSize = size / 2;
        Stack<Integer> stack = new Stack<>();
        processHalf(queue, halfSize, stack);
        processHalf(queue, halfSize, stack);
    }

    private static void processHalf(Queue<Integer> queue, int halfSize, Stack<Integer> stack) {
        for (int i = 0; i < halfSize; i++) {
            int value = queue.poll();
            stack.push(value);
            queue.offer(value);
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }

}

