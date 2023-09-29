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
public class Dev610_W5_Ch14_Ex6 {

    public static void rearrange(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int value = q.poll();
            if (value % 2 == 0) {
                q.offer(value);
            } else {
                stack.push(value);
            }
        }
        while (!stack.isEmpty()) {
            q.offer(stack.remove(0));
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
        rearrange(queue);
        System.out.println(queue);
    }

}

