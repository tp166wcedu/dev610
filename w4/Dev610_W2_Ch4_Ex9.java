package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex9 {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(2, 18, 2);  // This should throw an exception
    }

    public static void printTriangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides should be greater than 0.");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException(
                    "Invalid triangle: One side is greater than the sum of the other two."
            );
        }

        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }

}
