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
public class Dev610_W5_Ch14_Ex8 {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(3, 17, 9, 4, 17, 3));
        System.out.println(isPalindrome(queue1));
        System.out.println(isPalindrome(queue2));
    }

    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int size = q.size();
        boolean palindrome = true;
        for (int i = 0; i < size; i++) {
            int value = q.poll();
            stack.push(value);
            q.offer(value);
        }
        for (int i = 0; i < size; i++) {
            int stackValue = stack.pop();
            int queueValue = q.poll();
            if (stackValue != queueValue) {
                palindrome = false;
            }
            q.offer(queueValue);
        }
        return palindrome;
    }

}

