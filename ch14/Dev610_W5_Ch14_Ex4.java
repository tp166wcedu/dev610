package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex4 {
    public static void collapse(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            int sum = 0;
            for (int i = 0; i < 2 && !queue.isEmpty(); i++) {
                sum += queue.remove();
            }
            Stack<Integer> tempStack = new Stack<>();
            tempStack.push(sum);
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(42);
        numbers.push(1);
        numbers.push(7);
        numbers.push(11);
        numbers.push(4);
        numbers.push(9);
        numbers.push(8);
        numbers.push(2);
        numbers.push(7);
        collapse(numbers);
        System.out.println(numbers);
    }

}

