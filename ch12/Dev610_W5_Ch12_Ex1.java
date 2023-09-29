package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex1 {
    public static void main(String[] args) {
        starString(0);
        starString(1);
        starString(2);
        starString(3);
        starString(4);
    }

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0) {
            System.out.println("*");
        } else {
            String stars = recursiveStarBuilder(n);
            System.out.println(stars);
        }
    }

    public static String recursiveStarBuilder(int n) {
        if (n == 0) {
            return "*";
        } else {
            String previousStars = recursiveStarBuilder(n - 1);
            return previousStars + previousStars;
        }
    }

}

