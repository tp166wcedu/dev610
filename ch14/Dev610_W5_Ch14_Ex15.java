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
public class Dev610_W5_Ch14_Ex15 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Collections.addAll(stack, 2, 3, 8, 8, 11, 17, 20, 20);
        System.out.println(isSorted(stack));
    }

    public static boolean isSorted(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return true;
        }
        Stack<Integer> auxStack = new Stack<>();
        int prev = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current > prev) {
                while (!auxStack.isEmpty()) {
                    stack.push(auxStack.pop());
                }
                return false;
            }
            auxStack.push(current);
            prev = current;
        }
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
        return true;
    }

}

