package ch3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex8 {
    public static void main(String[] args) {
        quadratic(1, -7, 12);  // Roots: x = 4, x = 3
        quadratic(1, 3, 2);    // Roots: x = -2, x = -1
    }

    public static void quadratic(int a, int b, int c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Roots: x = " + root1 + ", x = " + root2);
    }
}
