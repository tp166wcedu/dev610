package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex2 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(3);
        numbers.push(7);
        numbers.push(1);
        numbers.push(14);
        numbers.push(9);
        stutter(numbers);
        System.out.println(numbers);
    }

    public static void stutter(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            queue.add(num);
            queue.add(num);
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }

}

