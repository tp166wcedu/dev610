package ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex3 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(3);
        numbers.push(7);
        numbers.push(1);
        numbers.push(14);
        numbers.push(9);
        Stack<Integer> copiedStack = copyStack(numbers);
        System.out.println(copiedStack);
        System.out.println(numbers);
    }

    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> copy = new Stack<>();
        while (!original.isEmpty()) {
            int current = original.pop();
            queue.add(current);
        }
        while (!queue.isEmpty()) {
            int current = queue.remove();
            original.push(current);
            copy.push(current);
        }
        return copy;
    }

}

