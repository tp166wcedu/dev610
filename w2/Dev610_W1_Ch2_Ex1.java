package w2;

import java.util.Scanner;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex1 {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for initial position, initial velocity, acceleration, and time
        System.out.print("Enter the initial position (s_0) in meters: ");
        double s0 = scanner.nextDouble();

        System.out.print("Enter the initial velocity (v_0) in meters/second: ");
        double v0 = scanner.nextDouble();

        System.out.print("Enter the acceleration (a) in meters/second^2: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the time (t) in seconds: ");
        double t = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Compute the final position s using the formula
        double s = s0 + v0 * t + 0.5 * a * Math.pow(t, 2);

        // Output the result
        System.out.println("The final position of the object is: " + s + " meters");
    }
}
