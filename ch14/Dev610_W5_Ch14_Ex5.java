package ch14;

import java.util.Stack;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch14_Ex5 {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(equals(stack1, stack2));
        stack2.push(4);
        System.out.println(equals(stack1, stack2));
        stack1.push(4);
        System.out.println(equals(stack1, stack2));

    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }

        Stack<Integer> aux = new Stack<>();
        boolean isEqual = true;

        while (!s1.isEmpty() && !s2.isEmpty()) {
            int val1 = s1.pop();
            int val2 = s2.pop();
            if (val1 != val2) {
                isEqual = false;
            }
            aux.push(val1);
            aux.push(val2);
        }

        while (!aux.isEmpty()) {
            int val2 = aux.pop();
            int val1 = aux.pop();
            s1.push(val1);
            s2.push(val2);
        }

        return isEqual;
    }

}

