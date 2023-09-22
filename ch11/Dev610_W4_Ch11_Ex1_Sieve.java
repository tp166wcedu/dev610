package ch11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W4_Ch11_Ex1_Sieve {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);
    }

    public static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        for (int i = 3; i <= max; i += 2) {
            numbers.add(i);
        }

        while (!numbers.isEmpty()) {
            int front = numbers.remove(0);
            primes.add(front);
            if (front * front > max) {
                primes.addAll(numbers);
                break;
            }
            numbers.removeIf(current -> current % front == 0);
        }

        return primes;
    }

}

