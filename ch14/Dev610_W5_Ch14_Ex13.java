package ch14;

import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex13 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(3);
        stack.push(12);
        stack.push(7);
        stack.push(5);
        stack.push(8);
        stack.push(15);
        stack.push(15);
        stack.push(20);
        stack.push(4);
        expunge(stack);
        System.out.println(stack);
    }

    public static void expunge(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!auxStack.isEmpty() && current > auxStack.peek()) {
                auxStack.pop();
            }
            auxStack.push(current);
        }

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.remove(0));
        }
    }

}

